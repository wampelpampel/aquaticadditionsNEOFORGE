package com.wampi.aq.datagen;

import com.wampi.aq.AquaticAdditions;
import com.wampi.aq.block.AQBlocks;
import com.wampi.aq.item.AQItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AQRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public AQRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQBlocks.TURTLE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', AQItems.TURTLE_INGOT.get())
                .unlockedBy("has_turtle_ingot", has(AQItems.TURTLE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQBlocks.SCUTE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.TURTLE_SCUTE)
                .unlockedBy("has_scute", has(Items.TURTLE_SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_CHESTPLATE)
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.TURTLE_SCUTE)
                .unlockedBy("has_scute", has(Items.TURTLE_SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_LEGGINGS)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', Items.TURTLE_SCUTE)
                .unlockedBy("has_scute", has(Items.TURTLE_SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_BOOTS)
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .define('B', Items.TURTLE_SCUTE)
                .unlockedBy("has_scute", has(Items.TURTLE_SCUTE)).save(recipeOutput);
/*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_HELMET)
                .pattern("III")
                .pattern("IHI")
                .pattern("   ")
                .define('I', AQItems.TURTLE_INGOT)
                .define('H', Items.TURTLE_HELMET)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_CHESTPLATE)
                .pattern("IPI")
                .pattern("ICI")
                .pattern("III")
                .define('I', AQItems.TURTLE_INGOT)
                .define('C', Items.CONDUIT)
                .define('P', AQItems.TURTLE_CHESTPLATE)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_LEGGINGS)
                .pattern("III")
                .pattern("IHI")
                .pattern("I I")
                .define('I', AQItems.TURTLE_INGOT)
                .define('H', AQItems.TURTLE_LEGGINGS)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_BOOTS)
                .pattern("   ")
                .pattern("I I")
                .pattern("IHI")
                .define('I', AQItems.TURTLE_INGOT)
                .define('H', AQItems.TURTLE_BOOTS)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AQItems.TURTLE_INGOT.get(), 9)
                .requires(AQBlocks.TURTLE_BLOCK)
                .unlockedBy("has_turtle_ingot", has(AQItems.TURTLE_INGOT)).save(recipeOutput);

*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AQItems.TURTLE_INGOT.get(), 1)
                .requires(Items.PRISMARINE_SHARD)
                .requires(Items.PRISMARINE_CRYSTALS)
                .requires(Items.GOLD_INGOT)
                .requires(Items.DIAMOND)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE)).save(recipeOutput, "aq:turtle_ingot_2");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()), // Template
                        Ingredient.of(Items.TURTLE_HELMET),                          // Base
                        Ingredient.of(AQItems.TURTLE_INGOT.get()),                   // Addition
                        RecipeCategory.COMBAT,
                        AQItems.TURTLE_MASTER_HELMET.get()                           // Result
                )
                .unlocks("has_template", has(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()))
                .unlocks("has_addition", has(AQItems.TURTLE_INGOT.get()))
                .unlocks("has_base", has(AQItems.TURTLE_HELMET.get()))
                .save(recipeOutput, "aq:turtle_master_helmet_via_smithing");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()),
                        Ingredient.of(AQItems.TURTLE_CHESTPLATE.get()),
                        Ingredient.of(AQItems.TURTLE_INGOT.get()),
                        RecipeCategory.COMBAT,
                        AQItems.TURTLE_MASTER_CHESTPLATE.get()
                )
                .unlocks("has_template", has(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()))
                .unlocks("has_addition", has(AQItems.TURTLE_INGOT.get()))
                .unlocks("has_base", has(AQItems.TURTLE_CHESTPLATE.get()))
                .save(recipeOutput, "aq:turtle_master_chestplate_via_smithing");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()),
                        Ingredient.of(AQItems.TURTLE_LEGGINGS.get()),
                        Ingredient.of(AQItems.TURTLE_INGOT.get()),
                        RecipeCategory.COMBAT,
                        AQItems.TURTLE_MASTER_LEGGINGS.get()
                )
                .unlocks("has_template", has(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()))
                .unlocks("has_addition", has(AQItems.TURTLE_INGOT.get()))
                .unlocks("has_base", has(AQItems.TURTLE_LEGGINGS.get()))
                .save(recipeOutput, "aq:turtle_master_leggings_via_smithing");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()),
                        Ingredient.of(AQItems.TURTLE_BOOTS.get()),
                        Ingredient.of(AQItems.TURTLE_INGOT.get()),
                        RecipeCategory.COMBAT,
                        AQItems.TURTLE_MASTER_BOOTS.get()
                )
                .unlocks("has_template", has(AQItems.TURTLE_MASTER_CRAFTING_UPGRADE.get()))
                .unlocks("has_addition", has(AQItems.TURTLE_INGOT.get()))
                .unlocks("has_base", has(AQItems.TURTLE_BOOTS.get()))
                .save(recipeOutput, "aq:turtle_master_boots_via_smithing");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, AquaticAdditions.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
