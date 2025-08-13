package net.dovahkiinforged.commons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ModBlocksTest {
    @Test
    void malachiteOreHasCorrectName() {
        assertEquals("malachite_ore", ModBlocks.MALACHITE_ORE.getName());
    }

    @Test
    void malachiteOreHasCorrectHardness() {
        assertEquals(3, ModBlocks.MALACHITE_ORE.getTraits().getHardness());
    }
}