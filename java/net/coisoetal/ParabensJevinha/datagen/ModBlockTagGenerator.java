package net.coisoetal.ParabensJevinha.datagen;

import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ParabensJevinha.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AZULEJO_AMARELO.get(),
                ModBlocks.AZULEJO_AZUL.get(),
                ModBlocks.CHAO_AZUL.get(),
                        ModBlocks.BANCA_DE_PEIXE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                ModBlocks.CHAO_AMARELO.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AZULEJO_AMARELO.get(),
                        ModBlocks.AZULEJO_AZUL.get(),
                        ModBlocks.CHAO_AZUL.get(),
                        ModBlocks.BANCA_DE_PEIXE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.CHAO_AMARELO.get()
                );




    }
}
