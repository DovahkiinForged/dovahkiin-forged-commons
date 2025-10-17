package net.dovahkiinforged.commons;

import net.dovahkiinforged.commons.constant.ItemConstant;
import net.dovahkiinforged.commons.item.ModItem;
import net.dovahkiinforged.commons.item.ModItem.Traits;
import net.dovahkiinforged.commons.util.TraitUtils;

public final class ModItems {

    /* WEAPONS */

    public static final ModItem ELVEN_DAGGER = ModItem.builder()
            .name("elven_dagger")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(0.5f)
                    .damage(ModItem.Damage.builder().normal(4).build())
                    .build())
            .build();
    public static final ModItem ELVEN_SWORD = ModItem.builder()
            .name("elven_sword")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(1f)
                    .damage(ModItem.Damage.builder().normal(6).build())
                    .build())
            .build();
    public static final ModItem GLASS_DAGGER = ModItem.builder()
            .name("glass_dagger")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(0.5f)
                    .damage(ModItem.Damage.builder().normal(4).build())
                    .build())
            .build();
    public static final ModItem GLASS_SWORD = ModItem.builder()
            .name("glass_sword")
            .traits(Traits.builder()
                    .maxStackSize(1)
                    .cooldown(1f)
                    .damage(ModItem.Damage.builder().normal(6).build())
                    .build())
            .build();

    /* MATERIALS */

    public static final ModItem AMETHYST = ModItem.builder()
            .name("amethyst")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem GARNET = ModItem.builder()
            .name("garnet")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem RUBY = ModItem.builder()
            .name("ruby")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem SAPPHIRE = ModItem.builder()
            .name("sapphire")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MALACHITE_INGOT = ModItem.builder()
            .name("malachite_ingot")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MALACHITE_NUGGET = ModItem.builder()
            .name("malachite_nugget")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MOONSTONE_INGOT = ModItem.builder()
            .name("moonstone_ingot")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem MOONSTONE_NUGGET = ModItem.builder()
            .name("moonstone_nugget")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem STEEL_INGOT = ModItem.builder()
            .name("steel_ingot")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();
    public static final ModItem STEEL_NUGGET = ModItem.builder()
            .name("steel_nugget")
            .type(ItemConstant.MATERIAL)
            .traits(Traits.builder()
                    .damage(ModItem.Damage.builder().normal(1).build())
                    .build())
            .build();

    /* BEVERAGE */

    public static final ModItem ALE = ModItem.builder()
            .name("ale")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ALTO_WINE_1 = ModItem.builder()
            .name("alto_wine_1")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ALTO_WINE_2 = ModItem.builder()
            .name("alto_wine_2")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ARGONIAN_BLOODWINE = ModItem.builder()
            .name("argonian_bloodwine")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ASHFIRE_MEAD = ModItem.builder()
            .name("ashfire_mead")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem BLACK_BRIAR_RESERVE = ModItem.builder()
            .name("black_briar_reserve")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem COLOVIAN_BRANDY = ModItem.builder()
            .name("colovian_brandy")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem DRAGONS_BREATH_MEAD = ModItem.builder()
            .name("dragons_breath_mead")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem EMBERBRAND_WINE = ModItem.builder()
            .name("emberbrand_wine")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem FIREBRAND_WINE = ModItem.builder()
            .name("firebrand_wine")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem FLIN = ModItem.builder()
            .name("flin")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HONNINGBREW_MEAD = ModItem.builder()
            .name("honningbrew_mead")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();

    /* FOOD */

    public static final ModItem ABECEAN_LONGFIN = ModItem.builder()
            .name("abecean_longfin")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem APPLE_CABBAGE_STEW = ModItem.builder()
            .name("apple_cabbage_stew")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem APPLE_DUMPLING = ModItem.builder()
            .name("apple_dumpling")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem APPLE_PIE = ModItem.builder()
            .name("apple_pie")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ASH_HOPPER_LEG = ModItem.builder()
            .name("ash_hopper_leg")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ASH_HOPPER_MEAT = ModItem.builder()
            .name("ash_hopper_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ASH_YAM = ModItem.builder()
            .name("ash_yam")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem BEEF_STEW = ModItem.builder()
            .name("beef_stew")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem BLACK_BRIAR_MEAD = ModItem.builder()
            .name("black_briar_mead")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem BOILED_CREME_TREAT = ModItem.builder()
            .name("boiled_creme_treat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem BRAIDED_BREAD = ModItem.builder()
            .name("braided_bread")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem BUTTER = ModItem.builder()
            .name("butter")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CABBAGE = ModItem.builder()
            .name("cabbage")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CABBAGE_POTATO_SOUP = ModItem.builder()
            .name("cabbage_potato_soup")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CABBAGE_SOUP = ModItem.builder()
            .name("cabbage_soup")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CHARRED_SKEEVER_MEAT = ModItem.builder()
            .name("charred_skeever_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CHICKEN_BREAST = ModItem.builder()
            .name("chicken_breast")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CHICKEN_DUMPLING = ModItem.builder()
            .name("chicken_dumpling")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CLAM_CHOWDER = ModItem.builder()
            .name("clam_chowder")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CLAM_MEAT = ModItem.builder()
            .name("clam_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem COOKED_BOAR_MEAT = ModItem.builder()
            .name("cooked_boar_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem CRAB_MEAT = ModItem.builder()
            .name("crab_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem DOG_MEAT = ModItem.builder()
            .name("dog_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem EIDAR_CHEESE_WEDGE = ModItem.builder()
            .name("eidar_cheese_wedge")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem EIDAR_CHEESE_WHEEL = ModItem.builder()
            .name("eidar_cheese_wheel")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem ELSWEYR_FONDUE = ModItem.builder()
            .name("elsweyr_fondue")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GARLIC_BREAD = ModItem.builder()
            .name("garlic_bread")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GOAT_CHEESE_WEDGE = ModItem.builder()
            .name("goat_cheese_wedge")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GOAT_CHEESE_WHEEL = ModItem.builder()
            .name("goat_cheese_wheel")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GOAT_MILK_BUCKET = ModItem.builder()
            .name("goat_milk_bucket")
            .type(ItemConstant.BEVERAGE)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GOURD = ModItem.builder()
            .name("gourd")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GREEN_APPLE = ModItem.builder()
            .name("green_apple")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GRILLED_CHICKEN_BREAST = ModItem.builder()
            .name("grilled_chicken_breast")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem GRILLED_LEEKS = ModItem.builder()
            .name("grilled_leeks")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HONEY_NUT_TREAT = ModItem.builder()
            .name("honey_nut_treat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HORKER_AND_ASH_YAM_STEW = ModItem.builder()
            .name("horker_and_ash_yam_stew")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HORKER_LOAF = ModItem.builder()
            .name("horker_loaf")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HORKER_MEAT = ModItem.builder()
            .name("horker_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HORKER_STEW = ModItem.builder()
            .name("horker_stew")
            .type(ItemConstant.SOUP)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HORSE_HAUNCH = ModItem.builder()
            .name("horse_haunch")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem HORSE_MEAT = ModItem.builder()
            .name("horse_meat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem JAZBAY_CROSTATA = ModItem.builder()
            .name("jazbay_crostata")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem JUNIPER_BERRY_CROSTATA = ModItem.builder()
            .name("juniper_berry_crostata")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem LAVENDER_DUMPLING = ModItem.builder()
            .name("lavender_dumpling")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem LEEK = ModItem.builder()
            .name("leek")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem LEG_OF_GOAT = ModItem.builder()
            .name("leg_of_goat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem LEG_OF_GOAT_ROAST = ModItem.builder()
            .name("leg_of_goat_roast")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();
    public static final ModItem LONG_TAFFY_TREAT = ModItem.builder()
            .name("long_taffy_treat")
            .type(ItemConstant.FOOD)
            .traits(TraitUtils.buildFoodTraits(4, 1f, false))
            .build();


    /* ALCHEMY INGREDIENTS */

    public static final ModItem ANCESTOR_MOTH_WING = ModItem.builder()
            .name("ancestor_moth_wing")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem ASH_CREEP_CLUSTER = ModItem.builder()
            .name("ash_creep_cluster")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem ASH_HOPPER_JELLY = ModItem.builder()
            .name("ash_hopper_jelly")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem ASHEN_GRASS_POD = ModItem.builder()
            .name("ashen_grass_pod")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem AZURAS_STAR = ModItem.builder()
            .name("azuras_star")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BEAR_CLAWS = ModItem.builder()
            .name("bear_claws")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BEE = ModItem.builder()
            .name("bee")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BEEHIVE_HUSK = ModItem.builder()
            .name("beehive_husk")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BLEEDING_CROWN = ModItem.builder()
            .name("bleeding_crown")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BLISTERWORT = ModItem.builder()
            .name("blisterwort")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BLUE_BUTTERFLY_WING = ModItem.builder()
            .name("blue_butterfly_wing")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BLUE_DARTWING = ModItem.builder()
            .name("blue_dartwing")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BLUE_MOUNTAIN_FLOWER = ModItem.builder()
            .name("blue_mountain_flower")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BOAR_TUSK = ModItem.builder()
            .name("boar_tusk")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BONE_MEAL = ModItem.builder()
            .name("bone_meal")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BRIAR_HEART = ModItem.builder()
            .name("briar_heart")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BURNT_SPRIGGAN_WOOD = ModItem.builder()
            .name("burnt_spriggan_wood")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem BUTTERFLY_WING = ModItem.builder()
            .name("butterfly_wing")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CANIS_ROOT = ModItem.builder()
            .name("canis_root")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CHARRED_SKEEVER_HIDE = ModItem.builder()
            .name("charred_skeever_hide")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CHAURUS_EGGES = ModItem.builder()
            .name("chaurus_eggs")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CHAURUS_HUNTER_ANTENNAE = ModItem.builder()
            .name("chaurus_hunter_antennae")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CHICKENS_EGG = ModItem.builder()
            .name("chickens_egg")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CREEP_CLUSTER = ModItem.builder()
            .name("creep_cluster")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CRIMSON_NIRNROOT = ModItem.builder()
            .name("crimson_nirnroot")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem CYRODILIC_SPADETAIL = ModItem.builder()
            .name("cyrodilic_spadetail")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem DAEDRA_HEART = ModItem.builder()
            .name("daedra_heart")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem DEATHBELL = ModItem.builder()
            .name("deathbell")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem DRAGONS_TONGUE = ModItem.builder()
            .name("dragons_tongue")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem DWARVEN_OIL = ModItem.builder()
            .name("dwarven_oil")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem ECTOPLASM = ModItem.builder()
            .name("ectoplasm")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem ELVES_EAR = ModItem.builder()
            .name("elves_ear")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem EMPEROR_PARASOL_MOSS = ModItem.builder()
            .name("emperor_parasol_moss")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem EYE_OF_SABRE_CAT = ModItem.builder()
            .name("eye_of_sabre_cat")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem FALMER_EAR = ModItem.builder()
            .name("falmer_ear")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem FELSAAD_TERN_FEATHERS = ModItem.builder()
            .name("felsaad_tern_feathers")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem FIRE_SALTS = ModItem.builder()
            .name("fire_salts")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem FLY_AMANITA = ModItem.builder()
            .name("fly_amanita")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem FROST_MIRRIAM = ModItem.builder()
            .name("frost_mirriam")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem FROST_SALTS = ModItem.builder()
            .name("frost_salts")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GARLIC = ModItem.builder()
            .name("garlic")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GIANT_LICHEN = ModItem.builder()
            .name("giant_lichen")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GIANTS_TOE = ModItem.builder()
            .name("giants_toe")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GLEAMBLOSSOM = ModItem.builder()
            .name("gleamblossom")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GLOW_DUST = ModItem.builder()
            .name("glow_dust")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GLOWING_MUSHROOM = ModItem.builder()
            .name("glowing_mushroom")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem GRASS_POD = ModItem.builder()
            .name("grass_pod")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HAGRAVEN_CLAW = ModItem.builder()
            .name("hagraven_claw")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HAGRAVEN_FEATHERS = ModItem.builder()
            .name("hagraven_feathers")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HANGING_MOSS = ModItem.builder()
            .name("hanging_moss")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HAWK_BEAK = ModItem.builder()
            .name("hawk_beak")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HAWK_FEATHERS = ModItem.builder()
            .name("hawk_feathers")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HAWK_EGG = ModItem.builder()
            .name("hawk_egg")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HISTCARP = ModItem.builder()
            .name("histcarp")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HUMAN_FLESH = ModItem.builder()
            .name("human_flesh")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem HUMAN_HEART = ModItem.builder()
            .name("human_heart")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem ICE_WRAITH_TEETH = ModItem.builder()
            .name("ice_wraith_teeth")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem IMP_STOOL = ModItem.builder()
            .name("imp_stool")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem JAZBAY_GRAPES = ModItem.builder()
            .name("jazbay_grapes")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem JUNIPER_BERRIES = ModItem.builder()
            .name("juniper_berries")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem LARGE_ANTLERS = ModItem.builder()
            .name("large_antlers")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem LAVENDER = ModItem.builder()
            .name("lavender")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
    public static final ModItem LUNA_MOTH_WING = ModItem.builder()
            .name("luna_moth_wing")
            .type(ItemConstant.ALCHEMY_INGREDIENT)
            .traits(TraitUtils.ALCHEMY_INGREDIENT_TRAITS)
            .build();
}
