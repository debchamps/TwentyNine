package debakesh.com.twentynine.entity;

import android.bluetooth.le.ScanRecord;

/**
 * Created by debarghy on 10/15/2015.
 */
public class SetScore {

    private int red = 0;
    private int black = 0;
    private int total = 0;


    private void singleHandUpdate(ScoreContext scoreContext) {
        if (scoreContext.isTargetSetter()) {
            if (scoreContext.isGameWinner()) {
                total += 2;
            } else {
                total -= 2;
            }
        } else {
            //Only target setter score changes
        }

    }

    private void normalGameUpdate(ScoreContext scoreContext) {
        int muliplier = 1;
        if (scoreContext.isDouble())
            muliplier = 2;
        if (scoreContext.isRedouble())
            muliplier = 4;
        if (scoreContext.isTargetSetter()) {
            if (scoreContext.isGameWinner()) {
                total += muliplier;
            } else {
                total -= muliplier;
            }
        }
    }


    public void updateScore(ScoreContext scoreContext) {
        if (scoreContext.isSingleHand()) {
            singleHandUpdate(scoreContext);
        } else {
            normalGameUpdate(scoreContext);
        }
    }

    public int getRed() {
        if (total > 0)
            return total;
        else
            return 0;
    }

    public int getBlack() {
        if (total < 0)
            return total;
        else
            return 0;
    }
}
