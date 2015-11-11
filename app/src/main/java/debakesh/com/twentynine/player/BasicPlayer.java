package debakesh.com.twentynine.player;

import com.card.common.card.Card;
import com.card.common.card.CardHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 10/16/2015.
 */
public class BasicPlayer extends Player {

    TwentyNineCard trumpCard;
    boolean isSeventhCard = false;
    Call maxBid;


    public BasicPlayer(String id, PlayerPosition pos) {
        super(id, pos);
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

    @Override
    public void updateMove(GameState gameState, Move move) {
        throw new IllegalArgumentException("");
    }

    @Override
    public void setTrumpCard(GameState gameState) {
        if(isSeventhCard) {
            trumpCard = this.getAllCards().get(6);
        }
        gameState.setTrumpCard(trumpCard, isSeventhCard);
    }

    @Override
    public void makeBid(GameState gameState, Call call) {
        if (null == maxBid) {
            maxBid = maxBid();
        }

        Call nextCall = new Call(this);
        if (gameState.getBidding().getMinimumNextBidAmount(this.getPlayerPosition()) <= maxBid.getBidAmount()) {
            nextCall.setBidAmount(gameState.getBidding().getMinimumNextBidAmount(this.getPlayerPosition()));
            gameState.getBidding().call(nextCall);
        } else {
            nextCall.setIsPass(true);
        }
        gameState.call(nextCall);

    }

    @Override
    public void updateTrumpRevealed(GameState gameState) {
        if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition())) {
            updateMove(gameState, null);
        }
    }

    @Override
    public void updateTrumpSet(GameState gameState) {

    }

    @Override
    public void updatePairRevealed(GameState gameState) {

    }

    public Call maxBid() {
        boolean isColorJackThere = false, isColorPair = false;
        int maxColorCardCount = Integer.MIN_VALUE;
        int maxColortPoint = Integer.MIN_VALUE;
        String maxColor = "";
        List<String> COLOR_LIST = Arrays.asList("H", "C", "S", "D");
        Card selectedCard = null;

        for (String COLOR : COLOR_LIST) {
            List<TwentyNineCard> colorCards = (List<TwentyNineCard>) CardHelper.filterBySuit(this.getFirstHandCards(), COLOR);
            if (maxColorCardCount == colorCards.size()) {
                //Pick the one with max occurance
                int newColorPoint = CardHelper.sumPoint(colorCards);
                if (newColorPoint > maxColortPoint) {
                    maxColorCardCount = colorCards.size();
                    maxColortPoint = newColorPoint;
                    maxColor = COLOR;

                }
            } else if (maxColorCardCount < colorCards.size()) {
                maxColorCardCount = colorCards.size();
                maxColortPoint = CardHelper.sumPoint(colorCards);
                maxColor = COLOR;
            }
        }

        List<TwentyNineCard> colorJacks = (List<TwentyNineCard>) CardHelper.filterBySuitAndNumbers(this.getFirstHandCards(), maxColor, Arrays.asList("J"));
        List<TwentyNineCard> colorPair = (List<TwentyNineCard>) CardHelper.filterBySuitAndNumbers(this.getFirstHandCards(), maxColor, Arrays.asList("K", "Q"));
        if (colorJacks != null && !colorJacks.isEmpty()) {
            isColorJackThere = true;
        }
        if (colorPair != null && !colorPair.isEmpty() && 2 == colorPair.size()) {
            isColorPair = true;
        }

        int point = -1;
        if (maxColorCardCount == 1) {
            if (new Random().nextFloat() < 0.15) {
                point = 16;
            } else if (new Random().nextFloat() < 0.3) {
                this.isSeventhCard = true;
                point = 16;
            } else {
                point = -1;
            }
        } else if (maxColorCardCount == 2) {
            if (new Random().nextFloat() < 0.5) {
                point = 17;
            } else if (new Random().nextFloat() < 0.7) {
                this.isSeventhCard = true;
                point = 17;
            } else {
                point = -1;
            }
        } else if (maxColorCardCount == 3) {
            if (new Random().nextFloat() < 0.1) {
                point = 16;
            } else if (new Random().nextFloat() < 0.6) {
                point = 17;
            } else if (new Random().nextFloat() < 0.9) {
                point = 18;
            } else {
                point = -1;
            }
        } else if (maxColorCardCount == 4) {
            if (new Random().nextFloat() < 0.1) {
                point = 16;
            } else if (new Random().nextFloat() < 0.3) {
                point = 17;
            } else if (new Random().nextFloat() < 0.7) {
                point = 18;
            } else if (new Random().nextFloat() < 0.95) {
                point = 19;
            } else {
                point = 20;
            }
            //If I  have J then anything between 19 22
            // If i do nor habe J then
        }
        Call call = new Call(this);
        if (point > 0) {
            if (isColorJackThere) {
                point += 2;
            }
            if (isColorPair) {
                point += 2;
            }
            call.setIsPass(false);
            call.setBidAmount(point);
        } else {
            call.setIsPass(true);
        }
        if (!this.isSeventhCard) {
            trumpCard = new TwentyNineCard(maxColor, "2");
        }

        return call;

    }
}
