package net.coisoetal.ParabensJevinha.compat;

import mezz.jei.api.IModPlugin;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.resources.ResourceLocation;

public class JEIParabensJevinhaPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ParabensJevinha.MOD_ID, "jei_plugin");
    }
}
