package net.coisoetal.ParabensJevinha;

import com.mojang.logging.LogUtils;
import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.Item.ModItems;
import net.coisoetal.ParabensJevinha.Item.ModCreativeModeTabs;
import net.coisoetal.ParabensJevinha.entities.ModEntities;
import net.coisoetal.ParabensJevinha.entities.client.RobaloRenderer;
import net.coisoetal.ParabensJevinha.entities.client.DouradaRenderer;
import net.coisoetal.ParabensJevinha.sound.ModSounds;
import net.coisoetal.ParabensJevinha.villager.ModVillagers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ParabensJevinha.MOD_ID)
public class ParabensJevinha {
    public static final String MOD_ID = "parabensjevinha";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ParabensJevinha() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModCreativeModeTabs.register(modEventBus);
        ModEntities.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModSounds.register(modEventBus);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.ROBALO_SPAWN_EGG);
            event.accept(ModItems.DOURADA_SPAWN_EGG);


        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.ROBALO.get(), RobaloRenderer::new);
            EntityRenderers.register(ModEntities.DOURADA.get(), DouradaRenderer::new);



        }
    }
}
