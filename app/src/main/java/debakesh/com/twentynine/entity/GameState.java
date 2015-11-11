package debakesh.com.twentynine.entity;


import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import debakesh.com.twentynine.helper.PlayerHelper;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;
import debakesh.com.twentynine.player.UINotifier;
import debakesh.com.twentynine.rule.FourJackValidator;
import debakesh.com.twentynine.rule.OpponentNoTrumpValidator;
import debakesh.com.twentynine.rule.SerialGameValidatationExecutor;
import debakesh.com.twentynine.rule.ZeroPointValidator;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 10/2/2015.
 */
public class GameState {
    private Call currentWinningCall;

    GameType gameType;

    TwentyNineSet parentSet;

    List<TwentyNineCard> playedCards = new ArrayList<>();

    SerialGameValidatationExecutor normalGameValidator;

    public Bidding getBidding() {
        return bidding;
    }

    private Map<PlayerPosition, Call> lastCallByPlayer = new HashMap<>();
    private Bidding bidding;
    private PlayerPosition callStartPosition = PlayerPosition.BOTTOM;
    private Team loser;
    private Team winner;
    private PlayerPosition currentStartPosition;
    private TwentyNineCard trumpCard;
    private GameTarget gameTarget;
    private List<UINotifier> uiNotifiers;
    private boolean isSeventhCard = false;


    public void setParentSet(TwentyNineSet parentSet) {
        this.parentSet = parentSet;
    }

    public void setTrumpCard(TwentyNineCard trumpCard, boolean isSeventhCard) {
        this.isSeventhCard = isSeventhCard;
        this.trumpCard = trumpCard;
        if (gameTarget == null) {
            gameTarget = new GameTarget(false, this.bidding.getWinningCall().getBidAmount(), this.bidding.getWinningCall().getCallingPlayer(), getTeam(this.bidding.getWinningCall().getCallingPlayer()));
        }

        //Setting the bottom position with single hand
      //  this.setSingleHand(this.getGameTarget().getCallingPlayer().getPlayerPosition());

        startGame(gameTarget.getCallingPlayer().getPlayerPosition());
            playerBottom.updateTrumpSet(this);
        playerRight.updateTrumpSet(this);
        playerLeft.updateTrumpSet(this);
        playerTop.updateTrumpSet(this);

        if (uiNotifiers != null) {
            for (UINotifier uiNotifier : this.uiNotifiers) {
                uiNotifier.updateTrumpSet(this);
            }
        }
    }

    public GameTarget getGameTarget() {
        return gameTarget;
    }

    public void setIsSeventhCard(boolean isSeventhCard) {
        this.isSeventhCard = isSeventhCard;
    }

    public boolean isSeventhCard() {
        return isSeventhCard;
    }

    public Team getWinner() {
        return winner;
    }

    public Team getLoser() {
        return loser;
    }

    public TwentyNineCard getTrumpCard() {
        return trumpCard;
    }

    public Round getCurrentRound() {
        return playedRounds.get(currentRoundNumber - 1);
    }

    public void load(GameState state) {
        //Set the card of the bottom player Which is the human player

        //Set the played card till now

        //Set the trump card if revealed

        //Set the scorecard
    }

    public void setSingleHand(PlayerPosition pos){
        gameType = GameType.SINGLE_HAND;
        this.gameTarget = new GameTarget(true, 28, getPlayer(pos), getTeam(getPlayer(pos)));
    }

    public void startGame(PlayerPosition startPlayerPosition) {

        ValidationResult validationResult = normalGameValidator.validate(this);
        if (!validationResult.isValid()) {
            this.gameStatus = GameStatus.CANCELLED;
            this.gameCancellationReason = validationResult;
            //notify Cancellation to UINotifier
            parentSet.updateOnGameComplete(this);

        } else {

            this.gameStatus = GameStatus.IN_PROGRESS;
            this.playedRounds = new ArrayList<>();
            this.currentRoundNumber = 1;
            this.currentStartPosition = startPlayerPosition;
            Round roundOne = new Round(currentRoundNumber, startPlayerPosition, gameType, false, null, null, this);
            playedRounds.add(roundOne);
        }
        //May need to notify all the first player at least
    }


    private Player getNextStartPlayer() {
        PlayerPosition nextStartPos = PlayerHelper.getNextPlayerPosition(currentStartPosition);
        if (nextStartPos.equals(PlayerPosition.BOTTOM)) {
            return playerBottom;
        } else if (nextStartPos.equals(PlayerPosition.TOP)) {
            return playerTop;
        } else if (nextStartPos.equals(PlayerPosition.TOP)) {
            return playerRight;

        } else {
            return playerLeft;
        }
    }


