package caedus.mod.init;

import java.util.ArrayList;
import java.util.List;

import caedus.mod.objects.blocks.block.BrassBlock;
import caedus.mod.objects.blocks.block.BronzeBlock;
import caedus.mod.objects.blocks.block.CopperBlock;
import caedus.mod.objects.blocks.block.ElectrumBlock;
import caedus.mod.objects.blocks.block.IgnatiusBlock;
import caedus.mod.objects.blocks.block.SilverBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedBrassBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedElectrumBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedGoldBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedSilverBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedBrassBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedElectrumBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedGoldBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedSilverBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedBrassBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedElectrumBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedGoldBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedSilverBlock;
import caedus.mod.objects.blocks.bricks.BrassBricks;
import caedus.mod.objects.blocks.bricks.BronzeBricks;
import caedus.mod.objects.blocks.bricks.CopperBricks;
import caedus.mod.objects.blocks.bricks.ElectrumBricks;
import caedus.mod.objects.blocks.bricks.GoldBricks;
import caedus.mod.objects.blocks.bricks.IgnatiusBricks;
import caedus.mod.objects.blocks.bricks.SilverBricks;
import caedus.mod.objects.blocks.machines.alloyer.Alloyer;
import caedus.mod.objects.blocks.ore.CopperOre;
import caedus.mod.objects.blocks.ore.ElementiumOre;
import caedus.mod.objects.blocks.ore.IgnatiusOre;
import caedus.mod.objects.blocks.ore.SilverOre;
import caedus.mod.objects.blocks.ore.TinOre;
import caedus.mod.objects.blocks.ore.ZephyriteOre;
import caedus.mod.objects.blocks.ore.ZincOre;
import caedus.mod.objects.blocks.rock.Zephyrstone;
import caedus.mod.objects.tree.ash.AshLeaves;
import caedus.mod.objects.tree.ash.AshLog;
import caedus.mod.objects.tree.ash.AshPlanks;
import caedus.mod.objects.tree.ash.AshSapling;
import caedus.mod.objects.tree.myrtle_ebony.EbonyLeaves;
import caedus.mod.objects.tree.myrtle_ebony.EbonyLog;
import caedus.mod.objects.tree.myrtle_ebony.EbonyPlanks;
import caedus.mod.objects.tree.myrtle_ebony.EbonySapling;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ALLOYER = new Alloyer("alloyer");
// - Wood - //
	public static final Block ASH_LOG = new AshLog("ash_log");
	public static final Block ASH_PLANKS = new AshPlanks("ash_planks");
	public static final Block ASH_LEAVES = new AshLeaves("ash_leaves");
	public static final Block ASH_SAPLINGS = new AshSapling("ash_sapling");
	public static final Block EBONY_PLANKS = new EbonyPlanks("ebony_planks");
	public static final Block EBONY_LOG = new EbonyLog("ebony_log");
	public static final Block EBONY_LEAVES = new EbonyLeaves("ebony_leaves");
	public static final Block EBONY_SAPLINGS = new EbonySapling("ebony_sapling");
// - Stone - //
	public static final Block TIN_ORE = new TinOre("tin_ore");
	public static final Block ZINC_ORE = new ZincOre("zinc_ore");
	public static final Block ZEPHYRSTONE = new Zephyrstone("zephyrstone");
// - Tier 1 [Wood] - //
	public static final Block BRASS_BRICKS = new BrassBricks("brass_bricks");
	public static final Block BRASS_BLOCK = new BrassBlock("brass_block");
	public static final Block CBRASS_BLOCK = new CondensedBrassBlock("brass_block_c");
	public static final Block SCBRASS_BLOCK = new SuperCondensedBrassBlock("brass_block_sc");
	public static final Block UCBRASS_BLOCK = new UltraCondensedBrassBlock("brass_block_uc");
	public static final Block SILVER_ORE = new SilverOre("silver_ore");
	public static final Block SILVER_BRICKS = new SilverBricks("silver_bricks");
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block");
	public static final Block CSILVER_BLOCK = new CondensedSilverBlock("silver_block_c");
	public static final Block SCSILVER_BLOCK = new SuperCondensedSilverBlock("silver_block_sc");
	public static final Block UCSILVER_BLOCK = new UltraCondensedSilverBlock("silver_block_uc");
	public static final Block GOLD_BRICKS = new GoldBricks("gold_bricks");
	public static final Block CGOLD_BLOCK = new CondensedGoldBlock("gold_block_c");
	public static final Block SCGOLD_BLOCK = new SuperCondensedGoldBlock("gold_block_sc");
	public static final Block UCGOLD_BLOCK = new UltraCondensedGoldBlock("gold_block_uc");
// - Tier 2 [Stone] - //
	public static final Block ELECTRUM_BRICKS = new ElectrumBricks("electrum_bricks");
	public static final Block ELECTRUM_BLOCK = new ElectrumBlock("electrum_block");
	public static final Block CELECTRUM_BLOCK = new CondensedElectrumBlock("electrum_block_c");
	public static final Block SCELECTRUM_BLOCK = new SuperCondensedElectrumBlock("electrum_block_sc");
	public static final Block UCELECTRUM_BLOCK = new UltraCondensedElectrumBlock("electrum_block_uc");
	public static final Block COPPER_ORE = new CopperOre("copper_ore");
	public static final Block COPPER_ORE_NETHER = new CopperOre("copper_ore_nether");
	public static final Block COPPER_ORE_END = new CopperOre("copper_ore_end");
	public static final Block COPPER_BRICKS = new CopperBricks("copper_bricks");
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block");
	public static final Block IGNATIUS_ORE = new IgnatiusOre("ignatius_ore");
	public static final Block IGNATIUS_BRICKS = new IgnatiusBricks("ignatius_bricks");
	public static final Block IGNATIUS_BLOCK = new IgnatiusBlock("ignatius_block");	
// - Tier 3 [Iron] - //
	public static final Block BRONZE_BRICKS = new BronzeBricks("bronze_bricks");
	public static final Block BRONZE_BLOCK = new BronzeBlock("bronze_block");
// - Tier 5 [Damascus Steel] - //
// - Tier 6 [Titanium] - //
// - Tier 7 [Adamantium] - //
// - Tier 8 [Titansteel] - //
// - Tier 9 [Elemental] - //
	public static final Block ELEMENTIUM_ORE = new ElementiumOre("elementium_ore");
	public static final Block ZEPHYRITE_ORE = new ZephyriteOre("zephyrite_ore");
// - Tier 10 [Elemental Steel] - //
// - Tier X [Chronosteel] - //
}
