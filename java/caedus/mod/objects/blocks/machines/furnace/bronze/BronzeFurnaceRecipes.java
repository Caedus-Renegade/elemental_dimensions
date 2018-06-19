package caedus.mod.objects.blocks.machines.furnace.bronze;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class BronzeFurnaceRecipes {
	
	private static final BronzeFurnaceRecipes INSTANCE = new BronzeFurnaceRecipes();
    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static BronzeFurnaceRecipes getInstance() 
	{
		return INSTANCE;
	}
	
	private BronzeFurnaceRecipes()
	{
        this.addSmeltingRecipeForBlock(Blocks.IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7F);
        this.addSmeltingRecipeForBlock(Blocks.GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1.0F);
        this.addSmeltingRecipeForBlock(Blocks.DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1.0F);
        this.addSmeltingRecipeForBlock(Blocks.SAND, new ItemStack(Blocks.GLASS), 0.1F);
        this.addSmelting(Items.PORKCHOP, new ItemStack(Items.COOKED_PORKCHOP), 0.35F);
        this.addSmelting(Items.BEEF, new ItemStack(Items.COOKED_BEEF), 0.35F);
        this.addSmelting(Items.CHICKEN, new ItemStack(Items.COOKED_CHICKEN), 0.35F);
        this.addSmelting(Items.RABBIT, new ItemStack(Items.COOKED_RABBIT), 0.35F);
        this.addSmelting(Items.MUTTON, new ItemStack(Items.COOKED_MUTTON), 0.35F);
        this.addSmeltingRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(Blocks.STONE), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.DEFAULT_META), new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.CRACKED_META), 0.1F);
        this.addSmelting(Items.CLAY_BALL, new ItemStack(Items.BRICK), 0.3F);
        this.addSmeltingRecipeForBlock(Blocks.CLAY, new ItemStack(Blocks.HARDENED_CLAY), 0.35F);
        this.addSmeltingRecipeForBlock(Blocks.CACTUS, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
        this.addSmeltingRecipeForBlock(Blocks.LOG, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addSmeltingRecipeForBlock(Blocks.LOG2, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addSmeltingRecipeForBlock(Blocks.EMERALD_ORE, new ItemStack(Items.EMERALD), 1.0F);
        this.addSmelting(Items.POTATO, new ItemStack(Items.BAKED_POTATO), 0.35F);
        this.addSmeltingRecipeForBlock(Blocks.NETHERRACK, new ItemStack(Items.NETHERBRICK), 0.1F);
        this.addSmelting(Items.CHORUS_FRUIT, new ItemStack(Items.CHORUS_FRUIT_POPPED), 0.1F);

        for (ItemFishFood.FishType itemfishfood$fishtype : ItemFishFood.FishType.values())
        {
            if (itemfishfood$fishtype.canCook())
            {
                this.addBronzeFurnaceRecipe(new ItemStack(Items.FISH, 1, itemfishfood$fishtype.getMetadata()), new ItemStack(Items.COOKED_FISH, 1, itemfishfood$fishtype.getMetadata()), 0.35F);
            }
        }
        this.addSmeltingRecipeForBlock(Blocks.COAL_ORE, new ItemStack(Items.COAL), 0.1F);
        this.addSmelting(Items.CHAINMAIL_HELMET, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.CHAINMAIL_CHESTPLATE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.CHAINMAIL_LEGGINGS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.CHAINMAIL_BOOTS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_PICKAXE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_SHOVEL, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_AXE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_HOE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_SWORD, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_HELMET, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_CHESTPLATE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_LEGGINGS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_BOOTS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.IRON_HORSE_ARMOR, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_PICKAXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_SHOVEL, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_AXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_HOE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_SWORD, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_HELMET, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_CHESTPLATE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_LEGGINGS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_BOOTS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addSmelting(Items.GOLDEN_HORSE_ARMOR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.WHITE.getMetadata()), new ItemStack(Blocks.WHITE_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.ORANGE.getMetadata()), new ItemStack(Blocks.ORANGE_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.MAGENTA.getMetadata()), new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIGHT_BLUE.getMetadata()), new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.YELLOW.getMetadata()), new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIME.getMetadata()), new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PINK.getMetadata()), new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GRAY.getMetadata()), new ItemStack(Blocks.GRAY_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.SILVER.getMetadata()), new ItemStack(Blocks.SILVER_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.CYAN.getMetadata()), new ItemStack(Blocks.CYAN_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PURPLE.getMetadata()), new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLUE.getMetadata()), new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BROWN.getMetadata()), new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GREEN.getMetadata()), new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.RED.getMetadata()), new ItemStack(Blocks.RED_GLAZED_TERRACOTTA), 0.1F);
        this.addBronzeFurnaceRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLACK.getMetadata()), new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA), 0.1F);
        this.addSmeltingRecipeForBlock(Blocks.QUARTZ_ORE, new ItemStack(Items.QUARTZ), 0.2F);
        this.addSmeltingRecipeForBlock(Blocks.LAPIS_ORE, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), 0.2F);
        this.addSmeltingRecipeForBlock(Blocks.REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.7F);
		this.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1);
