package net.coisoetal.ParabensJevinha.entities.Event;


import net.coisoetal.ParabensJevinha.entities.ModEntities;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.entities.custom.RobaloEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.coisoetal.ParabensJevinha.entities.ModEntities.ROBALO;


@Mod.EventBusSubscriber(modid = ParabensJevinha.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent

    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ROBALO.get(), RobaloEntity.createAttributes().build());
        event.put(ModEntities.DOURADA.get(), RobaloEntity.createAttributes().build());
    }


    }


