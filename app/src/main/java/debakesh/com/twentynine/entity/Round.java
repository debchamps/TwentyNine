package debakesh.com.twentynine.entity;


import java.util.ArrayList;
import java.util.List;

import debakesh.com.twentynine.helper.PlayerHelper;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;

/**
 * Created by debarghy on 10/2/2015.
 */
public class Round {
    //Can be 1-8


    public Round(Integer roundId, PlayerPosition currentPlayerPos, GameType gameType, boolean isTrumpRevealed, TrumpRevealedTime trumpRevealedTime, TwentyNineCard trumpCard, GameState gameState) {
        this.roundId = roundId;
        this.currentPlayerPosition = currentPlayerPos;
        this.roundStatus = RoundStatus.IN_PROGRESS;
        moves = new ArrayList<>();
        this.gameType = gameType;
        this.isTrumpRevealed = isTrumpRevealed;
        this.trumpRevealedTime = trumpRevealedTime;
        this.trumpCard = trumpCard;
        this.gameState = gameState;
    }

    GameState gameState;
    Integer roundId;
    boolean isTrumpRevealed = false;
    TrumpRevealedTime trumpRevealedTime;
    TwentyNineCard trumpCard;

    public void revealTrump(Player player, TwentyNineCard trump) {
        this.isTrumpRevealed = true;
        this.trumpRevealedTime = new TrumpRevealedTime(roundId, moves.size(), player);
        this.trumpCard = trump;
    }

    ; // refactor it to external class

    public enum RoundStatus {STARTED, IN_PROGRESS, COMPLETED}

    ;
    private RoundStatus roundStatus;
    private String roundSuit;
    private final GameType gameType;
    PlayerPosition currentPlayerPosition;
    List<Move> moves = new ArrayList<>();
    Integer roundWinnerTeamId;
    PlayerPosition roundWinnerPlayerPosition;
    Integer roundScore;