//		this.addSmeltingRecipeForBlock(BlockInit.ash_log, new ItemStack(Items.COAL), 1);
//		this.addSmeltingRecipeForBlock(BlockInit.cocobolo_log, new ItemStack(Items.COAL), 1);
//		this.addSmeltingRecipeForBlock(BlockInit.myrtle_ebony_log, new ItemStack(Items.COAL), 1);
//		this.addSmeltingRecipeForBlock(BlockInit.larch_log, new ItemStack(Items.COAL), 1);
//		this.addSmeltingRecipeForBlock(BlockInit.teak_log, new ItemStack(Items.COAL), 1);
		this.addSmelting(ItemInit.carbon_mesh, new ItemStack(ItemInit.carbon_plate), 1);
		this.addSmeltingRecipeForBlock(BlockInit.tin_ore, new ItemStack(ItemInit.tin_ingot), 1);
		this.addSmelting(ItemInit.tin_dust, new ItemStack(ItemInit.tin_ingot), 1);
		this.addSmeltingRecipeForBlock(BlockInit.zinc_ore, new ItemStack(ItemInit.zinc_ingot), 1);
		this.addSmelting(ItemInit.zinc_dust, new ItemStack(ItemInit.zinc_ingot), 1);
		this.addSmeltingRecipeForBlock(BlockInit.luminite_ore, new ItemStack(ItemInit.luminite_ingot), 1);
		this.addSmelting(ItemInit.luminite_dust, new ItemStack(ItemInit.luminite_ingot), 1);
		this.addSmelting(ItemInit.BRASS_DUST, new ItemStack(ItemInit.BRASS_INGOT), 1);
		this.addSmeltingRecipeForBlock(BlockInit.silver_ore, new ItemStack(ItemInit.SILVER_INGOT), 1);
		this.addSmelting(ItemInit.SILVER_DUST, new ItemStack(ItemInit.SILVER_INGOT), 1);
		this.addSmeltingRecipeForBlock(BlockInit.infuscolium_ore, new ItemStack(ItemInit.infuscolium_ingot), 2);
		this.addSmelting(ItemInit.infuscolium_dust, new ItemStack(ItemInit.infuscolium_ingot), 2);
		this.addSmelting(ItemInit.ELECTRUM_DUST, new ItemStack(ItemInit.ELECTRUM_INGOT), 2);
		this.addSmeltingRecipeForBlock(BlockInit.copper_ore, new ItemStack(ItemInit.COPPER_INGOT), 2);
		this.addSmelting(ItemInit.COPPER_DUST, new ItemStack(ItemInit.COPPER_INGOT), 2);
		this.addSmeltingRecipeForBlock(BlockInit.prometheum_ore, new ItemStack(ItemInit.PROMETHEUM_INGOT), 2);
		this.addSmelting(ItemInit.PROMETHEUM_DUST, new ItemStack(ItemInit.PROMETHEUM_INGOT), 2);
		this.addSmeltingRecipeForBlock(BlockInit.ignatius_ore, new ItemStack(ItemInit.IGNATIUS_INGOT), 2);
		this.addSmelting(ItemInit.IGNATIUS_DUST, new ItemStack(ItemInit.IGNATIUS_INGOT), 2);
		this.addSmeltingRecipeForBlock(BlockInit.manganese_ore, new ItemStack(ItemInit.manganese_ingot), 3);
		this.addSmelting(ItemInit.manganese_dust, new ItemStack(ItemInit.manganese_ingot), 3);
		this.addSmeltingRecipeForBlock(BlockInit.rubracium_ore, new ItemStack(ItemInit.rubracium_ingot), 3);
		this.addSmelting(ItemInit.rubracium_dust, new ItemStack(ItemInit.rubracium_ingot), 3);
		this.addSmeltingRecipeForBlock(BlockInit.adluorite_ore, new ItemStack(ItemInit.adluorite_ingot), 3);
		this.addSmelting(ItemInit.adluorite_dust, new ItemStack(ItemInit.adluorite_ingot), 3);
		this.addSmelting(ItemInit.GOLD_DUST, new ItemStack(Items.GOLD_INGOT), 3);
		this.addSmeltingRecipeForBlock(BlockInit.platinum_ore, new ItemStack(ItemInit.PLATINUM_INGOT), 3);
		this.addSmelting(ItemInit.PLATINUM_DUST, new ItemStack(ItemInit.PLATINUM_INGOT), 3);
		this.addSmeltingRecipeForBlock(BlockInit.lead_ore, new ItemStack(ItemInit.lead_ingot), 3);
		this.addSmelting(ItemInit.lead_dust, new ItemStack(ItemInit.lead_ingot), 3);
		this.addSmelting(ItemInit.IRON_DUST, new ItemStack(Items.IRON_INGOT), 3);
		this.addSmeltingRecipeForBlock(BlockInit.shadow_iron_ore, new ItemStack(ItemInit.SHADOW_IRON_INGOT), 3);
		this.addSmelting(ItemInit.SHADOW_IRON_DUST, new ItemStack(ItemInit.SHADOW_IRON_INGOT), 3);
		this.addSmeltingRecipeForBlock(BlockInit.dark_iron_ore, new ItemStack(ItemInit.dark_iron_ingot), 3);
		this.addSmelting(ItemInit.dark_iron_dust, new ItemStack(ItemInit.dark_iron_ingot), 3);
		this.addSmelting(ItemInit.steel_dust, new ItemStack(ItemInit.steel_ingot), 3);
		this.addSmelting(ItemInit.shadow_steel_dust, new ItemStack(ItemInit.shadow_steel_ingot), 3);
		this.addSmelting(ItemInit.BRONZE_DUST, new ItemStack(ItemInit.BRONZE_INGOT), 3);
		this.addSmeltingRecipeForBlock(BlockInit.meutoite_ore, new ItemStack(ItemInit.meutoite_ingot), 4);
		this.addSmelting(ItemInit.meutoite_dust, new ItemStack(ItemInit.meutoite_ingot), 4);
		this.addSmeltingRecipeForBlock(BlockInit.midasium_ore, new ItemStack(ItemInit.midasium_ingot), 4);
		this.addSmelting(ItemInit.midasium_dust, new ItemStack(ItemInit.midasium_ingot), 4);
		this.addSmeltingRecipeForBlock(BlockInit.vyroxeres_ore, new ItemStack(ItemInit.vyroxeres_ingot), 4);
		this.addSmelting(ItemInit.vyroxeres_dust, new ItemStack(ItemInit.vyroxeres_ingot), 4);
		this.addSmeltingRecipeForBlock(BlockInit.ceruclase_ore, new ItemStack(ItemInit.ceruclase_ingot), 4);
		this.addSmelting(ItemInit.ceruclase_dust, new ItemStack(ItemInit.ceruclase_ingot), 4);
		this.addSmelting(ItemInit.carbon_steel_dust, new ItemStack(ItemInit.carbon_steel_ingot), 4);
		this.addSmeltingRecipeForBlock(BlockInit.oureclase_ore, new ItemStack(ItemInit.oureclase_ingot), 4);
		this.addSmelting(ItemInit.oureclase_dust, new ItemStack(ItemInit.oureclase_ingot), 4);
		this.addSmeltingRecipeForBlock(BlockInit.eximite_ore, new ItemStack(ItemInit.eximite_ingot), 4);
		this.addSmelting(ItemInit.eximite_dust, new ItemStack(ItemInit.eximite_ingot), 4);
		this.addSmelting(ItemInit.darksteel_dust, new ItemStack(ItemInit.darksteel_ingot), 4);
		this.addSmeltingRecipeForBlock(Blocks.OBSIDIAN, new ItemStack(ItemInit.obsidian_ingot), 4);
		this.addSmeltingRecipeForBlock(BlockInit.astral_silver_ore, new ItemStack(ItemInit.astral_silver_ingot), 5);
		this.addSmelting(ItemInit.astral_silver_dust, new ItemStack(ItemInit.astral_silver_ingot), 5);
		this.addSmeltingRecipeForBlock(BlockInit.carmot_ore, new ItemStack(ItemInit.carmot_ingot), 5);
		this.addSmelting(ItemInit.carmot_dust, new ItemStack(ItemInit.carmot_ingot), 5);
		this.addSmeltingRecipeForBlock(BlockInit.kalendrite_ore, new ItemStack(ItemInit.kalendrite_ingot), 5);
		this.addSmelting(ItemInit.kalendrite_dust, new ItemStack(ItemInit.kalendrite_ingot), 5);
		this.addSmelting(ItemInit.inolashite_dust, new ItemStack(ItemInit.inolashite_ingot), 5);
		this.addSmelting(ItemInit.amordrine_dust, new ItemStack(ItemInit.amordrine_ingot), 5);
		this.addSmeltingRecipeForBlock(BlockInit.mythril_ore, new ItemStack(ItemInit.mythril_ingot), 5);
		this.addSmelting(ItemInit.mythril_dust, new ItemStack(ItemInit.mythril_ingot), 5);
		this.addSmelting(ItemInit.quicksilver_dust, new ItemStack(ItemInit.quicksilver_ingot), 5);
		this.addSmelting(ItemInit.haderoth_dust, new ItemStack(ItemInit.haderoth_ingot), 5);
		this.addSmelting(ItemInit.endersteel_dust, new ItemStack(ItemInit.endersteel_ingot), 5);
		this.addSmelting(ItemInit.wootz_iron_chunk, new ItemStack(ItemInit.damascus_steel_ingot), 5);
		this.addSmeltingRecipeForBlock(BlockInit.orichalcum_ore, new ItemStack(ItemInit.orichalcum_ingot), 6);
		this.addSmelting(ItemInit.orichalcum_dust, new ItemStack(ItemInit.orichalcum_ingot), 6);
		this.addSmeltingRecipeForBlock(BlockInit.titanium_ore, new ItemStack(ItemInit.titanium_ingot), 6);
		this.addSmelting(ItemInit.titanium_dust, new ItemStack(ItemInit.titanium_ingot), 6);
		this.addSmelting(ItemInit.celenegil_dust, new ItemStack(ItemInit.celenegil_ingot), 6);
		this.addSmeltingRecipeForBlock(BlockInit.elementium_ore, new ItemStack(ItemInit.elementium_ingot), 6);
		this.addSmeltingRecipeForBlock(BlockInit.adamantium_ore, new ItemStack(ItemInit.adamantium_ingot), 7);
		this.addSmelting(ItemInit.adamantium_dust, new ItemStack(ItemInit.adamantium_ingot), 7);
		this.addSmeltingRecipeForBlock(BlockInit.sanguinite_ore, new ItemStack(ItemInit.sanguinite_ingot), 7);
		this.addSmelting(ItemInit.sanguinite_dust, new ItemStack(ItemInit.sanguinite_ingot), 7);
		this.addSmelting(ItemInit.titansteel_dust, new ItemStack(ItemInit.titansteel_ingot), 8);
