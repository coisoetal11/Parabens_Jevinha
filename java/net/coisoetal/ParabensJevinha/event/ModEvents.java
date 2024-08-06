package net.coisoetal.ParabensJevinha.event;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.coisoetal.ParabensJevinha.Item.ModItems;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ParabensJevinha.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }


        if (event.getType() == VillagerProfession.ARMORER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }


        if (event.getType() == VillagerProfession.BUTCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }


        if (event.getType() == VillagerProfession.CARTOGRAPHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }


        if (event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }


        if (event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }


        if (event.getType() == VillagerProfession.FLETCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }

        if (event.getType() == VillagerProfession.LEATHERWORKER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));


        }if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }

        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }

        if (event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }

        if (event.getType() == VillagerProfession.SHEPHERD) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OPIO.get(), 64),
                    new ItemStack(Items.EMERALD, 1),
                    10, 8, 0.02f));
        }
        if (event.getType() == ModVillagers.AVO_JEVA.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ModItems.ROBALO_ITEM.get(), 1),
                    32, 2, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(ModItems.DOURADA_ITEM.get(), 1),
                    32, 5, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    new ItemStack(ModItems.ROBALO_ITEM.get(), 1),
                    new ItemStack(ModItems.COOKED_ROBALO.get(), 1),
                    10, 8, 0.04f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.DOURADA_ITEM.get(), 1),
                    new ItemStack(ModItems.COOKED_DOURADA.get(), 1),
                    10, 8, 0.04f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 64),
                    new ItemStack(Items.DIAMOND, 3),
                    new ItemStack(ModItems.ROBALO_SPAWN_EGG.get(), 1),
                    3, 25, 0.5f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 64),
                    new ItemStack(Items.DIAMOND, 3),
                    new ItemStack(ModItems.DOURADA_SPAWN_EGG.get(), 1),
                    3, 25, 0.5f));
        }

        if (event.getType() == ModVillagers.SOUND_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.ONE_KISS_MUSIC_DISK.get(), 1),
                    1, 25, 0.5f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.MONTAGEM_MYSTERIOUS_GAME_MUSIC_DISK.get(), 1),
                    1, 25, 0.5f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.BAGATATA_MUSIC_DISK.get(), 1),
                    1, 25, 0.5f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.URSS_MUSIC_DISK.get(), 1),
                    1, 30, 0.5f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.ERIKA_MUSIC_DISK.get(), 1),
                    1, 30, 0.5f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.WANNA_BE_YOURS_MUSIC_DISK.get(), 1),
                    1, 45, 0.5f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.ART_MUSIC_DISK.get(), 1),
                    1, 45, 0.5f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.WINTER_MUSIC_DISK.get(), 1),
                    1, 55, 0.5f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.LONELY_ANDRE_MUSIC_DISC.get(), 1),
                    1, 55, 0.5f));
        }
    }
    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                new ItemStack(ModItems.CEVADA_SEEDS.get(), 1),
                8, 2, 0.2f));

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 12),
                new ItemStack(ModItems.OCULOS_JEVA.get(), 1),
                1, 12, 0.15f));
    }
}