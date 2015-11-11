package debakesh.com.twentynine.player;

import android.os.Handler;

import com.card.common.card.Card;
import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import debakesh.com.twentynine.entity.Bidding;
import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 9/24/2015.
 */
public abstract class Player implements IPlayer {
    //Given a board state what is the next move
    protected List<TwentyNineCard> firstHandCards = new ArrayList<>();
    protected List<TwentyNineCard> remainingCards = new ArrayList<>();
    protected List<TwentyNineCard> playedCards = new ArrayList<>();
    protected List<TwentyNineCard> allCards = new ArrayList<>();

    public List<TwentyNineCard> getRemainingCards() {
        return remainingCards;
    }

    public List<TwentyNineCard> getAllCards() {
        return allCards;
    }

    protected GameState gameState;

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    protected PlayerPosition playerPosition;
    private String id;

    public List<TwentyNineCard> getFirstHandCards() {
        return firstHandCards;
    }

    public PlayerPosition getPartnerPosition() {
        if (playerPosition.equals(PlayerPosition.BOTTOM))
            return PlayerPosition.TOP;
        else if (playerPosition.equals(PlayerPosition.LEFT))
            return PlayerPosition.RIGHT;
        else if (playerPosition.equals(PlayerPosition.TOP))
            return PlayerPosition.BOTTOM;
        else if (playerPosition.equals(PlayerPosition.RIGHT))
            return PlayerPosition.LEFT;
        else
            throw new IllegalArgumentException("Invalid playerposition for " + playerPosition);
    }


    @Override
    public abstract TwentyNineCard nextMove();

    @Override
    public abstract void updateMove(GameState gameState, Move move);

    public abstract void setTrumpCard(GameState gameState);

    @Override
    public void updateBidComplete(GameState gameState) {
        Bidding bidding = gameState.getBidding();
        if (bidding.getWinningCall().getCallingPlayer().getPlayerPosition().equals(this.getPlayerPosition())) {
            setTrumpCard(gameState);
        }
    }

    @Override
    public void updateBid(GameState gameState, Call call) {
        if (gameState.getBidding().getBiddingStatus().equals(Bidding.BiddingStatus.IN_PROGRESS) && this.getPlayerPosition().equals(gameState.getBidding().getCurrentBidder())) {
            makeBid(gameState, call);
        }

    }

    public abstract void makeBid(GameState gameState, Call call);

    public Player(String id, PlayerPosition pos) {
        this.id = id;
        this.playerPosition = pos;
    }

    public void clearHand() {
        firstHandCards = new ArrayList<>();
        remainingCards = new ArrayList<>();
        allCards = new ArrayList<>();
        playedCards = new ArrayList<>();
    }

    public void setFirstHand(List<TwentyNineCard> cards) {
        allCards.addAll(cards);
        if (!firstHandCards.isEmpty())
            throw new IllegalArgumentException("First hand non empty");
        firstHandCards.addAll(cards);
        remainingCards.addAll(cards);
    }

    public void setSecondHand(List<TwentyNineCard> cards) {
        allCards.addAll(cards);
        remainingCards.addAll(cards);
    }

    public PlayerPosition getPlayerPosition() {
        return playerPosition;
    }

    public String getId() {
        return id;
    }

    public TwentyNineCard playCard() {
        TwentyNineCard playingCard = nextMove();
        updateCardAfterPlay(playingCard);
        //validate
        return playingCard;
    }

    protected void updateCardAfterPlay(TwentyNineCard playingCard) {
        //may update in the notify also once the server asks to notify
        removeCard(remainingCards, playingCard);
        playedCards.add(playingCard);

    }


    private void removeCard(List<TwentyNineCard> cards, TwentyNineCard card) {
        for (Iterator<TwentyNineCard> iter = cards.listIterator(); iter.hasNext(); ) {
            TwentyNineCard d = iter.next();
            if (d.getId().equals(card.getId())) {
                iter.remove();
            }
        }

    }

    public List<TwentyNineCard> allowedCards(List<TwentyNineCard> cards, String playerId) {
        List<TwentyNineCard> inputCards = new ArrayList<>(cards);

        if (!gameState.isTrumpRevealed() && gameState.isSeventhCard() && gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(this.playerPosition)) {
            //If the game is seventh card and the player in this position called the seventh card
            removeCard(inputCards, this.getAllCards().get(6));
        }
        Round round = gameState.getCurrentRound();
        List<TwentyNineCard> allowedCards = new ArrayList<>();
        if (round.getMoves().size() == 0) {
            allowedCards.addAll(inputCards);
            return allowedCards;
        }


        for (TwentyNineCard c : inputCards) {
            if (c.getSuit().equals(round.getRoundSuit())) {
                allowedCards.add(c);
            }
        }
        if (allowedCards.size() > 0)
            return allowedCards;

        if (gameState.isTrumpRevealed() && gameState.getCurrentRoundNumber().equals(gameState.getTrumpRevealedTime().getRoundNumber())) {
            List<TwentyNineCard> trumpCards = (List<TwentyNineCard>) CardHelper.filterBySuit(remainingCards, gameState.getTrumpCard().getSuit());
            if (gameState.getTrumpRevealedTime().getPlayer().getPlayerPosition().equals(this.getPlayerPosition())) {
                //If trump is revealed in this move then only trump suit can eb played if it is their
                if (trumpCards.size() > 0) {
                    return trumpCards;
                }
            } else {
                //Do not allow under trump
                Move currentHighestMove = gameState.getCurrentRound().findHighestMove();
                List<TwentyNineCard> overTrumps = new ArrayList<>();
                List<TwentyNineCard> underTrumps = new ArrayList<>();
                if (currentHighestMove.getCard().getSuit().equals(gameState.getTrumpCard().getSuit())) {
                    //If the winning move is a trump, then we need something over that
                    allowedCards.addAll(inputCards);
                    for (TwentyNineCard card : allowedCards) {
                        if (card.getSuit().equals(gameState.getTrumpCard().getSuit()) && card.getOrder() > currentHighestMove.getCard().getOrder()) {
                            underTrumps.add(card);
                        }
                    }
                    if (underTrumps != null) {
                        for (TwentyNineCard card : underTrumps) {
                            removeCard(allowedCards, card);
                        }
                    }
                    if (allowedCards.size() > 0) {
                        //return only overtrump + other cards after eliminating the undertrumps
                        return allowedCards;
                    } else {
                        //All the cards are undertrump so allow any of themm
                        return inputCards;
                    }
                }
            }
        }


        //Need to prevent undertrump
        allowedCards.addAll(inputCards);
        //No card of the same suit avalaible
        return allowedCards;
    }


}
