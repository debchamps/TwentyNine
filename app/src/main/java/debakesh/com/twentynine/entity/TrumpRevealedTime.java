package debakesh.com.twentynine.entity;

import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 10/2/2015.
 */
public class TrumpRevealedTime {
    int roundNumber;
    int sequenceNumber;
    Player player;

    public int getRoundNumber() {
        return roundNumber;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public Player getPlayer() {
        return player;
    }

    public TrumpRevealedTime(int roundNumber, int sequenceNumber, Player player) {
        this.roundNumber = roundNumber;
        this.sequenceNumber = sequenceNumber;
        this.player = player;
    }
}
