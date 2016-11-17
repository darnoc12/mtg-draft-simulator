package com.mtg.card.containter;

import java.util.List;

import com.mtg.card.Card;

public class CardPack extends CardContainer {

    private CardPack(List<Card> cardList) {
        super(cardList);
    }

    public static CardPack fromList(List<Card> cardList) {
        if (cardList.size() > 15) {
            throw new IllegalArgumentException("Cannot have a card pack with greater than 15 cards");
        }
        return new CardPack(cardList);
    }
}