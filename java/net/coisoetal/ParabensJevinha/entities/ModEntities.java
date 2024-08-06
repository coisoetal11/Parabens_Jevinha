package net.coisoetal.ParabensJevinha.entities;

import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.entities.custom.DouradaEntity;
import net.coisoetal.ParabensJevinha.entities.custom.RobaloEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ParabensJevinha.MOD_ID);

    public static final RegistryObject<EntityType<RobaloEntity>> ROBALO =
            ENTITY_TYPES.register("robalo", () -> EntityType.Builder.of(RobaloEntity::new, MobCategory.WATER_CREATURE)
                    .sized(0.5f, 0.5f).build("robalo"));

    public static final RegistryObject<EntityType<DouradaEntity>> DOURADA =
            ENTITY_TYPES.register("dourada", () -> EntityType.Builder.of(DouradaEntity::new, MobCategory.WATER_CREATURE)
                    .sized(0.7f, 0.7f).build("dourada"));



    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);

    }
}
