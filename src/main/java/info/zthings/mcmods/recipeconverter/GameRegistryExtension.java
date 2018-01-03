package info.zthings.mcmods.recipeconverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.CraftingHelper.ShapedPrimer;
import net.minecraftforge.registries.IForgeRegistryEntry;

public abstract class GameRegistryExtension {
	public enum Type {
		BLOCK, ITEM;
	}
	
	public static void addRecipe(IRecipe recipe) {
		//STUB
		System.out.println("Adding general recipe: " + recipe.getIngredients() + " -> " + recipe.getRecipeOutput().getCount() + "x" + recipe.getRecipeOutput().getItem().getUnlocalizedName());
	}
	
	public static IRecipe addShapedRecipe(ItemStack output, Object ... params) {
		//STUB
		System.out.println("Adding shaped recipe: " + Arrays.toString(params) + " -> " + output.getCount() + "x" + output.getItem().getUnlocalizedName());
		
		ShapedPrimer primer = CraftingHelper.parseShaped(params);
		String group = "test"; //STUB
        return new ShapedRecipes(group == null ? "" : group.toString(), primer.width, primer.height, primer.input, output);
	}
	public static void addRecipe(ItemStack output, Object ... params) { addShapedRecipe(output, params); }
	
	public static void addShapelessRecipe(ItemStack output, Object ... params) {
		//STUB
		System.out.println("Adding shapeless recipe: " + Arrays.toString(params) + " -> " + output.getCount() + "x" + output.getItem().getUnlocalizedName());
	}
	
	public static <K extends IForgeRegistryEntry<IRecipe>> K register(K recipe, ResourceLocation location) {
		//STUB
		System.out.println("Adding a '" + recipe.getRegistryType().getSimpleName().toLowerCase().replace("recipe", "") + "' recipe: " + location.toString());
		return recipe;
	}
}
