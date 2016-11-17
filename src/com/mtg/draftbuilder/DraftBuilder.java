package com.mtg.draftbuilder;

import java.util.List;

import com.mtg.card.containter.CardPack;
import com.mtg.card.containter.CardSet;

public interface DraftBuilder {

	CardPack createPack(CardSet set);
	
	public List<CardPack> createDraftSet(List<CardSet> setList);
	
}
