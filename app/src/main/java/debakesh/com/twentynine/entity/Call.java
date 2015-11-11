package debakesh.com.twentynine.entity;

import debakesh.com.twentynine.player.Player;

/**
 * Created by debarghy on 10/10/2015.
 */
public class Call {

    private final Player callingPlayer;
    private int bidAmount;
    private  boolean isPass;

    public Call(Player callingPlayer) {
        this.callingPlayer = callingPlayer;
    }

    public Player getCallingPlayer() {
        return callingPlayer;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
        isPass = false;
    }

    public void setIsPass(boolean isPass) {
        this.isPass = isPass;
    }

    public boolean isPass() {
        return isPass;
    }

    public int getBidAmount() {
        return bidAmount;
    }
}
