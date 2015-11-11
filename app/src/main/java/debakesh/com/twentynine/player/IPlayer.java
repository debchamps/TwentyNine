package debakesh.com.twentynine.player;

import java.util.Iterator;
import java.util.List;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 10/3/2015.
 */
public interface IPlayer {
    public TwentyNineCard nextMove();
    public void updateTrumpRevealed(GameState gameState);
    public  void updateMove(GameState gameState,Move currentMove);
    public  void updateBid(GameState gameState,Call call);
//    public void updateCall(GameState gameState);
//    public void makeeCall(GameState gameState);
    public void updateBidComplete(GameState gameState);
    public void updatePairRevealed(GameState gameState);

    public void setFirstHand(List<TwentyNineCard> cards);
    public void setSecondHand(List<TwentyNineCard> cards);
    public PlayerPosition getPlayerPosition();
    public String getId();
    public void updateTrumpSet(GameState gameState);



}
