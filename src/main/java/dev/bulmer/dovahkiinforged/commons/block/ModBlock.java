package dev.bulmer.dovahkiinforged.commons.block;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ModBlock {
    String name;
    String tooltip;
    Settings settings;

    @Value
    @Builder
    public static class Settings {
        float hardness;
        float resistance;
        float lightLevel;
        float harvestLevel;
        boolean burnable;
        boolean liquid;
    }
}
