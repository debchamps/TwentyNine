package com.card.common.card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import debakesh.com.twentynine.entity.TwentyNineCard;

/**
 * Created by debarghy on 10/8/2015.
 */
public class CardHelper {
    public static <T extends Card> Map<String, List<T>> groupBySuit(List<T> cards) {
        Map<String, List<T>> suitToCardsMapping = new HashMap<>();
        suitToCardsMapping.put("H", new ArrayList<T>());
        suitToCardsMapping.put("D", new ArrayList<T>());
        suitToCardsMapping.put("S", new ArrayList<T>());
        suitToCardsMapping.put("C", new ArrayList<T>());

        for (T c : cards) {
            List<T> existing = (List<T>)suitToCardsMapping.get(c.getSuit());
            existing.add(c);
        }
        return suitToCardsMapping;
    }

    public static <T extends  Card> List<T> filterBySuit(List<T> allCards, String suit) {
        List<T> suitCards = new ArrayList<>();
        for (T card : allCards) {
            if (card.getSuit().equals(suit)) {
                suitCards.add(card);
            }
        }
        return suitCards;
    }

    public static int sumPoint(List<TwentyNineCard> cards) {
        int sum = 0;
        for (TwentyNineCard card : cards) {
            sum += card.getPoints();
        }
        return sum;
    }

    public static <T extends  Card> List<T> removeCards(List<T> allCards, List<T> removeCards) {
        List<T> remainingCards = new ArrayList<>(allCards);
        for (Iterator<T> iter = remainingCards.listIterator(); iter.hasNext(); ) {
            T d = iter.next();
            for (T removeCard : removeCards) {
                if (d.getId().equals(removeCard.getId())) {
                    iter.remove();
                }
            }
        }
        return remainingCards;
    }


    public static <T extends Card> List<T> filterBySuitAndNumbers(List<T> allCards, String suit, List<String> numbers) {
        List<T> suitAndNumberCards = new ArrayList<>();
        for (T card : allCards) {
            if (card.getSuit().equals(suit) && numbers.contains(card.getNumber())) {
                suitAndNumberCards.add(card);
            }
        }
        return suitAndNumberCards;
    }
    public static <T extends  Card> T filterBySuitAndNumber(List<T> allCards, String suit, String  number) {
        for (T card : allCards) {
            if (card.getSuit().equals(suit) && number.equals(card.getNumber())) {
                return card;
            }
        }
        return null;
    }

    public static TwentyNineCard getHighCard(List<TwentyNineCard> cards) {
        if (null == cards || cards.size() == 0)
            return null;
        String suit = cards.get(0).getSuit();
        TwentyNineCard bestCard = null;
        int bestOrder = Integer.MAX_VALUE;
        for (TwentyNineCard card : cards) {
            //  if (!card.getSuit().equals(suit))
            //      throw new IllegalArgumentException("All card expected of same suit");
            if (card.getOrder() < bestOrder) {
                bestOrder = card.getOrder();
                bestCard = card;
            }
        }
        return bestCard;
    }

    public static TwentyNineCard getLowCard(List<TwentyNineCard> cards) {
        if (null == cards || cards.size() == 0)
            return null;
        String suit = cards.get(0).getSuit();
        TwentyNineCard worstCard = null;
        int worstOrder = Integer.MIN_VALUE;
        for (TwentyNineCard card : cards) {
            //if (!card.getSuit().equals(suit))
            //    throw new IllegalArgumentException("All card expected of same suit");
            if (card.getOrder() > worstOrder) {
                worstOrder = card.getOrder();
                worstCard = card;
            }
        }
        return worstCard;
    }


    public static <T extends Card> List<T> filterByNumber(List<T> allCards, String number) {
        List<T> numCards = new ArrayList<>();
        for (T card : allCards) {
            if (card.getNumber().equals(number)) {
                numCards.add(card);
            }
        }
        return numCards;
    }


}
