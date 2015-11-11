package debakesh.com.twentynine.player;

import java.util.List;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.TwentyNineMLFeature;
import debakesh.com.twentynine.helper.MLFeatureExtractor;
import debakesh.com.twentynine.team.Team;

// Generated with Weka 3.6.13
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Tue Oct 06 21:18:58 IST 2015
public class WekaPlayer3 extends RandomComputerMLPlayer {


    MLFeatureExtractor featureExtractor = new MLFeatureExtractor();

    @Override
    public void notifyGame(GameState gameState) {
        super.notifyGame(gameState);
    }

    @Override
    public TwentyNineCard nextMove() {
        List<TwentyNineCard> allAllowedCards = super.allowedCards(this.getRemainingCards(), this.getId());
        if (allAllowedCards.size() == 1)
            return allAllowedCards.get(0);
        Team team = null;
        if (this.getPlayerPosition().equals(PlayerPosition.BOTTOM) || this.getPlayerPosition().equals(PlayerPosition.TOP)) {
            team = gameState.getTeamOne();
        } else {
            team = gameState.getTeamTwo();
        }

        boolean canRevealTrump = gameState.canRevealTrump(this);
        boolean willRevealTrump = false;
        if(canRevealTrump) {
                gameState.revealTrump(this);
        }

        for(TwentyNineCard card : allAllowedCards) {
            if(gameState.isTrumpRevealed() && card.getSuit().equals(gameState.getTrumpCard().getSuit())) {
                return card;
            }
        }

        TwentyNineCard bestCard = null;
        for (TwentyNineCard allowedCard : allAllowedCards) {
            TwentyNineMLFeature featureOfCard = featureExtractor.extractFeatures(gameState, this, team, allowedCard);
            updateRoundFeatures(featureOfCard);

            featureOfCard.addFeature(TwentyNineMLFeature.FEATURE.GAME_WINNER.name(), "US");
            double maxScore = Double.MIN_VALUE;
            try {
                Object[] feature1 = featureOfCard.toArray();
                double score = RepClassifier.classify(featureOfCard.toArray());
                if(score >= 0.05 && score <=0.98) {
                    System.out.print("Proper");
                }
                if (score > maxScore) {
                    maxScore = score;
                    bestCard = allowedCard;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ;
            }

        }
        if (null == bestCard) {
            return allAllowedCards.get(0);
        }
        return bestCard;
    }

    public WekaPlayer3(String id, PlayerPosition pos) {
        super(id, pos);
    }

    @Override
    public void updateMove(GameState gameState, Move move) {
        super.updateMove(gameState, move);
    }
}