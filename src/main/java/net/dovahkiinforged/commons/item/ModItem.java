package net.dovahkiinforged.commons.item;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ModItem {
    /**
     * The item name, used as the registry key/name
     */
    String name;
    /**
     * The item traits
     */
    Traits traits;
    /**
     * The item type, used to categorize the item (e.g., TOOL, WEAPON, ARMOR)
     */
    String type;

    @Value
    @Builder
    public static class Traits {
        /**
         * The maximum stack size of the item.
         */
        @Builder.Default
        Integer maxStackSize = 64;
        /**
         * The damage the item can deal.
         */
        Damage damage;
        /**
         * The durability of the item.
         */
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

    @Value
    @Builder
    public static class Damage {
        Integer normal;
        Integer critical;
    }

}
