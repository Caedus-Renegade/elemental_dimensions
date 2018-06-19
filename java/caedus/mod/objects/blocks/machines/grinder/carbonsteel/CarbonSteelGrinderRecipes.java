package caedus.mod.objects.blocks.machines.grinder.carbonsteel;

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

public class CarbonSteelGrinderRecipes {
	
	private static final CarbonSteelGrinderRecipes INSTANCE = new CarbonSteelGrinderRecipes();
    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static CarbonSteelGrinderRecipes getInstance() 
	{
		return INSTANCE;
	}
	
	private CarbonSteelGrinderRecipes()
	{
// 1
		this.addCarbonSteelGrinderRecipe(new ItemStack(Blocks.STONE), new ItemStack(Blocks.GRAVEL), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.SAND), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Blocks.STONEBRICK), new ItemStack(Blocks.COBBLESTONE), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Items.COAL), new ItemStack(ItemInit.coal_dust, 2), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.tin_ore), new ItemStack(ItemInit.tin_dust, 2), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.tin_ingot), new ItemStack(ItemInit.tin_dust), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.zinc_ore), new ItemStack(ItemInit.zinc_dust, 2), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.zinc_ingot), new ItemStack(ItemInit.zinc_dust), 1);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.BRASS_INGOT), new ItemStack(ItemInit.BRASS_DUST), 1);
// 2		
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.infuscolium_ore), new ItemStack(ItemInit.infuscolium_dust, 2), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.infuscolium_ingot), new ItemStack(ItemInit.infuscolium_dust), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.luminite_ore), new ItemStack(ItemInit.luminite_dust, 2), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.luminite_ingot), new ItemStack(ItemInit.luminite_dust), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.ELECTRUM_INGOT), new ItemStack(ItemInit.ELECTRUM_DUST), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.copper_ore), new ItemStack(ItemInit.COPPER_DUST, 2), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.COPPER_INGOT), new ItemStack(ItemInit.COPPER_DUST), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.ignatius_ore), new ItemStack(ItemInit.IGNATIUS_DUST, 2), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.IGNATIUS_INGOT), new ItemStack(ItemInit.IGNATIUS_DUST), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.prometheum_ore), new ItemStack(ItemInit.PROMETHEUM_DUST, 2), 2);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.PROMETHEUM_INGOT), new ItemStack(ItemInit.PROMETHEUM_DUST), 2);
// 3
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.manganese_ore), new ItemStack(ItemInit.manganese_dust, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.manganese_ingot), new ItemStack(ItemInit.manganese_dust), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.adluorite_ore), new ItemStack(ItemInit.adluorite_dust, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.adluorite_ingot), new ItemStack(ItemInit.adluorite_dust), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.lead_ore), new ItemStack(ItemInit.lead_dust, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.lead_ingot), new ItemStack(ItemInit.lead_dust), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(ItemInit.GOLD_DUST, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Items.GOLD_INGOT), new ItemStack(ItemInit.GOLD_DUST), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.platinum_ore), new ItemStack(ItemInit.PLATINUM_DUST, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.PLATINUM_INGOT), new ItemStack(ItemInit.PLATINUM_DUST), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.BRONZE_INGOT), new ItemStack(ItemInit.BRONZE_DUST), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(ItemInit.IRON_DUST, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(ItemInit.IRON_DUST), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.dark_iron_ore), new ItemStack(ItemInit.dark_iron_dust, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.dark_iron_ingot), new ItemStack(ItemInit.dark_iron_dust), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.shadow_iron_ore), new ItemStack(ItemInit.SHADOW_IRON_DUST, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.SHADOW_IRON_INGOT), new ItemStack(ItemInit.SHADOW_IRON_DUST), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.steel_ingot), new ItemStack(ItemInit.steel_dust), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.shadow_steel_ingot), new ItemStack(ItemInit.shadow_steel_dust), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.amber), new ItemStack(ItemInit.amber_dust, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(Items.EMERALD), new ItemStack(ItemInit.emerald_dust, 2), 3);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.sapphire), new ItemStack(ItemInit.sapphire_dust, 2), 3);
//		this.addIronGrinderRecipe(new ItemStack(Items.DIAMOND), new ItemStack(ItemInit.diamond_dust, 2), 3);

//4
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.rubracium_ore), new ItemStack(ItemInit.rubracium_dust, 2), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.rubracium_ingot), new ItemStack(ItemInit.rubracium_dust), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.meutoite_ore), new ItemStack(ItemInit.meutoite_dust, 2), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.meutoite_ingot), new ItemStack(ItemInit.meutoite_dust), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.midasium_ore), new ItemStack(ItemInit.midasium_dust, 2), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.midasium_ingot), new ItemStack(ItemInit.midasium_dust), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.vyroxeres_ore), new ItemStack(ItemInit.vyroxeres_dust, 2), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.vyroxeres_ingot), new ItemStack(ItemInit.vyroxeres_dust), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.ceruclase_ore), new ItemStack(ItemInit.ceruclase_dust, 2), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.ceruclase_ingot), new ItemStack(ItemInit.ceruclase_dust), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(BlockInit.oureclase_ore), new ItemStack(ItemInit.oureclase_dust, 2), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.oureclase_ingot), new ItemStack(ItemInit.oureclase_dust), 4);
		this.addCarbonSteelGrinderRecipe(new ItemStack(ItemInit.carbon_steel_ingot), new ItemStack(ItemInit.carbon_steel_dust), 4);
	}
	
	public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
	{
		this.addSmelting(Item.getItemFromBlock(input), stack, experience);
	}
	
	public void addSmelting(Item input, ItemStack stack, float experience)
	{
		this.addCarbonSteelGrinderRecipe(new ItemStack(input, 1, 32767), stack, experience);
	}
	
	public void addCarbonSteelGrinderRecipe(ItemStack input1, ItemStack result, float experience)
	{
		if (getCarbonSteelGrinderResult(input1) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getCarbonSteelGrinderResult(ItemStack input1) //removed input2 from tutorial
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
	
	public float getCarbonSteelGrinderExperience(ItemStack stack)
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