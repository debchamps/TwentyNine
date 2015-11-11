package debakesh.com.twentynine.move;

import java.util.List;
import java.util.Random;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 11/3/2015.
 */
public class PlayAnySelectedRandomly implements MoveStrategy{
    private List<TwentyNineCard> selectedCards;

    public PlayAnySelectedRandomly(List<TwentyNineCard> selectedCards) {
        this.selectedCards = selectedCards;
    }

    @Override
    public TwentyNineCard nextMove(Player player, GameState gameState, List<TwentyNineCard> allowedCards) {
        if(selectedCards == null || selectedCards.size() == 0)
            return null;
        return selectedCards.get(new Random().nextInt(selectedCards.size()));
    }
}
