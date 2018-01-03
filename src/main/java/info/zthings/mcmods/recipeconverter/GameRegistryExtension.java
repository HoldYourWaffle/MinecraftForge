package info.zthings.mcmods.recipeconverter;

import java.util.Arrays;

import org.apache.logging.log4j.core.Logger;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.registries.IForgeRegistryEntry;

public abstract class GameRegistryExtension {
	public enum Type {
		BLOCK, ITEM;
	}
	
	public static void addRecipe(IRecipe p1) {
		//STUB
		System.out.println("Adding general recipe: " + p1.getIngredients() + " -> " + p1.getRecipeOutput().getCount() + "x" + p1.getRecipeOutput().getItem().getUnlocalizedName());
	}
	
	public static IRecipe addShapedRecipe(ItemStack p0, Object... p1) {
		//STUB
		System.out.println("Adding shaped recipe: " + Arrays.toString(p1) + " -> " + p0.getCount() + "x" + p0.getItem().getUnlocalizedName());
		return null;
	}
	public static void addRecipe(ItemStack p0, Object... p1) { addShapedRecipe(p0, p1); }
	
	public static void addShapelessRecipe(ItemStack p0, Object... p1) {
		//STUB
		System.out.println("Adding shapeless recipe: " + Arrays.toString(p1) + " -> " + p0.getCount() + "x" + p0.getItem().getUnlocalizedName());
	}
	
	public static <K extends IForgeRegistryEntry<IRecipe>> K register(K p0, ResourceLocation p1) {
		//STUB
		System.out.println("Adding a '" + p0.getRegistryType().getSimpleName().toLowerCase().replace("recipe", "") + "' recipe: " + p1.toString());
		return p0;
	}
}
