package com.mtg.card;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class Card {
    private final String id;
    private final String name;
    private final List<String> names;
    private final CastingCost castingCost;
    private final Double convertedManaCost;
    private final List<String> colorIdentity;
    private final List<String> superTypes;
    private final List<String> types;
    private final List<String> subTypes;
    private final Rarity rarity;
    private final String text;
    private final String flavor;
    private final String artist;
    private final String number;
    private final String power;
    private final String toughness;
    private final Integer loyalty;
    private final Integer multiverseId;
    private final List<Integer> variations;
    private final String imageName;
    private final String watermark;
    private final String border;
    private final Boolean timeShifted;
    private final Integer handModifier;
    private final Integer lifeModifier;
    private final String releaseDate;
    private final Boolean starter;
    private final Integer mciNumber;

    public Card( final String id, final String name, final String[] names, final String castingCost,
                 final double convertedManaCost, final String[] colorIdentity, 
                 final String[] superTypes, final String[] types, final String[] subTypes,
                 final String rarity, final String text, final String flavor,
                 final String artist, final String  number, final String power,
                 final String toughness, Integer loyalty, Integer multiverseId,
                 final Integer[] variations, final String imageName,
                 final String watermark, final String border, final boolean timeShifted,
                 final Integer hand, final Integer life, final String releaseDate,
                 final Boolean starter, final Integer mciNumber ) {
        this.id = id;
        this.name = name;
        this.names = ImmutableList.copyOf( names );
        this.castingCost = CastingCost.fromString( castingCost );
        this.convertedManaCost = convertedManaCost;
        this.colorIdentity = ImmutableList.copyOf( colorIdentity );
        this.superTypes = ImmutableList.copyOf( superTypes );
        this.types = ImmutableList.copyOf( types );
        this.subTypes = ImmutableList.copyOf( subTypes );
        this.rarity = Rarity.fromString( rarity );
        this.text = text;
        this.flavor = flavor;
        this.artist = artist;
        this.number = number;
        this.power = power;
        this.toughness = toughness;
        this.loyalty = loyalty;
        this.multiverseId = multiverseId;
        this.variations = ImmutableList.copyOf( variations );
        this.imageName = imageName;
        this.watermark = watermark;
        this.border = border;
        this.timeShifted = timeShifted;
        this.handModifier = hand;
        this.lifeModifier = life;
        this.releaseDate = releaseDate;
        this.starter = starter;
        this.mciNumber = mciNumber;
    }

    public String getId(){
        return emptyStringIfNull( id );
    }

    public String getName() {
        return emptyStringIfNull( name );
    }

    public List<String> getNames() {
        return emptyListIfNull( names );
    }

    public Rarity getRarity(){
        return rarity;
    }

    public CastingCost getCastingCost() {
       return castingCost;
    }

    public Double getCmc(){
        return (Double) zeroIfNull( convertedManaCost );
    }

    public List<String> getColorIdentity(){
        return emptyListIfNull( colorIdentity );
    }

    public List<String> getSuperTypes(){
        return emptyListIfNull( superTypes );
    }

    public List<String> getSubTypes(){
        return emptyListIfNull( subTypes );
    }

    public List<String> getTypes(){
        return emptyListIfNull( types );
    }

    public String getFlavorText(){
        return emptyStringIfNull( flavor );
    }

    public String getArtisit(){
        return emptyStringIfNull( artist );
    }

    public String getCardNumber(){
        return emptyStringIfNull( number );
    }

    public String getPower(){
        return emptyStringIfNull( power );
    }

    public String getToughness(){
        return emptyStringIfNull( toughness );
    }

    public Integer getLoyalty(){
        return (Integer) zeroIfNull( loyalty );
    }

    public Integer getMultiverseId(){
        return (Integer) zeroIfNull( multiverseId );
    }

    public List<Integer> getVariations(){
        return emptyListIfNull( variations );
    }

    public String getWatermark(){
        return emptyStringIfNull( watermark );
    }

    public String getBorder(){
        return emptyStringIfNull( border );
    }

    public Boolean isTimeShifted(){
        return falseIfNull( timeShifted );
    }

    public Integer getHandModifier(){
        return (Integer) zeroIfNull( handModifier );
    }

    public Integer getLifeModifier(){
        return (Integer) zeroIfNull( lifeModifier );
    }

    public String getReleaseDate(){
        return emptyStringIfNull( releaseDate );
    }

    public Boolean isStarter(){
        return falseIfNull( starter );
    }

    public Integer getMciNumber(){
        return (Integer) zeroIfNull( mciNumber );
    }

    public String getText(){
        return emptyStringIfNull( text );
    }
    private <T> List<T> emptyListIfNull( List<T> list){
        return list == null? ImmutableList.of(): list;
    }
    
    private String emptyStringIfNull( String textString ){
        return textString == null? "": textString;
    }

    private Number zeroIfNull( Number numberToCheck ){
        return numberToCheck == null? 0 : numberToCheck;
    }

    private Boolean falseIfNull( Boolean booleanValue ){
        return booleanValue == null ? Boolean.FALSE : booleanValue; 
    }
}