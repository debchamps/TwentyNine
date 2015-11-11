package debakesh.com.twentynine.rule;

import com.card.common.card.CardHelper;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.ValidationResult;
import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 10/20/2015.
 */
public class SevenCardNoTrumpValidator implements GameValidationRule {


    @Override
    public ValidationResult validate(GameState gameState) {

        if(gameState.getGameTarget() != null && gameState.isSeventhCard()) {
            Player callingPlayer = gameState.getGameTarget().getCallingPlayer();
            String trumpSuit = gameState.getTrumpCard().getSuit();
            int trumpSuitCount = CardHelper.filterBySuit(gameState.getPlayer(callingPlayer.getPlayerPosition()).getAllCards(), trumpSuit).size();
            if(trumpSuitCount <2) {
                return  new ValidationResult(false, "Calling player do not have trump suit other than seventh card", ValidationResult.ValidationType.SEVEN_CARD_NO_TRUMP);
            }
        }
        return new ValidationResult(true);
    }
}
