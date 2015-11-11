package debakesh.com.twentynine.entity;

/**
 * Created by debarghy on 9/24/2015.
 */
public class ValidationResult {
    private final boolean isValid;
    String message;
    ValidationType validationType;

    public ValidationType getValidationType() {
        return validationType;
    }

    public enum ValidationType {
        FOUR_JACK, OPPONENT_NO_TRUMP, SEVEN_CARD_NO_TRUMP, NO_POINT
    }

    public ValidationResult(boolean isValid, String message, ValidationType validationType) {
        this.isValid = isValid;
        this.message = message;
        this.validationType = validationType;
    }

    public ValidationResult(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }
}
