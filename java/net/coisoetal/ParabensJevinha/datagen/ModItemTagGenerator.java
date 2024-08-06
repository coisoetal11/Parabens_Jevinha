package net.coisoetal.ParabensJevinha.datagen;

import net.coisoetal.ParabensJevinha.Item.ModItems;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ParabensJevinha.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SWIM_SUIT_HELMET.get(),
                        ModItems.SWIM_SUIT_CHESTPLATE.get(),
                        ModItems.SWIM_SUIT_LEGGINS.get(),
                        ModItems.SWIM_SUIT_BOOTS.get());
                        ModItems.OCULOS_JEVA.get();



        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.LONELY_ANDRE_MUSIC_DISC.get())
                .add(ModItems.ART_MUSIC_DISK.get())
                .add(ModItems.WANNA_BE_YOURS_MUSIC_DISK.get())
                .add(ModItems.URSS_MUSIC_DISK.get())
                .add(ModItems.ERIKA_MUSIC_DISK.get())
                .add(ModItems.MONTAGEM_MYSTERIOUS_GAME_MUSIC_DISK.get())
                .add(ModItems.BAGATATA_MUSIC_DISK.get())
                .add(ModItems.ONE_KISS_MUSIC_DISK.get())
                .add(ModItems.WINTER_MUSIC_DISK.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.LONELY_ANDRE_MUSIC_DISC.get())
                .add(ModItems.ART_MUSIC_DISK.get())
                .add(ModItems.WANNA_BE_YOURS_MUSIC_DISK.get())
                .add(ModItems.URSS_MUSIC_DISK.get())
                .add(ModItems.ERIKA_MUSIC_DISK.get())
                .add(ModItems.MONTAGEM_MYSTERIOUS_GAME_MUSIC_DISK.get())
                .add(ModItems.BAGATATA_MUSIC_DISK.get())
                .add(ModItems.ONE_KISS_MUSIC_DISK.get())
                .add(ModItems.WINTER_MUSIC_DISK.get());

    }
}