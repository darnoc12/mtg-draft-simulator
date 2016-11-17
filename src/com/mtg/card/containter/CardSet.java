package com.mtg.card.containter;

import java.util.Set;

import com.mtg.card.Card;
import com.mtg.card.Rarity;

public interface CardSet {

	public Set<Card> getCardSet();
	
	public Card getCard(Rarity rarity);
	
	public Card getRandomCard();
	
}
