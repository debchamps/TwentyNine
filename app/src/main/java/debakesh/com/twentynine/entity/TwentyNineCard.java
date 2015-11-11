package debakesh.com.twentynine.entity;

import com.card.common.card.Card;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by debarghy on 10/2/2015.
 */
public class TwentyNineCard extends Card {

    Map<String, Integer> CARD_TO_ORDER_MAP = new HashMap<>();

    public TwentyNineCard(String color, String number) {
        super(color, number);
        setPoints();
        setOrder();
    }

    public TwentyNineCard(String id) {
        super(id);
        setPoints();
        setOrder();
    }


    public void setPoints() {
        if (number.equals("9"))
            points = 2;
        else if (number.equals("A"))
            points = 1;
        else if (number.equals("10"))
            points = 1;
        else if (number.equals("J"))
            points = 3;
        else
            points = 0;
    }

    public void setOrder() {
        CARD_TO_ORDER_MAP = new HashMap<>();
        CARD_TO_ORDER_MAP.put("J", 1);
        CARD_TO_ORDER_MAP.put("9", 2);
        CARD_TO_ORDER_MAP.put("A", 3);
        CARD_TO_ORDER_MAP.put("10", 4);
        CARD_TO_ORDER_MAP.put("K", 5);
        CARD_TO_ORDER_MAP.put("Q", 6);
        CARD_TO_ORDER_MAP.put("8", 7);
        CARD_TO_ORDER_MAP.put("7", 8);

    }


    private int points;

    private int order;

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TwentyNineCard)) return false;

        TwentyNineCard card = (TwentyNineCard) o;
        if (card.getId().equals(((TwentyNineCard) o).getId()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = points;
        result = 31 * result + order;
        return result;
    }

    public int getOrder() {
        return CARD_TO_ORDER_MAP.get(this.getNumber());
    }


}
