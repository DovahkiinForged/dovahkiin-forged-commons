package net.dovahkiinforged.commons;

import net.dovahkiinforged.commons.item.ModItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ModItemsTest {
    @Test
    public void malachiteIngotHasCorrectName() {
        ModItem item = ModItems.MALACHITE_INGOT;
        assertEquals("malachite_ingot", item.getName());
    }

    @Test
    public void malachiteIngotHasCorrectTraits() {
        ModItem item = ModItems.MALACHITE_INGOT;
        assertEquals(64, item.getTraits().getMaxStackSize());
        assertNull(item.getTraits().getCooldown());
        assertEquals(1, item.getTraits().getDamage().getNormal());
        assertNull(item.getTraits().getDamage().getCritical());
    }
}
