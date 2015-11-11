package debakesh.com.twentynine.player;

import com.card.common.card.Card;
import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 10/7/2015.
 */
public class AIPlayer extends Player {
    Map<String, List<TwentyNineCard>> cardPlayedBySuit = new HashMap<>();
    Map<String, PlayerPosition> suitToTrumpMade = new HashMap<>();
    TwentyNineCard trumpCard;
    boolean isSeventhCard = false;

    Call maxBid;

    @Override
    public void updatePairRevealed(GameState gameState) {

    }

    @Override
    public void setTrumpCard(GameState gameState) {
        if (isSeventhCard) {
            trumpCard = allCards.get(6);
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
                point = 16;
            } else if (new Random().nextFloat() < 0.7) {
                this.isSeventhCard = true;
                point = 16;
            } else {
                point = -1;
            }
        } else if (maxColorCardCount == 3) {
            if (new Random().nextFloat() < 0.1) {
                point = 16;
            } else if (new Random().nextFloat() < 0.8) {
                point = 17;
            } else {
                point = -1;
            }
        } else if (maxColorCardCount == 4) {
            if (new Random().nextFloat() < 0.1) {
                point = 16;
            } else if (new Random().nextFloat() < 0.4) {
                point = 17;
            } else {
                point = 18;
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


    @Override
    public void updateTrumpSet(GameState gameState) {

    }

    @Override
    public void updateTrumpRevealed(GameState gameState) {

    }


    @Override
    public void updateBidComplete(GameState gameState) {

    }

    @Override
    public void updateBid(GameState gameState, Call call) {

    }

    Map<String, List<Card>> suitToRemainingCardMap = new HashMap<>();

    public AIPlayer(String id, PlayerPosition pos) {

        super(id, pos);
        cardPlayedBySuit.put("H", new ArrayList<TwentyNineCard>());
        cardPlayedBySuit.put("C", new ArrayList<TwentyNineCard>());
        cardPlayedBySuit.put("S", new ArrayList<TwentyNineCard>());
        cardPlayedBySuit.put("D", new ArrayList<TwentyNineCard>());
    }

    @Override
    public TwentyNineCard nextMove() {
        return null;
    }

    public double probabilityOfTrump(TwentyNineCard card, GameState gameState, Player player) {
        //if last player no chance of trump
        //else
        int suitWithMe = CardHelper.filterBySuit(player.getRemainingCards(), card.getSuit()).size();
        boolean trumpRevealedToMe = gameState.isTrumpRevealed() || gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(player.getPlayerPosition());

        if (suitWithMe <= 4 || (card.getSuit().equals(gameState.getTrumpCard().getSuit()) && trumpRevealedToMe)) {
            return 0.0;
        } else {
            return 1.0;
        }
    }


    public TwentyNineCard partnerLosingMoveThirdOrFourthPlayer() {
        //If partner is losing,
        //if you cannot trump
        //a> See if you have the remaining high card, Play it if you have
        //b> Play a small card if you do not have winning card
        //if you can trump
        //see the points in this round
        return null;
    }

    //When player have only one card and partner is winning, and you do not have suit
    //and this is the first hand
    TwentyNineCard nonTrumpPartnerWinningMove(GameState gameState, Player player, List<TwentyNineCard> allowedCards) {
        if (gameState.getCurrentRound().getMoves().size() >= 3)
            return null;
        List<TwentyNineCard> roundSuits = (List<TwentyNineCard>) CardHelper.filterBySuit(allowedCards, gameState.getCurrentRound().getRoundSuit());
        if (roundSuits.size() != 0)
            return null;
        if (PlayerHelper.isPartner(gameState.getCurrentRound().findHighestMove().getPlayerPosition(), player.getPlayerPosition())) {
            if (new Random().nextFloat() < 0.6) {
                List<TwentyNineCard> hearts = (List<TwentyNineCard>) CardHelper.filterBySuit(allowedCards, "H");
                List<TwentyNineCard> diamonds = (List<TwentyNineCard>) CardHelper.filterBySuit(allowedCards, "H");
                List<TwentyNineCard> spade = (List<TwentyNineCard>) CardHelper.filterBySuit(allowedCards, "H");
                List<TwentyNineCard> clubs = (List<TwentyNineCard>) CardHelper.filterBySuit(allowedCards, "H");

                if (gameState.getCurrentRoundNumber() <= 4) {
                    if (hearts.size() == 1)
                        return hearts.get(0);
                    if (diamonds.size() == 1)
                        return diamonds.get(0);
                    if (spade.size() == 1)
                        return spade.get(0);
                    if (clubs.size() == 1)
                        return clubs.get(0);

                }
            }
            if (new Random().nextFloat() < 0.8) {
                //or play something for which lowest suit is played and you have one suit
                //Play something you have the highest type non jack and
                int maxPoint = Integer.MIN_VALUE;
                TwentyNineCard maxCard = null;
                for (TwentyNineCard allowedCard : allowedCards) {
                    if (maxPoint < allowedCard.getPoints()) {
                        maxCard = allowedCard;
                        maxPoint = maxCard.getPoints();
                    }
                }
                return maxCard;

            }
        }
        return null;
    }


    public void cheat() {
        //Check your partner have a trump play it
        //play point when your partner wins ()
        //if opponent only have pair, break the par
        //Play a random card if your J is going to be trumped
        //Don't trump if it is going to be overtrumped
        //Play a low card if partner is winning but it is going to be trumped
    }


    public TwentyNineCard firstCard(GameState gameState) {
        TwentyNineCard jack = playJack(gameState);
        if (jack != null)
            return jack;
        //Else if I color, and count of color is more than 3 do not have jack play a low card
        if (gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(this.getPlayerPosition())) {
            List<TwentyNineCard> trumpSuits = (List<TwentyNineCard>) CardHelper.filterBySuit(remainingCards, gameState.getTrumpCard().getSuit());
            List<TwentyNineCard> trumpJack = (List<TwentyNineCard>) CardHelper.filterByNumber(trumpSuits, gameState.getTrumpCard().getSuit());
            if (null == trumpJack) {
                List<TwentyNineCard> trumpLowCards = (List<TwentyNineCard>) CardHelper.filterBySuitAndNumbers(remainingCards, gameState.getTrumpCard().getSuit(), Arrays.asList("7", "8", "Q"));
                if (trumpLowCards.size() == 0)
                    return null;
                if (new Random().nextFloat() < .6) {
                    return trumpLowCards.get(new Random().nextInt(trumpLowCards.size() - 1));
                }
                //Plat low card
            }
            //If trump suit is more than 3
        } else {

            //This guy will try to find out what the color is, try for small card for which he do not have Jack
        }

        return null;
        //go by sequencing probability
    }

    public void trump() {
        //If opponent is winning
        //If I am third/fourth player trump if points >=2, trump with lowest card if J of trump is gone
        //If I am second player trump with .25 probability if first card is not J

        // Do not give K and Q trump if you have pair and have not won a set
    }

    public void overTrump() {

        //If opponent is winning almost always overtrump

    }


    TwentyNineCard playJack(GameState gameState) {
        List<TwentyNineCard> allJacks = (List<TwentyNineCard>) CardHelper.filterByNumber(this.getRemainingCards(), "J");
        if (null == allJacks || allJacks.isEmpty())
            return null;
        boolean jackPlayed = false;
        for (TwentyNineCard jack : allJacks) {
            double trumpProb = probabilityOfTrump(jack, gameState, this);
            if (trumpProb < 0.5) {
                if (new Random().nextFloat() < 0.8) {
                    return jack;
                }
            }
        }
        return null;
    }

    @Override
    public void updateMove(GameState gameState, Move move) {
        this.cardPlayedBySuit.get(move.getCard().getSuit()).add(move.getCard());
        //Non trump
        //Play cheat card with low probability Probability should be in the low range a bit higher for expert player
        //Cheat mode1, see what your partner can trump and play that

        //Player1 logic
        //1>Play J if chance of trump is less (i.e I do not have many card of the same suit) (Ply with prob of .75)
        //2> If not Play low card which have max number of occurance by a probability distribution (both non point and suit)
        //Player2 logic
        //Same as above
        //Player3 Logic
        //If your team will win with high probability, give point,
        // in case you do not have the suit try to give 9 of other ,
        // otherwise try to remove some suit which have one occurance and not yet played(becomes higher probability)
        //Player4 Logic
        //Same

        //reveal trump
        //If your team is winning do not trump
        //If opponent is winning do not trump unless the max point in this round >=3 )
        //


        //If none of the card are chosen play at random
        //For trump Player

        //Trump
        //If you have trump J play with probability a
        //If your partner is winning
    }

    public enum AILevel {EASY, MEDIUM, HARD}

}