    private Team getTeam(Player player) {
        if (teamOne.getPlayerOne().getId().equals(player.getId()) || teamOne.getPlayerTwo().getId().equals(player.getId()))
            return teamOne;
        else
            return teamTwo;
    }

    private void decideGameWinner() {
        int teamSequenceId = this.gameTarget.getCallingTeam().getTeamSequenceId();
        if (gameType.equals(GameType.NORMAL)) {
            if (teamSequenceId == 1) {
                if (teamOneScore >= gameTarget.getTarget()) {
                    winner = teamOne;
                    loser = teamTwo;
                    //
                } else {
                    //Team2 wins
                    winner = teamTwo;
                    loser = teamOne;
                }

            } else {
                if (teamTwoScore >= gameTarget.getTarget()) {
                    //Team2 wins
                    winner = teamTwo;
                    loser = teamOne;
                } else {
                    //Team1 wins
                    winner = teamOne;
                    loser = teamTwo;
                }
            }
        } else {
            int roundCount = 0;
             if(playedRounds.size() == 8 && getCurrentRound().getRoundStatus().equals(Round.RoundStatus.COMPLETED) && getCurrentRound().getRoundWinnerPlayerPosition().equals(gameTarget.getCallingPlayer().getPlayerPosition())) {
                //All the eight rounds are plated and player who won the target have won the 8th round
                //Assumption we will stop plaay and decide the winner whenever opponent of a player not setting signe hand wins a roound
                //or all the 8 rounds are complete
                if(gameTarget.getCallingTeam().getTeamSequenceId() == 1) {
                    winner = teamOne;
                    loser = teamTwo;
                } else {
                    winner = teamTwo;
                    loser = teamOne;                }
            } else {
                if(gameTarget.getCallingTeam().getTeamSequenceId() == 1) {
                    winner = teamTwo;
                    loser = teamOne;
                } else {
                    winner = teamOne;
                    loser = teamTwo;
                }

            }
            //TODO: Need to implement this
            //Single Hand
            //If the oponent wins even one hand then he loses
        }
    }

    private boolean isGameCompleted() {
        if(!gameStatus.equals(GameStatus.IN_PROGRESS))
            return false;
        if(playedRounds.size() == 8 && getCurrentRound().getRoundStatus().equals(Round.RoundStatus.COMPLETED))
            return true;
        if(gameType.equals(GameType.SINGLE_HAND) && !getCurrentRound().getRoundWinnerPlayerPosition().equals(gameTarget.getCallingPlayer().getPlayerPosition())) {
            return true;
        }
        return  false;
    }


    public void playMove(Player player, TwentyNineCard card) {
        System.out.println("Player " + player.getId() + " played " + card.getId());
       // Log.e("GameState", "Player " + player.getId() + " played " + card.getId());

        playedCards.add(card);
        Round currentRound = playedRounds.get(playedRounds.size() - 1);
        Move currentMove = currentRound.playMove(player, card);
        updateTargetForPair(player);


        if (uiNotifiers != null) {
            for (UINotifier uiNotifier : this.uiNotifiers) {
                uiNotifier.notifyMove(this, currentMove);
            }
        }

        if (currentRound.getRoundStatus().equals(Round.RoundStatus.COMPLETED)) {
            //update GameTaget for pair
            //Check if current round was last round. Make the game as completed
            if (isGameCompleted()) {
                this.gameStatus = GameStatus.COMPLETED;
                decideGameWinner();
                parentSet.updateOnGameComplete(this);

                if (!parentSet.getSetStatus().equals(TwentyNineSet.SetStatus.COMPLETED)) {
                    // We will notify set complete here instead of game complete
                    if (uiNotifiers != null) {
                        for (UINotifier uiNotifier : uiNotifiers) {
                            uiNotifier.notifyGame(this);
                        }
                    }
                }
            }
            else {
                Round nextRound = new Round(currentRoundNumber + 1, currentRound.getRoundWinnerPlayerPosition(), gameType, isTrumpRevealed, trumpRevealedTime, trumpCard, this);
                playedRounds.add(nextRound);
                currentRoundNumber++;
            }
            if (currentRound.roundWinnerTeamId == 1)
                this.teamOneScore += currentRound.roundScore;
            else
                this.teamTwoScore += currentRound.roundScore;
            if (uiNotifiers != null) {
                for (UINotifier uiNotifier : uiNotifiers) {
                    uiNotifier.notifyRound(this, currentRound);
                }
            }
        }
        playerBottom.updateMove(this, currentMove);
        playerRight.updateMove(this, currentMove);
        playerLeft.updateMove(this, currentMove);
        playerTop.updateMove(this, currentMove);


    }


