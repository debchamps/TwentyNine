package debakesh.com.twentynine.entity;

/**
 * Created by debarghy on 10/2/2015.
 */
public class ValidationException extends RuntimeException {
    private ValidationResult validationResult;

    public ValidationException(String detailMessage, ValidationResult validationResult) {
        super(detailMessage);
        this.validationResult = validationResult;
    }

    public ValidationException(ValidationResult vr) {
        this.validationResult = vr;
    }
}
