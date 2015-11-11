package debakesh.com.twentynine.move;

import java.util.List;
import java.util.Random;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 11/3/2015.
 */
public class ProbabilisticCardStrategy implements MoveStrategy {
    MoveStrategy moveStrategy;
    private double playProbability;

    public ProbabilisticCardStrategy(MoveStrategy moveStrategy, double playProbability) {
        this.moveStrategy = moveStrategy;
        this.playProbability = playProbability;
    }

    @Override
    public TwentyNineCard nextMove(Player player, GameState gameState, List<TwentyNineCard> allowedCards) {
        TwentyNineCard card = moveStrategy.nextMove(player, gameState, allowedCards);
        if(new Random().nextFloat() < playProbability)
            return card;
        return null;
    }
}

