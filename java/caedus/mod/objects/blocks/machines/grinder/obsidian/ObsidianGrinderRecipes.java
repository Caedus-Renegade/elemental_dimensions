package caedus.mod.objects.blocks.machines.grinder.obsidian;

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

public class ObsidianGrinderRecipes {
	
	private static final ObsidianGrinderRecipes INSTANCE = new ObsidianGrinderRecipes();
    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static ObsidianGrinderRecipes getInstance() 
	{
		return INSTANCE;
	}
	
	private ObsidianGrinderRecipes()
	{
// 1
		this.addObsidianGrinderRecipe(new ItemStack(Blocks.STONE), new ItemStack(Blocks.GRAVEL), 1);
		this.addObsidianGrinderRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.SAND), 1);
		this.addObsidianGrinderRecipe(new ItemStack(Blocks.STONEBRICK), new ItemStack(Blocks.COBBLESTONE), 1);
		this.addObsidianGrinderRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT), 1);
		this.addObsidianGrinderRecipe(new ItemStack(Items.COAL), new ItemStack(ItemInit.coal_dust, 2), 1);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.tin_ore), new ItemStack(ItemInit.tin_dust, 2), 1);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.tin_ingot), new ItemStack(ItemInit.tin_dust), 1);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.zinc_ore), new ItemStack(ItemInit.zinc_dust, 2), 1);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.zinc_ingot), new ItemStack(ItemInit.zinc_dust), 1);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.BRASS_INGOT), new ItemStack(ItemInit.BRASS_DUST), 1);
// 2		
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.infuscolium_ore), new ItemStack(ItemInit.infuscolium_dust, 2), 2);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.infuscolium_ingot), new ItemStack(ItemInit.infuscolium_dust), 2);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.luminite_ore), new ItemStack(ItemInit.luminite_dust, 2), 2);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.luminite_ingot), new ItemStack(ItemInit.luminite_dust), 2);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.ELECTRUM_INGOT), new ItemStack(ItemInit.ELECTRUM_DUST), 2);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.copper_ore), new ItemStack(ItemInit.COPPER_DUST, 2), 2);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.COPPER_INGOT), new ItemStack(ItemInit.COPPER_DUST), 2);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.ignatius_ore), new ItemStack(ItemInit.IGNATIUS_DUST, 2), 2);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.IGNATIUS_INGOT), new ItemStack(ItemInit.IGNATIUS_DUST), 2);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.prometheum_ore), new ItemStack(ItemInit.PROMETHEUM_DUST, 2), 2);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.PROMETHEUM_INGOT), new ItemStack(ItemInit.PROMETHEUM_DUST), 2);
// 3
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.manganese_ore), new ItemStack(ItemInit.manganese_dust, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.manganese_ingot), new ItemStack(ItemInit.manganese_dust), 3);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.adluorite_ore), new ItemStack(ItemInit.adluorite_dust, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.adluorite_ingot), new ItemStack(ItemInit.adluorite_dust), 3);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.lead_ore), new ItemStack(ItemInit.lead_dust, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.lead_ingot), new ItemStack(ItemInit.lead_dust), 3);
		this.addObsidianGrinderRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(ItemInit.GOLD_DUST, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(Items.GOLD_INGOT), new ItemStack(ItemInit.GOLD_DUST), 3);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.platinum_ore), new ItemStack(ItemInit.PLATINUM_DUST, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.PLATINUM_INGOT), new ItemStack(ItemInit.PLATINUM_DUST), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.BRONZE_INGOT), new ItemStack(ItemInit.BRONZE_DUST), 3);
		this.addObsidianGrinderRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(ItemInit.IRON_DUST, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(ItemInit.IRON_DUST), 3);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.dark_iron_ore), new ItemStack(ItemInit.dark_iron_dust, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.dark_iron_ingot), new ItemStack(ItemInit.dark_iron_dust), 3);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.shadow_iron_ore), new ItemStack(ItemInit.SHADOW_IRON_DUST, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.SHADOW_IRON_INGOT), new ItemStack(ItemInit.SHADOW_IRON_DUST), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.steel_ingot), new ItemStack(ItemInit.steel_dust), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.shadow_steel_ingot), new ItemStack(ItemInit.shadow_steel_dust), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.amber), new ItemStack(ItemInit.amber_dust, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(Items.EMERALD), new ItemStack(ItemInit.emerald_dust, 2), 3);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.sapphire), new ItemStack(ItemInit.sapphire_dust, 2), 3);
//		this.addIronGrinderRecipe(new ItemStack(Items.DIAMOND), new ItemStack(ItemInit.diamond_dust, 2), 3);

//4
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.rubracium_ore), new ItemStack(ItemInit.rubracium_dust, 2), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.rubracium_ingot), new ItemStack(ItemInit.rubracium_dust), 4);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.meutoite_ore), new ItemStack(ItemInit.meutoite_dust, 2), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.meutoite_ingot), new ItemStack(ItemInit.meutoite_dust), 4);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.midasium_ore), new ItemStack(ItemInit.midasium_dust, 2), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.midasium_ingot), new ItemStack(ItemInit.midasium_dust), 4);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.vyroxeres_ore), new ItemStack(ItemInit.vyroxeres_dust, 2), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.vyroxeres_ingot), new ItemStack(ItemInit.vyroxeres_dust), 4);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.ceruclase_ore), new ItemStack(ItemInit.ceruclase_dust, 2), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.ceruclase_ingot), new ItemStack(ItemInit.ceruclase_dust), 4);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.oureclase_ore), new ItemStack(ItemInit.oureclase_dust, 2), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.oureclase_ingot), new ItemStack(ItemInit.oureclase_dust), 4);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.carbon_steel_ingot), new ItemStack(ItemInit.carbon_steel_dust), 4);
//5
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.astral_silver_ore), new ItemStack(ItemInit.astral_silver_dust, 2), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.astral_silver_ingot), new ItemStack(ItemInit.astral_silver_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.carmot_ore), new ItemStack(ItemInit.carmot_dust, 2), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.carmot_ingot), new ItemStack(ItemInit.carmot_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.kalendrite_ore), new ItemStack(ItemInit.kalendrite_dust, 2), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.kalendrite_ingot), new ItemStack(ItemInit.kalendrite_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.inolashite_ingot), new ItemStack(ItemInit.inolashite_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.amordrine_ingot), new ItemStack(ItemInit.amordrine_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.mythril_ore), new ItemStack(ItemInit.mythril_dust, 2), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.mythril_ingot), new ItemStack(ItemInit.mythril_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.quicksilver_ingot), new ItemStack(ItemInit.quicksilver_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.haderoth_ingot), new ItemStack(ItemInit.haderoth_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(ItemInit.endersteel_ingot), new ItemStack(ItemInit.endersteel_dust), 5);
		this.addObsidianGrinderRecipe(new ItemStack(BlockInit.wootz_ore), new ItemStack(ItemInit.wootz_dust, 2), 5);
		
	}
	
	public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
	{
		this.addSmelting(Item.getItemFromBlock(input), stack, experience);
	}
	
	public void addSmelting(Item input, ItemStack stack, float experience)
	{
		this.addObsidianGrinderRecipe(new ItemStack(input, 1, 32767), stack, experience);
	}
	
	public void addObsidianGrinderRecipe(ItemStack input1, ItemStack result, float experience)
	{
		if (getObsidianGrinderResult(input1) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getObsidianGrinderResult(ItemStack input1) //removed input2 from tutorial
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
	
	public float getObsidianGrinderExperience(ItemStack stack)
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