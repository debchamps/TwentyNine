package debakesh.com.twentynine.helper;


import debakesh.com.twentynine.entity.ValidationException;
import debakesh.com.twentynine.entity.ValidationResult;
import debakesh.com.twentynine.player.PlayerPosition;

/**
 * Created by debarghy on 10/2/2015.
 */
public class PlayerHelper {

    public static PlayerPosition getNextPlayerPosition(PlayerPosition playerPosition) {
        if(null == playerPosition) {
            return null;
         //   throw new ValidationException(new ValidationResult(false,"PlayerPosition cannot be null", ));
        }
        else if(playerPosition.equals(PlayerPosition.BOTTOM)) {
            return PlayerPosition.RIGHT;
        }
        else if(playerPosition.equals(PlayerPosition.LEFT)) {
            return PlayerPosition.BOTTOM;
        }
        else if(playerPosition.equals(PlayerPosition.TOP)) {
            return PlayerPosition.LEFT;
        }
        else {
            return PlayerPosition.TOP;
        }

    }

}
