package net.coisoetal.ParabensJevinha.entities.client;


import net.coisoetal.ParabensJevinha.entities.custom.DouradaEntity;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DouradaRenderer extends MobRenderer<DouradaEntity, DouradaModel<DouradaEntity>> {


    public DouradaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DouradaModel<>(pContext.bakeLayer(ModModelLayers.DOURADA_LAYER)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(DouradaEntity robaloEntity) {
        return new ResourceLocation(ParabensJevinha.MOD_ID, "textures/entity/dourada.png");
    }

}
