package debakesh.com.twentynine.rule;

import com.card.common.card.CardHelper;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.ValidationResult;

/**
 * Created by debarghy on 10/20/2015.
 */
public class ZeroPointValidator implements GameValidationRule {

    @Override
    public ValidationResult validate(GameState gameState) {

        int pointsBottom = CardHelper.sumPoint(gameState.getPlayerBottom().getAllCards());
        int pointsLeft = CardHelper.sumPoint(gameState.getPlayerLeft().getAllCards());
        int pointsRight = CardHelper.sumPoint(gameState.getPlayerRight().getAllCards());
        int pointsTop = CardHelper.sumPoint(gameState.getPlayerTop().getAllCards());

        if (pointsLeft == 0) {
            return new ValidationResult(false, "Player Left do not have any point card", ValidationResult.ValidationType.NO_POINT);
        }

        if (pointsRight == 0) {
            return new ValidationResult(false, "Player Right do not have any point card", ValidationResult.ValidationType.NO_POINT);
        }
        if (pointsTop == 0) {
            return new ValidationResult(false, "Player Top do not have any point card", ValidationResult.ValidationType.NO_POINT);
        }
        if (pointsBottom == 0) {
            return new ValidationResult(false, "Player Bottom do not have any point card", ValidationResult.ValidationType.NO_POINT);
        }
        return new ValidationResult(true);
    }
}
