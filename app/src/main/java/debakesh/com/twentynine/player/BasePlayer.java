package debakesh.com.twentynine.player;

import com.card.common.card.Card;
import com.card.common.card.CardFactory;
import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.helper.factory.TwentyNineCardDistributionFactory;
import debakesh.com.twentynine.util.CardConstant;

/**
 * Created by debarghy on 10/26/2015.
 */
public abstract class BasePlayer extends Player {

    TwentyNineCard trumpCard;
    boolean isSeventhCard = false;
    Call maxBid;

    public BasePlayer(String id, PlayerPosition pos) {
        super(id, pos);
    }

    public void playSeqenceOne() {

    }

    public void playSeqenceTwo() {

    }

    public void playSeqenceThree() {

    }


    public void playSeqenceFour() {
        //Check if I have round suit
        //Check who is winning the round
        //If I have winning card play the highest winnin card if it is not trump and


        //If i have round suit
        //If trump not revealed or round suit not truno suit
        //If partner is winning
        //play the highest card
        //If opponent is winning
        //Can i win the round
        //Yes Play high card
        //Mo play low card
        //play low card
        //If trump revealed
        //If round suit is trump suit
        //
        //If partner is winning

    }

    boolean isTrumpKnown() {
        return false;

    }



    protected List<TwentyNineCard> filterNonTrumpCards(List<TwentyNineCard> cards) {
        if(gameState.isTrumpRevealed() || playerPosition.equals(gameState.getGameTarget().getCallingPlayer().getPlayerPosition())) {
            List<TwentyNineCard> nonTrumpCards = new ArrayList<>();
            for(TwentyNineCard card : cards) {
                if(!card.getSuit().equals(gameState.getTrumpCard().getSuit())) {
                    nonTrumpCards.add(card);
                }
            }
            return nonTrumpCards;
        }
        //Trump not revealed sending the original list
        return cards;
    }

    protected TwentyNineCard playLowestCard(List<TwentyNineCard> cards , String suit) {
        return CardHelper.getLowCard((List<TwentyNineCard>) CardHelper.filterBySuit(cards, suit));
    }

    protected List<TwentyNineCard> filterByNumber(List<String> numbers) {
        List<TwentyNineCard> numberCards = new ArrayList<>();
        for(String num : numbers) {
            List<TwentyNineCard> ncards = (List<TwentyNineCard>) CardHelper.filterByNumber(this.remainingCards, num);
            if(ncards != null) {
                numberCards.addAll(ncards);
            }
        }
        return numberCards;
    }

    protected int roundPoints() {
        int points = 0;
        List<TwentyNineCard> cardRound = new ArrayList<>();
        for (Move move : gameState.getCurrentRound().getMoves()) {
            points += move.getCard().getPoints();
        }
        return points;
    }

    protected TwentyNineCard playPointlessCard(List<TwentyNineCard> cards ,String suit) {
        List<TwentyNineCard> pointlessCards = (List<TwentyNineCard>) CardHelper.filterBySuitAndNumbers(cards, suit, Arrays.asList("7", "8", "K", "Q"));
        if (pointlessCards != null && pointlessCards.size() != 0) {
            return pointlessCards.get(new Random().nextInt(pointlessCards.size() - 1));
        }
        return null;
    }


    /**
     * Return all suit having @count numer of occurance  out of the 8 cards
     *
     * @param count
     * @return
     */
    List<String> getInitialSuitWithCount(int count) {
        List<String> suitWithCount = new ArrayList<>();
        Map<String, List<TwentyNineCard>> suitMap = CardHelper.groupBySuit(allCards);
        for (String key : suitMap.keySet()) {
            if (suitMap.get(key).size() == count) {
                suitWithCount.add(key);
            }
        }
        return suitWithCount;
    }


    @Override
    public void setTrumpCard(GameState gameState) {
        if(isSeventhCard) {
            trumpCard = this.getAllCards().get(6);
        }
        gameState.setTrumpCard(trumpCard, isSeventhCard);

    }

    String getMaxSuit() {
        Map<String, List<TwentyNineCard>> suitMap = CardHelper.groupBySuit(remainingCards);
        int maxCard = Integer.MIN_VALUE;
        String maxSuit = "";
        if (suitMap.get("H").size() > maxCard) {
            maxCard = suitMap.get("H").size();
            maxSuit = "H";
        }
        if (suitMap.get("D").size() > maxCard) {
            maxCard = suitMap.get("D").size();
            maxSuit = "D";
        }
        if (suitMap.get("S").size() > maxCard) {
            maxCard = suitMap.get("S").size();
            maxSuit = "S";
        }
        if (suitMap.get("C").size() > maxCard) {
            maxCard = suitMap.get("C").size();
            maxSuit = "C";
        }
        return maxSuit;
    }

