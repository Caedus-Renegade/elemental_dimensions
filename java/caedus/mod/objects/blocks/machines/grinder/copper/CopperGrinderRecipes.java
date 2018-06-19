package caedus.mod.objects.blocks.machines.grinder.copper;

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

public class CopperGrinderRecipes {
	
	private static final CopperGrinderRecipes INSTANCE = new CopperGrinderRecipes();
	//private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static CopperGrinderRecipes getInstance() 
	{
		return INSTANCE;
	}
	
	private CopperGrinderRecipes()
	{
// 1
		this.addCopperGrinderRecipe(new ItemStack(Blocks.STONE), new ItemStack(Blocks.GRAVEL), 1);
		this.addCopperGrinderRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.SAND), 1);
		this.addCopperGrinderRecipe(new ItemStack(Blocks.STONEBRICK), new ItemStack(Blocks.COBBLESTONE), 1);
		this.addCopperGrinderRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT), 1);
		this.addCopperGrinderRecipe(new ItemStack(Items.COAL), new ItemStack(ItemInit.coal_dust, 2), 1);
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.tin_ore), new ItemStack(ItemInit.tin_dust, 2), 1);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.tin_ingot), new ItemStack(ItemInit.tin_dust), 1);
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.zinc_ore), new ItemStack(ItemInit.zinc_dust, 2), 1);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.zinc_ingot), new ItemStack(ItemInit.zinc_dust), 1);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.BRASS_INGOT), new ItemStack(ItemInit.BRASS_DUST), 1);
// 2		
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.infuscolium_ore), new ItemStack(ItemInit.infuscolium_dust, 2), 2);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.infuscolium_ingot), new ItemStack(ItemInit.infuscolium_dust), 2);
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.luminite_ore), new ItemStack(ItemInit.luminite_dust, 2), 2);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.luminite_ingot), new ItemStack(ItemInit.luminite_dust), 2);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.ELECTRUM_INGOT), new ItemStack(ItemInit.ELECTRUM_DUST), 2);
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.copper_ore), new ItemStack(ItemInit.COPPER_DUST, 2), 2);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.COPPER_INGOT), new ItemStack(ItemInit.COPPER_DUST), 2);
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.ignatius_ore), new ItemStack(ItemInit.IGNATIUS_DUST, 2), 2);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.IGNATIUS_INGOT), new ItemStack(ItemInit.IGNATIUS_DUST), 2);
		this.addCopperGrinderRecipe(new ItemStack(BlockInit.prometheum_ore), new ItemStack(ItemInit.PROMETHEUM_DUST, 2), 2);
		this.addCopperGrinderRecipe(new ItemStack(ItemInit.PROMETHEUM_INGOT), new ItemStack(ItemInit.PROMETHEUM_DUST), 2);
		
	}
	
	public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
	{
		this.addSmelting(Item.getItemFromBlock(input), stack, experience);
	}
	
	public void addSmelting(Item input, ItemStack stack, float experience)
	{
		this.addCopperGrinderRecipe(new ItemStack(input, 1, 32767), stack, experience);
	}
	
	public void addCopperGrinderRecipe(ItemStack input1, ItemStack result, float experience)
	{
		//if (getCopperGrinderResult(input1, input2) != ItemStack.EMPTY) return;
		if (getCopperGrinderResult(input1) != ItemStack.EMPTY) return;
		//this.smeltingList.put(input1, input2, result);
		this.smeltingList.put(input1, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getCopperGrinderResult(ItemStack input1) //removed input2 from tutorial
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
	
	public float getCopperGrinderExperience(ItemStack stack)
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