    private void setNextPlayerPosition() {
        this.currentPlayerPosition = PlayerHelper.getNextPlayerPosition(currentPlayerPosition);
        if (gameType.equals(GameType.SINGLE_HAND)) {
            if (currentPlayerPosition.equals(PlayerPosition.BOTTOM) && gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.TOP)) {
                this.currentPlayerPosition = PlayerHelper.getNextPlayerPosition(currentPlayerPosition);
            }
            else if (currentPlayerPosition.equals(PlayerPosition.TOP) && gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
                this.currentPlayerPosition = PlayerHelper.getNextPlayerPosition(currentPlayerPosition);
            }
            else if (currentPlayerPosition.equals(PlayerPosition.LEFT) && gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.RIGHT)) {
                this.currentPlayerPosition = PlayerHelper.getNextPlayerPosition(currentPlayerPosition);
            }
            else if (currentPlayerPosition.equals(PlayerPosition.RIGHT) && gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.LEFT)) {
                this.currentPlayerPosition = PlayerHelper.getNextPlayerPosition(currentPlayerPosition);
            }
        }

    }

    public Move playMove(Player player, TwentyNineCard card) {
        if (!player.getPlayerPosition().equals(currentPlayerPosition) || moves.size() == 0) {
            //      throw new IllegalArgumentException(player.getPlayerPosition() + " and  currentPlayerPosition" + currentPlayerPosition + " are different" );
            //throw exception
        }
        if (moves.size() == 0) {
            //First moce
            this.roundSuit = card.getSuit();
            this.currentPlayerPosition = player.getPlayerPosition();
        }
        Move move = new Move(moves.size() + 1, player, card);
        moves.add(move);
        boolean isRoundComplete = isRoundComplete();
        if (isRoundComplete) {
            roundStatus = RoundStatus.COMPLETED;
            updateScoreRound();
        }
        setNextPlayerPosition();
        return move;
    }


    private void updateScoreRound() {

        this.roundScore = 0;
        boolean isRoundComplete = isRoundComplete();
        if (isRoundComplete) {
            if (gameType.equals(GameType.NORMAL)) {
                updateScoreNormal();
            } else if (gameType.equals(GameType.SINGLE_HAND)) {
                updateScoreSingleHand();
            }
        }
    }

    private boolean isRoundComplete() {
        if (moves.size() == 4 && gameType.equals(GameType.NORMAL)) {
            return true;
        }
        if (moves.size() == 3 && gameType.equals(GameType.SINGLE_HAND)) {
            return true;
        }
        return false;
    }


    public Integer getRoundId() {
        return roundId;
    }

    public boolean isTrumpRevealed() {
        return isTrumpRevealed;
    }


    public RoundStatus getRoundStatus() {
        return roundStatus;
    }

    public String getRoundSuit() {
        return roundSuit;
    }

    public GameType getGameType() {
        return gameType;
    }

    public PlayerPosition getCurrentPlayerPosition() {
        return currentPlayerPosition;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public Integer getRoundWinnerTeamId() {
        return roundWinnerTeamId;
    }

    public Integer getRoundScore() {
        return roundScore;
    }

    public PlayerPosition getRoundWinnerPlayerPosition() {
        return roundWinnerPlayerPosition;
    }

    public void onComplete() {
        boolean isRoundComplete = isRoundComplete();
        if (isRoundComplete) {
            if (gameType.equals(GameType.NORMAL)) {
                updateScoreNormal();
            } else if (gameType.equals(GameType.SINGLE_HAND)) {
                updateScoreSingleHand();
            }
        }

    }

    private void updateScoreSingleHand() {
        Move highestMove = findHighestCard();
        this.roundWinnerPlayerPosition = highestMove.getPlayerPosition();
        if (roundWinnerPlayerPosition.equals(PlayerPosition.BOTTOM) || roundWinnerPlayerPosition.equals(PlayerPosition.TOP)) {
            this.roundWinnerTeamId = 1;
        } else {
            this.roundWinnerTeamId = 2;

        }
        this.roundScore = getScore();
    }


    private void updateScoreNormal() {
        Move winningMove = null;
        Move highSuitMove = findHighestCard();

        Move highTrumpMove = null;
        if (isTrumpRevealed) {
            highTrumpMove = findHighestTrumpCard();
        }
        if (highTrumpMove != null) {
            winningMove = highTrumpMove;
            System.out.print("\n********************** TRUMP Player " + highTrumpMove.getPlayerPosition() + ": wins round " + roundId + " *******\" + getScore() + \"**********\n");
        } else {
            winningMove = highSuitMove;
            System.out.print("\n********************** HIGHSUIT Player " + highSuitMove.getPlayerPosition() + ": wins round " + roundId + " ******** score" + getScore() + " *********\n");
        }
        this.roundWinnerPlayerPosition = winningMove.getPlayerPosition();
        if (roundWinnerPlayerPosition.equals(PlayerPosition.BOTTOM) || roundWinnerPlayerPosition.equals(PlayerPosition.TOP)) {
            this.roundWinnerTeamId = 1;
        } else {
            this.roundWinnerTeamId = 2;

        }

        this.roundScore = getScore();
    }

    private int getScore() {
        int score = 0;
        for (Move move : moves) {
            score += move.getCard().getPoints();
        }
        return score;
    }


    public Move findHighestCard() {
        int bestPriority = Integer.MAX_VALUE;
        Move bestMove = null;
        for (Move move : moves) {
            if (move.getCard().getSuit().equals(roundSuit)) {
                if (move.getCard().getOrder() < bestPriority) {
                    bestMove = move;
                    bestPriority = move.getCard().getOrder();
                }
            }
        }
        return bestMove;
    }

    public Move findHighestTrumpCard() {
        if (isTrumpRevealed) {
            int bestPriority = Integer.MAX_VALUE;
            Move bestMove = null;
            for (Move move : moves) {
                boolean isTrumpApplicable = false;
                if (roundSuit.equals(trumpCard.getSuit()))
                    isTrumpApplicable = false;
                if (roundId > this.trumpRevealedTime.getRoundNumber())
                    isTrumpApplicable = true;
                if (roundId == this.trumpRevealedTime.getRoundNumber() && move.getSequenceId() >= this.trumpRevealedTime.getSequenceNumber())
                    isTrumpApplicable = true;

                if (isTrumpApplicable && move.getCard().getSuit().equals(trumpCard.getSuit())) {
                    if (move.getCard().getOrder() < bestPriority) {
                        bestMove = move;
                        bestPriority = move.getCard().getOrder();
                    }
                }
            }
            return bestMove;
        } else
            return null;
    }

    /**
     * Returns the best moved played till now in this round
     *
     * @return
     */
    public Move findHighestMove() {
        if (this.moves.size() == 0)
            return null;

        Move highesyTrumpMove = findHighestTrumpCard();
        if (highesyTrumpMove != null)
            return highesyTrumpMove;
        Move highestCardMove = findHighestCard();
        return highestCardMove;
    }

    public boolean canRevealTrump(Player player) {
        if (!player.getPlayerPosition().equals(currentPlayerPosition) || isTrumpRevealed) {
            return false;
        }

        //Can reveal trum on first card
        if (0 == moves.size())
            return false;

        List<TwentyNineCard> playerCards = player.getRemainingCards();
        //Check if any of the cards are of suit
        for (TwentyNineCard card : playerCards) {
            if (card.getSuit().equals(roundSuit))
                return false;
        }

        return true;


    }

}