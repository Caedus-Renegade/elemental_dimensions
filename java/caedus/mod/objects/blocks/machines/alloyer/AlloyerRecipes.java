package caedus.mod.objects.blocks.machines.alloyer;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class AlloyerRecipes 
{	
	private static final AlloyerRecipes INSTANCE = new AlloyerRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static AlloyerRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private AlloyerRecipes() 
	{
		addAlloyerRecipe(new ItemStack(ItemInit.COPPER_DUST), new ItemStack(ItemInit.ZINC_DUST), new ItemStack(ItemInit.BRASS_INGOT, 2), 1.0F);
		addAlloyerRecipe(new ItemStack(ItemInit.COPPER_DUST), new ItemStack(ItemInit.TIN_DUST), new ItemStack(ItemInit.BRONZE_INGOT, 2), 3.0F);
	}

	
	public void addAlloyerRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getAlloyerResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getAlloyerResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getAlloyerExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}