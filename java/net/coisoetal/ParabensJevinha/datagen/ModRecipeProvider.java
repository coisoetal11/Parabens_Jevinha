package net.coisoetal.ParabensJevinha.datagen;

import net.coisoetal.ParabensJevinha.Block.ModBlocks;
import net.coisoetal.ParabensJevinha.Item.ModItems;
import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    private static final List<ItemLike> SAPPHIRE_SMELTABLE = List.of(ModItems.ROBALO_ITEM.get());
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.DOURADA_ITEM.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLE, RecipeCategory.MISC, ModItems.COOKED_ROBALO.get(), 0.25f, 200, "sapphire");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.COOKED_DOURADA.get(), 0.25f, 100, "sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHAO_AZUL.get(),4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.AZULEJO_AZUL.get())
                .unlockedBy(getHasName(ModBlocks.AZULEJO_AZUL.get()), has(ModBlocks.AZULEJO_AZUL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHAO_AMARELO.get(),4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.AZULEJO_AMARELO.get())
                .unlockedBy(getHasName(ModBlocks.AZULEJO_AMARELO.get()), has(ModBlocks.AZULEJO_AMARELO.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AZULEJO_AZUL.get(),4)
                .pattern("SS")
                .pattern("SS")
                .define('S', Items.BLUE_TERRACOTTA)
                .unlockedBy(getHasName(Items.BLUE_TERRACOTTA), has(Items.BLUE_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AZULEJO_AMARELO.get(),4)
                .pattern("SS")
                .pattern("SS")
                .define('S', Items.YELLOW_TERRACOTTA)
                .unlockedBy(getHasName(Items.YELLOW_TERRACOTTA), has(Items.YELLOW_TERRACOTTA))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OPIO.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', Items.POPPY)
                .unlockedBy(getHasName(Items.POPPY), has(Items.POPPY))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCALE_FABRIC.get())
                .pattern("SSS")
                .pattern("XXX")
                .pattern("SSS")
                .define('S', ModItems.SCALES.get())
                .define('X', Items.LEATHER)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .unlockedBy(getHasName(ModItems.SCALES.get()), has(ModItems.SCALES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SWIM_SUIT_HELMET.get())
                .pattern("SSS")
                .pattern("XXX")
                .pattern("SSS")
                .define('X', Items.GLASS_PANE)
                .define('S', ModItems.SCALE_FABRIC.get())
                .unlockedBy(getHasName(ModItems.SCALE_FABRIC.get()), has(ModItems.SCALE_FABRIC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SWIM_SUIT_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SCALE_FABRIC.get())
                .unlockedBy(getHasName(ModItems.SCALE_FABRIC.get()), has(ModItems.SCALE_FABRIC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SWIM_SUIT_LEGGINS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SCALE_FABRIC.get())
                .unlockedBy(getHasName(ModItems.SCALE_FABRIC.get()), has(ModItems.SCALE_FABRIC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SWIM_SUIT_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SCALE_FABRIC.get())
                .unlockedBy(getHasName(ModItems.SCALE_FABRIC.get()), has(ModItems.SCALE_FABRIC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BANCA_DE_PEIXE.get())
                .pattern("SSS")
                .pattern("SXS")
                .pattern("SSS")
                .define('S', ModBlocks.AZULEJO_AZUL.get())
                .define('X', Items.CRAFTING_TABLE)
                .unlockedBy(getHasName(ModBlocks.AZULEJO_AZUL.get()), has(ModBlocks.AZULEJO_AZUL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK.get())
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .define('S', Items.JUKEBOX)
                .define('X', Items.OAK_PLANKS)
                .unlockedBy(getHasName(Items.JUKEBOX), has(Items.JUKEBOX))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CEVADA_BREAD.get())
                .pattern("XXX")
                .define('X', ModItems.CEVADA.get())
                .unlockedBy(getHasName(ModItems.CEVADA.get()), has(ModItems.CEVADA.get()))
                .save(pWriter);

    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, ParabensJevinha.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
