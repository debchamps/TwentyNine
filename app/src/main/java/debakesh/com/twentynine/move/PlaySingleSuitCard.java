package debakesh.com.twentynine.move;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 11/3/2015.
 */
public class PlaySingleSuitCard implements MoveStrategy{
    @Override
    public TwentyNineCard nextMove(Player player, GameState gameState, List<TwentyNineCard> allowedCards) {

        //If partner will win, play it regardless of anything
        //If opponent is winning play only if it is pointless
        return null;
    }
}
