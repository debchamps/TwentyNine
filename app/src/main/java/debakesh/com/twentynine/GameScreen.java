package debakesh.com.twentynine;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Bundle;
import android.transition.Fade;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.card.common.card.Card;
import com.card.common.card.CardFactory;
import com.card.common.shuffle.NCutShuffler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import debakesh.com.twentynine.entity.Call;
import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.SetScore;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.TwentyNineSet;
import debakesh.com.twentynine.helper.factory.TwentyNineCardDistributionFactory;
import debakesh.com.twentynine.player.HumanPlayer;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;
import debakesh.com.twentynine.player.RandomComputerPlayer;
import debakesh.com.twentynine.player.RuleBasedRandomPlayer;
import debakesh.com.twentynine.player.UINotifier;
import debakesh.com.twentynine.player.WekaPlayer;
import debakesh.com.twentynine.team.Team;

//ActionBarActivity
public class GameScreen extends Activity implements UINotifier {
    Typeface myTypeface;

    @Override
    public void notifyGameStart(final GameState gameState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startNewGame();
            }
        }, 4000);

    }

    @Override
    public void onGameCancellation(GameState gameState) {

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.game_cancellation);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                twentnNineSet.createNewGame();
            }
        });
        WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();
        TextView selectTrumpText = (TextView) dialog.findViewById(R.id.selectTrumpTxt);
        selectTrumpText.setTypeface(myTypeface);
        selectTrumpText.setText(gameState.getGameCancellationReason().getMessage());
//        wmlp.x = new Float(findViewById(R.id.playerBottomImage).getX()).intValue(); ;   //x position
        dialog.setCancelable(true);
        dialog.show();

    }

    @Override
    public void notifySetComplete(TwentyNineSet twentyNineSet) {
        Toast toast = Toast.makeText(getApplicationContext(), " wins the match with score ", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public void updateTrumpRevealed(GameState gameState) {
        //Anyway reveal this

        if (!gameState.isSeventhCard()) {
            if (gameState.getTrumpCard().getSuit().equals("D"))
                ((ImageView) findViewById(R.id.revealTrumpBtn)).setImageDrawable(getResources().getDrawable(R.drawable.diamond_six));
            if (gameState.getTrumpCard().getSuit().equals("S"))
                ((ImageView) findViewById(R.id.revealTrumpBtn)).setImageDrawable(getResources().getDrawable(R.drawable.spade_six));
            if (gameState.getTrumpCard().getSuit().equals("C"))
                ((ImageView) findViewById(R.id.revealTrumpBtn)).setImageDrawable(getResources().getDrawable(R.drawable.club_six));
            if (gameState.getTrumpCard().getSuit().equals("H"))
                ((ImageView) findViewById(R.id.revealTrumpBtn)).setImageDrawable(getResources().getDrawable(R.drawable.hearts_six));
        }

        if (gameState.isSeventhCard() && gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
            ImageButton sevenCard = (ImageButton) findViewById(R.id.playerBottomCard7);
            sevenCard.setImageResource(android.R.color.transparent);
            setCard(sevenCard, gameState.getPlayerBottom().getAllCards().get(6));

        }

        if (gameState.isTrumpRevealed()) {
            ImageButton trumpButton = (ImageButton) findViewById(R.id.revealTrumpBtn);
            trumpButton.setImageResource(android.R.color.transparent);
            setCard(trumpButton, gameState.getTrumpCard());
        }

    }

    @Override
    public void updateTrumpSet(final GameState gameState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (!gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
                    ((Button) findViewById(R.id.playerBottomBubble)).setText("");
                    animateBallon((View) findViewById(R.id.playerBottomBubble));
                }
                if (!gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.LEFT)) {
                    ((Button) findViewById(R.id.playerLeftBubble)).setText("");
                    animateBallon((View) findViewById(R.id.playerLeftBubble));
                }
                if (!gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.RIGHT)) {
                    ((Button) findViewById(R.id.playerRightBubble)).setText("");
                    animateBallon((View) findViewById(R.id.playerRightBubble));
                }
                if (!gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.TOP)) {
                    ((Button) findViewById(R.id.playerTopBubble)).setText("");
                    animateBallon((View) findViewById(R.id.playerTopBubble));
                }
            }
        }, 100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame(gameState);
            }
        }, 2500);

        //if seventh card
    }

    public void animateBallon(View balloonView) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        TranslateAnimation animate;
        animate = new TranslateAnimation(0, 0, 0, -height); // <------  slide up
        animate.setDuration(2000);
        animate.setFillAfter(false);
        balloonView.startAnimation(animate);
        balloonView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void updateBidComplete(GameState gameState) {
        if (gameState.getBidding().getWinningCall().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.BOTTOM)) {

            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.trump_dialog);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();
            TextView selectTrumpText = (TextView) dialog.findViewById(R.id.selectTrumpTxt);
            selectTrumpText.setTypeface(myTypeface);
