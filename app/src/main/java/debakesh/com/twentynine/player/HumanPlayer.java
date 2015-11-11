package debakesh.com.twentynine.player;

import debakesh.com.twentynine.GameScreen;
import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 10/2/2015.
 */
public  class HumanPlayer extends Player {

    @Override
    public void setTrumpCard(GameState gameState) {

    }

    @Override
    public void updatePairRevealed(GameState gameState) {

    }


    @Override
    public void makeBid(GameState gameState, Call call) {

    }

    @Override
    public void updateTrumpRevealed(GameState gameState) {

    }

    @Override
    public void updateTrumpSet(GameState gameState) {

    }

    private GameScreen gameScreen;

    public HumanPlayer(String id, PlayerPosition pos) {
        super(id, pos);
    }

    @Override
    public  TwentyNineCard nextMove() {
        return  null;
    }

    @Override
    public void updateBidComplete(GameState gameState) {

    }
    @Override
    public void updateMove(GameState gameState, Move move) {

    }

    @Override
    public void updateBid(GameState gameState, Call call) {

    }

    public void playCard(TwentyNineCard card) {
        updateCardAfterPlay(card);
        gameState.playMove(this, card);
    }

}