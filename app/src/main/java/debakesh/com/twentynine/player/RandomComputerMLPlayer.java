package debakesh.com.twentynine.player;

import android.os.Handler;

import com.card.common.card.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.TwentyNineMLFeature;
import debakesh.com.twentynine.entity.TwentyNineSet;
import debakesh.com.twentynine.helper.FeatureWriter;
import debakesh.com.twentynine.helper.MLFeatureExtractor;
import debakesh.com.twentynine.team.Team;

/**
 * No intelligence player
 * Created by debarghy on 9/27/2015.
 */
public class RandomComputerMLPlayer extends Player implements  UINotifier {
    FeatureWriter writer;

    @Override
    public void notifyGameStart(GameState gameState) {

    }

    @Override
    public void onGameCancellation(GameState gameState) {

    }

    @Override
    public void notifySetComplete(TwentyNineSet twentyNineSet) {

    }

    @Override
    public void updatePairRevealed(GameState gameState) {

    }

    @Override
    public void setTrumpCard(GameState gameState) {

    }

    @Override
    public void makeBid(GameState gameState, Call call) {

    }

    @Override
    public void updateTrumpSet(GameState gameState) {

    }

    @Override
    public void updateTrumpRevealed(GameState gameState) {

    }

    public void setWriter(FeatureWriter writer) {
        this.writer = writer;
    }

    Map<Integer, Map<Integer, TwentyNineMLFeature>> roundMoveFeatures = new HashMap<>();
    @Override
    public void notifyMove(GameState gameState, Move move) {

    }

    @Override
    public void updateBidComplete(GameState gameState) {

    }

    @Override
    public void notifyRound(GameState gameState, Round round) {

    }

    @Override
    public void updateBid(GameState gameState, Call call) {

    }

    @Override
    public void notifyGame(GameState gameState) {
        for(Integer roundId : roundMoveFeatures.keySet()) {
            for(Integer moveId : roundMoveFeatures.get(roundId).keySet()) {
                Integer teamId = (Integer)(roundMoveFeatures.get(roundId).get(moveId).getFeature(TwentyNineMLFeature.FEATURE.TEAM_SEQUENCE_NUMBER.name()));
                if(teamId.equals(gameState.getWinner().getTeamSequenceId())) {
                //    roundMoveFeatures.get(roundId).get(moveId).addFeature(TwentyNineMLFeature.FEATURE.GAME_WINNER.name(), "US");
                } else {
                  //  roundMoveFeatures.get(roundId).get(moveId).addFeature(TwentyNineMLFeature.FEATURE.GAME_WINNER.name(), "OPPONENT");

                }
                if(teamId.equals(gameState.getPlayedRounds().get(roundId -1).getRoundWinnerTeamId())) {
                    roundMoveFeatures.get(roundId).get(moveId).addFeature(TwentyNineMLFeature.FEATURE.GAME_WINNER.name(), "US");
                    roundMoveFeatures.get(roundId).get(moveId).addFeature(TwentyNineMLFeature.FEATURE.POINTS_GAINED.name(), gameState.getPlayedRounds().get(roundId -1).getRoundScore().intValue() );
                } else {
                    roundMoveFeatures.get(roundId).get(moveId).addFeature(TwentyNineMLFeature.FEATURE.GAME_WINNER.name(), "OPPONENT");
                    roundMoveFeatures.get(roundId).get(moveId).addFeature(TwentyNineMLFeature.FEATURE.POINTS_GAINED.name(), gameState.getPlayedRounds().get(roundId -1).getRoundScore().intValue() * -1);

                }
                if(writer != null) {
                    writer.write(roundMoveFeatures.get(roundId).get(moveId));
                    roundMoveFeatures.get(roundId).get(moveId).toStringMap();
                }
            }
        }
    }

    MLFeatureExtractor mlFeatureExtractor = new MLFeatureExtractor();

