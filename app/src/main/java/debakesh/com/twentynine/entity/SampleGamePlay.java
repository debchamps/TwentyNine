package debakesh.com.twentynine.entity;

import com.card.common.card.Card;
import com.card.common.card.CardFactory;
import com.card.common.shuffle.NCutShuffler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import debakesh.com.twentynine.helper.FeatureWriter;
import debakesh.com.twentynine.helper.MLFeatureExtractor;
import debakesh.com.twentynine.helper.MapHelper;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;
import debakesh.com.twentynine.player.RandomComputerMLPlayer;
import debakesh.com.twentynine.player.RandomComputerPlayer;
import debakesh.com.twentynine.player.RandomComputerPlayerWithSomeIntelligence;
import debakesh.com.twentynine.player.RuleBasedRandomPlayer;
import debakesh.com.twentynine.player.UINotifier;
import debakesh.com.twentynine.player.WekaPlayer;
import debakesh.com.twentynine.player.WekaPlayer2;
import debakesh.com.twentynine.player.WekaPlayer3;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 10/2/2015.
 */
public class SampleGamePlay {
    static FeatureWriter featureWriter = new FeatureWriter();
    static int teamOneGameWIn = 0;
    static int teamTwoGameWIn = 0;
    static int gameCount = 0;
    static int callingTeamWin = 0;
    static int defendingTeamWin = 0;
    static Map<String, Integer> suitToTrumpCOunt = new HashMap<>();
    public static void main(String[] args) {
        int count = 0;
        long startTime = System.currentTimeMillis();
        while (count++ < 10000) {
            gameCount +=1;
            System.out.println("PLaying game " + count);
            try {
                SampleGamePlay sampleGamePlay = new SampleGamePlay();
                sampleGamePlay.start();

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        Long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Finished" + new String(timeTaken.toString()) + " in ms");
        System.out.println("TeamOneWin :: " +  teamOneGameWIn );
        System.out.println("TeamTwoWin :: " +teamTwoGameWIn );
        System.out.println("Suit to trump" + suitToTrumpCOunt);
    }


    public void start() {
        //create players
        //shuffle card
        Player leftPlayer = null , rightPlayer = null;
        boolean isWekaPlaying = false , isIntelligentPlayerPlaying = true;
        if(isWekaPlaying) {
            leftPlayer = new WekaPlayer3("Bot", PlayerPosition.LEFT);
            rightPlayer = new WekaPlayer3("Top", PlayerPosition.RIGHT);

        } else {
            if(isIntelligentPlayerPlaying) {

                leftPlayer = new RuleBasedRandomPlayer("Bot", PlayerPosition.LEFT, false);
                rightPlayer = new RuleBasedRandomPlayer("Top", PlayerPosition.RIGHT, false);
            } else {
                leftPlayer = new RandomComputerMLPlayer("Bot", PlayerPosition.LEFT);
                rightPlayer = new RandomComputerMLPlayer("Top", PlayerPosition.RIGHT);
            }
        }

        Player topPlayer = new WekaPlayer3("Left", PlayerPosition.TOP);
        Player bottomPlayer = new WekaPlayer3("Right", PlayerPosition.BOTTOM);
 //        topPlayer = new RandomComputerMLPlayer("Left", PlayerPosition.TOP);
 //        bottomPlayer = new RandomComputerMLPlayer("Right", PlayerPosition.BOTTOM);
        if(isIntelligentPlayerPlaying) {
            // topPlayer = new RandomComputerPlayerWithSomeIntelligence("Left", PlayerPosition.TOP);
            //bottomPlayer = new RandomComputerPlayerWithSomeIntelligence("Right", PlayerPosition.BOTTOM);
      //      topPlayer = new RandomComputerPlayerWithSomeIntelligence("Left", PlayerPosition.TOP);
      //      bottomPlayer = new RandomComputerPlayerWithSomeIntelligence("Right", PlayerPosition.BOTTOM);
        }


        List<TwentyNineCard> cards = CardFactory.get29Deck();
        NCutShuffler shuffler = new NCutShuffler(cards);

        List<TwentyNineCard> playingDeck = (List<TwentyNineCard>) shuffler.shuffle();

        bottomPlayer.setFirstHand(playingDeck.subList(0, 4));
        leftPlayer.setFirstHand(playingDeck.subList(4, 8));
        topPlayer.setFirstHand(playingDeck.subList(8, 12));
        rightPlayer.setFirstHand(playingDeck.subList(12, 16));


        bottomPlayer.setSecondHand(playingDeck.subList(16, 20));
        leftPlayer.setSecondHand(playingDeck.subList(20, 24));
        topPlayer.setSecondHand(playingDeck.subList(24, 28));
        rightPlayer.setSecondHand(playingDeck.subList(28, 32));

        Team teamOne = new Team("One", "WE", bottomPlayer, topPlayer, 1);

        Team teamTwo = new Team("Two", "Opponent", rightPlayer, leftPlayer, 2);
        List<UINotifier> uiNotifiers = new ArrayList<>();
        TwentyNineSet set = new TwentyNineSet(gameCount, bottomPlayer, topPlayer, rightPlayer, leftPlayer,  teamOne, teamTwo, uiNotifiers);

        GameState gameState = new GameState(gameCount, bottomPlayer, topPlayer, rightPlayer, leftPlayer, PlayerPosition.BOTTOM, teamOne, teamTwo, uiNotifiers);
        gameState.setParentSet(set);
        //TODO: Randomize
        gameState.setGameTarget(makeCall(gameState));
        gameState.setTrumpCard(makeTrump(), false);

        System.out.println("############  BOT " + bottomPlayer.getRemainingCards());
        System.out.println("############ TOP " + topPlayer.getRemainingCards());
        System.out.println("############ LEFT " + leftPlayer.getRemainingCards());
        System.out.println("############ RIGHT " + rightPlayer.getRemainingCards());

        bottomPlayer.setGameState(gameState);
        leftPlayer.setGameState(gameState);
        topPlayer.setGameState(gameState);
        rightPlayer.setGameState(gameState);
        int counter = 0;
        //!gameState.getGameStatus().equals(GameState.GameStatus.COMPLETED

        gameState.playMove(gameState.getGameTarget().getCallingPlayer(), gameState.getGameTarget().getCallingPlayer().nextMove());
        /*
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
        } */

        //give player hand

        //set the score of the game

        //turn by turn play the game

        if(gameState.getWinner().getTeamSequenceId() == 1) {
            teamOneGameWIn +=1;
        } else
            teamTwoGameWIn +=1;

        if(gameState.getWinner().getTeamSequenceId() == gameState.getGameTarget().getCallingTeam().getTeamSequenceId()) {
            callingTeamWin +=1;
        }
        if(!suitToTrumpCOunt.containsKey(gameState.getTrumpCard().getSuit())) {
            suitToTrumpCOunt.put(gameState.getTrumpCard().getSuit(), 0);

        }
        suitToTrumpCOunt.put(gameState.getTrumpCard().getSuit(), suitToTrumpCOunt.get(gameState.getTrumpCard().getSuit()) + 1);

        System.out.println("############ TEAM_ONE SCORE " + gameState.getTeamOneScore());
        System.out.println("############ TEAM_TWO SCORE " + gameState.getTeamTwoScore());
    }


    public TwentyNineCard makeTrump() {
        int colorRnd = new Random().nextInt(4);
        if(colorRnd == 1) {
            return new TwentyNineCard("H", "6");

        } else if(colorRnd ==2) {
            return new TwentyNineCard("D", "6");

        }else if(colorRnd ==3) {
            return new TwentyNineCard("S", "6");

        }else {
            return new TwentyNineCard("C", "6");

        }
    }


    //Make 20 % of the time seventh card later
    public TwentyNineCard makeTrump(GameState gameState) {

        //50, 30, 15, 5
        Map<String, Integer> suitToPoint = new HashMap<>(), suitToCount = new HashMap<>();
        suitToPoint.put("H", 0);
        suitToPoint.put("C", 0);
        suitToPoint.put("S", 0);
        suitToPoint.put("D", 0);

        suitToCount.put("H", 0);
        suitToCount.put("C", 0);
        suitToCount.put("S", 0);
        suitToCount.put("D", 0);


        GameTarget target = gameState.getGameTarget();
        List<TwentyNineCard> cards = target.getCallingPlayer().getAllCards().subList(0, 4);

        for (TwentyNineCard c : cards) {
            suitToPoint.put(c.getSuit(), suitToPoint.get(c.getSuit()) + c.getPoints());
            suitToCount.put(c.getSuit(), suitToPoint.get(c.getSuit()) + 1);
        }
        for (Map.Entry<String, Integer> entry : suitToCount.entrySet()) {
            if (entry.getValue() == 2) {
                entry.setValue(10);
            } else if (entry.getValue() == 3) {
                entry.setValue(70);
            } else if (entry.getValue() == 4) {
                entry.setValue(99);
            }


        }

        int randomRange = suitToPoint.get("H") + suitToPoint.get("C") + suitToPoint.get("S") + suitToPoint.get("D");
        randomRange  += suitToCount.get("H") + suitToCount.get("C") + suitToCount.get("S") + suitToCount.get("D");

        int rnd = new Random().nextInt(randomRange);
        int cumulativeSum = (suitToPoint.get("H") +suitToCount.get("H"));
        if(rnd <= cumulativeSum) {
            return new TwentyNineCard("H", "6");
        }
        cumulativeSum+=(suitToPoint.get("D") +suitToCount.get("D"));
        if (rnd <=(cumulativeSum)) {
            return new TwentyNineCard("D", "6");

        }
        cumulativeSum+=(suitToPoint.get("S") +suitToCount.get("S"));
        if (rnd <=(cumulativeSum)) {
            return new TwentyNineCard("S", "6");

        } else {
            return new TwentyNineCard("C", "6");

        }

    }

    GameTarget makeCall(GameState gameState) {

        int bidWinner = new Random().nextInt(4);
        Team callingTeam = null;
        Player pos = null;
        if (bidWinner == 1) {
            pos = gameState.getPlayerBottom();
            callingTeam = gameState.getTeamOne();
        } else if (bidWinner == 2) {
            pos = gameState.getPlayerLeft();
            callingTeam = gameState.getTeamTwo();

        } else if (bidWinner == 3) {
            pos = gameState.getPlayerRight();
            callingTeam = gameState.getTeamTwo();

        } else {
            pos = gameState.getPlayerTop();
            callingTeam = gameState.getTeamOne();
        }

        return new GameTarget(false, getCallValue(), pos, callingTeam);

    }

    int getCallValue() {
        int num = new Random().nextInt(100);

        if (num <= 8) {
            return 13;
        } else if (num <= 16) {
            return 14;
        } else if (num <= 24) {
            return 15;
        } else if (num <= 30) {
            return 16;
        } else if (num <= 45) {
            return 17;
        } else if (num <= 55) {
            return 18;
        } else if (num <= 72) {
            return 19;
        } else if (num <= 81) {
            return 20;
        } else if (num <= 87) {
            return 21;
        } else if (num <= 92) {
            return 17;
        } else if (num <= 95) {
            return 23;
        } else if (num <= 96) {
            return 24;
        } else if (num <= 37) {
            return 25;
        } else if (num <= 98) {
            return 26;
        } else if (num <= 99) {
            return 27;
        } else {
            return 28;
        }

    }
}

