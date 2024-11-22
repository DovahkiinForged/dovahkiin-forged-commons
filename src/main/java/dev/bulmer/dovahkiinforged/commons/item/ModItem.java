package dev.bulmer.dovahkiinforged.commons.item;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ModItem {
    String name;
    Settings settings;

    @Value
    @Builder
    public static class Settings {
        @Builder.Default
        Integer maxStackSize = 64;
        Integer maxDamage;
        Integer durability;
        Float efficiency;
        Float cooldown;
        boolean fireproof;
    }
}
