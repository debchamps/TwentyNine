package com.card.common.shuffle;

import com.card.common.card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by debarghy on 9/23/2015.
 */
public class NCutShuffler implements Shuffler {
    private int n = 50;
    private final List<? extends Card> initialDeck;

    public NCutShuffler(List<? extends  Card> deck) {
        initialDeck = deck;
    }

    @Override
    public List<? extends Card> shuffle() {
        //return  initialDeck;

        List<? extends Card> firtShufle = shuffle1(new ArrayList<Card>(initialDeck));
        Collections.shuffle(firtShufle);

        for (int i = 0; i < n; i++) {
        //    firtShufle = shuffle1(firtShufle);
        }
        return firtShufle;
    }

    List<? extends Card> shuffle1(List<? extends Card> cards) {
        int cut =new Random().nextInt(cards.size()/2) +4;
        int cutSize =new Random().nextInt(5) + 3;

//        Log.i("NCutShuffler","Card " + cards.size() + " cut" + cut + " cutSize" + cutSize);
//        System.out.print("Card " + cards.size() + " cut" + cut + " cutSize" + cutSize);
        List<? extends Card> list1 = cards.subList(0, cut  );
        List<Card> list2 = new ArrayList<>(cards.subList(cut, cut + cutSize ));
        List<? extends Card> list3 = cards.subList(cut + cutSize, cards.size());
        list2.addAll(new ArrayList<>(list1));
        list2.addAll(list3);
        return list2;
    }

}
