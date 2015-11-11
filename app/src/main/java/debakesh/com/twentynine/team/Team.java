package debakesh.com.twentynine.team;

import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 9/27/2015.
 */
public class Team {
    String teamId;
    String teamDisplayId;
    int teamSequenceId;
    //There is no ordering as of now
    Player playerOne;
    Player playerTwo;

    public Team(String teamId, String teamDisplayId, Player playerOne, Player playerTwo, int teamSequenceId) {
        this.teamId = teamId;
        this.teamDisplayId = teamDisplayId;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.teamSequenceId = teamSequenceId;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamDisplayId() {
        return teamDisplayId;
    }

    public int getTeamSequenceId() {
        return teamSequenceId;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }
}
