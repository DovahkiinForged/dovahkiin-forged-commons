package dev.bulmer.dovahkiinforged.commons;

import dev.bulmer.dovahkiinforged.commons.item.ItemSettings;

public final class Items {

    /* WEAPONS */

    public static final ItemSettings ELVEN_DAGGER = ItemSettings.builder()
            .name("elven_dagger")
            .maxStackSize(1)
            .cooldown(0.5f)
            .maxDamage(4)
            .build();
    public static final ItemSettings ELVEN_SWORD = ItemSettings.builder()
            .name("elven_sword")
            .maxStackSize(1)
            .cooldown(1f)
            .maxDamage(6)
            .build();
    public static final ItemSettings GLASS_DAGGER = ItemSettings.builder()
            .name("glass_dagger")
            .maxStackSize(1)
            .cooldown(0.5f)
            .maxDamage(4)
            .build();
    public static final ItemSettings GLASS_SWORD = ItemSettings.builder()
            .name("glass_sword")
            .maxStackSize(1)
            .cooldown(1f)
            .maxDamage(6)
            .build();

    /* MATERIALS */

    public static final ItemSettings MALACHITE_INGOT = ItemSettings.builder()
            .name("malachite_ingot")
            .maxDamage(1)
            .build();
    public static final ItemSettings MALACHITE_NUGGET = ItemSettings.builder()
            .name("malachite_nugget")
            .maxDamage(1)
            .build();
    public static final ItemSettings MOONSTONE_INGOT = ItemSettings.builder()
            .name("moonstone_ingot")
            .maxDamage(1)
            .build();
    public static final ItemSettings MOONSTONE_NUGGET = ItemSettings.builder()
            .name("moonstone_nugget")
            .maxDamage(1)
            .build();
    public static final ItemSettings STEEL_INGOT = ItemSettings.builder()
            .name("steel_ingot")
            .maxDamage(1)
            .build();
    public static final ItemSettings STEEL_NUGGET = ItemSettings.builder()
            .name("steel_nugget")
            .maxDamage(1)
            .build();
}
