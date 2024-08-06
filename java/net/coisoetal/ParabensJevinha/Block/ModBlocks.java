package net.coisoetal.ParabensJevinha.Block;

import net.coisoetal.ParabensJevinha.Block.custom.CevadaCropBlock;
import net.coisoetal.ParabensJevinha.Block.custom.FermentatorBlock;
import net.coisoetal.ParabensJevinha.Block.custom.SoundBlock;
import net.coisoetal.ParabensJevinha.Item.ModItems;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.coisoetal.ParabensJevinha.sound.ModSounds;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ParabensJevinha.MOD_ID);

    public static final RegistryObject<Block> AZULEJO_AZUL = registerBlock("azulejo_azul",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> AZULEJO_AMARELO = registerBlock("azulejo_amarelo",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CHAO_AZUL = registerBlock("chao_azul",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CHAO_AMARELO = registerBlock("chao_amarelo",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));





    public static final RegistryObject<Block> CEVADA_CROP = BLOCKS.register("cevada_crop",
            () -> new CevadaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));


    public static final RegistryObject<Block> FERMENTATOR = registerBlock("fermentator",
            () -> new FermentatorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> BANCA_DE_PEIXE = registerBlock("banca_peixe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(ModSounds.SOUND_BLOCK_SOUNDS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
