package debakesh.com.twentynine.rule;

import com.card.common.card.CardHelper;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.ValidationResult;

/**
 * Created by debarghy on 10/20/2015.
 */
public class FourJackValidator implements GameValidationRule {

    @Override
    public ValidationResult validate(GameState gameState) {

        List<TwentyNineCard> allJacksLeft = (List<TwentyNineCard>) CardHelper.filterByNumber(gameState.getPlayerLeft().getAllCards(), "J");
        List<TwentyNineCard> allJacksRight = (List<TwentyNineCard>) CardHelper.filterByNumber(gameState.getPlayerRight().getAllCards(), "J");
        List<TwentyNineCard> allJacksTop = (List<TwentyNineCard>) CardHelper.filterByNumber(gameState.getPlayerTop().getAllCards(), "J");
        List<TwentyNineCard> allJacksBottom = (List<TwentyNineCard>) CardHelper.filterByNumber(gameState.getPlayerBottom().getAllCards(), "J");

        if (allJacksLeft.size() == 4) {
            return new ValidationResult(false, "Player Left have four Jack", ValidationResult.ValidationType.FOUR_JACK);
        }

        if (allJacksRight.size() == 4) {
            return new ValidationResult(false, "Player Right have four Jack", ValidationResult.ValidationType.FOUR_JACK);
        }
        if (allJacksTop.size() == 4) {
            return new ValidationResult(false, "Player Top have four Jack", ValidationResult.ValidationType.FOUR_JACK);
        }
        if (allJacksBottom.size() == 4) {
            return new ValidationResult(false, "Player Bottom have four Jack", ValidationResult.ValidationType.FOUR_JACK);
        }
        return new ValidationResult(true);
    }
}
