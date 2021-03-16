package com.Main;

import Card.Card;
import Card.Deck;

public class Main
{
    public static void main(String[] args)
    {
        Card myCard = new Card(10);
        System.out.println(myCard.getValue());
        System.out.println(myCard.getName());
        System.out.println(myCard.getSuite());

        Deck myDeck = new Deck();
        myDeck.shuffle(3);
        for(Card e : myDeck.getDeck())
        {
            System.out.println(e.getName() + "\s" + e.getValue() + "\s" + e.getSuite());
        }
    }
}