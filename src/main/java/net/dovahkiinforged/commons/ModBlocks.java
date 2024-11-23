package net.dovahkiinforged.commons;

import net.dovahkiinforged.commons.block.ModBlock;
import net.dovahkiinforged.commons.block.ModBlock.Traits;

public final class ModBlocks {

    /* ORES */

    public static final ModBlock MALACHITE_ORE = ModBlock.builder()
            .name("malachite_ore")
            .traits(Traits.builder()
                    .hardness(3)
                    .build())
            .build();
    public static final ModBlock MOONSTONE_ORE = ModBlock.builder()
            .name("moonstone_ore")
            .traits(Traits.builder()
                    .hardness(3)
                    .build())
            .build();

    /* BLOCKS */

    public static final ModBlock RAW_MALACHITE_BLOCK = ModBlock.builder()
            .name("raw_malachite_block")
            .traits(Traits.builder()
                    .hardness(3)
                    .build())
            .build();
    public static final ModBlock RAW_MOONSTONE_BLOCK = ModBlock.builder()
            .name("raw_moonstone_block")
            .traits(Traits.builder()
                    .hardness(3)
                    .build())
            .build();
    public static final ModBlock MALACHITE_BLOCK = ModBlock.builder()
            .name("malachite_block")
            .traits(Traits.builder()
                    .hardness(1.5f)
                    .build())
            .build();
    public static final ModBlock MOONSTONE_BLOCK = ModBlock.builder()
            .name("moonstone_block")
            .traits(Traits.builder()
                    .hardness(1.5f)
                    .build())
            .build();

}
