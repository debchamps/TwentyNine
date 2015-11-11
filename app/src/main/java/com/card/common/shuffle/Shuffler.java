package com.card.common.shuffle;

import com.card.common.card.Card;

import java.util.List;

/**
 * Created by debarghy on 9/23/2015.
 */
    public interface Shuffler {
        public List<? extends Card> shuffle();
}
