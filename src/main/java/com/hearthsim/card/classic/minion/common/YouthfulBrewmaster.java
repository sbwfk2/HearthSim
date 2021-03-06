package com.hearthsim.card.classic.minion.common;

import com.hearthsim.card.minion.Minion;
import com.hearthsim.card.minion.MinionBattlecryInterface;
import com.hearthsim.event.effect.EffectCharacter;
import com.hearthsim.event.filter.FilterCharacter;
import com.hearthsim.event.filter.FilterCharacterTargetedBattlecry;

public class YouthfulBrewmaster extends Minion implements MinionBattlecryInterface {

    private final static FilterCharacterTargetedBattlecry filter = new FilterCharacterTargetedBattlecry() {
        protected boolean includeOwnMinions() {
            return true;
        }
    };

    private final static EffectCharacter effect = EffectCharacter.BOUNCE;

    public YouthfulBrewmaster() {
        super();
    }

    @Override
    public FilterCharacter getBattlecryFilter() {
        return YouthfulBrewmaster.filter;
    }

    @Override
    public EffectCharacter getBattlecryEffect() {
        return YouthfulBrewmaster.effect;
    }
}
