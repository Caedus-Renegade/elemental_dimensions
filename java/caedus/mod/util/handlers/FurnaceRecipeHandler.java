package caedus.mod.util.handlers;

import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeHandler {
	
	public FurnaceRecipeHandler()
	{
		
	}
		public static void addRecipes() 
		{
			GameRegistry.addSmelting(ItemInit.BRASS_DUST, new ItemStack(ItemInit.BRASS_INGOT), 1);
			GameRegistry.addSmelting(BlockInit.SILVER_ORE, new ItemStack(ItemInit.SILVER_INGOT), 1);
			GameRegistry.addSmelting(ItemInit.SILVER_DUST, new ItemStack(ItemInit.SILVER_INGOT), 1);
			GameRegistry.addSmelting(ItemInit.ELECTRUM_DUST, new ItemStack(ItemInit.ELECTRUM_INGOT), 2);
			GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.COPPER_INGOT), 2);
			GameRegistry.addSmelting(ItemInit.COPPER_DUST, new ItemStack(ItemInit.COPPER_INGOT), 2);
			GameRegistry.addSmelting(BlockInit.IGNATIUS_ORE, new ItemStack(ItemInit.IGNATIUS_INGOT), 2);
			GameRegistry.addSmelting(ItemInit.IGNATIUS_DUST, new ItemStack(ItemInit.IGNATIUS_INGOT), 2);
			GameRegistry.addSmelting(ItemInit.BRONZE_DUST, new ItemStack(ItemInit.BRONZE_INGOT), 3);
			GameRegistry.addSmelting(BlockInit.ELEMENTIUM_ORE, new ItemStack(ItemInit.ELEMENTIUM_INGOT), 9);
		}
	}