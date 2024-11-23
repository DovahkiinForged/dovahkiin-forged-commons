package net.dovahkiinforged.commons.item;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ModItem {
    String name;
    Traits traits;

    @Value
    @Builder
    public static class Traits {
        @Builder.Default
        Integer maxStackSize = 64;
        Integer maxDamage;
        Integer durability;
        Float efficiency;
        Float cooldown;
        boolean fireproof;
        FoodTraits foodTraits;
    }

    @Value
    @Builder
    public static class FoodTraits {
        Integer nutrition;
        Float saturation;
        boolean alwaysEdible;
    }

}
