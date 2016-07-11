package com.org.card.containter;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.org.card.Card;

public abstract class CardContainer {
    private DeckName deckName;
    private final List<Card> cardList;

    protected CardContainer(List<Card> cardList) {
        this.cardList = cardList;
    }

    public abstract CardContainer fromList(List<Card> cardList);

    public abstract CardContainer fromContainer(CardContainer container);

    public void shuffle() {
        Random rand = new Random();
        int deckSize = cardList.size();
        for (; deckSize > 1; deckSize--) {
            int exchange = rand.nextInt((deckSize) + 1);
            Card before = cardList.get(exchange);
            cardList.add(exchange, cardList.get(deckSize));
            cardList.add(deckSize, before);
        }
    }

    public Optional<Card> remove(Card card) {
        if (cardList.remove(card)) {
            return Optional.of(card);
        }
        return Optional.empty();
    }

    public DeckName getDeckName() {
        return deckName;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setDeckName(DeckName deckName) {
        this.deckName = deckName;
    }

}
