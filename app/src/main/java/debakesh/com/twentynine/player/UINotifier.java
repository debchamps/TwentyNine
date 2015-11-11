package debakesh.com.twentynine.player;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineSet;

/**
 * Created by debarghy on 10/2/2015.
 */
public interface UINotifier {
    public void notifyMove(GameState gameState, Move move); //Match is ended or not is the UI responsibility to check
    public void notifyRound(GameState gameState, Round round); //Match is ended or not is the UI responsibility to check
    public void notifyGame(GameState gameState); //Match is ended or not is the UI responsibility to check
    public void notifyGameStart(GameState gameState); //Match is started
    public void notifySetComplete(TwentyNineSet twentyNineSet);
    public  void updateBid(GameState gameState,Call call);
    public  void onGameCancellation(GameState gameState);

    public void updateBidComplete(GameState gameState);
    public void updateTrumpRevealed(GameState gameState);
    public void updateTrumpSet(GameState gameState);
    public void updatePairRevealed(GameState gameState);

}
