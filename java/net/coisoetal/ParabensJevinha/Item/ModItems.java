package net.coisoetal.ParabensJevinha.Item;

import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.Item.custom.CevadaItem;
import net.coisoetal.ParabensJevinha.Item.custom.ModArmorItem;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.entities.ModEntities;
import net.coisoetal.ParabensJevinha.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import static net.coisoetal.ParabensJevinha.entities.ModEntities.DOURADA;
import static net.coisoetal.ParabensJevinha.entities.ModEntities.ROBALO;

public class ModItems {



    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ParabensJevinha.MOD_ID);



    public static final RegistryObject<Item> DOURADA_ITEM = ITEMS.register("dourada",
            () -> new Item(new Item.Properties().food(ModFood.DOURADA_ITEM)));

    public static final RegistryObject<Item> ROBALO_ITEM = ITEMS.register("robalo",
            () -> new Item(new Item.Properties().food(ModFood.ROBALO_ITEM)));

    public static final RegistryObject<Item> CEVADA_BREAD = ITEMS.register("cevada_bread",
            () -> new Item(new Item.Properties().food(ModFood.CEVADA_BREAD)));

    public static final RegistryObject<Item> SCALES = ITEMS.register("scales",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCALE_FABRIC = ITEMS.register("scale_fabric",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CEVADA = ITEMS.register("cevada",
            () -> new CevadaItem(new Item.Properties()));

    public static final RegistryObject<Item> ROBALO_SPAWN_EGG = ITEMS.register("robalo_spawn_egg",
            () -> new ForgeSpawnEggItem(ROBALO, 0xC0C0C0, 0x808080, new Item.Properties()));

    public static final RegistryObject<Item> DOURADA_SPAWN_EGG = ITEMS.register("dourada_spawn_egg",
            () -> new ForgeSpawnEggItem(DOURADA, 0xC0C0C0, 0x808080, new Item.Properties()));

    public static final RegistryObject<Item> COOKED_ROBALO = ITEMS.register("cooked_robalo",
            () -> new Item(new Item.Properties().food(ModFood.COOKED_ROBALO)));

    public static final RegistryObject<Item> OPIO = ITEMS.register("opio",
            () -> new Item(new Item.Properties().food(ModFood.OPIO)));

    public static final RegistryObject<Item> CEVADA_SEEDS = ITEMS.register("cevada_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CEVADA_CROP.get(), new Item.Properties()));


    public static final RegistryObject<Item> COOKED_DOURADA = ITEMS.register("cooked_dourada",
            () -> new Item(new Item.Properties().food(ModFood.COOKED_DOURADA)));

    public static final RegistryObject<Item> SWIM_SUIT_HELMET = ITEMS.register("swim_suit_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SCALE_FABRIC, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> SWIM_SUIT_CHESTPLATE = ITEMS.register("swim_suit_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SCALE_FABRIC, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> SWIM_SUIT_LEGGINS = ITEMS.register("swim_suit_leggins",
            () -> new ModArmorItem(ModArmorMaterials.SCALE_FABRIC, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> SWIM_SUIT_BOOTS = ITEMS.register("swim_suit_boots",
            () -> new ModArmorItem(ModArmorMaterials.SCALE_FABRIC, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> OCULOS_JEVA = ITEMS.register("oculos_jeva_helmet",
            () -> new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.HELMET, new Item.Properties()));





    public static final RegistryObject<Item> LONELY_ANDRE_MUSIC_DISC = ITEMS.register("lonely_andre_version_music_disc",
            () -> new RecordItem(15, ModSounds.LONELY_ANDRE, new Item.Properties().stacksTo(1), 3960));

    public static final RegistryObject<Item> WINTER_MUSIC_DISK = ITEMS.register("winter_music_disc",
            () -> new RecordItem(14, ModSounds.WINTER, new Item.Properties().stacksTo(1), 11263));

    public static final RegistryObject<Item> ART_MUSIC_DISK = ITEMS.register("505_music_disc",
            () -> new RecordItem(13, ModSounds.ART, new Item.Properties().stacksTo(1), 4980));

    public static final RegistryObject<Item> ERIKA_MUSIC_DISK = ITEMS.register("erika_music_disc",
            () -> new RecordItem(12, ModSounds.ERIKA, new Item.Properties().stacksTo(1), 1820));

    public static final RegistryObject<Item> BAGATATA_MUSIC_DISK = ITEMS.register("funk_do_bagatata_music_disc",
            () -> new RecordItem(11, ModSounds.BAGATATA, new Item.Properties().stacksTo(1), 2220));

    public static final RegistryObject<Item> MONTAGEM_MYSTERIOUS_GAME_MUSIC_DISK = ITEMS.register("montagem_mysterious_game_music_disc",
            () -> new RecordItem(10, ModSounds.MONTAGEM_MYSTERIOUS_GAME, new Item.Properties().stacksTo(1), 2060));

    public static final RegistryObject<Item> ONE_KISS_MUSIC_DISK = ITEMS.register("one_kiss_music_disc",
            () -> new RecordItem(9, ModSounds.ONE_KISS, new Item.Properties().stacksTo(1), 4220));

    public static final RegistryObject<Item> URSS_MUSIC_DISK = ITEMS.register("urss_music_disc",
            () -> new RecordItem(8, ModSounds.URSS, new Item.Properties().stacksTo(1), 4220));

    public static final RegistryObject<Item> WANNA_BE_YOURS_MUSIC_DISK = ITEMS.register("wanna_be_yours_music_disc",
            () -> new RecordItem(7, ModSounds.WANNA_BE_YOURS, new Item.Properties().stacksTo(1), 3620));



















    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
