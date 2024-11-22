package dev.bulmer.dovahkiinforged.commons.item;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ItemSettings {
    String name;
    int maxStackSize;
    int maxDamage;
    int durability;
    int enchantability;
    int harvestLevel;
    float efficiency;
    float cooldown;
}
