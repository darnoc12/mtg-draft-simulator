package com.org.card.containter;

import java.util.List;

import com.org.card.Card;

public class CardPack extends CardContainer {

    private CardPack(List<Card> cardList) {
        super(cardList);
    }

    @Override
    public CardContainer fromList(List<Card> cardList) {
        if (cardList.size() > 15) {
            throw new IllegalArgumentException("Cannot have a card pack with greater than 15 cards");
        }
        return new CardPack(cardList);
    }

    @Override
    public CardContainer fromContainer(CardContainer container) {
        // TODO Auto-generated method stub
        return null;
    }

}
