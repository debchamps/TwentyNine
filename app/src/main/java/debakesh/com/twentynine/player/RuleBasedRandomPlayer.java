package debakesh.com.twentynine.player;

import android.os.Handler;
import android.util.Log;

import com.card.common.card.Card;
import com.card.common.card.CardHelper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import debakesh.com.twentynine.entity.Bidding;
import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.move.PlayAnySelectedRandomly;
import debakesh.com.twentynine.move.ProbabilisticCardStrategy;

/**
 * Created by debarghy on 10/29/2015.
 */
public class RuleBasedRandomPlayer extends BasePlayer {

    WekaPlayer3 player;
    @Override
    public void updateBid(final GameState gameState, final Call call) {

        if (gameState.getBidding().getBiddingStatus().equals(Bidding.BiddingStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getCurrentBidder())) {
            if (isHumanPlayerEnabled) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        makeBid(gameState, call);
                    }
                }, 100);
            } else {
                makeBid(gameState, call);
            }

        }

    }

    boolean isHumanPlayerEnabled = true;


    public RuleBasedRandomPlayer(String id, PlayerPosition pos) {
        super(id, pos);
        isHumanPlayerEnabled = true;
    }

    public RuleBasedRandomPlayer(String id, PlayerPosition pos, boolean isHumanPlayerEnabled) {
        super(id, pos);
        this.isHumanPlayerEnabled = isHumanPlayerEnabled;
    }

    @Override
    public void setTrumpCard(final GameState gameState) {
        if (isHumanPlayerEnabled) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    gameState.setTrumpCard(trumpCard, isSeventhCard);
                }
            }, 100);
        } else {
            gameState.setTrumpCard(trumpCard, isSeventhCard);
        }

    }

    @Override
    public void updateTrumpRevealed(GameState gameState) {

    }

    @Override
    public void updatePairRevealed(GameState gameState) {

    }

    @Override
    public void updateTrumpSet(GameState gameState) {
        if (isHumanPlayerEnabled) {
            if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition())) {
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        RuleBasedRandomPlayer.this.gameState.playMove(RuleBasedRandomPlayer.this, RuleBasedRandomPlayer.this.playCard());
                    }
                }, 4000);
            }
        }
    }

    protected Map<PlayerPosition, Integer> getRoundStartCount(GameState gameState) {
        Map<PlayerPosition, Integer> roundStartCount = new HashMap<>();
        roundStartCount.put(PlayerPosition.TOP, 0);
        roundStartCount.put(PlayerPosition.BOTTOM, 0);
        roundStartCount.put(PlayerPosition.LEFT, 0);
        roundStartCount.put(PlayerPosition.RIGHT, 0);
        for(Round round : gameState.getPlayedRounds()) {
            roundStartCount.put(round.getMoves().get(0).getPlayerPosition(), roundStartCount.get(round.getMoves().get(0).getPlayerPosition()) + 1);
        }
        return roundStartCount;
    }

    //Normal Suit Moves
    //Trump Moves
    //Non trump non suit moves

    @Override
    public TwentyNineCard nextMove() {
        try {
            if (gameState.canRevealTrump(this)) {
//            if(super.roundPoints() >=1) {
                gameState.revealTrump(this);
//            }
            }
            if (gameState.getCurrentRound().getMoves().size() == 0) {
                return playerSequenceOneMove();
            }
            if (gameState.getCurrentRound().getMoves().size() == 1) {
                return playerSequenceTwoMove();
            }
            if (gameState.getCurrentRound().getMoves().size() == 2) {
                return playerSequenceThreeMove();
            }
            if (gameState.getCurrentRound().getMoves().size() == 3) {
                return playerSequenceFourMove();
            }

        }catch (Exception e) {
            e.printStackTrace();;
            throw e;
        }
        throw new IllegalArgumentException("Cods should not come here");
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
    public void updateMove(GameState gameState, Move move) {
        if (gameState.getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && gameState.getCurrentRound().getCurrentPlayerPosition().equals(this.getPlayerPosition())) {
            if (gameState.getCurrentRound().getMoves().size() == 0) {
                if (isHumanPlayerEnabled) {
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            RuleBasedRandomPlayer.this.gameState.playMove(RuleBasedRandomPlayer.this, RuleBasedRandomPlayer.this.playCard());

                        }
                    }, 3000);
                } else {
                    this.gameState.playMove(this, this.playCard());

                }


            } else {
                if (isHumanPlayerEnabled) {
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            RuleBasedRandomPlayer.this.gameState.playMove(RuleBasedRandomPlayer.this, RuleBasedRandomPlayer.this.playCard());

                        }
                    }, 1000);
                } else {
                    this.gameState.playMove(this, this.playCard());

                }

            }
        }
    }


    public TwentyNineCard playHighestCardWithNoTrump(List<TwentyNineCard> cards) {
//        super.trum
        int trumpOthers  = super.trumpSuitRemainingOthers();
        if(trumpOthers <=1) {
            return null;
        }
        List<String> suits = Arrays.asList("H", "D", "C", "S");
        for(String ssuit : suits) {
            if(!ssuit.equals(gameState.getTrumpCard().getSuit())) {
                TwentyNineCard highCard = super.getHighestSuitedCardWithMe(cards, ssuit);
                if(highCard != null) {
                    Log.i("RandomPLayer", "Playing high card");
                    return highCard;
                }

            }
        }
        return null;
    }

    public TwentyNineCard playCardWithProbability(TwentyNineCard card, double probability) {
        if (new Random().nextFloat() < probability)
            return card;
        return null;
    }

    TwentyNineCard playerSequenceOneMove() {
        //Play Jack if you have
        //Play non 9, if you have not set trump play something with more occurance,
        TwentyNineCard playCard = null;

        playCard = super.playRandomJack(remainingCards);
        if (playCard != null)
            return playCard;



        playCard = playHighestCardWithNoTrump(remainingCards);
        if (playCard != null)
            return playCard;

        String suit = super.getMaxSuit();

        if(gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(this.getPlayerPosition())) {
            if(suit.equals(gameState.getTrumpCard())) {
                suit = Arrays.asList("H", "D", "S", "C").get(new Random().nextInt(4));
            }
        }

        //If other do not have any trump, play any highest remaining card


        List<TwentyNineCard> sevens = CardHelper.filterByNumber(remainingCards, "7");
        if(sevens != null && !sevens.isEmpty())
            return sevens.get(0);
        List<TwentyNineCard> eights = CardHelper.filterByNumber(remainingCards, "8");
        if(eights != null && !eights.isEmpty())
            return eights.get(0);
        List<TwentyNineCard> kings = CardHelper.filterByNumber(remainingCards, "K");
        if(kings != null && !kings.isEmpty())
            return kings.get(0);
        List<TwentyNineCard> queens =  CardHelper.filterByNumber(remainingCards, "Q");
        if(queens != null && !queens.isEmpty())
            return queens.get(0);

        playCard = super.playRandomly(allCards, suit, Arrays.asList("7", "8"));
        if (playCard != null)
            return playCard;

        //If trump  suiter have played
        playCard = super.playRandomly(allCards, suit, Arrays.asList("K", "Q"));
        if (playCard != null)
            return playCard;

        playCard = super.playRandomly(allCards, suit, Arrays.asList("A", "10"));
        if (playCard != null)
            return playCard;


        TwentyNineCard card = null;
        if (gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(getPlayerPosition())) {
            //Play color small card if I do not have Jack


        } else {

            playCardWithProbability(super.playPointlessCard(remainingCards, super.getMaxSuit()), .7);


        }
        return remainingCards.get(new Random().nextInt(remainingCards.size()));
    }

    TwentyNineCard playerSequenceTwoMove() {
        TwentyNineCard playCard = null;
        String roundSuit = gameState.getCurrentRound().getRoundSuit();
        List<TwentyNineCard> allowedCards = allowedCards(remainingCards, this.getId());
        if (allowedCards.size() == 1)
            return allowedCards.get(0);


        new ProbabilisticCardStrategy(new PlayAnySelectedRandomly(CardHelper.filterByNumber(allowedCards, "J")), 0.9);
        new ProbabilisticCardStrategy(new PlayAnySelectedRandomly(CardHelper.filterBySuitAndNumbers(allowedCards, roundSuit, Arrays.asList("7", "8"))), 0.9);
        new ProbabilisticCardStrategy(new PlayAnySelectedRandomly(CardHelper.filterBySuitAndNumbers(allowedCards, roundSuit, Arrays.asList("K", "Q"))), 0.9);
        new ProbabilisticCardStrategy(new PlayAnySelectedRandomly(CardHelper.filterBySuitAndNumbers(allowedCards, roundSuit, Arrays.asList("A", "10"))), 0.9);


        //Play Jack if you have
        playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
        if (playCard != null)
            return playCard;


        playCard = playHighestCardWithNoTrump(allowedCards);
        if (playCard != null)
            return playCard;

        playCard = super.playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("7", "8"));
        if (playCard != null)
            return playCard;

        //If trump  suiter have played
        playCard = super.playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("K", "Q"));
        if (playCard != null)
            return playCard;

        playCard = super.playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("A", "10"));
        if (playCard != null)
            return playCard;

        if (gameState.getCurrentRound().getMoves().get(0).getCard().getNumber().equals("J")) {
            playCard = super.playPointlessCard(allowedCards, gameState.getCurrentRound().getRoundSuit());
            if(playCard != null)
                return playCard;
        }

        //Play either of A/10 or pointless card with equal probability


        List<String> singleSuit = super.getInitialSuitWithCount(1);
        for (String ssuit : singleSuit) {
            List<TwentyNineCard> singleCards = super.getCardBySit(ssuit);
            if (singleCards != null && !singleCards.isEmpty()) {
                if (singleCards.get(0).getPoints() == 0)
                    return singleCards.get(0);
                if (singleCards.get(0).getPoints() == 1)
                    return singleCards.get(0);
            }
        }


        //Trump if you do nat have suit and first player have played J/9/A/10 or the point


        return allowedCards.get(new Random().nextInt(allowedCards.size()));
    }

    TwentyNineCard playerSequenceThreeMove() {
        TwentyNineCard playCard = null;
        //Play Jack if you have and player two have not trumped
        //Trump if you do nat have suit and second player is winning
        //Give highest card if partner is winning
        //Give lowsedt
        List<TwentyNineCard> allowedCards = allowedCards(remainingCards, this.getId());

        //Have round suit moves
        boolean isTeamWinning = gameState.getCurrentRound().findHighestMove().getPlayerPosition().equals(getPartnerPosition()) ? true : false;
        boolean isTrumpMove = !gameState.getCurrentRound().findHighestMove().getCard().getSuit().equals(gameState.getCurrentRound().getRoundSuit());


        playCard = playHighestCardWithNoTrump(allowedCards);
        if (playCard != null && !isTrumpMove)
            return playCard;
        //Also check if the highest card was the highest remaining card of that suit

        TwentyNineCard remainingHighCard = super.getHighestCardRemainingOthers(gameState.getCurrentRound().getRoundSuit());
        //If my partner is winnign and opponent do not have a bigger card or partner have trumped

        //Check if opponent have trumped
        if(isTeamWinning) {
            //May check trump chance of third player
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
         //   if (playCard != null)
         //       return playCard;

        }
        if (!isTeamWinning && !isTrumpMove)
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
        if (playCard != null)
            return playCard;
        if ((isTeamWinning && remainingHighCard.getOrder() > gameState.getCurrentRound().findHighestMove().getCard().getOrder()) || isTrumpMove) {
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "9");
            if (playCard != null)
                return playCard;
        } else {
            playCard = playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("7", "8"));
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("K", "Q"));
            if (playCard != null)
                return playCard;
        }
        playCard = playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("10", "A"));
        if (playCard != null)
            return playCard;


        /** CASES where I have trump suits in my allowed card and  I have trumped*/
        //Get all the trump suits
        //If poits is low should not play trump or partner is not winning
        boolean shouldPlayTrump = !isTeamWinning;

        if (gameState.isTrumpRevealed() && shouldPlayTrump) {
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getTrumpCard().getSuit(), "9");
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getTrumpCard().getSuit(), Arrays.asList("10", "A"));
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getTrumpCard().getSuit(), Arrays.asList("7", "8"));
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getTrumpCard().getSuit(), Arrays.asList("K", "Q"));
            if (playCard != null)
                return playCard;
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
            if (playCard != null)
                return playCard;
        }


        /** Trump use case is completed */


        /** Cases where I do not have trump or decided not to reveal the trump  or I do not want to play the trump*/

        List<String> singleSuits = getInitialSuitWithCount(1);
        if (isTeamWinning) {
            List<TwentyNineCard> cards = filterByNumber(Arrays.asList("9"));
            filterNonTrumpCards(cards);
            cards = filterByNumber(Arrays.asList("A", "10"));
            filterNonTrumpCards(cards);
            //play 9   of non trump suit
            //play A, 10   of non trump suit
        } else {
            List<TwentyNineCard> cards = filterByNumber(Arrays.asList("7", "8", "K", "Q"));
            filterNonTrumpCards(cards);
            //play low card of non trump suit
        }

        for (String ssuit : singleSuits) {
            //I fpointless play with high probability
            //If 10/A play with low probability
        }


        return allowedCards.get(new Random().nextInt(allowedCards.size()));
    }

    TwentyNineCard playerSequenceFourMove() {
        //Very similar to 3 move


        TwentyNineCard playCard = null;
        //Play Jack if you have and player two have not trumped
        //Trump if you do nat have suit and second player is winning
        //Give highest card if partner is winning
        //Give lowsedt
        List<TwentyNineCard> allowedCards = allowedCards(remainingCards, this.getId());

        //Have round suit moves
        boolean isTeamWinning = gameState.getCurrentRound().findHighestMove().getPlayerPosition().equals(getPartnerPosition()) ? true : false;
        boolean isTrumpMove = !gameState.getCurrentRound().findHighestMove().getCard().getSuit().equals(gameState.getCurrentRound().getRoundSuit());

        playCard = playHighestCardWithNoTrump(allowedCards);
        if (playCard != null)
            return playCard;

        //Also check if the highest card was the highest remaining card of that suit

        //If my partner is winnign and opponent do not have a bigger card or partner have trumped

        //Check if opponent have trumped
        if(isTeamWinning)
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
        if (!isTeamWinning && !isTrumpMove)
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
        if (playCard != null)
            return playCard;
        if (isTeamWinning) {
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "9");
            if (playCard != null)
                return playCard;
        } else {
            playCard = playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("7", "8"));
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("K", "Q"));
            if (playCard != null)
                return playCard;
        }
        playCard = playRandomly(allowedCards, gameState.getCurrentRound().getRoundSuit(), Arrays.asList("10", "A"));
        if (playCard != null)
            return playCard;


        /** CASES where I have trump suits in my allowed card and  I have trumped*/
        //Get all the trump suits
        //If poits is low should not play trump or partner is not winning
        boolean shouldPlayTrump = !isTeamWinning;

        if (gameState.isTrumpRevealed() && shouldPlayTrump) {
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getTrumpCard().getSuit(), "9");
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getTrumpCard().getSuit(), Arrays.asList("10", "A"));
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getTrumpCard().getSuit(), Arrays.asList("7", "8"));
            if (playCard != null)
                return playCard;
            playCard = playRandomly(allowedCards, gameState.getTrumpCard().getSuit(), Arrays.asList("K", "Q"));
            if (playCard != null)
                return playCard;
            playCard = playCardWithNumberAndSuit(allowedCards, gameState.getCurrentRound().getRoundSuit(), "J");
            if (playCard != null)
                return playCard;
        }


        /** Trump use case is completed */


        /** Cases where I do not have trump or decided not to reveal the trump  or I do not want to play the trump*/

        List<String> singleSuits = getInitialSuitWithCount(1);
        if (isTeamWinning) {
            List<TwentyNineCard> cards = filterByNumber(Arrays.asList("9"));
            filterNonTrumpCards(cards);
            cards = filterByNumber(Arrays.asList("A", "10"));
            filterNonTrumpCards(cards);
            //play 9   of non trump suit
            //play A, 10   of non trump suit
        } else {
            List<TwentyNineCard> cards = filterByNumber(Arrays.asList("7", "8", "K", "Q"));
            filterNonTrumpCards(cards);
            //play low card of non trump suit
        }

        for (String ssuit : singleSuits) {
            //I fpointless play with high probability
            //If 10/A play with low probability
        }


        return allowedCards.get(new Random().nextInt(allowedCards.size()));
    }
}
