package debakesh.com.twentynine.entity;

import com.card.common.card.CardFactory;
import com.card.common.shuffle.NCutShuffler;

import java.util.Date;
import java.util.List;

import debakesh.com.twentynine.player.PlayerPosition;
import debakesh.com.twentynine.player.RandomComputerPlayer;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 10/2/2015.
 */
public class SinglePlayerGamePlay {

    public static  void main(String[] args) {
        SampleGamePlay sampleGamePlay = new SampleGamePlay();
        System.out.print("Date" + new Date());
        sampleGamePlay.start();
    }

    public void start() {
        //create players
        //shuffle card
        RandomComputerPlayer bottomPlayer = new RandomComputerPlayer("Bot", PlayerPosition.BOTTOM);
        RandomComputerPlayer topPlayer = new RandomComputerPlayer("Top", PlayerPosition.TOP);
        RandomComputerPlayer leftPlayer = new RandomComputerPlayer("Left", PlayerPosition.LEFT);
        RandomComputerPlayer rightPlayer = new RandomComputerPlayer("Right", PlayerPosition.RIGHT);

        List<TwentyNineCard> cards = CardFactory.get29Deck();
        NCutShuffler shuffler = new NCutShuffler(cards);

        List<TwentyNineCard> playingDeck = (List<TwentyNineCard>)shuffler.shuffle();

        bottomPlayer.setFirstHand(playingDeck.subList(0, 4));
        leftPlayer.setFirstHand(playingDeck.subList(4, 8));
        topPlayer.setFirstHand(playingDeck.subList(8, 12));
        rightPlayer.setFirstHand(playingDeck.subList(12, 16));


        bottomPlayer.setFirstHand(playingDeck.subList(16, 20));
        leftPlayer.setFirstHand(playingDeck.subList(20, 24));
        topPlayer.setFirstHand(playingDeck.subList(24, 28));
        rightPlayer.setFirstHand(playingDeck.subList(28, 32));

        Team teamOne = new Team("One", "WE", bottomPlayer, topPlayer, 1);

        Team teamTwo = new Team("Two", "Opponent", rightPlayer, leftPlayer, 2);

        GameState gameState = new GameState(1,bottomPlayer, topPlayer,  rightPlayer, leftPlayer, teamOne, teamTwo);

        System.out.println("############  BOT " +bottomPlayer.getRemainingCards());
        System.out.println("############ TOP " + topPlayer.getRemainingCards());
        System.out.println("############ LEFT " +leftPlayer.getRemainingCards());
        System.out.println("############ RIGHT " +rightPlayer.getRemainingCards());

        bottomPlayer.setGameState(gameState);
        leftPlayer.setGameState(gameState);
        topPlayer.setGameState(gameState);
        rightPlayer.setGameState(gameState);
        int counter = 0;
        //!gameState.getGameStatus().equals(GameState.GameStatus.COMPLETED
        while(!gameState.getGameStatus().equals(GameState.GameStatus.COMPLETED)) {
            PlayerPosition playerPos = gameState.getPlayedRounds().get(gameState.getPlayedRounds().size()-1).getCurrentPlayerPosition();
            if(playerPos.equals(PlayerPosition.BOTTOM)) {
                gameState.revealTrump(bottomPlayer);
                gameState.playMove(bottomPlayer, bottomPlayer.playCard());
            } else if(playerPos.equals(PlayerPosition.TOP)) {
                gameState.revealTrump(topPlayer);
                gameState.playMove(topPlayer, topPlayer.playCard());
            } else if(playerPos.equals(PlayerPosition.LEFT)) {
                gameState.revealTrump(leftPlayer);
                gameState.playMove(leftPlayer, leftPlayer.playCard());
            } else if(playerPos.equals(PlayerPosition.RIGHT)) {
                gameState.revealTrump(rightPlayer);
                gameState.playMove(rightPlayer, rightPlayer.playCard());
            }
        }

        System.out.println("############ TEAM_ONE SCORE " +gameState.getTeamOneScore());
        System.out.println("############ TEAM_TWO SCORE " +gameState.getTeamTwoScore());
        //give player hand

        //set the score of the game

        //turn by turn play the game


    }
}

