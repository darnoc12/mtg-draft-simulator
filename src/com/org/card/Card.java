package com.org.card;

import java.util.LinkedList;
import java.util.Optional;

import com.org.card.CastingCost.CardColors;

public class Card {
    private final String name;
    private final Optional<CombatStats> powerToughness;
    private final String types;
    private final Optional<CastingCost> castingCost;

    public Card(String name, Optional<CombatStats> powerToughness, String types, Optional<CastingCost> castingCost) {
        super();
        this.name = name;
        this.powerToughness = powerToughness;
        this.types = types;
        this.castingCost = castingCost;
    }

    public String getName() {
        return name;
    }

    public Optional<CombatStats> getPowerToughness() {
        return powerToughness;
    }

    public String getTypes() {
        return types;
    }

    public CastingCost getCastingCost() {
        if (castingCost.isPresent()) {
            return castingCost.get();
        }
        return CastingCost.fromList(new LinkedList<CardColors>());
    }
}
