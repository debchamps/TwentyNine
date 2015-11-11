package debakesh.com.twentynine.move;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 11/3/2015.
 */
public class PlayAscendingPointPlay implements MoveStrategy {
    @Override
    public TwentyNineCard nextMove(Player player, GameState gameState, List<TwentyNineCard> allowedCards) {
        //Play 7/8 randomly
        //Play K/Q randomly
        //Play A/10 randomly
        //Play 9
        //Play J

        return null;
    }
}
