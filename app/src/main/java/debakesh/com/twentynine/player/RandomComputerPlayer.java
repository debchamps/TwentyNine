package debakesh.com.twentynine.player;

import android.os.Handler;

import com.card.common.card.Card;
import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import debakesh.com.twentynine.entity.Bidding;
import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * No intelligence player
 */
public class RandomComputerPlayer extends BasicPlayer {
    WekaPlayer wekaPlayer;

    public RandomComputerPlayer(String id, PlayerPosition pos) {
        super(id, pos);
    }

    @Override
    public void updateTrumpSet(GameState gameState) {
        if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition())) {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    x();
                }
            }, 4000);

        }

    }


    @Override
    public void updateTrumpRevealed(GameState gameState) {

    }

    public void x() {
        gameState.playMove(this, super.playCard());
    }


    @Override
    public void updateMove(GameState gameState, Move currentMove) {
        if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && gameState.getCurrentRound().getCurrentPlayerPosition().equals(this.getPlayerPosition())) {
            if (gameState.getCurrentRound().getMoves().size() == 0) {
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        x();
                    }
                }, 3000);


            } else {
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        x();
                    }
                }, 1000);

            }
        }
    }

    @Override
    public TwentyNineCard nextMove() {
        if (gameState.canRevealTrump(this)) {
            gameState.revealTrump(this);

        }
        List<TwentyNineCard> allowedCards = allowedCards(this.remainingCards, this.getId());

        for (TwentyNineCard card : allowedCards) {
            if (gameState.isTrumpRevealed() && card.getSuit().equals(gameState.getTrumpCard().getSuit())) {
                return card;
            }
        }
        //PLay trump

        int pickCardId = new Random().nextInt(allowedCards.size());
        return allowedCards.get(pickCardId);

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

    public class TwentyNineGamePlay {
        public void updatePlayerMove(String gameId, String playerId, Card card) {
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


    public void setTrumpCard(final GameState gameState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gameState.setTrumpCard(trumpCard, isSeventhCard);
            }
        }, 100);

    }


    private String getIntelligentTrump() {
        int max = -1;
        String suit = "D";
        if (CardHelper.filterBySuit(this.getAllCards(), "H").size() > max) {
            max = CardHelper.filterBySuit(this.getAllCards(), "H").size();
            suit = "H";
        }
        if (CardHelper.filterBySuit(this.getAllCards(), "D").size() > max) {
            max = CardHelper.filterBySuit(this.getAllCards(), "D").size();
            suit = "D";
        }
        if (CardHelper.filterBySuit(this.getAllCards(), "S").size() > max) {
            max = CardHelper.filterBySuit(this.getAllCards(), "S").size();
            suit = "S";
        }
        if (CardHelper.filterBySuit(this.getAllCards(), "C").size() > max) {
            max = CardHelper.filterBySuit(this.getAllCards(), "C").size();
            suit = "C";
        }

        return suit;
    }

    /*
    @Override
    public void makeBid(final GameState gameState, Call call) {
        final Player player = this;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (gameState.getBidding().getBiddingStatus().equals(Bidding.BiddingStatus.IN_PROGRESS)) {
                    if (gameState.getBidding().getCurrentBidder().equals(player.getPlayerPosition())) {

                        Call nextCall = new Call(player);
                        // make next bid with probability of .75
                        if (new Random().nextFloat() < .7) {
                            nextCall.setBidAmount(gameState.getBidding().getMinimumNextBidAmount(player.getPlayerPosition()));
                        } else {
                            nextCall.setIsPass(true);
                        }
                        gameState.call(nextCall);
                    }
                }
            }
        }, 500);

    }
   */

}
