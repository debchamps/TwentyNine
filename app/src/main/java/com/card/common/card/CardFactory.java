package com.card.common.card;
import java.util.*;

import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 9/23/2015.
 */
public class CardFactory {
    public List<Card> getFullDeck() {
        return null;
    }





    public static List<TwentyNineCard> get29Deck() {
        String[] numbers = {"7","8","A","10","9","J","K","Q"};
        String[] colors = {"D","C","H","S"};
        List<TwentyNineCard> cardList = new ArrayList<>();
            for(String col : colors) {
                for(String num : numbers) {
                cardList.add(new TwentyNineCard(col, num));
            }
        }
        return cardList;
    }

    public static void main(String[] args) {
        CardFactory fac = new CardFactory();
        System.out.println(fac.get29Deck().size());
    }



}
