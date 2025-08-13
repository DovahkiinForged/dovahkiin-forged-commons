package net.dovahkiinforged.commons;

import net.dovahkiinforged.commons.item.ModItem;
import net.dovahkiinforged.commons.item.ModItem.Traits;

public final class ModItems {

    /* WEAPONS */

    public static final ModItem ELVEN_DAGGER = ModItem.builder()
            .name("elven_dagger")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(0.5f)
                    .damage(ModItem.Damage.builder().normal(4).build())
                    .build())
            .build();
    public static final ModItem ELVEN_SWORD = ModItem.builder()
            .name("elven_sword")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(1f)
                    .damage(ModItem.Damage.builder().normal(6).build())
                    .build())
            .build();
    public static final ModItem GLASS_DAGGER = ModItem.builder()
            .name("glass_dagger")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(0.5f)
                    .damage(ModItem.Damage.builder().normal(4).build())
                    .build())
            .build();
    public static final ModItem GLASS_SWORD = ModItem.builder()
            .name("glass_sword")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(1f)
                    .damage(ModItem.Damage.builder().normal(6).build())
                    .build())
            .build();

    /* MATERIALS */

    public static final ModItem AMETHYST = ModItem.builder()
            .name("amethyst")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem GARNET = ModItem.builder()
            .name("garnet")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem RUBY = ModItem.builder()
            .name("ruby")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem SAPPHIRE = ModItem.builder()
            .name("sapphire")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MALACHITE_INGOT = ModItem.builder()
            .name("malachite_ingot")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MALACHITE_NUGGET = ModItem.builder()
            .name("malachite_nugget")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MOONSTONE_INGOT = ModItem.builder()
            .name("moonstone_ingot")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MOONSTONE_NUGGET = ModItem.builder()
            .name("moonstone_nugget")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem STEEL_INGOT = ModItem.builder()
            .name("steel_ingot")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem STEEL_NUGGET = ModItem.builder()
            .name("steel_nugget")
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
}
