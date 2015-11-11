package debakesh.com.twentynine.entity;

/**
 * Created by debarghy on 10/15/2015.
 */
public class ScoreContext {

    private boolean isTargetSetter;
    private boolean isGameWinner;
    private boolean isDouble;
    private boolean isRedouble;
    private boolean isSingleHand;
    private boolean isAllRoundWinner;


    public ScoreContext(boolean isTargetSetter, boolean isGameWinner, boolean isDouble, boolean isRedouble, boolean isSingleHand, boolean isAllRoundWinner) {
        this.isTargetSetter = isTargetSetter;
        this.isGameWinner = isGameWinner;
        this.isDouble = isDouble;
        this.isRedouble = isRedouble;
        this.isSingleHand = isSingleHand;
        this.isAllRoundWinner = isAllRoundWinner;
    }

    public boolean isAllRoundWinner() {
        return isAllRoundWinner;
    }

    public boolean isTargetSetter() {
        return isTargetSetter;
    }

    public boolean isGameWinner() {
        return isGameWinner;
    }

    public boolean isDouble() {
        return isDouble;
    }

    public boolean isRedouble() {
        return isRedouble;
    }

    public boolean isSingleHand() {
        return isSingleHand;
    }
}
