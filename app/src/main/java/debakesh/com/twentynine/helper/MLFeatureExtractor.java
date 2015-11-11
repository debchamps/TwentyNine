package debakesh.com.twentynine.helper;

import com.card.common.card.Card;
import com.card.common.card.CardHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import debakesh.com.twentynine.entity.GameState;
import debakesh.com.twentynine.entity.GameType;
import debakesh.com.twentynine.entity.Move;
import debakesh.com.twentynine.entity.Round;
import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.entity.TwentyNineMLFeature;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;
import debakesh.com.twentynine.team.Team;

/**
 * Created by debarghy on 10/4/2015.
 */
public class MLFeatureExtractor {

    public TwentyNineMLFeature extractFeatures(GameState gameState, Player player, Team team, TwentyNineCard card) {
        Map<String, Object> allFeatures = new HashMap<>();
        allFeatures.putAll(getCardFeatures(card));
        allFeatures.putAll(getGameState(gameState, player, team, card));
        allFeatures.putAll(roundFeatures(gameState, player, card));
        allFeatures.putAll(otherPlayerCardFeatures(gameState, player, card));
        allFeatures.putAll(trumpFeatures(gameState, card, player));
        TwentyNineMLFeature feature = new TwentyNineMLFeature(allFeatures);
        return feature;
    }

    Map<String, Object> getCardFeatures(TwentyNineCard card) {
        Map<String, Object> cardFeatures = new HashMap<>();
        cardFeatures.put(TwentyNineMLFeature.FEATURE.CARD_SUIT.name(), card.getSuit());
        cardFeatures.put(TwentyNineMLFeature.FEATURE.SUIT_ORDER.name(), card.getOrder());
        return cardFeatures;
    }


