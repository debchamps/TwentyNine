package debakesh.com.twentynine.entity;

import com.card.common.card.CardFactory;
import com.card.common.shuffle.NCutShuffler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import debakesh.com.twentynine.helper.factory.TwentyNineCardDistributionFactory;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;
import debakesh.com.twentynine.player.UINotifier;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 10/2/2015.
 */
public class TwentyNineSet {

    public enum SetStatus {IN_PROGRESS, COMPLETED}

    private Team teamOne;
    private Team teamTwo;


    private Player playerBottom;
    private Player playerTop;
    private Player playerLeft;
    private Player playerRight;
    private List<UINotifier> uiNotifiers;


    int setId;

    public TwentyNineSet(Integer setId, Player playerBottom, Player playerTop, Player playerRight, Player playerLeft, Team teamOne, Team teamTwo, List<UINotifier> uiNotifiers) {
        this.uiNotifiers = uiNotifiers;
        this.playerBottom = playerBottom;
        this.playerTop = playerTop;
        this.playerRight = playerRight;
        this.playerLeft = playerLeft;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        team1Score = new SetScore();
        team2Score = new SetScore();
        setStatus = SetStatus.IN_PROGRESS;
        createNewGame();
        // startGame(playerBottom.getPlayerPosition());
    }

    ;


    private SetStatus setStatus;
    Team team1;
    Team team2;

    private Team setWinner;

    private SetScore team1Score;

    private SetScore team2Score;

    //TODO : Add to consturctor or randomize
    private PlayerPosition setStarter = PlayerPosition.BOTTOM;

    List<GameState> gameStateList = new ArrayList<>();


    public GameState getCurrentGameState() {
        return gameStateList.get(gameStateList.size() - 1);
    }

    public void createNewGame() {
        //TODO: Check a counter on all the game number
        GameState gameState = new GameState(1, playerBottom, playerTop, playerRight, playerLeft, PlayerPosition.BOTTOM, teamOne, teamTwo, uiNotifiers);
        playerLeft.setGameState(gameState);
        playerTop.setGameState(gameState);
        playerRight.setGameState(gameState);
        playerBottom.setGameState(gameState);
        gameState.setParentSet(this);


        //allocateMadeHand(gameState);
        allocateShuffledCard(gameState);
        //Shuffle the pack of card
        gameStateList.add(gameState);
        if (uiNotifiers != null) {
            for (UINotifier uiNotifier : uiNotifiers) {
                uiNotifier.notifyGameStart(gameState);
            }
        }
    }

    //all the public method will go through it or not

    public void updateOnGameComplete(GameState gameState) {

        //       public ScoreContext(boolean isTargetSetter, boolean isGameWinner, boolean isDouble, boolean isRedouble, boolean isSingleHand, boolean isAllRoundWinner) {


        //TODO : After cancellation how to start the game, from user input or from code, think Right now it is getting started from here
        if(gameState.getGameStatus().equals(GameState.GameStatus.CANCELLED)) {
            if(uiNotifiers != null)  {
                for(UINotifier uiNotifier : uiNotifiers) {
                    uiNotifier.onGameCancellation(gameState);
                }
            }
            //notify cancellation
        } else if(gameState.getGameStatus().equals(GameState.GameStatus.COMPLETED)) {
            ScoreContext scoreContextTeam1 = new ScoreContext((gameState.getGameTarget().getCallingTeam().getTeamSequenceId() == 1), gameState.getWinner().getTeamSequenceId() == 1, false, false, gameState.getGameTarget().isSingleHand(), false);
            ScoreContext scoreContextTeam2 = new ScoreContext((gameState.getGameTarget().getCallingTeam().getTeamSequenceId() == 2), gameState.getWinner().getTeamSequenceId() == 2, false, false, gameState.getGameTarget().isSingleHand(), false);
            team1Score.updateScore(scoreContextTeam1);
            team2Score.updateScore(scoreContextTeam2);
            updateSetWinner();
            if(setWinner == null)
                createNewGame();
        }

        //Check if set is complete then notify setComplete
        // otherwise start a new game
        // notify new game
    }

