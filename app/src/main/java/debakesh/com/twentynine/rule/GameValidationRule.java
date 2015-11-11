package debakesh.com.twentynine.rule;

import debakesh.com.twentynine.Game;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.ValidationResult;

/**
 * Created by debarghy on 9/24/2015.
 */
public interface GameValidationRule {
    //Given a board context and a platwr action, is the action allowed
    ValidationResult validate(GameState gameState);
}
