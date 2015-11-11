package debakesh.com.twentynine.rule;

import com.card.common.card.CardHelper;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.ValidationResult;
import debakesh.com.twentynine.player.PlayerPosition;

/**
 * Created by debarghy on 10/20/2015.
 */
public class OpponentNoTrumpValidator implements GameValidationRule {



    @Override
    public ValidationResult validate(GameState gameState) {
        if (gameState.getGameTarget().isSingleHand())
            return new ValidationResult(true);

        List<TwentyNineCard> allTrumpsLeft = (List<TwentyNineCard>) CardHelper.filterBySuit(gameState.getPlayerLeft().getAllCards(), gameState.getTrumpCard().getSuit());
        List<TwentyNineCard> allTrumpsRight = (List<TwentyNineCard>) CardHelper.filterBySuit(gameState.getPlayerRight().getAllCards(), gameState.getTrumpCard().getSuit());
        List<TwentyNineCard> allTrumpsTop = (List<TwentyNineCard>) CardHelper.filterBySuit(gameState.getPlayerTop().getAllCards(), gameState.getTrumpCard().getSuit());
        List<TwentyNineCard> allTrumpsBottom = (List<TwentyNineCard>) CardHelper.filterBySuit(gameState.getPlayerBottom().getAllCards(), gameState.getTrumpCard().getSuit());


        if (gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.BOTTOM) || gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.TOP)) {
            if (allTrumpsLeft.size() + allTrumpsRight.size() == 0) {
                return new ValidationResult(false, "Opponent do not have any card of trump suit", ValidationResult.ValidationType.OPPONENT_NO_TRUMP);
            }
        }
        if (gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.LEFT) || gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.RIGHT)) {
            if (allTrumpsTop.size() + allTrumpsBottom.size() == 0) {
                return new ValidationResult(false, "Opponent do not have any card of trump suit", ValidationResult.ValidationType.OPPONENT_NO_TRUMP);
            }
        }
        return new ValidationResult(true);
    }
}
