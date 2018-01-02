package info.zthings.mcmods.recipeconverter;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public abstract class GameRegistryExtension {
	public enum Type {
		BLOCK, ITEM;
	}
	
	public static void addRecipe(IRecipe p1) {
		//STUB
	}
	
	public static void addRecipe(ItemStack p0, Object... p1) {
		//STUB
	}
	
	public static IRecipe addShapedRecipe(ItemStack p0, Object... p1) {
		//STUB
		return null;
	}
	
	public static void addShapelessRecipe(ItemStack p0, Object... p1) {
		//STUB
	}
	
	public static <K extends IForgeRegistryEntry<?>> K register(K p0, ResourceLocation p1) {
		//STUB
		return p0;
	}
}