    Map<String, Object> getGameState(GameState gameState, Player player, Team team, TwentyNineCard card) {
        Map<String, Object> roundFeatures = new HashMap<>();
        roundFeatures.put(TwentyNineMLFeature.FEATURE.GAME_ID.name(),"G" + gameState.getGameId());
        if(gameState.isSeventhCard())
        roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_SEVEN_CARD.name(), "YES");
        else
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_SEVEN_CARD.name(), "NO");

        if (team.getTeamSequenceId() == 1) {
            if (gameState.getGameTarget().getCallingTeam().getTeamSequenceId() == 1) {
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_US.name(), gameState.getGameTarget().getTarget() - gameState.getTeamOneScore());
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_OTHER.name(), (28 - gameState.getGameTarget().getTarget() + 1) - gameState.getTeamTwoScore());

            } else {
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_US.name(), (28 - gameState.getGameTarget().getTarget() + 1) - gameState.getTeamOneScore());
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_OTHER.name(), gameState.getGameTarget().getTarget() - gameState.getTeamTwoScore());

            }

        } else {
            if (gameState.getGameTarget().getCallingTeam().getTeamSequenceId() == 1) {
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_US.name(), (28 - gameState.getGameTarget().getTarget() + 1) - gameState.getTeamTwoScore());
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_OTHER.name(), gameState.getGameTarget().getTarget() - gameState.getTeamOneScore());
            } else {
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_US.name(), gameState.getGameTarget().getTarget() - gameState.getTeamTwoScore());
                roundFeatures.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_OTHER.name(), (28 - gameState.getGameTarget().getTarget() + 1) - gameState.getTeamOneScore());
            }
        }

        List<TwentyNineCard> allRemainingCardsSuit = new ArrayList<>();
        allRemainingCardsSuit.addAll(gameState.getPlayerBottom().getRemainingCards());
        allRemainingCardsSuit.addAll(gameState.getPlayerTop().getRemainingCards());
        allRemainingCardsSuit.addAll(gameState.getPlayerLeft().getRemainingCards());
        allRemainingCardsSuit.addAll(gameState.getPlayerRight().getRemainingCards());
        allRemainingCardsSuit.add(card);

        Card allHighSuitCard = CardHelper.getHighCard((List<TwentyNineCard>)(CardHelper.filterBySuit(allRemainingCardsSuit, gameState.getCurrentRound().getRoundSuit())));
        if(allHighSuitCard != null && allHighSuitCard.getId().equals(card.getId())) {
                roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_BIGGEST_SUIT_REMAINING.name(), "Y");
        } else {
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_BIGGEST_SUIT_REMAINING.name(), "N");
        }



        roundFeatures.put(TwentyNineMLFeature.FEATURE.TEAM_SEQUENCE_NUMBER.name(), team.getTeamSequenceId());

        roundFeatures.put(TwentyNineMLFeature.FEATURE.CARD_POINT.name(), card.getPoints());

        if(gameState.isTrumpRevealed())
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_TRUMP_REVEALED.name(), "YES");
        else
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_TRUMP_REVEALED.name(), "NO");

        if(card.getSuit().equals(gameState.getCurrentRound().getRoundSuit())) {
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_ROUND_SUIT.name(), "Y");
        } else {
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_ROUND_SUIT.name(), "N");
        }
        if (gameState.isTrumpRevealed() || gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(player.getPlayerPosition())) {
            if(card.getSuit().equals(gameState.getTrumpCard().getSuit()))
                roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_TRUMP_SUIT.name(), "Y");
            else
                roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_TRUMP_SUIT.name(), "N");

        }
        else {
            roundFeatures.put(TwentyNineMLFeature.FEATURE.IS_TRUMP_SUIT.name(), "X");
        }


        int pointPlayedForSuitInPreviousRound = 0, trumpSuitRemainingOthers = 0, roundSuitRemainingMe = 0, roundSuitPlayed = 0;

        for (Round r : gameState.getPlayedRounds()) {
            for (Move m : r.getMoves()) {
                if (m.getCard().getSuit().equals(gameState.getCurrentRound().getRoundSuit())) {
                    pointPlayedForSuitInPreviousRound += m.getCard().getPoints();
                    roundSuitPlayed += 1;
                }
            }
        }

        for (Card pcard : player.getRemainingCards()) {
            if (pcard.getSuit().equals(gameState.getCurrentRound().getRoundSuit())) {
                roundSuitRemainingMe += 1;
            }
        }

        //Put the logic for round winner some where

        roundFeatures.put(TwentyNineMLFeature.FEATURE.ROUND_SUIT_REMAINING_ME.name(), roundSuitRemainingMe);
        roundFeatures.put(TwentyNineMLFeature.FEATURE.ROUND_SUIT_REMAINING_POINTS.name(), 7 - pointPlayedForSuitInPreviousRound);
        roundFeatures.put(TwentyNineMLFeature.FEATURE.ROUND_SUIT_REMAINING_CARDS.name(), 8 - roundSuitPlayed);
        return roundFeatures;
    }


    Map<String, Object> roundFeatures(GameState gameState, Player player, Card card) {
        Map<String, Object> roundFeatures = new HashMap<>();
        int roundNumber = gameState.getCurrentRoundNumber();
        roundFeatures.put(TwentyNineMLFeature.FEATURE.ROUND_NUMBER.name(), roundNumber);
        roundFeatures.put(TwentyNineMLFeature.FEATURE.MOVE_SEQUENCE.name(), gameState.getCurrentRound().getMoves().size() + 1);

        roundFeatures.put(TwentyNineMLFeature.FEATURE.NUMBER_OF_CARD_PLAYED.name(), (gameState.getCurrentRoundNumber() - 1) * 4 + gameState.getCurrentRound().getMoves().size());

        int pointInRound = 0;
        List<Move> currentMoves = gameState.getCurrentRound().getMoves();
        for (Move move : currentMoves) {
            pointInRound += move.getCard().getPoints();

        }
        roundFeatures.put(TwentyNineMLFeature.FEATURE.POINT_PLAYED_ROUND.name(), pointInRound);

        PlayerPosition winnerPosition = null;
        Move currentWinningMove = gameState.getCurrentRound().findHighestMove();
        if (currentWinningMove == null) {
            roundFeatures.put(TwentyNineMLFeature.FEATURE.CURRENT_ROUND_WINNER.name(), "X");

        } else {
            if (currentWinningMove.getPlayerPosition().equals(PlayerPosition.TOP) || currentWinningMove.getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
                if (player.getPlayerPosition().equals(PlayerPosition.TOP) || player.getPlayerPosition().equals(PlayerPosition.BOTTOM)) {
                    //Our team winning
                    roundFeatures.put(TwentyNineMLFeature.FEATURE.CURRENT_ROUND_WINNER.name(), "US");
                } else {
                    roundFeatures.put(TwentyNineMLFeature.FEATURE.CURRENT_ROUND_WINNER.name(), "OPPONENT");
                    //Opponent winning
                }
            }
            if (currentWinningMove.getPlayerPosition().equals(PlayerPosition.LEFT) || currentWinningMove.getPlayerPosition().equals(PlayerPosition.RIGHT)) {
                if (player.getPlayerPosition().equals(PlayerPosition.LEFT) || player.getPlayerPosition().equals(PlayerPosition.RIGHT)) {
                    roundFeatures.put(TwentyNineMLFeature.FEATURE.CURRENT_ROUND_WINNER.name(), "US");
                    //Our team winning
                } else {
                    roundFeatures.put(TwentyNineMLFeature.FEATURE.CURRENT_ROUND_WINNER.name(), "OPPONENT");
                    //Opponent winning
                }
            }

        }


        //is there any bigger card left apart from me which can be played

        return roundFeatures;
    }


    Map<String, Object> otherPlayerCardFeatures(GameState gameState, Player player, TwentyNineCard card) {
        Map<String, Object> features = new HashMap<>();
        List<TwentyNineCard> otherTwentyNineCards = new ArrayList<>();
        if (!player.getPlayerPosition().equals(PlayerPosition.TOP))
            otherTwentyNineCards.addAll(gameState.getPlayerTop().getRemainingCards());
        if (!player.getPlayerPosition().equals(PlayerPosition.BOTTOM))
            otherTwentyNineCards.addAll(gameState.getPlayerBottom().getRemainingCards());
        if (!player.getPlayerPosition().equals(PlayerPosition.LEFT))
            otherTwentyNineCards.addAll(gameState.getPlayerLeft().getRemainingCards());
        if (!player.getPlayerPosition().equals(PlayerPosition.RIGHT))
            otherTwentyNineCards.addAll(gameState.getPlayerRight().getRemainingCards());

        TwentyNineCard highestCard = null;

        for (TwentyNineCard otherCard : otherTwentyNineCards) {
            if (otherCard.getSuit().equals(card.getSuit())) {
                if (highestCard == null || (otherCard.getOrder() < highestCard.getOrder())) {
                    highestCard = otherCard;
                }
            }
        }
        if (null == highestCard) {
            //Sure trump
            features.put(TwentyNineMLFeature.FEATURE.OTHER_PLAYER_HIGHEST_SUIT_ORDER.name(), -1);
        } else {
            features.put(TwentyNineMLFeature.FEATURE.OTHER_PLAYER_HIGHEST_SUIT_ORDER.name(), highestCard.getOrder());
        }
        PlayerPosition pos = null;
        if(gameState.getCurrentRound().getMoves().size() >0) {
            pos = gameState.getCurrentRound().getMoves().get(0).getPlayerPosition();
        } else {
            pos = player.getPlayerPosition();
        }

        Move currentHighestMove = gameState.getCurrentRound().findHighestMove();

        if(currentHighestMove == null) {
            features.put(TwentyNineMLFeature.FEATURE.IS_TEAM_WINNING_NOW.name(), "X");
        } else {
            if(currentHighestMove.getPlayerPosition().equals(PlayerPosition.BOTTOM) || currentHighestMove.getPlayerPosition().equals(PlayerPosition.TOP)) {
                if(player.getPlayerPosition().equals(PlayerPosition.BOTTOM) || player.getPlayerPosition().equals(PlayerPosition.TOP)) {
                    features.put(TwentyNineMLFeature.FEATURE.IS_TEAM_WINNING_NOW.name(), "Y");

                } else {
                    features.put(TwentyNineMLFeature.FEATURE.IS_TEAM_WINNING_NOW.name(), "N");

                }
            } else {
                if(player.getPlayerPosition().equals(PlayerPosition.BOTTOM) || player.getPlayerPosition().equals(PlayerPosition.TOP)) {
                    features.put(TwentyNineMLFeature.FEATURE.IS_TEAM_WINNING_NOW.name(), "N");

                } else {
                    features.put(TwentyNineMLFeature.FEATURE.IS_TEAM_WINNING_NOW.name(), "Y");
                }
            }
        }

        Round tempRound = new Round(100, pos, GameType.NORMAL, gameState.isTrumpRevealed(), gameState.getTrumpRevealedTime(), gameState.getTrumpCard(), null);
        for (Move move : gameState.getCurrentRound().getMoves()) {
            tempRound.playMove(gameState.getPlayer(move.getPlayerPosition()), move.getCard());
        }
        tempRound.playMove(player, card);

        if(tempRound.findHighestMove().getCard().getId().equals(card.getId())) {
            features.put(TwentyNineMLFeature.FEATURE.IS_WINNING_CARD.name(), "YES");
        } else {
            features.put(TwentyNineMLFeature.FEATURE.IS_WINNING_CARD.name(), "NO");

        }


        return features;
    }

    Map<String, Object> trumpFeatures(GameState gameState, Card card, Player player) {
        Map<String, Object> features = new HashMap<>();
        int trumpReleased = 0, trumpRemainingForMe = 0;

        if(gameState.getGameTarget().getCallingPlayer().getPlayerPosition().equals(player.getPlayerPosition())) {
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SETTER.name(), "ME");
        } else if(gameState.getGameTarget().getCallingTeam().getPlayerOne().getPlayerPosition().equals(player.getPlayerPosition()) || gameState.getGameTarget().getCallingTeam().getPlayerTwo().getPlayerPosition().equals(player.getPlayerPosition())) {
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SETTER.name(), "PARTNER");
        } else {
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SETTER.name(), "OPPONENT");
        }

        if (!gameState.isTrumpRevealed() && !player.getPlayerPosition().equals(gameState.getGameTarget().getCallingPlayer().getPlayerPosition())) {
            features.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_OTHER.name(), -1);
            features.put(TwentyNineMLFeature.FEATURE.TARGET_REMAINING_FOR_US.name(), -1);
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SUIT_REMAINING_OTHER.name(), -1);
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SUIT_REMAINING_ME.name(), -1);
        } else {

            for (TwentyNineCard tCard : player.getRemainingCards()) {
                if (tCard.getSuit().equals(gameState.getTrumpCard().getSuit())) {
                    trumpRemainingForMe += 1;
                }
            }

            for (Round round : gameState.getPlayedRounds()) {
                for (Move move : round.getMoves()) {
                    if (move.getCard().getSuit().equals(card.getSuit())) {
                        trumpReleased += 1;
                    }
                }
            }
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SUIT_REMAINING_OTHER.name(), 8 - trumpRemainingForMe - trumpReleased);
            features.put(TwentyNineMLFeature.FEATURE.TRUMP_SUIT_REMAINING_ME.name(), trumpRemainingForMe);
        }
        return features;
    }

    public void getIsWinning(GameState gameState, Player player, TwentyNineCard card) {

    }

}
