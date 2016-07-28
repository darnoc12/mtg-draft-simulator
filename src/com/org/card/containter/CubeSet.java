package com.org.card.containter;

import java.util.List;

import com.org.card.Card;
import com.org.card.Rarity;

public class CubeSet implements CardSet {

	private List<Card> cardList;
	
	@Override
	public List<Card> getCardList() {
		return cardList;
	}

	@Override
	public Card getCard(Rarity rarity) {
		return getRandomCard();
	}

	@Override
	public Card getRandomCard() {
		return null;
		
	}

}
