package debakesh.com.twentynine.helper.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import debakesh.com.twentynine.entity.TwentyNineCard;
import debakesh.com.twentynine.player.Player;
import debakesh.com.twentynine.player.PlayerPosition;

/**
 * Created by debarghy on 10/16/2015.
 */
public class TwentyNineCardDistributionFactory {

    public static Map<PlayerPosition, List<TwentyNineCard>> getOpponentNoTrumpInvalidHand() {

        //Set the trump to clubs
        List<String> cardsTop = Arrays.asList("SJ","D10","D9","DJ","CA","CK","CQ","CJ");
        List<String> cardsBot = Arrays.asList("D7","C8","S9","C10","DA","C9","DQ","C7");
        List<String> cardsLeft = Arrays.asList("S7","S8","H9","S10","SA","SK","SQ","D8");
        List<String> cardsRight = Arrays.asList("H7","H8","DK","H10","HA","HK","HQ","HJ");

        Map<PlayerPosition, List<TwentyNineCard>> positionToCardMap = new HashMap<>();
        positionToCardMap.put(PlayerPosition.BOTTOM, getCards(cardsBot));
        positionToCardMap.put(PlayerPosition.TOP, getCards(cardsTop));
        positionToCardMap.put(PlayerPosition.LEFT, getCards(cardsLeft));
        positionToCardMap.put(PlayerPosition.RIGHT, getCards(cardsRight));

        return  positionToCardMap;
    }

    public static Map<PlayerPosition, List<TwentyNineCard>> getOneTrumpSeventhCardInvalidHand() {
        List<String> cardsTop = Arrays.asList("C7","C8","D9","C10","CA","CK","CQ","CJ");
        List<String> cardsBot = Arrays.asList("D7","D8","S9","D10","DA","DK","DQ","DJ");
        List<String> cardsLeft = Arrays.asList("S7","S8","H9","S10","SA","SK","SQ","SJ");
        List<String> cardsRight = Arrays.asList("H7","H8","C9","H10","HA","HK","HQ","HJ");

        Map<PlayerPosition, List<TwentyNineCard>> positionToCardMap = new HashMap<>();
        positionToCardMap.put(PlayerPosition.BOTTOM, getCards(cardsBot));
        positionToCardMap.put(PlayerPosition.TOP, getCards(cardsTop));
        positionToCardMap.put(PlayerPosition.LEFT, getCards(cardsLeft));
        positionToCardMap.put(PlayerPosition.RIGHT, getCards(cardsRight));

        return  positionToCardMap;
    }

    public static Map<PlayerPosition, List<TwentyNineCard>> getZeroPointInvalidHand() {
        List<String> cardsTop = Arrays.asList("C7","C8","D9","C10","CA","CK","CQ","CJ");
        List<String> cardsBot = Arrays.asList("D7","D8","S9","D10","DA","DK","DQ","DJ");
        List<String> cardsLeft = Arrays.asList("S7","S8","H9","S10","SA","SK","SQ","SJ");
        List<String> cardsRight = Arrays.asList("H7","H8","C9","H10","HA","HK","HQ","HJ");

        Map<PlayerPosition, List<TwentyNineCard>> positionToCardMap = new HashMap<>();
        positionToCardMap.put(PlayerPosition.BOTTOM, getCards(cardsBot));
        positionToCardMap.put(PlayerPosition.TOP, getCards(cardsTop));
        positionToCardMap.put(PlayerPosition.LEFT, getCards(cardsLeft));
        positionToCardMap.put(PlayerPosition.RIGHT, getCards(cardsRight));

        return  positionToCardMap;
    }
    public static Map<PlayerPosition, List<TwentyNineCard>> getFourJackInvalidHand() {
        List<String> cardsTop = Arrays.asList("SJ","HJ","D9","DJ","CA","CK","CQ","CJ");
        List<String> cardsBot = Arrays.asList("D7","D8","S9","D10","DA","DK","DQ","C7");
        List<String> cardsLeft = Arrays.asList("S7","S8","H9","S10","SA","SK","SQ","C8");
        List<String> cardsRight = Arrays.asList("H7","H8","C9","H10","HA","HK","HQ","C10");

        Map<PlayerPosition, List<TwentyNineCard>> positionToCardMap = new HashMap<>();
        positionToCardMap.put(PlayerPosition.BOTTOM, getCards(cardsBot));
        positionToCardMap.put(PlayerPosition.TOP, getCards(cardsTop));
        positionToCardMap.put(PlayerPosition.LEFT, getCards(cardsLeft));
        positionToCardMap.put(PlayerPosition.RIGHT, getCards(cardsRight));

        return  positionToCardMap;

    }
    public static Map<PlayerPosition, List<TwentyNineCard>> getKingQueuen() {
        List<String> cardsTop = Arrays.asList("C7","C8","D9","C10","CA","CK","CQ","CJ");
        List<String> cardsBot = Arrays.asList("D7","D8","S9","D10","DA","DK","DQ","DJ");
        List<String> cardsLeft = Arrays.asList("S7","S8","H9","S10","SA","SK","SQ","SJ");
        List<String> cardsRight = Arrays.asList("H7","H8","C9","H10","HA","HK","HQ","HJ");

        Map<PlayerPosition, List<TwentyNineCard>> positionToCardMap = new HashMap<>();
        positionToCardMap.put(PlayerPosition.BOTTOM, getCards(cardsBot));
        positionToCardMap.put(PlayerPosition.TOP, getCards(cardsTop));
        positionToCardMap.put(PlayerPosition.LEFT, getCards(cardsLeft));
        positionToCardMap.put(PlayerPosition.RIGHT, getCards(cardsRight));

        return  positionToCardMap;
    }

     static List<TwentyNineCard>   getCards(List<String> ids) {
         List<TwentyNineCard> cards = new ArrayList<>();
         for(String id : ids) {
            cards.add(new TwentyNineCard(id));
         }
         return cards;
     }
}
