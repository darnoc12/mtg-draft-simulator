package com.mtg.card;

public enum Rarity {
    
	MYTHIC,
	RARE,
	UNCOMMON,
	COMMON,
	LAND,
	MARKETING,
	CHECKLIST,
	DOUBLE,
	TIMESHIFTED,
	DRAFT,
	FOIL,
	POWER_NINE;
	public static Rarity fromString(String cardRarity){
	    Rarity rarity;
	    switch( cardRarity.toLowerCase() ){
	    case "common":
	        rarity = COMMON;
	        break;
	    case "uncommon":
	        rarity = UNCOMMON;
	        break;
	    case "rare":
	        rarity = RARE;
	        break;
	    case "mythic rare":
	        rarity = MYTHIC;
	        break;
	    case "land":
	        rarity = LAND;
	        break;
	    case "marketing":
	        rarity = MARKETING;
	        break;
	    case "checklist":
	        rarity = CHECKLIST;
	        break;
	    case "double faced":
	        rarity = DOUBLE;
	        break;
	    case "timeshifted common":
	    case "timeshifted uncommon":
	    case "timeshifted rare":
	    case "timeshifted purple":
	        rarity = TIMESHIFTED;
	        break;
	    case "draft-matters":
	        rarity = DRAFT;
	        break;
	    case "power nine":
	        rarity = POWER_NINE;
	        break;
	    case "foil common":
	    case "foil uncommon":
	    case "foil rare":
	    case "foil mythic rare":
	        rarity = FOIL;
	        break;
	    default:
	        throw new IllegalArgumentException (" Was given illegal rarity" );
	    }
	    return rarity;
	}
}

