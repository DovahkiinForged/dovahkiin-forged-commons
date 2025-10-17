package net.dovahkiinforged.commons.util;

import net.dovahkiinforged.commons.item.ModItem;

public class TraitUtils {
    public static ModItem.Traits ALCHEMY_INGREDIENT_TRAITS = ModItem.Traits.builder()
            .maxStackSize(64)
            .foodTraits(ModItem.FoodTraits.builder()
                    .nutrition(1)
                    .saturation(0f)
                    .alwaysEdible(false)
                    .build())
            .build();

    public static ModItem.Traits buildFoodTraits(int nutrition, float saturation, boolean alwaysEdible) {
        return ModItem.Traits.builder().foodTraits(ModItem.FoodTraits.builder()
                        .nutrition(nutrition)
                        .saturation(saturation)
                        .alwaysEdible(alwaysEdible)
                        .build())
                .build();
    }
}
