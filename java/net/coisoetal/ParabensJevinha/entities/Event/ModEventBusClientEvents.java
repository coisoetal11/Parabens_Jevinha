package net.coisoetal.ParabensJevinha.entities.Event;


import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.entities.client.DouradaModel;
import net.coisoetal.ParabensJevinha.entities.client.ModModelLayers;
import net.coisoetal.ParabensJevinha.entities.animations.RobaloModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ParabensJevinha.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent

    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ROBALO_LAYER, RobaloModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DOURADA_LAYER, DouradaModel::createBodyLayer);

    }



}
