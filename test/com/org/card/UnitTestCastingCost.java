package com.org.card;


import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.mtg.card.CastingCost;
import com.mtg.card.CastingCost.CardColors;

import static com.mtg.card.CastingCost.CardColors.*;
import static org.junit.Assert.assertTrue;
public class UnitTestCastingCost {

	private String testString = "wgubr1";
	private List<CardColors> list;
	@Before
	public void setup(){
		list = new LinkedList<CardColors>();
		list.add(WHITE);
		list.add(RED);
		list.add(BLACK);
		list.add(BLUE);
		list.add(GREEN);
		list.add(COLORLESS);
	}
	
	@Test
	public void testFromString(){
		CastingCost cc = CastingCost.fromString(testString);
		List<CardColors> costList = cc.getCastingCost();
		assertTrue("Lists are not equal : " + costList + "is : "+list,costList.equals(list));
	}
	
	@Test
	public void testFromList(){
		CastingCost cc = CastingCost.fromList(list);
		assertTrue("Lists were not equal in fromList",list.equals(cc.getCastingCost()));
	}
	
	@Test
	public void testgetCastingCostasString(){
		CastingCost cc = CastingCost.fromString(testString);
		testString.equals(cc.getCastingCostAsString());
	}
}
