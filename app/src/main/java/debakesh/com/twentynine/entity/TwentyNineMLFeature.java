package debakesh.com.twentynine.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by debarghy on 10/5/2015.
 */
public class TwentyNineMLFeature {

    /**
     * suit
     order
     points
     sequence
     isTrump
     currentWinningTeam
     isItBiggestRemainingSuitCard
     trumpRemainingWithoutMe
     suitRemainingWithoutMe
     points

     */
    public enum CURENT_FEATURE{
        MOVE_SEQUENCE, ROUND_NUMBER, SUIT_ORDER, CARD_POINT, IS_WINNING_CARD,IS_BIGGEST_SUIT_REMAINING,
         IS_TRUMP_SUIT, IS_ROUND_SUIT, IS_TEAM_WINNING_NOW,
         TRUMP_SUIT_REMAINING_OTHER, TRUMP_SUIT_REMAINING_ME, ROUND_SUIT_REMAINING_ME,

        ROUND_SUIT_REMAINING_CARDS, GAME_WINNER, POINTS_GAINED;
        public static String[] names() {
            CURENT_FEATURE[] states = CURENT_FEATURE.values();
            String[] names = new String[states.length];

            for (int i = 0; i < states.length; i++) {
                names[i] = states[i].name();
            }

            return names;
        }



    };
    public enum FEATURE {
        GAME_ID,MOVE_SEQUENCE, ROUND_NUMBER, CARD_SUIT, SUIT_ORDER, CARD_POINT, IS_WINNING_CARD, IS_BIGGEST_SUIT_REMAINING,IS_TEAM_WINNING_NOW,

        POINT_PLAYED_ROUND, NUMBER_OF_CARD_PLAYED, IS_TRUMP_SUIT,IS_ROUND_SUIT,TRUMP_SETTER,
        IS_TRUMP_REVEALED, TRUMP_SUIT_REMAINING_OTHER, TRUMP_SUIT_REMAINING_ME, ROUND_SUIT_REMAINING_ME, OTHER_PLAYER_HIGHEST_SUIT_ORDER,
        IS_SEVEN_CARD, CURRENT_ROUND_WINNER, TARGET_REMAINING_FOR_US, TARGET_REMAINING_FOR_OTHER, TEAM_SEQUENCE_NUMBER, ROUND_SUIT_REMAINING_POINTS,
        ROUND_SUIT_REMAINING_CARDS, GAME_WINNER, POINTS_GAINED;


        public static String[] names() {
            FEATURE[] states = FEATURE.values();
            String[] names = new String[states.length];

            for (int i = 0; i < states.length; i++) {
                names[i] = states[i].name();
            }

            return names;
        }

        }


    private Map<String, Object> feature = new HashMap<>();

    public void addFeature(String featureName, Object featureVal) {
        feature.put(featureName, featureVal);
    }

    public void addFeature(Map<String, Object> features) {
        feature.putAll(features);
    }

    public TwentyNineMLFeature() {}

    public TwentyNineMLFeature(Map<String, Object> f) {
        this.feature = f;
    }

    public Object getFeature(String key) {
        return feature.get(key);
    }

    public Map<String, Object> getFeature() {
        return feature;
    }

    public String toString(List<String> keySet) {
        List<Object> valueSet = new ArrayList<>();
        for (String key : keySet) {
            if (feature.containsKey(key) && feature.get(key) != null) {
                if(feature.get(key) instanceof  Integer) {

                    valueSet.add(new Double(((Integer) feature.get(key)).doubleValue()));
                } else {
                    valueSet.add(feature.get(key));
                }
            }
        }
        return joinString(valueSet, ",");
    }

    public String featureNameString() {
        List<Object> featureNames = new ArrayList<>();
        for(CURENT_FEATURE f : CURENT_FEATURE.values()) {
            featureNames.add(f.name());
        }
        return joinString(featureNames,",");
    }

    public void toStringMap() {
        System.out.println("Feature :: ");
        for (String key : Arrays.asList(FEATURE.names())) {
            System.out.print("[" + key +  " :" + feature.get(key) + "]");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return toString(Arrays.asList(CURENT_FEATURE.names()));
    }

    private String joinString(List<Object> objs, String separator) {
        String joinedStr = "";
        for (int i = 0; i < objs.size() - 1; i++) {
            joinedStr = joinedStr + objs.get(i).toString() + ",";
        }
        joinedStr = joinedStr + objs.get(objs.size() - 1);
        return joinedStr;
    }

    public Object[] toArray(){
        List<Object> featureValList = new ArrayList<>();
        for (String key : Arrays.asList(CURENT_FEATURE.names())) {

            if(feature.containsKey(key)) {
                if(feature.get(key) instanceof  Integer) {

                    featureValList.add(new Double(((Integer) feature.get(key)).doubleValue()));
                } else if(feature.get(key) instanceof Boolean) {
                    if(feature.get(key).equals(true)) {
                        featureValList.add("TRUE");
                    } else {
                        featureValList.add("FALSE");

                    }
                }
                else{
                    featureValList.add(feature.get(key));
                }
            }
        }
        return featureValList.toArray();
    }

}
