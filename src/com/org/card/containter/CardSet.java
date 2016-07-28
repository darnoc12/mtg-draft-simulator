package com.org.card.containter;

import java.util.List;

import com.org.card.Card;
import com.org.card.Rarity;

public interface CardSet {

	public List<Card> getCardList();
	
	public Card getCard(Rarity rarity);
	
	public Card getRandomCard();
	
}
