package com.mtg.draftbuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.mtg.card.Card;
import com.mtg.card.containter.CardPack;
import com.mtg.card.containter.CardSet;

public class CubeDraftBuilder implements DraftBuilder {
	
	@Override
	public
	CardPack createPack(CardSet set) {
		List<Card> cardList = new LinkedList<Card>();
		for(int i=0;i<15;i++){
			cardList.add(set.getRandomCard());
		}
		return CardPack.fromList(cardList);
	}

	@Override
	public List<CardPack> createDraftSet(List<CardSet> setList) {
		List<CardPack> draftSet = new LinkedList<CardPack>();
		for(CardSet set : setList){
			draftSet.add(createPack(set));
		}
		return draftSet;
	}

}
