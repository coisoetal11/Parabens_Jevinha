package net.coisoetal.ParabensJevinha.datagen;

import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.Block.custom.CevadaCropBlock;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ParabensJevinha.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AZULEJO_AZUL);
        blockWithItem(ModBlocks.AZULEJO_AMARELO);

        blockWithItem(ModBlocks.CHAO_AMARELO);
        blockWithItem(ModBlocks.CHAO_AZUL);
        blockWithItem(ModBlocks.SOUND_BLOCK);





        makeCevadaCrop((CropBlock) ModBlocks.CEVADA_CROP.get(), "cevada_crop_stage_", "cevada_crop_stage_");

        simpleBlockWithItem(ModBlocks.FERMENTATOR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/fermentator")));







    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


    public void makeCevadaCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cevadaStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cevadaStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CevadaCropBlock) block).getAgeProperty()),
                new ResourceLocation(ParabensJevinha.MOD_ID, "block/" + textureName + state.getValue(((CevadaCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }



}


