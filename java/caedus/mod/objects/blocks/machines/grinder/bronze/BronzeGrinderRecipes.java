package caedus.mod.objects.blocks.machines.grinder.bronze;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BronzeGrinderRecipes {
	
	private static final BronzeGrinderRecipes INSTANCE = new BronzeGrinderRecipes();
    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static BronzeGrinderRecipes getInstance() 
	{
		return INSTANCE;
	}
	
	private BronzeGrinderRecipes()
	{
// 1
		this.addBronzeGrinderRecipe(new ItemStack(Blocks.STONE), new ItemStack(Blocks.GRAVEL), 1);
		this.addBronzeGrinderRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.SAND), 1);
		this.addBronzeGrinderRecipe(new ItemStack(Blocks.STONEBRICK), new ItemStack(Blocks.COBBLESTONE), 1);
		this.addBronzeGrinderRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT), 1);
		this.addBronzeGrinderRecipe(new ItemStack(Items.COAL), new ItemStack(ItemInit.coal_dust, 2), 1);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.tin_ore), new ItemStack(ItemInit.tin_dust, 2), 1);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.tin_ingot), new ItemStack(ItemInit.tin_dust), 1);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.zinc_ore), new ItemStack(ItemInit.zinc_dust, 2), 1);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.zinc_ingot), new ItemStack(ItemInit.zinc_dust), 1);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.BRASS_INGOT), new ItemStack(ItemInit.BRASS_DUST), 1);
// 2		
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.infuscolium_ore), new ItemStack(ItemInit.infuscolium_dust, 2), 2);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.infuscolium_ingot), new ItemStack(ItemInit.infuscolium_dust), 2);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.luminite_ore), new ItemStack(ItemInit.luminite_dust, 2), 2);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.luminite_ingot), new ItemStack(ItemInit.luminite_dust), 2);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.ELECTRUM_INGOT), new ItemStack(ItemInit.ELECTRUM_DUST), 2);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.copper_ore), new ItemStack(ItemInit.COPPER_DUST, 2), 2);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.COPPER_INGOT), new ItemStack(ItemInit.COPPER_DUST), 2);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.ignatius_ore), new ItemStack(ItemInit.IGNATIUS_DUST, 2), 2);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.IGNATIUS_INGOT), new ItemStack(ItemInit.IGNATIUS_DUST), 2);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.prometheum_ore), new ItemStack(ItemInit.PROMETHEUM_DUST, 2), 2);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.PROMETHEUM_INGOT), new ItemStack(ItemInit.PROMETHEUM_DUST), 2);
// 3
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.manganese_ore), new ItemStack(ItemInit.manganese_dust, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.manganese_ingot), new ItemStack(ItemInit.manganese_dust), 3);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.adluorite_ore), new ItemStack(ItemInit.adluorite_dust, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.adluorite_ingot), new ItemStack(ItemInit.adluorite_dust), 3);
		this.addBronzeGrinderRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(ItemInit.GOLD_DUST, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(Items.GOLD_INGOT), new ItemStack(ItemInit.GOLD_DUST), 3);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.platinum_ore), new ItemStack(ItemInit.PLATINUM_DUST, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.PLATINUM_INGOT), new ItemStack(ItemInit.PLATINUM_DUST), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.BRONZE_INGOT), new ItemStack(ItemInit.BRONZE_DUST), 3);
		this.addBronzeGrinderRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(ItemInit.IRON_DUST, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(ItemInit.IRON_DUST), 3);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.dark_iron_ore), new ItemStack(ItemInit.dark_iron_dust, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.dark_iron_ingot), new ItemStack(ItemInit.dark_iron_dust), 3);
		this.addBronzeGrinderRecipe(new ItemStack(BlockInit.shadow_iron_ore), new ItemStack(ItemInit.SHADOW_IRON_DUST, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.SHADOW_IRON_INGOT), new ItemStack(ItemInit.SHADOW_IRON_DUST), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.steel_ingot), new ItemStack(ItemInit.steel_dust), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.shadow_steel_ingot), new ItemStack(ItemInit.shadow_steel_dust), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.amber), new ItemStack(ItemInit.amber_dust, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(Items.EMERALD), new ItemStack(ItemInit.emerald_dust, 2), 3);
		this.addBronzeGrinderRecipe(new ItemStack(ItemInit.sapphire), new ItemStack(ItemInit.sapphire_dust, 2), 3);
	}
	
	public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
	{
		this.addSmelting(Item.getItemFromBlock(input), stack, experience);
	}
	
	public void addSmelting(Item input, ItemStack stack, float experience)
	{
		this.addBronzeGrinderRecipe(new ItemStack(input, 1, 32767), stack, experience);
	}
	
	public void addBronzeGrinderRecipe(ItemStack input1, ItemStack result, float experience)
	{
		if (getBronzeGrinderResult(input1) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getBronzeGrinderResult(ItemStack input1) //removed input2 from tutorial
	{
		for (Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet())
        {
            if (this.compareItemStacks(input1, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Map<ItemStack, ItemStack> getSmeltingList()
	{
		return this.smeltingList;
	}
	
	public float getBronzeGrinderExperience(ItemStack stack)
	{
		float ret = stack.getItem().getSmeltingExperience(stack);
		if (ret != -1) return ret;
		
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
		{
			if (this.compareItemStacks(stack, entry.getKey()))
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}

}