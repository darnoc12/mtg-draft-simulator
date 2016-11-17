package com.mtg.card;

public class CombatStats {
    private int power;
    private int toughness;

    public CombatStats(int power, int toughness) {
        this.power = power;
        this.toughness = toughness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

}
