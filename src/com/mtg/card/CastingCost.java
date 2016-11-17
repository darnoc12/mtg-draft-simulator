package com.mtg.card;

import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class CastingCost {
	public enum CardColors {
		WHITE('w'), GREEN('g'), BLUE('u'), BLACK('b'), RED('r'), COLORLESS('1');
		private char colorValue;
		CardColors(char color){
			this.colorValue = color;
		}
		
		public char getColorValue(){
			return colorValue;
		}
	}

	private final List<CardColors> castingCost;

	private CastingCost(List<CardColors> castingCost) {
		this.castingCost = castingCost;
	}

	public static CastingCost fromList(List<CardColors> castingCost) {
		return new CastingCost(castingCost);

	}

	public static CastingCost fromString(String castingCost){
		LinkedList<CardColors> castingCostList = new LinkedList<CardColors>();
		String lowerCase = castingCost.toLowerCase();
		int numWhite = StringUtils.countMatches(lowerCase,"w");
		int numBlack = StringUtils.countMatches(lowerCase,"b");
		int numBlue = StringUtils.countMatches(lowerCase,"u");
		int numGreen = StringUtils.countMatches(lowerCase,"g");
		int numRed = StringUtils.countMatches(lowerCase,"r");
		int numColorless = Integer.parseInt(lowerCase.replaceAll("\\D+",""));
		addCost(castingCostList,CardColors.WHITE,numWhite);
		addCost(castingCostList,CardColors.RED,numRed);
		addCost(castingCostList,CardColors.BLACK,numBlack);
		addCost(castingCostList,CardColors.BLUE,numBlue);
		addCost(castingCostList,CardColors.GREEN,numGreen);
		addCost(castingCostList,CardColors.COLORLESS,numColorless);
		return new CastingCost(castingCostList);
	}

	private static void addCost(List<CardColors> cardList, 
					CardColors color,
					int amount){
		for(int i=0; i<amount;i++){
			cardList.add(color);
			
		}
	}
	
	public List<CardColors> getCastingCost(){
		return castingCost;
	}
	
	public String getCastingCostAsString(){
		StringBuilder builder = new  StringBuilder();
		for(CardColors color : castingCost){
			builder.append(color.getColorValue());
		}
		return builder.toString();
	}
}