//        wmlp.x = new Float(findViewById(R.id.playerBottomImage).getX()).intValue(); ;   //x position
            dialog.setCancelable(false);
            dialog.show();
            addTrumpButton(dialog);
        }
    }

    public void updateSetScore(SetScore setScore) {
        int spriteIndex = setScore.getRed() + -1 * setScore.getBlack() + 6;
        int spriteColIndex = spriteIndex % 4;
        int spriteRowIndex = spriteIndex / 4;

        Bitmap cardImage = BitmapFactory.decodeResource(getResources(), R.drawable.set_score_opponent);
        Bitmap scoreView = Bitmap.createBitmap(cardImage, 50, 230, 130, 180);
        ImageView imgTeam1Scr = (ImageView) findViewById(R.id.team1SetScore);
        ImageView imgTeam2Scr = (ImageView) findViewById(R.id.team2SetScore);
        imgTeam1Scr.setImageBitmap(scoreView);
        imgTeam2Scr.setImageBitmap(scoreView);
    }

    private void gameCompleteUICleanup() {

        findViewById(R.id.playerBottomCard1).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard2).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard3).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard4).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard5).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard6).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard7).setVisibility(View.INVISIBLE);
        findViewById(R.id.playerBottomCard8).setVisibility(View.INVISIBLE);
    }


    @Override
    public void notifyGame(GameState gameState) {
        updateSetScore(twentnNineSet.getTeam1Score());
        Toast toast = Toast.makeText(getApplicationContext(), gameState.getWinner().getTeamId() + " wins the match with score ", Toast.LENGTH_LONG);
        toast.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                gameCompleteUICleanup();
                //      startNewGame();
            }
        }, 100);
    }

    private TextView getBidScoreView(Player player) {
        if (player.getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
            return (TextView) findViewById(R.id.callScoreBottom);

        }
        if (player.getPlayerPosition().equals(PlayerPosition.TOP)) {
            return (TextView) findViewById(R.id.callScoreTop);

        }
        if (player.getPlayerPosition().equals(PlayerPosition.LEFT)) {
            return (TextView) findViewById(R.id.callScoreLeft);

        }
        if (player.getPlayerPosition().equals(PlayerPosition.RIGHT)) {
            return (TextView) findViewById(R.id.callScoreRight);

        }
        return null;

    }


    View getBidBubble(PlayerPosition pos) {
        if (pos.equals(PlayerPosition.BOTTOM))
            return (View) findViewById(R.id.playerBottomBubble);
        else if (pos.equals(PlayerPosition.RIGHT))
            return (View) findViewById(R.id.playerRightBubble);
        else if (pos.equals(PlayerPosition.TOP))
            return (View) findViewById(R.id.playerTopBubble);
        else
            return (View) findViewById(R.id.playerLeftBubble);


    }

    @Override
    public void updateBid(GameState gameState, Call call) {

        Button incrBtn = (Button) findViewById(R.id.buttonIncrementBidId);
        getBidBubble(call.getCallingPlayer().getPlayerPosition()).setVisibility(View.VISIBLE);

        if (call.isPass()) {
            //remove the number from the players cap
            ((Button) getBidBubble(call.getCallingPlayer().getPlayerPosition())).setTypeface(myTypeface);
            ((Button) getBidBubble(call.getCallingPlayer().getPlayerPosition())).setText("Pass");
            //getBidScoreView(call.getCallingPlayer()).setText("P");
            //getBidScoreView(call.getCallingPlayer()).setVisibility(View.VISIBLE);
            // getBidScoreView(call.getCallingPlayer()).setTypeface(myTypeface);
        } else {

            Button incrBidBtn = ((Button) findViewById(R.id.buttonIncrementBidId));
            if (gameState.getBidding().getCurrentBidder().equals(PlayerPosition.BOTTOM)) {
                incrBidBtn.setBackgroundResource(R.drawable.green_button);
                ((Button) findViewById(R.id.buttonStopBid)).setBackgroundResource(R.drawable.red_button);
                incrBidBtn.setText(String.valueOf(gameState.getBidding().getMinimumNextBidAmount(PlayerPosition.BOTTOM)));
                incrBidBtn.setTypeface(myTypeface);
            } else {
                incrBidBtn.setBackgroundResource(R.drawable.yellow_button);
                ((Button) findViewById(R.id.buttonStopBid)).setBackgroundResource(R.drawable.yellow_button);

            }
            ((Button) getBidBubble(call.getCallingPlayer().getPlayerPosition())).setTypeface(myTypeface);
            ((Button) getBidBubble(call.getCallingPlayer().getPlayerPosition())).setText(String.valueOf(call.getBidAmount()));
            //getBidScoreView(call.getCallingPlayer()).setText(String.valueOf(call.getBidAmount()));
            //getBidScoreView(call.getCallingPlayer()).setTypeface(myTypeface);
            //getBidScoreView(call.getCallingPlayer()).setVisibility(View.VISIBLE);
            //Change the number in playercap
        }
    }

    public void updateCall(GameState gameState, Call call) {
        //Check the position the call is made and then upate that number
        PlayerPosition callPosition = call.getCallingPlayer().getPlayerPosition();
        if (callPosition.equals(PlayerPosition.BOTTOM)) {

        }
    }

    private ImageView getPlayerView(PlayerPosition pos) {
        if (pos.equals(PlayerPosition.BOTTOM)) {
            return (ImageView) findViewById(R.id.playerBottomImage);
        } else if (pos.equals(PlayerPosition.TOP)) {
            return (ImageView) findViewById(R.id.playerTopImage);
        } else if (pos.equals(PlayerPosition.LEFT)) {
            return (ImageView) findViewById(R.id.playerLeftImage);
        } else {
            return (ImageView) findViewById(R.id.playerRightImage);
        }
    }

    @Override
    public void notifyMove(GameState gameState, Move move) {
        setCard(getPlayedCardView(move.getPlayerPosition()), move.getCard());
    }

    public void startGame(GameState gs) {

        ((View) findViewById(R.id.biddingLayout)).setVisibility(View.INVISIBLE);
        ImageButton sevenCard = (ImageButton) findViewById(R.id.playerBottomCard7);
        if (gs.isSeventhCard() && gs.getGameTarget().getCallingPlayer().getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
            sevenCard.setBackgroundResource(R.drawable.trump_back);
            sevenCard.setImageBitmap(null);
            //  new GameTarget(true, gs.getBidding().getWinningCall().getBidAmount(), gs.getBidding().getWinningCall().getCallingPlayer(), ) {

            // gameState.setGameTarget(true,);
        } else {

        }
        //Making all the card vuisible
        ((View) findViewById(R.id.bottomCardSecondHandLayout)).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard1).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard2).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard3).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard4).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard5).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard6).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard7).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard8).setVisibility(View.VISIBLE);

        //if seventh card update the
    }

    public void animationCard(final ImageView imageView, int startX, int startY, int finalX, int finalY) {

//        TranslateAnimation animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0, Animation.ABSOLUTE, finalX - imageView.getX(), Animation.ABSOLUTE, finalY - imageView.getY());

        TranslateAnimation animation = new TranslateAnimation(0, finalX - startX, 0, finalY - startY);
        animation.setDuration(1500);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        AnimationSet set1 = new AnimationSet(false);
        set1.addAnimation(animation);
        Animation fadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.abc_fade_out);
        fadeOutAnimation.setStartOffset(500);
        set1.setFillAfter(false);
        imageView.startAnimation(set1);


        set1.setAnimationListener(new Animation.AnimationListener() {

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                imageView.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void animationCard(final ImageView imageView, int finalX, int finalY) {

//        TranslateAnimation animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0, Animation.ABSOLUTE, finalX - imageView.getX(), Animation.ABSOLUTE, finalY - imageView.getY());

        int[] originPos = new int[2];
        ;
        imageView.getLocationOnScreen(originPos);
        TranslateAnimation animation = new TranslateAnimation(0, finalX - originPos[0], 0, finalY - originPos[1]);
        animation.setDuration(900);
        animation.setFillAfter(false);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                imageView.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        AnimationSet set1 = new AnimationSet(false);
        set1.addAnimation(animation);
        Animation fadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.abc_fade_out);
        fadeOutAnimation.setStartOffset(500);
        //      set1.addAnimation(fadeOutAnimation);
        set1.setFillAfter(false);
        imageView.startAnimation(set1);


        set1.setAnimationListener(new Animation.AnimationListener() {

            public void onAnimationStart(Animation animation) {

            }

            public void onAnimationRepeat(Animation animation) {

            }

            public void onAnimationEnd(Animation animation) {
                imageView.setVisibility(View.INVISIBLE);

            }
        });
    }

    @Override
    public void notifyRound(GameState gameState, Round round) {

        TextView team1Score = (TextView) findViewById(R.id.team1GameScore);
        TextView team2Score = (TextView) findViewById(R.id.team2GameScore);

        if (round.getRoundWinnerTeamId() == 1) {
            //  drawScore(1, gameState.getTeamOneScore());
            team1Score.setText(gameState.getTeamOneScore().toString());
            team1Score.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        }
        if (round.getRoundWinnerTeamId() == 2) {
            //   drawScore(2, gameState.getTeamTwoScore());
            team2Score.setText(gameState.getTeamTwoScore().toString());
            team2Score.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        }
        int[] finalPosition = new int[2];
        int xOffset = 0, yOffset = 0;
        if (round.getRoundWinnerPlayerPosition().equals(PlayerPosition.BOTTOM)) {
            findViewById(R.id.playerBottomImage).getLocationOnScreen(finalPosition);
            xOffset = 60;
        }
        if (round.getRoundWinnerPlayerPosition().equals(PlayerPosition.TOP)) {
            findViewById(R.id.playerTopImage).getLocationOnScreen(finalPosition);
            xOffset = -60;
        }
        if (round.getRoundWinnerPlayerPosition().equals(PlayerPosition.LEFT)) {
            findViewById(R.id.playerLeftImage).getLocationOnScreen(finalPosition);
            yOffset = 60;
        }
        if (round.getRoundWinnerPlayerPosition().equals(PlayerPosition.RIGHT)) {
            findViewById(R.id.playerRightImage).getLocationOnScreen(finalPosition);
            yOffset = -60;
        }


        for (int i = 0; i < round.getMoves().size(); i++) {
            animationCard(getPlayedCardView(round.getMoves().get(i).getPlayerPosition()), finalPosition[0] + xOffset, finalPosition[1] + yOffset);

        }
//        animationCard(getPlayedCardView(PlayerPosition.BOTTOM), finalPosition[0], finalPosition[1] + 60);
//        animationCard(getPlayedCardView(PlayerPosition.TOP), finalPosition[0], finalPosition[1] + 60);
//        animationCard(getPlayedCardView(PlayerPosition.LEFT), finalPosition[0], finalPosition[1] + 60);
        //       animationCard(getPlayedCardView(PlayerPosition.RIGHT), finalPosition[0], finalPosition[1] + 60);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //   getPlayedCardView(PlayerPosition.BOTTOM).setVisibility(View.GONE);
                //   getPlayedCardView(PlayerPosition.TOP).setVisibility(View.GONE);
                //   getPlayedCardView(PlayerPosition.RIGHT).setVisibility(View.GONE);
                //   getPlayedCardView(PlayerPosition.LEFT).setVisibility(View.GONE);

            }
        }, 1000);
    }


    public void setScore(TwentyNineSet set) {
        findViewById(R.id.team1SetScore);
        findViewById(R.id.team2SetScore);

    }

    List<TwentyNineCard> cards = CardFactory.get29Deck();
    NCutShuffler nCutShuffler = new NCutShuffler(cards);
    List<TwentyNineCard> shuffledDeck = (List<TwentyNineCard>) nCutShuffler.shuffle();

    private GameState gameState;

    private TwentyNineSet twentnNineSet;

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initiate();
    }

    public void initiate() {
        myTypeface = Typeface.createFromAsset(getAssets(),
                String.format(Locale.US, "fonts/%s", "Lobster_1.3.otf"));

        startNewSet();
        // GameState gameState = startNewGame();
        setContentView(R.layout.activity_game_screen);
        displayeImage();
        addListenerOnPLayerCard();
        addBiddingButton();
        addBiddingPassButton();
        addRevealTrumpListener();
        addStartGameButton();
        updateSetScore(twentnNineSet.getTeam1Score());

    }


    public TwentyNineCard nextMove() {
        return null;
    }

    public void updateMove(GameState gameState) {

    }

    private void startNewGame() {
//        setContentView(R.layout.activity_game_screen);
        if (getBidBubble(PlayerPosition.BOTTOM) != null)
            ((Button) getBidBubble(PlayerPosition.BOTTOM)).setText("");
        if (getBidBubble(PlayerPosition.TOP) != null)
            ((Button) getBidBubble(PlayerPosition.TOP)).setText("");
        if (getBidBubble(PlayerPosition.LEFT) != null)
            ((Button) getBidBubble(PlayerPosition.LEFT)).setText("");
        if (getBidBubble(PlayerPosition.RIGHT) != null)
            ((Button) getBidBubble(PlayerPosition.RIGHT)).setText("");

//        ((TextView) findViewById(R.id.callScoreTop)).setText("");
//        ((TextView) findViewById(R.id.callScoreBottom)).setText("");
//        ((TextView) findViewById(R.id.callScoreLeft)).setText("");
//        ((TextView) findViewById(R.id.callScoreRight)).setText("");

        ((TextView) findViewById(R.id.team1GameScore)).setText("0");
        ((TextView) findViewById(R.id.team2GameScore)).setText("0");


        //First hand visible

        ((ImageView) findViewById(R.id.revealTrumpBtn)).setImageDrawable(getResources().getDrawable(R.drawable.trump_back));

        getBidBubble(PlayerPosition.BOTTOM).setVisibility(View.INVISIBLE);
        getBidBubble(PlayerPosition.TOP).setVisibility(View.INVISIBLE);
        getBidBubble(PlayerPosition.LEFT).setVisibility(View.INVISIBLE);
        getBidBubble(PlayerPosition.RIGHT).setVisibility(View.INVISIBLE);
        ((Button) findViewById(R.id.buttonIncrementBidId)).setBackgroundResource(R.drawable.green_button);
        ((Button) findViewById(R.id.buttonStopBid)).setBackgroundResource(R.drawable.red_button);

        ((View) findViewById(R.id.biddingLayout)).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard1).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard2).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard3).setVisibility(View.VISIBLE);
        findViewById(R.id.playerBottomCard4).setVisibility(View.VISIBLE);

        //TODO: Should we set it here or should we do it from TwentyNineSet on complete game
        //  twentnNineSet. createNewGame();


        displayeImage();
        addListenerOnPLayerCard();
        addBiddingButton();
        addBiddingPassButton();
        addRevealTrumpListener();
        addStartGameButton();

    }

    private TwentyNineSet startNewSet() {
        /*
        RandomComputerPlayer topPlayer = new RandomComputerPlayer("Top", PlayerPosition.TOP);
        RandomComputerPlayer leftPlayer = new RandomComputerPlayer("Left", PlayerPosition.LEFT);
        RandomComputerPlayer rightPlayer = new RandomComputerPlayer("Right", PlayerPosition.RIGHT);
        HumanPlayer bottomPlayer = new HumanPlayer("Right", PlayerPosition.BOTTOM);
        */
        /*

        WekaPlayer topPlayer = new WekaPlayer("Top", PlayerPosition.TOP);
        WekaPlayer leftPlayer = new WekaPlayer("Left", PlayerPosition.LEFT);
        WekaPlayer rightPlayer = new WekaPlayer("Right", PlayerPosition.RIGHT);
        HumanPlayer bottomPlayer = new HumanPlayer("Bottom", PlayerPosition.BOTTOM);
        */
        RuleBasedRandomPlayer topPlayer = new RuleBasedRandomPlayer("Top", PlayerPosition.TOP);
        RuleBasedRandomPlayer leftPlayer = new RuleBasedRandomPlayer("Left", PlayerPosition.LEFT);
        RuleBasedRandomPlayer rightPlayer = new RuleBasedRandomPlayer("Right", PlayerPosition.RIGHT);
        HumanPlayer bottomPlayer = new HumanPlayer("Bottom", PlayerPosition.BOTTOM);

        //a
        Team teamOne = new Team("One", "WE", bottomPlayer, topPlayer, 1);

        Team teamTwo = new Team("Two", "Opponent", rightPlayer, leftPlayer, 2);
        List<UINotifier> uiNotifiers = new ArrayList<>();
        uiNotifiers.add(this);

        twentnNineSet = new TwentyNineSet(1, bottomPlayer, topPlayer, rightPlayer, leftPlayer, teamOne, teamTwo, uiNotifiers);

        //      gameState.setGameTarget(new GameTarget(false, 17, bottomPlayer, teamOne));
        //allocateTestDeck(gameState);
//        allocateShuffledCard(gameState);
//        gameState.setIsTrumpRevealed(false);


        return twentnNineSet;

    }


    private GameState startNewGame1() {

        /*
        RandomComputerPlayer topPlayer = new RandomComputerPlayer("Top", PlayerPosition.TOP);
        RandomComputerPlayer leftPlayer = new RandomComputerPlayer("Left", PlayerPosition.LEFT);
        RandomComputerPlayer rightPlayer = new RandomComputerPlayer("Right", PlayerPosition.RIGHT);
        HumanPlayer bottomPlayer = new HumanPlayer("Right", PlayerPosition.BOTTOM);
        */

        WekaPlayer topPlayer = new WekaPlayer("Top", PlayerPosition.TOP);
        WekaPlayer leftPlayer = new WekaPlayer("Left", PlayerPosition.LEFT);
        WekaPlayer rightPlayer = new WekaPlayer("Right", PlayerPosition.RIGHT);
        HumanPlayer bottomPlayer = new HumanPlayer("Right", PlayerPosition.BOTTOM);


        //a
        Team teamOne = new Team("One", "WE", bottomPlayer, topPlayer, 1);

        Team teamTwo = new Team("Two", "Opponent", rightPlayer, leftPlayer, 2);
        List<UINotifier> uiNotifiers = new ArrayList<>();
        uiNotifiers.add(this);
        gameState = new GameState(1, bottomPlayer, topPlayer, rightPlayer, leftPlayer, PlayerPosition.BOTTOM, teamOne, teamTwo, uiNotifiers);
        //      gameState.setGameTarget(new GameTarget(false, 17, bottomPlayer, teamOne));
        //allocateTestDeck(gameState);
        allocateShuffledCard(gameState);
        gameState.setIsTrumpRevealed(false);

        System.out.println("############  BOT " + bottomPlayer.getRemainingCards());
        System.out.println("############ TOP " + topPlayer.getRemainingCards());
        System.out.println("############ LEFT " + leftPlayer.getRemainingCards());
        System.out.println("############ RIGHT " + rightPlayer.getRemainingCards());

        //bottomPlayer.setGameState(gameState);
        leftPlayer.setGameState(gameState);
        topPlayer.setGameState(gameState);
        rightPlayer.setGameState(gameState);
        bottomPlayer.setGameState(gameState);

        return gameState;
    }

    public void allocateTestDeck(GameState gameState) {

        NCutShuffler shuffler = new NCutShuffler(cards);
        Map<PlayerPosition, List<TwentyNineCard>> posToCardMap = TwentyNineCardDistributionFactory.getKingQueuen();
        //List<TwentyNineCard> playingDeck = cards;

        gameState.getPlayerBottom().setFirstHand(posToCardMap.get(PlayerPosition.BOTTOM).subList(0, 4));
        gameState.getPlayerLeft().setFirstHand(posToCardMap.get(PlayerPosition.LEFT).subList(0, 4));
        gameState.getPlayerTop().setFirstHand(posToCardMap.get(PlayerPosition.TOP).subList(0, 4));
        gameState.getPlayerRight().setFirstHand(posToCardMap.get(PlayerPosition.RIGHT).subList(0, 4));

        gameState.getPlayerBottom().setSecondHand(posToCardMap.get(PlayerPosition.BOTTOM).subList(4, 8));
        gameState.getPlayerLeft().setSecondHand(posToCardMap.get(PlayerPosition.LEFT).subList(4, 8));
        gameState.getPlayerTop().setSecondHand(posToCardMap.get(PlayerPosition.TOP).subList(4, 8));
        gameState.getPlayerRight().setSecondHand(posToCardMap.get(PlayerPosition.RIGHT).subList(4, 8));


    }


    @Override
    public void updatePairRevealed(GameState gameState) {

        getBidScoreView(gameState.getGameTarget().getCallingPlayer()).setText(String.valueOf(gameState.getGameTarget().getTarget()));

    }

    public void allocateShuffledCard(GameState gameState) {
        NCutShuffler shuffler = new NCutShuffler(cards);
        List<TwentyNineCard> playingDeck = (List<TwentyNineCard>) shuffler.shuffle();
        //List<TwentyNineCard> playingDeck = cards;

        gameState.getPlayerBottom().setFirstHand(playingDeck.subList(0, 4));
        gameState.getPlayerLeft().setFirstHand(playingDeck.subList(4, 8));
        gameState.getPlayerTop().setFirstHand(playingDeck.subList(8, 12));
        gameState.getPlayerRight().setFirstHand(playingDeck.subList(12, 16));


        gameState.getPlayerBottom().setSecondHand(playingDeck.subList(16, 20));
        gameState.getPlayerLeft().setSecondHand(playingDeck.subList(20, 24));
        gameState.getPlayerTop().setSecondHand(playingDeck.subList(24, 28));
        gameState.getPlayerRight().setSecondHand(playingDeck.subList(28, 32));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayeImage() {


        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                displayCaard(0, 0);
            }

            public void onFinish() {
            }
        }.start();
    }

    Bitmap getSpriteFromCard(Card card) {
        String suit = card.getSuit();
        String number = card.getNumber();
        Map<String, Integer> suitToPositionMap = new HashMap<>();
        suitToPositionMap.put("H", 0);
        suitToPositionMap.put("D", 1);
        suitToPositionMap.put("C", 2);
        suitToPositionMap.put("S", 3);


        Map<String, Integer> numberToPositionMap = new HashMap<>();
        numberToPositionMap.put("2", 0);
        numberToPositionMap.put("3", 1);
        numberToPositionMap.put("4", 2);
        numberToPositionMap.put("5", 3);
        numberToPositionMap.put("6", 4);
        numberToPositionMap.put("7", 5);
        numberToPositionMap.put("8", 6);
        numberToPositionMap.put("9", 7);
        numberToPositionMap.put("10", 8);
        numberToPositionMap.put("J", 9);
        numberToPositionMap.put("Q", 10);
        numberToPositionMap.put("K", 11);
        numberToPositionMap.put("A", 12);
        Bitmap cardImage = BitmapFactory.decodeResource(getResources(), R.drawable.card_sprite_small);
        Bitmap part = Bitmap.createBitmap(cardImage, ((cardImage.getWidth() * numberToPositionMap.get(card.getNumber())) / 13), ((cardImage.getHeight() * suitToPositionMap.get(card.getSuit())) / 5), (cardImage.getWidth() / 13) + 1, (cardImage.getHeight() / 5));
        return part;
    }

    public void displayCaard(int x, int y) {


        setCard((ImageButton) findViewById(R.id.playerBottomCard1), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(0));
        setCard((ImageButton) findViewById(R.id.playerBottomCard2), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(1));
        setCard((ImageButton) findViewById(R.id.playerBottomCard3), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(2));
        setCard((ImageButton) findViewById(R.id.playerBottomCard4), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(3));
        setCard((ImageButton) findViewById(R.id.playerBottomCard5), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(4));
        setCard((ImageButton) findViewById(R.id.playerBottomCard6), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(5));
        setCard((ImageButton) findViewById(R.id.playerBottomCard7), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(6));
        setCard((ImageButton) findViewById(R.id.playerBottomCard8), twentnNineSet.getCurrentGameState().getPlayerBottom().getAllCards().get(7));

//            setCard((ImageView) findViewById(R.id.playerLeftCard1), shuffledDeck.get(8));
//            setCard((ImageView) findViewById(R.id.playerLeftCard2), shuffledDeck.get(9));
//            setCard((ImageView) findViewById(R.id.playerLeftCard3), shuffledDeck.get(10));
        //           setCard((ImageView) findViewById(R.id.playerLeftCard4), shuffledDeck.get(11));

//            setCard((ImageView) findViewById(R.id.playerRightCard1), shuffledDeck.get(12));
        //           setCard((ImageView) findViewById(R.id.playerRightCard2), shuffledDeck.get(13));
        //           setCard((ImageView) findViewById(R.id.playerRightCard3), shuffledDeck.get(14));
        //          setCard((ImageView) findViewById(R.id.playerRightCard4), shuffledDeck.get(15));

//            setCard((ImageView) findViewById(R.id.playedCard1), shuffledDeck.get(16));
//            setCard((ImageView) findViewById(R.id.playedCard2), shuffledDeck.get(17));
//            setCard((ImageView) findViewById(R.id.playedCard3), shuffledDeck.get(18));
        //           setCard((ImageView) findViewById(R.id.playedCard4), shuffledDeck.get(19));

    }


    public void animatePlayedCard(ImageView img, Card card) {
        Bitmap cardImage = BitmapFactory.decodeResource(getResources(), R.drawable.card_sprite);
        Bitmap part = getSpriteFromCard(card);
//        img.setMaxHeight(5);
//        img.setMaxWidth(3);
        img.setImageBitmap(part);
        img.setVisibility(View.VISIBLE);

    }

    public void setCard(ImageView img, Card card) {
        Bitmap cardImage = BitmapFactory.decodeResource(getResources(), R.drawable.card_sprite);
        Bitmap part = getSpriteFromCard(card);
        img.setImageBitmap(part);
        img.setVisibility(View.VISIBLE);

    }

    public void setCard(ImageButton img, Card card) {
        Bitmap cardImage = BitmapFactory.decodeResource(getResources(), R.drawable.card_sprite);
        Bitmap part = getSpriteFromCard(card);
        img.setBackground(null);
        img.setImageBitmap(part);
    }

    private ImageView getPlayedCardView(PlayerPosition pos) {
        if (pos.equals(PlayerPosition.TOP))
            return (ImageView) findViewById(R.id.playedCardTop);
        else if (pos.equals(PlayerPosition.BOTTOM))
            return (ImageView) findViewById(R.id.playedCardBot);
        else if (pos.equals(PlayerPosition.RIGHT))
            return (ImageView) findViewById(R.id.playedCardRight);
        else
            return (ImageView) findViewById(R.id.playedCardLeft);
    }


    OnClickListener getOnClickListener(final TwentyNineCard card) {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twentnNineSet.getCurrentGameState().getGameStatus().equals(GameState.GameStatus.IN_PROGRESS) && twentnNineSet.getCurrentGameState().getCurrentRound().getCurrentPlayerPosition().equals(PlayerPosition.BOTTOM)) {
                    List<TwentyNineCard> allowedCards = twentnNineSet.getCurrentGameState().getPlayerBottom().allowedCards(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards(), twentnNineSet.getCurrentGameState().getPlayerBottom().getId());
                    for (TwentyNineCard allowedCard : allowedCards) {
                        if (allowedCard.getId().equals(card.getId())) {
                            v.setVisibility(View.INVISIBLE);
                            ((HumanPlayer) twentnNineSet.getCurrentGameState().getPlayerBottom()).playCard(card);
                        }
                    }
                }

            }
        };
    }

    public void addListenerOnPLayerCard() {

        ImageButton button1 = (ImageButton) findViewById(R.id.playerBottomCard1);
        ImageButton button2 = (ImageButton) findViewById(R.id.playerBottomCard2);
        ImageButton button3 = (ImageButton) findViewById(R.id.playerBottomCard3);
        ImageButton button4 = (ImageButton) findViewById(R.id.playerBottomCard4);
        ImageButton button5 = (ImageButton) findViewById(R.id.playerBottomCard5);
        ImageButton button6 = (ImageButton) findViewById(R.id.playerBottomCard6);
        ImageButton button7 = (ImageButton) findViewById(R.id.playerBottomCard7);
        ImageButton button8 = (ImageButton) findViewById(R.id.playerBottomCard8);

        button1.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(0)));
        button2.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(1)));
        button3.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(2)));
        button4.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(3)));
        button5.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(4)));
        button6.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(5)));
        button7.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(6)));
        button8.setOnClickListener(getOnClickListener(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(7)));
    }


    public void addBiddingPassButton() {
        Button passBidButton = (Button) findViewById(R.id.buttonStopBid);
        passBidButton.setTypeface(myTypeface);
        passBidButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twentnNineSet.getCurrentGameState().getBidding().getCurrentBidder().equals(twentnNineSet.getCurrentGameState().getPlayerBottom().getPlayerPosition())) {
                    ((Button) findViewById(R.id.buttonIncrementBidId)).setBackgroundResource(R.drawable.yellow_button);
                    ((Button) findViewById(R.id.buttonStopBid)).setBackgroundResource(R.drawable.yellow_button);
                    Button incrementBidvBtn = (Button) findViewById(R.id.buttonIncrementBidId);
                    incrementBidvBtn.setTypeface(myTypeface);
                    Call call = new Call(twentnNineSet.getCurrentGameState().getPlayerBottom());
                    call.setIsPass(true);
                    twentnNineSet.getCurrentGameState().call(call);
                }
            }
        });
    }

    private OnClickListener getRevealTrumpButtonListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!twentnNineSet.getCurrentGameState().isTrumpRevealed()) {
                    if (twentnNineSet.getCurrentGameState().canRevealTrump(twentnNineSet.getCurrentGameState().getPlayerBottom())) {
                        twentnNineSet.getCurrentGameState().revealTrump(twentnNineSet.getCurrentGameState().getPlayerBottom());
                    }
                }
            }
        };
    }

    public void addRevealTrumpListener() {
        ((ImageButton) findViewById(R.id.revealTrumpBtn)).setOnClickListener(getRevealTrumpButtonListener());
    }

    OnClickListener getTrumpSelectorButtonListener(final String suit, final Dialog dialog) {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                //   ImageView imageView = getPlayedCardView(gameState.getCurrentRound().getMoves().size() + 1);
                //  setCard(imageView, card);
                if (suit.equals("C")) {
                    twentnNineSet.getCurrentGameState().setTrumpCard(new TwentyNineCard("C", "6"), false);
                } else if (suit.equals("D")) {
                    twentnNineSet.getCurrentGameState().setTrumpCard(new TwentyNineCard("D", "6"), false);
                } else if (suit.equals("S")) {
                    twentnNineSet.getCurrentGameState().setTrumpCard(new TwentyNineCard("S", "6"), false);
                } else if (suit.equals("H")) {
                    twentnNineSet.getCurrentGameState().setTrumpCard(new TwentyNineCard("H", "6"), false);
                } else if (suit.equals("SEVEN")) {
                    twentnNineSet.getCurrentGameState().setTrumpCard(twentnNineSet.getCurrentGameState().getPlayerBottom().getRemainingCards().get(6), true);
                    twentnNineSet.getCurrentGameState().setIsSeventhCard(true);
                } else {
                    throw new IllegalArgumentException("Unexpected call for view" + v);
                }
                dialog.dismiss();
                startGame(twentnNineSet.getCurrentGameState());
            }
        };

    }


    public void addStartGameButton() {
        Button startButton = (Button) findViewById(R.id.startGameBtn);
        startButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                initiate();
            }
        });
    }

    public void addTrumpButton(Dialog dialog) {
        ImageButton heartTrumpBtn = (ImageButton) dialog.findViewById(R.id.trumpHeartBtn);
        ImageButton spadeTrumpBtn = (ImageButton) dialog.findViewById(R.id.trumpSpadeBtn);
        ImageButton diamondTrumpBtn = (ImageButton) dialog.findViewById(R.id.trumpDiamondBtn);
        ImageButton clubTrumpBtn = (ImageButton) dialog.findViewById(R.id.trumpClubBtn);
        ImageButton seventhTrumpBtn = (ImageButton) dialog.findViewById(R.id.trumpSeventhBtn);

        heartTrumpBtn.setOnClickListener(getTrumpSelectorButtonListener("H", dialog));
        spadeTrumpBtn.setOnClickListener(getTrumpSelectorButtonListener("S", dialog));
        diamondTrumpBtn.setOnClickListener(getTrumpSelectorButtonListener("D", dialog));
        clubTrumpBtn.setOnClickListener(getTrumpSelectorButtonListener("C", dialog));
        seventhTrumpBtn.setOnClickListener(getTrumpSelectorButtonListener("SEVEN", dialog));
    }

    public void addBiddingButton() {
        Button incrementBidvBtn = (Button) findViewById(R.id.buttonIncrementBidId);
        incrementBidvBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twentnNineSet.getCurrentGameState().getBidding().getCurrentBidder().equals(twentnNineSet.getCurrentGameState().getPlayerBottom().getPlayerPosition())) {
                    ((Button) findViewById(R.id.buttonIncrementBidId)).setBackgroundResource(R.drawable.yellow_button);
                    ((Button) findViewById(R.id.buttonStopBid)).setBackgroundResource(R.drawable.yellow_button);
                    Call call = new Call(twentnNineSet.getCurrentGameState().getPlayerBottom());
                    call.setBidAmount(twentnNineSet.getCurrentGameState().getBidding().getMinimumNextBidAmount(PlayerPosition.BOTTOM));
                    twentnNineSet.getCurrentGameState().call(call);
                }
            }
        });
    }


    public void drawScore(int teamNumber, int score) {
        /*
        ImageView digit1  = null, digit2 = null ;
        if(teamNumber ==1 ) {
             digit1 = (ImageView)findViewById(R.id.team1DigitOne);
             digit2 = (ImageView)findViewById(R.id.team1DigitTwo);

        } else {
             digit1 = (ImageView) findViewById(R.id.team2DigitOne);
             digit2 = (ImageView) findViewById(R.id.team2DigitTwo);
        }

        int digit1Num = 0, digit2Num = 0;
        if(score >= 10) {
            digit1Num = score/10;
            digit1.setImageBitmap(getDigitBitMap(digit1Num));
        }
        digit2Num = score % 10;
        digit2.setImageBitmap(getDigitBitMap(digit2Num));



    */
    }

    Bitmap getDigitBitMap(int number) {
        int row = 0, col = 0;
        if (number >= 5) {
            row = 1;
        }
        col = number % 5;
        Bitmap numberSprite = BitmapFactory.decodeResource(getResources(), R.drawable.numbers3);
        Bitmap digit2Sprite = Bitmap.createBitmap(numberSprite, ((numberSprite.getWidth() * col) / 5), ((numberSprite.getHeight() * row) / 2), (numberSprite.getWidth() / 5) + 1, (numberSprite.getHeight() / 2));
        return digit2Sprite;
    }


    /**
     * Sets the specified image buttonto the given state, while modifying or
     * "graying-out" the icon as well
     *
     * @param enabled   The state of the menu item
     * @param item      The menu item to modify
     * @param iconResId The icon ID
     */
    public static void setImageButtonEnabled(Context ctxt, boolean enabled, Button item,
                                             int iconResId) {
        item.setEnabled(enabled);
        Drawable originalIcon = ctxt.getResources().getDrawable(iconResId);
        Drawable icon = enabled ? originalIcon : convertDrawableToGrayScale(originalIcon);
        item.setBackground(icon);
    }

    /**
     * Mutates and applies a filter that converts the given drawable to a Gray
     * image. This method may be used to simulate the color of disable icons in
     * Honeycomb's ActionBar.
     *
     * @return a mutated version of the given drawable with a color filter
     * applied.
     */
    public static Drawable convertDrawableToGrayScale(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Drawable res = drawable.mutate();
        res.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
        return res;
    }

}