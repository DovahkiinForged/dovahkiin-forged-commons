package net.dovahkiinforged.commons.block;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ModBlock {
    String name;
    String tooltip;
    Traits traits;

    @Value
    @Builder
    public static class Traits {
        float hardness;
        float resistance;
        float lightLevel;
        float harvestLevel;
        boolean burnable;
        boolean liquid;
    }
}