    protected List<String> offSuits() {
        List<String> offSuits = new ArrayList<>();
        List<String> allSuits = Arrays.asList("D", "H", "S", "C");
        for (String suit : allSuits) {
            if (CardHelper.groupBySuit(allCards).get(suit).size() == 0) {
                offSuits.add(suit);
            }
        }
        return offSuits;
    }

    protected TwentyNineCard playRandomJack(List<TwentyNineCard> cards) {
        List<TwentyNineCard> jacks = CardHelper.filterByNumber(cards, "J");
        if (jacks != null && !jacks.isEmpty()) {
            return jacks.get(new Random().nextInt(jacks.size()));
        }
        return null;
    }

    protected TwentyNineCard playCardWithNumberAndSuit(List<TwentyNineCard> cards, String suit, String number) {

        return CardHelper.filterBySuitAndNumber(cards, suit, number);
    }

    protected boolean isSuitAbsent(String suit) {
        return CardHelper.groupBySuit(remainingCards).get(suit).size() == 0 ? true : false;
    }

    public boolean canTrump() {
        List<TwentyNineCard> roundSuitCards = CardHelper.filterBySuit(allCards, gameState.getCurrentRound().getRoundSuit());
        if (roundSuitCards.isEmpty())
            return true;
        return false;
    }


    protected int trumpSuitRemainingOthers() {
        int trumpSuitRemainingOthers = 0;
        List<TwentyNineCard> trumpSuitCards  = CardHelper.filterBySuit(gameState.getPlayedCards(), gameState.getTrumpCard().getSuit());
        List<TwentyNineCard> trumpSuitCardsRemainingMe  = CardHelper.filterBySuit(this.remainingCards, gameState.getTrumpCard().getSuit());
        int trumpPlayed = 0, trumpRemainingMe = 0;
        if(trumpSuitCards != null && !trumpSuitCards.isEmpty()) {
            trumpPlayed = trumpSuitCards.size();
        }
        if(trumpSuitCardsRemainingMe != null && !trumpSuitCardsRemainingMe.isEmpty()) {
            trumpRemainingMe = trumpSuitCardsRemainingMe.size();
        }
        return 8 - trumpPlayed - trumpRemainingMe;
    }


    /**
     * Returns the highest suited card which I have and no one else have a higher card at that moment
     * @param cards
     * @param suit
     * @return
     */
    protected TwentyNineCard getHighestSuitedCardWithMe(List<TwentyNineCard> cards, String suit) {
        TwentyNineCard otherHighCard = getHighestCardRemainingOthers(suit);
        if(otherHighCard == null)
            return null;
        List<TwentyNineCard> allowedSuitCards = CardHelper.filterBySuit(cards, suit);

        TwentyNineCard myHighCard = CardHelper.getHighCard(allowedSuitCards);
        if(myHighCard == null)
            return null;
        if( otherHighCard == null || otherHighCard.getOrder() > myHighCard.getOrder()) {
            return myHighCard;
        }
        return null;
    }

    protected TwentyNineCard getHighestCardRemainingOthers(String suit) {
        List<TwentyNineCard> suitedCardPlayed = CardHelper.filterBySuit(gameState.getPlayedCards(), suit);
        List<TwentyNineCard> suitedAllCards = CardHelper.filterBySuit(CardFactory.get29Deck(), suit);

        suitedAllCards.removeAll(suitedCardPlayed);
        suitedAllCards.removeAll(remainingCards);

        TwentyNineCard maxCard = null;
        int minOrder = Integer.MAX_VALUE;
        for (TwentyNineCard card : allCards) {
            if (card.getOrder() < minOrder) {
                maxCard = card;
                minOrder = card.getOrder();
            }
        }
        return maxCard;
    }


    protected List<TwentyNineCard> getCardBySit(String suit) {
        return CardHelper.filterBySuit(remainingCards, suit);
    }

    protected TwentyNineCard playRandomly(List<TwentyNineCard> cards, String suit, List<String> numbers) {
        List<TwentyNineCard> filteredRemaining = CardHelper.filterBySuitAndNumbers(cards, suit, numbers);
        if (filteredRemaining != null && !filteredRemaining.isEmpty()) {
            return filteredRemaining.get(new Random().nextInt(filteredRemaining.size()));
        }

        return null;

    }

    protected int roundStartCount(PlayerPosition pos) {
        int roundStarted = 0;
        for (Round r : gameState.getPlayedRounds()) {
            if (r.getMoves().size() >= 1 && r.getMoves().get(0).getPlayerPosition().equals(pos)) {
                roundStarted += 1;
            }
        }
        return roundStarted;
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
