package dev.bulmer.dovahkiinforged.commons;

import dev.bulmer.dovahkiinforged.commons.block.BlockSettings;

public final class Blocks {

    public static final BlockSettings MALACHITE_ORE = BlockSettings.builder()
            .name("malachite_ore")
            .hardness(3)
            .build();
    public static final BlockSettings MOONSTONE_ORE = BlockSettings.builder()
            .name("moonstone_ore")
            .hardness(3)
            .build();
    public static final BlockSettings RAW_MALACHITE_BLOCK = BlockSettings.builder()
            .name("raw_malachite_block")
            .hardness(3)
            .build();
    public static final BlockSettings RAW_MOONSTONE_BLOCK = BlockSettings.builder()
            .name("raw_moonstone_block")
            .hardness(3)
            .build();
    public static final BlockSettings MALACHITE_BLOCK = BlockSettings.builder()
            .name("malachite_block")
            .hardness(1.5f)
            .build();
    public static final BlockSettings MOONSTONE_BLOCK = BlockSettings.builder()
            .name("moonstone_block")
            .hardness(1.5f)
            .build();
}
