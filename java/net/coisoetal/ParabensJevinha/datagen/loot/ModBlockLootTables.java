package net.coisoetal.ParabensJevinha.datagen.loot;


import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.Block.custom.CevadaCropBlock;
import net.coisoetal.ParabensJevinha.Item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AZULEJO_AZUL.get());
        this.dropSelf(ModBlocks.AZULEJO_AMARELO.get());
        this.dropSelf(ModBlocks.CHAO_AMARELO.get());
        this.dropSelf(ModBlocks.CHAO_AZUL.get());
        this.dropSelf(ModBlocks.BANCA_DE_PEIXE.get());
        this.dropSelf(ModBlocks.FERMENTATOR.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());


        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CEVADA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CevadaCropBlock.AGE, 5));

        this.add(ModBlocks.CEVADA_CROP.get(), createCropDrops(ModBlocks.CEVADA_CROP.get(), ModItems.CEVADA.get(),
                ModItems.CEVADA_SEEDS.get(), lootitemcondition$builder));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