    private void updateTargetForPair(Player player) {
        if (!isTrumpRevealed)
            return;
        if (gameTarget.isPair())
            return;
        List<TwentyNineCard> pairCards = (List<TwentyNineCard>) CardHelper.filterBySuitAndNumbers(player.getRemainingCards(), trumpCard.getSuit(), Arrays.asList("K", "Q"));
        if (pairCards.size() == 2) {
            gameTarget.updatePair(getTeam(player).getTeamSequenceId());
            if (uiNotifiers != null) {
                for (UINotifier uiNotifier : uiNotifiers) {
                    uiNotifier.updatePairRevealed(this);
                }
            }

            //TODO: Notify Pair
        }
    }

    public void revealTrump(Player player) {
        if (!canRevealTrump(player))
            return;
        //if(trumpCard != null)
        //    trumpCard = new TwentyNineCard("H","7");
        System.out.println("XXXXXXXXXXXXX   REVEAL OF TRUMP" + player.getPlayerPosition() + " Trump is " + trumpCard);
        isTrumpRevealed = true;
        this.trumpRevealedTime = new TrumpRevealedTime(currentRoundNumber, getCurrentRound().getMoves().size(), player);
        getCurrentRound().revealTrump(player, trumpCard);

        if (uiNotifiers != null) {
            for (UINotifier uiNotifier : uiNotifiers) {
                uiNotifier.updateTrumpRevealed(this);
            }
        }
        playerBottom.updateTrumpRevealed(this);
        playerTop.updateTrumpRevealed(this);
        playerLeft.updateTrumpRevealed(this);
        playerRight.updateTrumpRevealed(this);

    }

    public boolean canRevealTrump(Player player) {
        if (!gameStatus.equals(GameStatus.IN_PROGRESS))
            return false;
        if (isTrumpRevealed())
            return false;
        if(gameType.equals(GameType.SINGLE_HAND))
            return false;
        return getCurrentRound().canRevealTrump(player);
    }

    public enum GameStatus {STARTED, BIDDING, IN_PROGRESS, COMPLETED, CANCELLED}

    private GameStatus gameStatus;
    private ValidationResult gameCancellationReason;

    private Team teamOne;
    private Team teamTwo;

    private Integer teamOneScore;
    private Integer teamTwoScore;

    private Player playerBottom;
    private Player playerTop;
    private Player playerLeft;
    private Player playerRight;

    private final Integer gameId;
    private List<Player> currentPlayerSequence; //The players are the same as the players in the team
    //private Map<Integer, List<TwentyNineCard>> roundToTwentyNineCardPlayedMap;
    private List<Round> playedRounds = new ArrayList<>();
    private Integer currentRoundNumber;
    boolean isTrumpRevealed;


    public void setGameTarget(GameTarget gameTarget) {
        this.gameTarget = gameTarget;
    }

    public ValidationResult getGameCancellationReason() {
        return gameCancellationReason;
    }

    public GameState(Integer gameId, Player playerBottom, Player playerTop, Player playerRight, Player playerLeft, Team teamOne, Team teamTwo) {
        this.gameId = gameId;
        this.playerBottom = playerBottom;
        this.playerTop = playerTop;
        this.playerRight = playerRight;
        this.playerLeft = playerLeft;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.gameStatus = GameStatus.BIDDING;
        this.bidding = new Bidding(playerBottom.getPlayerPosition());
        isTrumpRevealed = false;
        teamOneScore = teamTwoScore = 0;
        this.gameType = GameType.NORMAL;
        initiateValidators();
        // startGame(playerBottom.getPlayerPosition());
    }

    public void initiateValidators() {
        normalGameValidator = new SerialGameValidatationExecutor(Arrays.asList(new FourJackValidator(), new OpponentNoTrumpValidator(), new ZeroPointValidator()));
    }

