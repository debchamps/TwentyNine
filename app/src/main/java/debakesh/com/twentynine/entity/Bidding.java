package debakesh.com.twentynine.entity;

import debakesh.com.twentynine.helper.PlayerHelper;
import debakesh.com.twentynine.player.PlayerPosition;

/**
 * Created by debarghy on 10/11/2015.
 */
public class Bidding {

    public enum BiddingStatus {IN_PROGRESS,COMPLETED}
    private  BiddingStatus biddingStatus;


    public BiddingStatus getBiddingStatus() {
        return biddingStatus;
    }

    int numPass = 0;
    PlayerPosition currentCallPosition;
    PlayerPosition latestBidRaiser;
    PlayerPosition otherBidCaller;
    PlayerPosition callStarter;
    Call winningCall;

    public Call getWinningCall() {
        return winningCall;
    }

    public Bidding(PlayerPosition bidStarter) {
        this.currentCallPosition = bidStarter;
        callStarter = bidStarter;
        latestBidRaiser = bidStarter;
        otherBidCaller = PlayerHelper.getNextPlayerPosition(bidStarter);
        biddingStatus = BiddingStatus.IN_PROGRESS;
    }

    public PlayerPosition getCurrentBidder() {
        return this.currentCallPosition;
    }

    public int getMinimumNextBidAmount(PlayerPosition pos) {
        if(null == winningCall)
            return 16;
        if(pos.equals(latestBidRaiser)) {
            return winningCall.getBidAmount();
        } else if(pos.equals(otherBidCaller)){
            return winningCall.getBidAmount() + 1;
        } else {
            return -1;
        }

    }

    public void call(Call call) {
        //check bidding status
        if (biddingStatus.equals(BiddingStatus.COMPLETED))
            return;
        if(!call.getCallingPlayer().getPlayerPosition().equals(currentCallPosition)) {
            return;
        }

        if(call.isPass()) {
            numPass +=1;
            //Check if who raised passed or the other player passed
            if(call.getCallingPlayer().getPlayerPosition().equals(latestBidRaiser)) {
                PlayerPosition temp = otherBidCaller;
                otherBidCaller = PlayerHelper.getNextPlayerPosition(otherBidCaller);
                currentCallPosition = otherBidCaller;
                latestBidRaiser = temp;
            } else {
                otherBidCaller = PlayerHelper.getNextPlayerPosition(otherBidCaller);
                currentCallPosition = otherBidCaller;
            }
        } else {
            if(call.getCallingPlayer().getPlayerPosition().equals(latestBidRaiser) ) {
                if(winningCall == null || call.getBidAmount() >= winningCall.getBidAmount()) {
                    winningCall = call;
                    currentCallPosition = otherBidCaller;
                }
            } else {
                if(winningCall == null || call.getBidAmount() > winningCall.getBidAmount()) {
                    winningCall = call;
                    currentCallPosition = latestBidRaiser;
                }
            }
        }
        if(numPass == 3)
            biddingStatus = BiddingStatus.COMPLETED;

        if(otherBidCaller.equals(callStarter) ) {
    //            biddingStatus = BiddingStatus.COMPLETED;
            //Bidding ends
        }
    }
}