//		this.addSmeltingRecipeForBlock(BlockInit.cragcliff_larch_log, new ItemStack(ItemInit.cragnite_fragment), 8);
//		this.addSmeltingRecipeForBlock(BlockInit.ruemus_teak_log, new ItemStack(ItemInit.hydrolite_fragment), 8);
//		this.addSmeltingRecipeForBlock(BlockInit.skyridge_ebony_log, new ItemStack(ItemInit.zephyrite_fragment), 8);
		this.addSmelting(ItemInit.cragnite_ingot, new ItemStack(ItemInit.cragsteel_ingot), 9);
		this.addSmelting(ItemInit.hydrolite_ingot, new ItemStack(ItemInit.hydrosteel_ingot), 9);
		this.addSmelting(ItemInit.zephyrite_ingot, new ItemStack(ItemInit.zephyrsteel_ingot), 9);
	}
	
	public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
	{
		this.addSmelting(Item.getItemFromBlock(input), stack, experience);
	}
	
	public void addSmelting(Item input, ItemStack stack, float experience)
	{
		this.addBronzeFurnaceRecipe(new ItemStack(input, 1, 32767), stack, experience);
	}
	
	public void addBronzeFurnaceRecipe(ItemStack input1, ItemStack result, float experience)
	{
		if (getBronzeFurnaceResult(input1) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getBronzeFurnaceResult(ItemStack input1) //removed input2 from tutorial
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
	
	public float getBronzeFurnaceExperience(ItemStack stack)
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