package debakesh.com.twentynine.move;

import com.card.common.card.Card;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 11/3/2015.
 */
public class SerialMoveStrategyExecutor {
    private final List<MoveStrategy> moveStrategyList;


    public SerialMoveStrategyExecutor(List<MoveStrategy> moveStrategyList) {
        this.moveStrategyList = moveStrategyList;
    }

    public TwentyNineCard execute(Player player, GameState gameState, List<TwentyNineCard> allowedCard) {
        for(MoveStrategy moveStrategy : moveStrategyList) {
            TwentyNineCard card = moveStrategy.nextMove(player,gameState, allowedCard);
            if(card != null)
                return card;
        }
        return null;
    }
}