    public SetScore getTeam1Score() {
        return team1Score;

    }

    public SetScore getTeam2Score() {
        return team2Score;
    }

    public void updateSetWinner() {
        if (team1Score.getBlack() >= 6 || team2Score.getRed() >= 6) {
            setWinner = team2;
            setStatus = SetStatus.COMPLETED;
            if (uiNotifiers != null) {
                for (UINotifier uiNotifier : uiNotifiers) {
                    uiNotifier.notifySetComplete(this);
                }
            }
        }
        if (team1Score.getBlack() >= 6 || team1Score.getRed() >= 6) {
            setWinner = team1;
            setStatus = SetStatus.COMPLETED;
            if (uiNotifiers != null) {
                for (UINotifier uiNotifier : uiNotifiers) {
                    uiNotifier.notifySetComplete(this);
                }
            }
        }
    }


    public void allocateMadeHand(GameState gameState) {

        //Rather
        List<TwentyNineCard> cards = CardFactory.get29Deck();


        NCutShuffler shuffler = new NCutShuffler(cards);
        List<TwentyNineCard> playingDeck = (List<TwentyNineCard>) shuffler.shuffle();
        //List<TwentyNineCard> playingDeck = cards;

        gameState.getPlayerBottom().clearHand();
        gameState.getPlayerLeft().clearHand();
        gameState.getPlayerTop().clearHand();
        gameState.getPlayerRight().clearHand();

        Map<PlayerPosition, List<TwentyNineCard>> madeHand = TwentyNineCardDistributionFactory.getOpponentNoTrumpInvalidHand();
        gameState.getPlayerBottom().setFirstHand(madeHand.get(PlayerPosition.BOTTOM).subList(0,4));
        gameState.getPlayerLeft().setFirstHand(madeHand.get(PlayerPosition.LEFT).subList(0, 4));
        gameState.getPlayerTop().setFirstHand(madeHand.get(PlayerPosition.TOP).subList(0, 4));
        gameState.getPlayerRight().setFirstHand(madeHand.get(PlayerPosition.RIGHT).subList(0, 4));


        gameState.getPlayerBottom().setSecondHand(madeHand.get(PlayerPosition.BOTTOM).subList(4, 8));
        gameState.getPlayerLeft().setSecondHand(madeHand.get(PlayerPosition.LEFT).subList(4, 8));
        gameState.getPlayerTop().setSecondHand(madeHand.get(PlayerPosition.TOP).subList(4, 8));
        gameState.getPlayerRight().setSecondHand(madeHand.get(PlayerPosition.RIGHT).subList(4, 8));


    }
    public void allocateShuffledCard(GameState gameState) {

        //Rather
        List<TwentyNineCard> cards = CardFactory.get29Deck();


        NCutShuffler shuffler = new NCutShuffler(cards);
        List<TwentyNineCard> playingDeck = (List<TwentyNineCard>) shuffler.shuffle();
        //List<TwentyNineCard> playingDeck = cards;

        gameState.getPlayerBottom().clearHand();
        gameState.getPlayerLeft().clearHand();
        gameState.getPlayerTop().clearHand();
        gameState.getPlayerRight().clearHand();

        gameState.getPlayerBottom().setFirstHand(playingDeck.subList(0, 4));
        gameState.getPlayerLeft().setFirstHand(playingDeck.subList(4, 8));
        gameState.getPlayerTop().setFirstHand(playingDeck.subList(8, 12));
        gameState.getPlayerRight().setFirstHand(playingDeck.subList(12, 16));


        gameState.getPlayerBottom().setSecondHand(playingDeck.subList(16, 20));
        gameState.getPlayerLeft().setSecondHand(playingDeck.subList(20, 24));
        gameState.getPlayerTop().setSecondHand(playingDeck.subList(24, 28));
        gameState.getPlayerRight().setSecondHand(playingDeck.subList(28, 32));


    }

    public SetStatus getSetStatus() {
        return setStatus;
    }
}
