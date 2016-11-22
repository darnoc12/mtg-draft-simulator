package com.org.card;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.mtg.card.Card;

public class cardTest {
    String cardJson;
    @Before
    public void setUp(){
        cardJson = "{\"Air Elemental\":{\"layout\":\"normal\",\"name\":\"Air Elemental\",\"manaCost\":\"{3}{U}{U}\",\"cmc\":5,\"colors\":[\"Blue\"],\"type\":\"Creature — Elemental\",\"types\":[\"Creature\"],\"subtypes\":[\"Elemental\"],\"text\":\"Flying\",\"power\":\"4\",\"toughness\":\"4\",\"imageName\":\"air elemental\",\"colorIdentity\":[\"U\"]}}";
    }
    
    @Test
    public void testSerializes(){
        Gson gson = new Gson();
        Card card = gson.fromJson( cardJson, Card.class );
        assertFalse( card == null );
        assertTrue( card.getNames().isEmpty() );
    }
}
