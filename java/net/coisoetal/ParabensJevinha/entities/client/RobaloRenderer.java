package net.coisoetal.ParabensJevinha.entities.client;

import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.entities.animations.RobaloModel;
import net.coisoetal.ParabensJevinha.entities.custom.RobaloEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RobaloRenderer extends MobRenderer<RobaloEntity, RobaloModel<RobaloEntity>> {


    public RobaloRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new RobaloModel<>(pContext.bakeLayer(ModModelLayers.ROBALO_LAYER)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(RobaloEntity robaloEntity) {
        return new ResourceLocation(ParabensJevinha.MOD_ID, "textures/entity/robalo.png");
    }

}
