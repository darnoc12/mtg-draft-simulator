package com.mtg.card.containter;

import java.util.Set;

import com.mtg.card.Card;
import com.mtg.card.Rarity;

public class CubeSet implements CardSet {

	private final Set<Card> setList;
	public CubeSet( Set<Card> setList){
		this.setList = setList;
	}

	@Override
	public Set<Card> getCardSet() {
		return setList;
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
