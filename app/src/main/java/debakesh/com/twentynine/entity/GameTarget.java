package debakesh.com.twentynine.entity;

import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 10/3/2015.
 */
public class GameTarget {

    private boolean isSingleHand;
    private int target;
    private Player callingPlayer;
    private Team callingTeam;
    private  boolean isPair;
    private  int pairTeamSequenceId;


    public GameTarget(boolean isSingleHand, int target, Player callingPlayer, Team callingTeam) {
        this.isSingleHand = isSingleHand;
        this.target = target;
        this.callingPlayer = callingPlayer;
        this.callingTeam = callingTeam;
    }

    public boolean isPair() {
        return isPair;
    }

    public int getPairTeamSequenceIdId() {
        return pairTeamSequenceId;
    }

    public void updatePair(int pairTeamSequenceId) {
        if(!isSingleHand()) {
            this.isPair = true;
            this.pairTeamSequenceId = pairTeamSequenceId;
            if(callingTeam.getTeamSequenceId() == pairTeamSequenceId) {
                if(target <=20) {
                    target = 16;
                } else {
                    target -= 4;
                }
            } else {
                target +=4;
            }
        }
    }

    public boolean isSingleHand() {
        return isSingleHand;
    }

    public int getTarget() {
        return target;
    }

    public Player getCallingPlayer() {
        return callingPlayer;
    }

    public Team getCallingTeam() {
        return callingTeam;
    }
}
