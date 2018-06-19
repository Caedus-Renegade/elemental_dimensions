package caedus.mod.util.handlers;

import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeHandler
{
	
	public FurnaceRecipeHandler()
	{
		
	}
		public static void addRecipes() 
		{
			GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 1);
			
			//			GameRegistry.addSmelting(BlockInit.ash_log, new ItemStack(Items.COAL), 1);
			//			GameRegistry.addSmelting(BlockInit.cocobolo_log, new ItemStack(Items.COAL), 1);
			//			GameRegistry.addSmelting(BlockInit.myrtle_ebony_log, new ItemStack(Items.COAL), 1);
			//			GameRegistry.addSmelting(BlockInit.larch_log, new ItemStack(Items.COAL), 1);
			//			GameRegistry.addSmelting(BlockInit.teak_log, new ItemStack(Items.COAL), 1);
			GameRegistry.addSmelting(ItemInit.carbon_mesh, new ItemStack(ItemInit.carbon_plate), 1);
			GameRegistry.addSmelting(BlockInit.tin_ore, new ItemStack(ItemInit.tin_ingot), 1);
			GameRegistry.addSmelting(ItemInit.tin_dust, new ItemStack(ItemInit.tin_ingot), 1);
			GameRegistry.addSmelting(BlockInit.zinc_ore, new ItemStack(ItemInit.zinc_ingot), 1);
			GameRegistry.addSmelting(ItemInit.zinc_dust, new ItemStack(ItemInit.zinc_ingot), 1);
			GameRegistry.addSmelting(BlockInit.luminite_ore, new ItemStack(ItemInit.luminite_ingot), 1);
			GameRegistry.addSmelting(ItemInit.luminite_dust, new ItemStack(ItemInit.luminite_ingot), 1);
			GameRegistry.addSmelting(ItemInit.BRASS_DUST, new ItemStack(ItemInit.BRASS_INGOT), 1);
			GameRegistry.addSmelting(BlockInit.silver_ore, new ItemStack(ItemInit.SILVER_INGOT), 1);
			GameRegistry.addSmelting(ItemInit.SILVER_DUST, new ItemStack(ItemInit.SILVER_INGOT), 1);
			GameRegistry.addSmelting(BlockInit.infuscolium_ore, new ItemStack(ItemInit.infuscolium_ingot), 2);
			GameRegistry.addSmelting(ItemInit.infuscolium_dust, new ItemStack(ItemInit.infuscolium_ingot), 2);
			GameRegistry.addSmelting(ItemInit.ELECTRUM_DUST, new ItemStack(ItemInit.ELECTRUM_INGOT), 2);
			GameRegistry.addSmelting(BlockInit.copper_ore, new ItemStack(ItemInit.COPPER_INGOT), 2);
			GameRegistry.addSmelting(ItemInit.COPPER_DUST, new ItemStack(ItemInit.COPPER_INGOT), 2);
			GameRegistry.addSmelting(BlockInit.prometheum_ore, new ItemStack(ItemInit.PROMETHEUM_INGOT), 2);
			GameRegistry.addSmelting(ItemInit.PROMETHEUM_DUST, new ItemStack(ItemInit.PROMETHEUM_INGOT), 2);
			GameRegistry.addSmelting(BlockInit.ignatius_ore, new ItemStack(ItemInit.IGNATIUS_INGOT), 2);
			GameRegistry.addSmelting(ItemInit.IGNATIUS_DUST, new ItemStack(ItemInit.IGNATIUS_INGOT), 2);
			GameRegistry.addSmelting(BlockInit.manganese_ore, new ItemStack(ItemInit.manganese_ingot), 3);
			GameRegistry.addSmelting(ItemInit.manganese_dust, new ItemStack(ItemInit.manganese_ingot), 3);
			GameRegistry.addSmelting(BlockInit.rubracium_ore, new ItemStack(ItemInit.rubracium_ingot), 3);
			GameRegistry.addSmelting(ItemInit.rubracium_dust, new ItemStack(ItemInit.rubracium_ingot), 3);
			GameRegistry.addSmelting(BlockInit.adluorite_ore, new ItemStack(ItemInit.adluorite_ingot), 3);
			GameRegistry.addSmelting(ItemInit.adluorite_dust, new ItemStack(ItemInit.adluorite_ingot), 3);
			GameRegistry.addSmelting(BlockInit.lead_ore, new ItemStack(ItemInit.lead_ingot), 3);
			GameRegistry.addSmelting(ItemInit.lead_dust, new ItemStack(ItemInit.lead_ingot), 3);
			GameRegistry.addSmelting(BlockInit.platinum_ore, new ItemStack(ItemInit.PLATINUM_INGOT), 3);
			GameRegistry.addSmelting(ItemInit.PLATINUM_DUST, new ItemStack(ItemInit.PLATINUM_INGOT), 3);
			GameRegistry.addSmelting(ItemInit.IRON_DUST, new ItemStack(Items.IRON_INGOT), 3);
			GameRegistry.addSmelting(BlockInit.shadow_iron_ore, new ItemStack(ItemInit.SHADOW_IRON_INGOT), 3);
			GameRegistry.addSmelting(ItemInit.SHADOW_IRON_DUST, new ItemStack(ItemInit.SHADOW_IRON_INGOT), 3);
			GameRegistry.addSmelting(BlockInit.dark_iron_ore, new ItemStack(ItemInit.dark_iron_ingot), 3);
			GameRegistry.addSmelting(ItemInit.dark_iron_dust, new ItemStack(ItemInit.dark_iron_ingot), 3);
			GameRegistry.addSmelting(ItemInit.steel_dust, new ItemStack(ItemInit.steel_ingot), 3);
			GameRegistry.addSmelting(ItemInit.shadow_steel_dust, new ItemStack(ItemInit.shadow_steel_ingot), 3);
			GameRegistry.addSmelting(ItemInit.BRONZE_DUST, new ItemStack(ItemInit.BRONZE_INGOT), 3);
			GameRegistry.addSmelting(BlockInit.meutoite_ore, new ItemStack(ItemInit.meutoite_ingot), 4);
			GameRegistry.addSmelting(ItemInit.meutoite_dust, new ItemStack(ItemInit.meutoite_ingot), 4);
			GameRegistry.addSmelting(BlockInit.midasium_ore, new ItemStack(ItemInit.midasium_ingot), 4);
			GameRegistry.addSmelting(ItemInit.midasium_dust, new ItemStack(ItemInit.midasium_ingot), 4);
			GameRegistry.addSmelting(BlockInit.vyroxeres_ore, new ItemStack(ItemInit.vyroxeres_ingot), 4);
			GameRegistry.addSmelting(ItemInit.vyroxeres_dust, new ItemStack(ItemInit.vyroxeres_ingot), 4);
			GameRegistry.addSmelting(BlockInit.ceruclase_ore, new ItemStack(ItemInit.ceruclase_ingot), 4);
			GameRegistry.addSmelting(ItemInit.ceruclase_dust, new ItemStack(ItemInit.ceruclase_ingot), 4);
			GameRegistry.addSmelting(ItemInit.carbon_steel_dust, new ItemStack(ItemInit.carbon_steel_ingot), 4);
			GameRegistry.addSmelting(BlockInit.oureclase_ore, new ItemStack(ItemInit.oureclase_ingot), 4);
			GameRegistry.addSmelting(ItemInit.oureclase_dust, new ItemStack(ItemInit.oureclase_ingot), 4);
			GameRegistry.addSmelting(BlockInit.eximite_ore, new ItemStack(ItemInit.eximite_ingot), 4);
			GameRegistry.addSmelting(ItemInit.eximite_dust, new ItemStack(ItemInit.eximite_ingot), 4);
			GameRegistry.addSmelting(ItemInit.darksteel_dust, new ItemStack(ItemInit.darksteel_ingot), 4);
			GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ItemInit.obsidian_ingot), 4);
			GameRegistry.addSmelting(BlockInit.astral_silver_ore, new ItemStack(ItemInit.astral_silver_ingot), 5);
			GameRegistry.addSmelting(ItemInit.astral_silver_dust, new ItemStack(ItemInit.astral_silver_ingot), 5);
			GameRegistry.addSmelting(BlockInit.carmot_ore, new ItemStack(ItemInit.carmot_ingot), 5);
			GameRegistry.addSmelting(ItemInit.carmot_dust, new ItemStack(ItemInit.carmot_ingot), 5);
			GameRegistry.addSmelting(BlockInit.kalendrite_ore, new ItemStack(ItemInit.kalendrite_ingot), 5);
			GameRegistry.addSmelting(ItemInit.kalendrite_dust, new ItemStack(ItemInit.kalendrite_ingot), 5);
			GameRegistry.addSmelting(ItemInit.inolashite_dust, new ItemStack(ItemInit.inolashite_ingot), 5);
			GameRegistry.addSmelting(ItemInit.amordrine_dust, new ItemStack(ItemInit.amordrine_ingot), 5);
			GameRegistry.addSmelting(BlockInit.mythril_ore, new ItemStack(ItemInit.mythril_ingot), 5);
			GameRegistry.addSmelting(ItemInit.mythril_dust, new ItemStack(ItemInit.mythril_ingot), 5);
			GameRegistry.addSmelting(ItemInit.quicksilver_dust, new ItemStack(ItemInit.quicksilver_ingot), 5);
			GameRegistry.addSmelting(ItemInit.haderoth_dust, new ItemStack(ItemInit.haderoth_ingot), 5);
			GameRegistry.addSmelting(ItemInit.endersteel_dust, new ItemStack(ItemInit.endersteel_ingot), 5);
			GameRegistry.addSmelting(ItemInit.wootz_iron_chunk, new ItemStack(ItemInit.damascus_steel_ingot), 5);
			GameRegistry.addSmelting(BlockInit.orichalcum_ore, new ItemStack(ItemInit.orichalcum_ingot), 6);
			GameRegistry.addSmelting(ItemInit.orichalcum_dust, new ItemStack(ItemInit.orichalcum_ingot), 6);
			GameRegistry.addSmelting(BlockInit.titanium_ore, new ItemStack(ItemInit.titanium_ingot), 6);
			GameRegistry.addSmelting(ItemInit.titanium_dust, new ItemStack(ItemInit.titanium_ingot), 6);
			GameRegistry.addSmelting(ItemInit.celenegil_dust, new ItemStack(ItemInit.celenegil_ingot), 6);
			GameRegistry.addSmelting(BlockInit.elementium_ore, new ItemStack(ItemInit.elementium_ingot), 6);
			GameRegistry.addSmelting(BlockInit.adamantium_ore, new ItemStack(ItemInit.adamantium_ingot), 7);
			GameRegistry.addSmelting(ItemInit.adamantium_dust, new ItemStack(ItemInit.adamantium_ingot), 7);
			GameRegistry.addSmelting(BlockInit.sanguinite_ore, new ItemStack(ItemInit.sanguinite_ingot), 7);
			GameRegistry.addSmelting(ItemInit.sanguinite_dust, new ItemStack(ItemInit.sanguinite_ingot), 7);
			GameRegistry.addSmelting(ItemInit.titansteel_dust, new ItemStack(ItemInit.titansteel_ingot), 8);
			//			GameRegistry.addSmelting(BlockInit.cragcliff_larch_log, new ItemStack(ItemInit.cragnite_fragment), 8);
			//			GameRegistry.addSmelting(BlockInit.ruemus_teak_log, new ItemStack(ItemInit.hydrolite_fragment), 8);
			//			GameRegistry.addSmelting(BlockInit.skyridge_ebony_log, new ItemStack(ItemInit.zephyrite_fragment), 8);
			GameRegistry.addSmelting(ItemInit.cragnite_ingot, new ItemStack(ItemInit.cragsteel_ingot), 9);
			GameRegistry.addSmelting(ItemInit.hydrolite_ingot, new ItemStack(ItemInit.hydrosteel_ingot), 9);
			GameRegistry.addSmelting(ItemInit.zephyrite_ingot, new ItemStack(ItemInit.zephyrsteel_ingot), 9);
		}
	}