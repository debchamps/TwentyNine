package debakesh.com.twentynine.rule;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.ValidationResult;

/**
 * Created by debarghy on 10/20/2015.
 */
public class SerialGameValidatationExecutor {

    public SerialGameValidatationExecutor(List<GameValidationRule> validationRuleList) {
        this.validationRuleList = validationRuleList;
    }

    List<GameValidationRule> validationRuleList;

    public ValidationResult validate(GameState gameState) {
        if (validationRuleList != null) {
            for (GameValidationRule rule : validationRuleList) {
                ValidationResult result = rule.validate(gameState);
                if (result.isValid() == false) {
                    return result;
                }
            }
        }
        return new ValidationResult(true);
    }
}
