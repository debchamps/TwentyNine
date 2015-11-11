package debakesh.com.twentynine.entity;

import com.card.common.card.Card;

import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;

/**
 * Created by debarghy on 10/2/2015.
 */
public class Move {
    int moveId;
    int sequenceId;
    String playerId;
    PlayerPosition playerPosition;
    TwentyNineCard card;

    public Move(int moveId, Player player, TwentyNineCard card) {
        this.moveId = moveId;
        this.sequenceId = moveId;
        this.playerId = player.getId();
        this.playerPosition = player.getPlayerPosition();
        this.card = card;
    }

    public int getMoveId() {
        return moveId;
    }

    public int getSequenceId() {
        return sequenceId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public PlayerPosition getPlayerPosition() {
        return playerPosition;
    }

    public TwentyNineCard getCard() {
        return card;
    }
}

