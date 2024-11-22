package dev.bulmer.dovahkiinforged.commons;

import dev.bulmer.dovahkiinforged.commons.item.ModItem;
import dev.bulmer.dovahkiinforged.commons.item.ModItem.Settings;

public final class ModItems {

    /* WEAPONS */

    public static final ModItem ELVEN_DAGGER = ModItem.builder()
            .name("elven_dagger")
            .settings(Settings.builder()
                    .maxStackSize(1)
                    .cooldown(0.5f)
                    .maxDamage(4)
                    .build())
            .build();
    public static final ModItem ELVEN_SWORD = ModItem.builder()
            .name("elven_sword")
            .settings(Settings.builder()
                    .maxStackSize(1)
                    .cooldown(1f)
                    .maxDamage(6)
                    .build())
            .build();
    public static final ModItem GLASS_DAGGER = ModItem.builder()
            .name("glass_dagger")
            .settings(Settings.builder()
                    .maxStackSize(1)
                    .cooldown(0.5f)
                    .maxDamage(4)
                    .build())
            .build();
    public static final ModItem GLASS_SWORD = ModItem.builder()
            .name("glass_sword")
            .settings(Settings.builder()
                    .maxStackSize(1)
                    .cooldown(1f)
                    .maxDamage(6)
                    .build())
            .build();

    /* MATERIALS */

    public static final ModItem MALACHITE_INGOT = ModItem.builder()
            .name("malachite_ingot")
            .settings(Settings.builder()
                    .maxDamage(1)
                    .build())
            .build();
    public static final ModItem MALACHITE_NUGGET = ModItem.builder()
            .name("malachite_nugget")
            .settings(Settings.builder()
                    .maxDamage(1)
                    .build())
            .build();
    public static final ModItem MOONSTONE_INGOT = ModItem.builder()
            .name("moonstone_ingot")
            .settings(Settings.builder()
                    .maxDamage(1)
                    .build())
            .build();
    public static final ModItem MOONSTONE_NUGGET = ModItem.builder()
            .name("moonstone_nugget")
            .settings(Settings.builder()
                    .maxDamage(1)
                    .build())
            .build();
    public static final ModItem STEEL_INGOT = ModItem.builder()
            .name("steel_ingot")
            .settings(Settings.builder()
                    .maxDamage(1)
                    .build())
            .build();
    public static final ModItem STEEL_NUGGET = ModItem.builder()
            .name("steel_nugget")
            .settings(Settings.builder()
                    .maxDamage(1)
                    .build())
            .build();
}