    public GameState(Integer gameId, Player playerBottom, Player playerTop, Player playerRight, Player playerLeft, PlayerPosition bidStarter, Team teamOne, Team teamTwo, List<UINotifier> uiNotifiers) {
        this.uiNotifiers = uiNotifiers;
        this.gameId = gameId;
        this.playerBottom = playerBottom;
        this.playerTop = playerTop;
        this.playerRight = playerRight;
        this.playerLeft = playerLeft;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.gameStatus = GameStatus.BIDDING;
        this.bidding = new Bidding(bidStarter);
        isTrumpRevealed = false;
        teamOneScore = teamTwoScore = 0;
        this.gameType = GameType.NORMAL;
        initiateValidators();
        // startGame(playerBottom.getPlayerPosition());
    }


    public PlayerPosition getCurrentStartPosition() {
        return currentStartPosition;
    }

    public void setCurrentStartPosition(PlayerPosition currentStartPosition) {
        this.currentStartPosition = currentStartPosition;
    }


    public void call(Call call) {
        if (gameStatus.equals(GameStatus.BIDDING)) {
            if (bidding.getBiddingStatus().equals(Bidding.BiddingStatus.IN_PROGRESS)) {
                bidding.call(call);
                if (uiNotifiers != null) {
                    for (UINotifier uiNotifier : this.uiNotifiers) {
                        uiNotifier.updateBid(this, call);
                    }
                }

                if (bidding.getBiddingStatus().equals(Bidding.BiddingStatus.COMPLETED)) {
                    GameTarget gameTarget = new GameTarget(false, this.bidding.getWinningCall().getBidAmount(), bidding.getWinningCall().getCallingPlayer(), getTeam(bidding.getWinningCall().getCallingPlayer()));
                    this.setGameTarget(gameTarget);
                    //now is turn of seventh card / trump choose
                    if (uiNotifiers != null) {
                        for (UINotifier uiNotifier : this.uiNotifiers) {
                            uiNotifier.updateBidComplete(this);
                        }
                    }
                    playerBottom.updateBidComplete(this);
                    playerTop.updateBidComplete(this);
                    playerRight.updateBidComplete(this);
                    playerLeft.updateBidComplete(this);


                    //.Bid completed

                    //TODO: We may need to start the game after single hand when single hand comes into picture
                } else {
                    playerBottom.updateBid(this, call);
                    playerTop.updateBid(this, call);
                    playerRight.updateBid(this, call);
                    playerLeft.updateBid(this, call);

                }
            }
        }
    }


    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public Integer getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(Integer teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public Integer getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(Integer teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public Player getPlayer(PlayerPosition pos) {
        if (pos.equals(PlayerPosition.TOP)) {
            return getPlayerTop();
        } else if (pos.equals(PlayerPosition.BOTTOM)) {
            return getPlayerBottom();
        } else if (pos.equals(PlayerPosition.RIGHT)) {
            return getPlayerRight();
        } else {
            return getPlayerLeft();
        }
    }

    public Player getPlayerBottom() {
        return playerBottom;
    }

    public void setPlayerBottom(Player playerBottom) {
        this.playerBottom = playerBottom;
    }

    public Player getPlayerTop() {
        return playerTop;
    }

    public void setPlayerTop(Player playerTop) {
        this.playerTop = playerTop;
    }

    public Player getPlayerLeft() {
        return playerLeft;
    }

    public void setPlayerLeft(Player playerLeft) {
        this.playerLeft = playerLeft;
    }

    public Player getPlayerRight() {
        return playerRight;
    }

    public void setPlayerRight(Player playerRight) {
        this.playerRight = playerRight;
    }

    public Integer getGameId() {
        return gameId;
    }

    public List<Player> getCurrentPlayerSequence() {
        return currentPlayerSequence;
    }

    public void setCurrentPlayerSequence(List<Player> currentPlayerSequence) {
        this.currentPlayerSequence = currentPlayerSequence;
    }

    public List<Round> getPlayedRounds() {
        return playedRounds;
    }

    public void setPlayedRounds(List<Round> playedRounds) {
        this.playedRounds = playedRounds;
    }

    public Integer getCurrentRoundNumber() {
        return currentRoundNumber;
    }

    public void setCurrentRoundNumber(Integer currentRoundNumber) {
        this.currentRoundNumber = currentRoundNumber;
    }

    private TrumpRevealedTime trumpRevealedTime;

    public boolean isTrumpRevealed() {
        return isTrumpRevealed;
    }

    public TrumpRevealedTime getTrumpRevealedTime() {
        return trumpRevealedTime;
    }

    public void setIsTrumpRevealed(boolean isTrumpRevealed) {
        this.isTrumpRevealed = isTrumpRevealed;
    }

    public List<TwentyNineCard> getPlayedCards() {
        return playedCards;
    }
}
