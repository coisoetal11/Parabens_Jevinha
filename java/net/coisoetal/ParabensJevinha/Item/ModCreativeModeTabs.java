package net.coisoetal.ParabensJevinha.Item;

import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ParabensJevinha.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JEVA_TAB = CREATIVE_MOD_TABS.register("jevaaaaaaa",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OCULOS_JEVA.get()))
                    .title(Component.translatable("jevaaaaaaa"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ROBALO_ITEM.get());
                        pOutput.accept(ModItems.DOURADA_ITEM.get());
                        pOutput.accept(ModItems.COOKED_ROBALO.get());
                        pOutput.accept(ModItems.COOKED_DOURADA.get());
                        pOutput.accept(ModItems.SCALES.get());
                        pOutput.accept(ModItems.SCALE_FABRIC.get());
                        pOutput.accept(ModItems.OPIO.get());
                        pOutput.accept(ModItems.CEVADA_SEEDS.get());
                        pOutput.accept(ModItems.CEVADA.get());
                        pOutput.accept(ModItems.CEVADA_BREAD.get());

                        pOutput.accept(ModItems.SWIM_SUIT_HELMET.get());
                        pOutput.accept(ModItems.SWIM_SUIT_CHESTPLATE.get());
                        pOutput.accept(ModItems.SWIM_SUIT_LEGGINS.get());
                        pOutput.accept(ModItems.SWIM_SUIT_BOOTS.get());
                        pOutput.accept(ModItems.OCULOS_JEVA.get());



                        pOutput.accept(ModBlocks.AZULEJO_AZUL.get());
                        pOutput.accept(ModBlocks.AZULEJO_AMARELO.get());
                        pOutput.accept(ModBlocks.CHAO_AMARELO.get());
                        pOutput.accept(ModBlocks.CHAO_AZUL.get());
                        pOutput.accept(ModBlocks.BANCA_DE_PEIXE.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());



                        pOutput.accept(ModItems.LONELY_ANDRE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.WINTER_MUSIC_DISK.get());
                        pOutput.accept(ModItems.ART_MUSIC_DISK.get());
                        pOutput.accept(ModItems.WANNA_BE_YOURS_MUSIC_DISK.get());
                        pOutput.accept(ModItems.ERIKA_MUSIC_DISK.get());
                        pOutput.accept(ModItems.URSS_MUSIC_DISK.get());
                        pOutput.accept(ModItems.BAGATATA_MUSIC_DISK.get());
                        pOutput.accept(ModItems.MONTAGEM_MYSTERIOUS_GAME_MUSIC_DISK.get());
                        pOutput.accept(ModItems.ONE_KISS_MUSIC_DISK.get());





                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);

    }



}