    public RandomComputerMLPlayer(String id, PlayerPosition pos) {
        super(id, pos);
    }
    @Override
    public void updateMove(GameState gameState,Move currentMove) {
        if(gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && gameState.getCurrentRound().getCurrentPlayerPosition().equals(this.getPlayerPosition())) {
            gameState.playMove(this, super.playCard());
        }
    }

    public TwentyNineCard nextMove() {
        /*
        try {
            Thread.sleep(2000);
        }catch (Exception e) {}
        */
        boolean canRevealTrump = gameState.canRevealTrump(this);
        boolean willRevealTrump = false;
        if(canRevealTrump) {
            int random = new Random().nextInt(5);
            if(random <=4) {
                willRevealTrump = true;
                gameState.revealTrump(this);
            }
        }
        List<TwentyNineCard> allowedCards = allowedCards(this.remainingCards, this.getId());

        for(TwentyNineCard card : allowedCards) {
            if(gameState.isTrumpRevealed() && card.getSuit().equals(gameState.getTrumpCard().getSuit())) {
                return card;
            }
        }
        //PLay trump

        int pickCardId = new Random().nextInt(allowedCards.size());
        Team team = null;
        if(this.getPlayerPosition().equals(PlayerPosition.BOTTOM) || this.getPlayerPosition().equals(PlayerPosition.TOP)) {
            team = gameState.getTeamOne();
        } else{
            team = gameState.getTeamTwo();
        }
        TwentyNineMLFeature feature = mlFeatureExtractor.extractFeatures(gameState, this, team, allowedCards.get(pickCardId));
     //   System.out.println(" ------------  Feature is " + );
        updateRoundFeatures(feature);

        return allowedCards.get(pickCardId);

    }

    protected  void updateRoundFeatures(TwentyNineMLFeature feature) {
        if(!roundMoveFeatures.containsKey(gameState.getCurrentRoundNumber())) {
            roundMoveFeatures.put(gameState.getCurrentRoundNumber(), new HashMap<Integer, TwentyNineMLFeature>());
        }
        roundMoveFeatures.get(gameState.getCurrentRoundNumber()).put(gameState.getCurrentRound().getMoves().size(), feature);

    }

    public List<TwentyNineCard> allowedCards(List<TwentyNineCard> cards, String playerId) {
        Round round = gameState.getCurrentRound();
        List<TwentyNineCard> allowedCards = new ArrayList<>();
        if(round.getMoves().size() == 0) {
            allowedCards.addAll(cards);
            return allowedCards;
        }


        for(TwentyNineCard c : cards) {
            if(c.getSuit().equals(round.getRoundSuit())) {
                allowedCards.add(c);
            }
        }
        if(allowedCards.size() >0)
            return allowedCards;

        //If trump is revealed in this move then only trump suit can eb played if it is their

        //Need to prevent undertrump
        allowedCards.addAll(cards);
        //No card of the same suit avalaible
        return allowedCards;
    }





        //List down all the validation
        //1> If it is first card in the new round all the cards are allowed
        //2> If it is non first card any card of same suite is allowed
        //3> If player have no card of suite and trump have already been invoked in this move then player have to play trump card
        //4> If player have no card of suite and trump have been invoked before then player can play overtrump or some other suite. Player can only undertrump if
        //all other card are undertrump

        //Winning an hand rule
        //If all card are of same suite , highest card wins
        //If trump was invoked before this round , then the highest trump card wins else 1>
        //If trump was invoked in this round the highest trump card after trump invoke wins (So if someone plays trump suit before trump invokes he does not win)




    public void winner(List<Card> cards, String trumpSuit) {

    }

    public class TwentyNineGamePlay  {
            public  void updatePlayerMove(String gameId, String playerId, Card card) {
                //check if he was supposed to move
                //check valid move or not

                //Wrong move shouls be client side as well as server side validations

                //update GameState
                    //If new Round start update round number
                    //Update nextMovePlayer (Should this be  message)
                    //If round end Notify the Screen of moving the card to the winner direction
                    //
                //if end of
            }
    }

}
