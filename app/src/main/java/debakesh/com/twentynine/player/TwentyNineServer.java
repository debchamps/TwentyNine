package debakesh.com.twentynine.player;

import com.card.common.card.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import debakesh.com.twentynine.entity.ValidationResult;
import debakesh.com.twentynine.helper.PlayerHelper;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 9/27/2015.
 */
public interface TwentyNineServer {
    public void createNewGame();
    public void registerPlayerToGame(String gsmeId, String playerId);
    /** Allowed only for single playerMode. We only have one gameId*/
    public void resetGame(String gameId);
    ValidationResult isValidMove(String gameId, Player player, Card card);
    public void updateMove(String gameId, String playerId, Card card);
    public void makeCall(String gameId, String playerId, int callCount);
    public void callDouble(String gameId, String playerId);
    public void callReDouble(String gameId, String playerId);



}
