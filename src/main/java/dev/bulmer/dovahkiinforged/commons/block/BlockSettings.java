package dev.bulmer.dovahkiinforged.commons.block;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BlockSettings {
    String name;
    String tooltip;
    float hardness;
    float resistance;
    float lightLevel;
    float harvestLevel;
    boolean burnable;
}
