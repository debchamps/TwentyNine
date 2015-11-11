package debakesh.com.twentynine.player;

import android.os.Handler;

import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import debakesh.com.twentynine.entity.Bidding;
import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.TwentyNineMLFeature;
import debakesh.com.twentynine.helper.MLFeatureExtractor;
import debakesh.com.twentynine.team.Team;

// Generated with Weka 3.6.13
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Tue Oct 06 21:18:58 IST 2015
public class WekaPlayer extends BasicPlayer {



    MLFeatureExtractor featureExtractor = new MLFeatureExtractor();

    @Override
    public void updateTrumpSet(GameState gameState) {
        if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition())) {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    playMoveWithDelay();
                }
            }, 4000);

        }

    }


    @Override
    public void updateTrumpRevealed(GameState gameState) {

    }

    public void playMoveWithDelay() {
        gameState.playMove(this, super.playCard());
    }


    @Override
    public void updateMove(GameState gameState, Move currentMove) {
        if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && gameState.getCurrentRound().getCurrentPlayerPosition().equals(this.getPlayerPosition())) {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    playMoveWithDelay();
                }
            }, 1000);
        }
    }

    @Override
    public void updateBidComplete(final GameState gameState) {
        Bidding bidding = gameState.getBidding();
        if (bidding.getWinningCall().getCallingPlayer().getPlayerPosition().equals(this.getPlayerPosition())) {
            setTrumpCard(gameState);
        }
    }




    @Override
    public void updateBid(final GameState gameState, final Call call) {
        if (gameState.getBidding().getBiddingStatus().equals(Bidding.BiddingStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getCurrentBidder())) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    makeBid(gameState, call);
                }
            }, 2000);
        }
    }



    @Override
    public TwentyNineCard nextMove() {
        List<TwentyNineCard> allAllowedCards = super.allowedCards(this.getRemainingCards(), this.getId());
        if (allAllowedCards.size() == 1)
            return allAllowedCards.get(0);
        Team team = null;
        if (this.getPlayerPosition().equals(PlayerPosition.BOTTOM) || this.getPlayerPosition().equals(PlayerPosition.TOP)) {
            team = gameState.getTeamOne();
        } else {
            team = gameState.getTeamTwo();
        }

        boolean canRevealTrump = gameState.canRevealTrump(this);
        boolean willRevealTrump = false;
        if(canRevealTrump) {
                gameState.revealTrump(this);
        }

        for(TwentyNineCard card : allAllowedCards) {
            if(gameState.isTrumpRevealed() && card.getSuit().equals(gameState.getTrumpCard().getSuit())) {
                return card;
            }
        }

        TwentyNineCard bestCard = null;
        List<TwentyNineCard> winningCards = new ArrayList<>();
        for (TwentyNineCard allowedCard : allAllowedCards) {
            TwentyNineMLFeature featureOfCard = featureExtractor.extractFeatures(gameState, this, team, allowedCard);
            //updateRoundFeatures(featureOfCard);

            featureOfCard.addFeature(TwentyNineMLFeature.FEATURE.GAME_WINNER.name(), "US");
            double maxScore = Double.MIN_VALUE;
            try {
                Object[] feature1 = featureOfCard.toArray();
                double score = WekaClassifier.classify(featureOfCard.toArray());
                if(score > .95)
                    winningCards.add(allowedCard);

                if(score >= 0.05 && score <=0.98) {
                    System.out.print("Proper");
                }
                if (score > maxScore) {
                    maxScore = score;
                    bestCard = allowedCard;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ;
            }

        }

        if(winningCards.size() > 0) {

            return CardHelper.getHighCard(winningCards);
        }
        else
            return CardHelper.getLowCard(allAllowedCards);
    }

    public WekaPlayer(String id, PlayerPosition pos) {
        super(id, pos);
    }

 }