package com.card.common.card;

/**
 * Created by debarghy on 9/23/2015.
 */
public class Card {
    protected String id;
    protected String suit;
    protected String number;


    public Card(String id) {
        this.id = id;
        if(id.length()!= 2) {
           // throw new IllegalArgumentException("Id have to be of length 2  for cards" );
        }
        this.suit = new Character(id.charAt(0)).toString();
        this.number =id.substring(1,id.length());
    }
    public Card(String color, String number) {
        this.suit = color;
        this.number = number;
        id = color + number;
    }

    public String getId() {
        return id;
    }

    public String getSuit() {
        return suit;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return id;
    }
}
