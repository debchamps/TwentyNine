package debakesh.com.twentynine.player;

/**
 * Created by debarghy on 10/8/2015.
 */
public class PlayerHelper {
    public static boolean isPartner(PlayerPosition pos1, PlayerPosition pos2) {
        if ((pos1.equals(PlayerPosition.BOTTOM) || pos1.equals(PlayerPosition.TOP) && (pos2.equals(PlayerPosition.BOTTOM) || pos2.equals(PlayerPosition.TOP))))
            return true;
        if ((pos1.equals(PlayerPosition.LEFT) || pos1.equals(PlayerPosition.RIGHT) && (pos2.equals(PlayerPosition.LEFT) || pos2.equals(PlayerPosition.RIGHT))))
            return true;
        return false;
    }
}
