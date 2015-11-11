package debakesh.com.twentynine.move;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 11/3/2015.
 */
public class PLayNonTrumpMove implements MoveStrategy{
    public PLayNonTrumpMove() {
    }

    @Override
    public TwentyNineCard nextMove(Player player, GameState gameState, List<TwentyNineCard> allowedCards) {
        return null;
    }
}
