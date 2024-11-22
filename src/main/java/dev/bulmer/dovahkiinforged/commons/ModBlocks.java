package dev.bulmer.dovahkiinforged.commons;

import dev.bulmer.dovahkiinforged.commons.block.ModBlock;
import dev.bulmer.dovahkiinforged.commons.block.ModBlock.Settings;

public final class ModBlocks {

    /* ORES */

    public static final ModBlock MALACHITE_ORE = ModBlock.builder()
            .name("malachite_ore")
            .settings(Settings.builder()
                    .hardness(3)
                    .build())
            .build();
    public static final ModBlock MOONSTONE_ORE = ModBlock.builder()
            .name("moonstone_ore")
            .settings(Settings.builder()
                    .hardness(3)
                    .build())
            .build();

    /* BLOCKS */

    public static final ModBlock RAW_MALACHITE_BLOCK = ModBlock.builder()
            .name("raw_malachite_block")
            .settings(Settings.builder()
                    .hardness(3)
                    .build())
            .build();
    public static final ModBlock RAW_MOONSTONE_BLOCK = ModBlock.builder()
            .name("raw_moonstone_block")
            .settings(Settings.builder()
                    .hardness(3)
                    .build())
            .build();
    public static final ModBlock MALACHITE_BLOCK = ModBlock.builder()
            .name("malachite_block")
            .settings(Settings.builder()
                    .hardness(1.5f)
                    .build())
            .build();
    public static final ModBlock MOONSTONE_BLOCK = ModBlock.builder()
            .name("moonstone_block")
            .settings(Settings.builder()
                    .hardness(1.5f)
                    .build())
            .build();

}
