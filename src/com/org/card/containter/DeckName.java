package com.org.card.containter;

public class DeckName {

    String deckName;

    private DeckName(String name) {
        this.deckName = name;
    }

    public DeckName fromString(String deckName) {
        return new DeckName(deckName);
    }

    public DeckName fromDeckName(DeckName deckName) {
        return new DeckName(deckName.deckName);
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }
}
