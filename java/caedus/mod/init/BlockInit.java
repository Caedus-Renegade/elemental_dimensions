package caedus.mod.init;

import java.util.ArrayList;
import java.util.List;

import caedus.mod.objects.blocks.block.AdamantiumBlock;
import caedus.mod.objects.blocks.block.AdluoriteBlock;
import caedus.mod.objects.blocks.block.AmberBlock;
import caedus.mod.objects.blocks.block.AmordrineBlock;
import caedus.mod.objects.blocks.block.AstralSilverBlock;
import caedus.mod.objects.blocks.block.BeefCrate;
import caedus.mod.objects.blocks.block.BoneCrate;
import caedus.mod.objects.blocks.block.BrassBlock;
import caedus.mod.objects.blocks.block.BronzeBlock;
import caedus.mod.objects.blocks.block.CarbonSteelBlock;
import caedus.mod.objects.blocks.block.CarmotBlock;
import caedus.mod.objects.blocks.block.CelenegilBlock;
import caedus.mod.objects.blocks.block.CeruclaseBlock;
import caedus.mod.objects.blocks.block.CopperBlock;
import caedus.mod.objects.blocks.block.CragcliffAmberBlock;
import caedus.mod.objects.blocks.block.CragsteelBlock;
import caedus.mod.objects.blocks.block.DamascusSteelBlock;
import caedus.mod.objects.blocks.block.DarkIronBlock;
import caedus.mod.objects.blocks.block.DarksteelBlock;
import caedus.mod.objects.blocks.block.ElectrumBlock;
import caedus.mod.objects.blocks.block.EnchantedCragsteelBlock;
import caedus.mod.objects.blocks.block.EnchantedHydrosteelBlock;
import caedus.mod.objects.blocks.block.EnchantedZephyrsteelBlock;
import caedus.mod.objects.blocks.block.EnderPearlCrate;
import caedus.mod.objects.blocks.block.EndersteelBlock;
import caedus.mod.objects.blocks.block.EximiteBlock;
import caedus.mod.objects.blocks.block.HaderothBlock;
import caedus.mod.objects.blocks.block.HydrosteelBlock;
import caedus.mod.objects.blocks.block.IgnatiusBlock;
import caedus.mod.objects.blocks.block.InfuscoliumBlock;
import caedus.mod.objects.blocks.block.InolashiteBlock;
import caedus.mod.objects.blocks.block.KalendriteBlock;
import caedus.mod.objects.blocks.block.LeadBlock;
import caedus.mod.objects.blocks.block.LeatherCrate;
import caedus.mod.objects.blocks.block.LuminiteBlock;
import caedus.mod.objects.blocks.block.ManganeseBlock;
import caedus.mod.objects.blocks.block.MeutoiteBlock;
import caedus.mod.objects.blocks.block.MidasiumBlock;
import caedus.mod.objects.blocks.block.MuttonCrate;
import caedus.mod.objects.blocks.block.MythrilBlock;
import caedus.mod.objects.blocks.block.ObsidianBlock;
import caedus.mod.objects.blocks.block.OrichalcumBlock;
import caedus.mod.objects.blocks.block.OureclaseBlock;
import caedus.mod.objects.blocks.block.PlatinumBlock;
import caedus.mod.objects.blocks.block.PorkchopCrate;
import caedus.mod.objects.blocks.block.PrometheumBlock;
import caedus.mod.objects.blocks.block.QuicksilverBlock;
import caedus.mod.objects.blocks.block.RottenFleshCrate;
import caedus.mod.objects.blocks.block.RubraciumBlock;
import caedus.mod.objects.blocks.block.RuemusSapphireBlock;
import caedus.mod.objects.blocks.block.SanguiniteBlock;
import caedus.mod.objects.blocks.block.SapphireBlock;
import caedus.mod.objects.blocks.block.ShadowIronBlock;
import caedus.mod.objects.blocks.block.ShadowSteelBlock;
import caedus.mod.objects.blocks.block.SteelBlock;
import caedus.mod.objects.blocks.block.SilverBlock;
import caedus.mod.objects.blocks.block.SkyridgeEmeraldBlock;
import caedus.mod.objects.blocks.block.TinBlock;
import caedus.mod.objects.blocks.block.TitaniumBlock;
import caedus.mod.objects.blocks.block.TitansteelBlock;
import caedus.mod.objects.blocks.block.VyroxeresBlock;
import caedus.mod.objects.blocks.block.ZephyrsteelBlock;
import caedus.mod.objects.blocks.block.ZincBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedBeefCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedBoneCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedBrassBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedCoalBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedDiamondBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedElectrumBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedEnderPearlCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedGoldBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedLapisBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedLeatherCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedMuttonCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedPlatinumBlock;
import caedus.mod.objects.blocks.block.condensed.CondensedPorkchopCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedRottenFleshCrate;
import caedus.mod.objects.blocks.block.condensed.CondensedSilverBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedBeefCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedBoneCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedBrassBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedCoalBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedDiamondBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedElectrumBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedEnderPearlCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedGoldBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedLapisBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedLeatherCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedMuttonCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedPlatinumBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedPorkchopCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedRottenFleshCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.SuperCondensedSilverBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedBeefCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedBoneCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedBrassBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedCoalBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedDiamondBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedElectrumBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedEnderPearlCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedGoldBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedLapisBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedLeatherCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedMuttonCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedPlatinumBlock;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedPorkchopCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedRottenFleshCrate;
import caedus.mod.objects.blocks.block.condensed.super_condensed.ultra_condensed.UltraCondensedSilverBlock;
import caedus.mod.objects.blocks.bricks.AdamantiumBricks;
import caedus.mod.objects.blocks.bricks.AmordrineBricks;
import caedus.mod.objects.blocks.bricks.AstralSilverBricks;
import caedus.mod.objects.blocks.bricks.BrassBricks;
import caedus.mod.objects.blocks.bricks.BronzeBricks;
import caedus.mod.objects.blocks.bricks.CarbonSteelBricks;
import caedus.mod.objects.blocks.bricks.CarmotBricks;
import caedus.mod.objects.blocks.bricks.CelenegilBricks;
import caedus.mod.objects.blocks.bricks.CeruclaseBricks;
import caedus.mod.objects.blocks.bricks.CopperBricks;
import caedus.mod.objects.blocks.bricks.CragsteelBricks;
import caedus.mod.objects.blocks.bricks.DamascusSteelBricks;
import caedus.mod.objects.blocks.bricks.DarkIronBricks;
import caedus.mod.objects.blocks.bricks.DarksteelBricks;
import caedus.mod.objects.blocks.bricks.ElectrumBricks;
import caedus.mod.objects.blocks.bricks.EndersteelBricks;
import caedus.mod.objects.blocks.bricks.EximiteBricks;
import caedus.mod.objects.blocks.bricks.GoldBricks;
import caedus.mod.objects.blocks.bricks.HaderothBricks;
import caedus.mod.objects.blocks.bricks.HydrosteelBricks;
import caedus.mod.objects.blocks.bricks.IgnatiusBricks;
import caedus.mod.objects.blocks.bricks.InolashiteBricks;
import caedus.mod.objects.blocks.bricks.IronBricks;
import caedus.mod.objects.blocks.bricks.KalendriteBricks;
import caedus.mod.objects.blocks.bricks.LuminiteBricks;
import caedus.mod.objects.blocks.bricks.MidasiumBricks;
import caedus.mod.objects.blocks.bricks.MythrilBricks;
import caedus.mod.objects.blocks.bricks.ObsidianBricks;
import caedus.mod.objects.blocks.bricks.OrichalcumBricks;
import caedus.mod.objects.blocks.bricks.OureclaseBricks;
import caedus.mod.objects.blocks.bricks.PlatinumBricks;
import caedus.mod.objects.blocks.bricks.PrometheumBricks;
import caedus.mod.objects.blocks.bricks.QuicksilverBricks;
import caedus.mod.objects.blocks.bricks.SanguiniteBricks;
import caedus.mod.objects.blocks.bricks.ShadowIronBricks;
import caedus.mod.objects.blocks.bricks.ShadowSteelBricks;
import caedus.mod.objects.blocks.bricks.SteelBricks;
import caedus.mod.objects.blocks.bricks.TitaniumBricks;
import caedus.mod.objects.blocks.bricks.TitansteelBricks;
import caedus.mod.objects.blocks.bricks.VyroxeresBricks;
import caedus.mod.objects.blocks.bricks.ZephyrsteelBricks;
import caedus.mod.objects.blocks.bricks.SilverBricks;
import caedus.mod.objects.blocks.machines.furnace.bronze.BronzeFurnace;
import caedus.mod.objects.blocks.machines.furnace.carbonsteel.CarbonSteelFurnace;
import caedus.mod.objects.blocks.machines.furnace.copper.CopperFurnace;
import caedus.mod.objects.blocks.machines.furnace.iron.IronFurnace;
import caedus.mod.objects.blocks.machines.furnace.obsidian.ObsidianFurnace;
import caedus.mod.objects.blocks.machines.furnace.steel.SteelFurnace;
import caedus.mod.objects.blocks.machines.grinder.bronze.BronzeGrinder;
import caedus.mod.objects.blocks.machines.grinder.carbonsteel.CarbonSteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.copper.CopperGrinder;
import caedus.mod.objects.blocks.machines.grinder.iron.IronGrinder;
import caedus.mod.objects.blocks.machines.grinder.obsidian.ObsidianGrinder;
import caedus.mod.objects.blocks.machines.grinder.steel.SteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.stone.Grinder;
import caedus.mod.objects.blocks.machines.teleporters.CragsteelTeleporter;
import caedus.mod.objects.blocks.machines.teleporters.HydrosteelTeleporter;
import caedus.mod.objects.blocks.machines.teleporters.ZephyrsteelTeleporter;
import caedus.mod.objects.blocks.ore.AdamantiumOre;
import caedus.mod.objects.blocks.ore.AdluoriteOre;
import caedus.mod.objects.blocks.ore.AmberOre;
import caedus.mod.objects.blocks.ore.AstralSilverOre;
import caedus.mod.objects.blocks.ore.CarmotOre;
import caedus.mod.objects.blocks.ore.CeruclaseOre;
import caedus.mod.objects.blocks.ore.CopperOre;
import caedus.mod.objects.blocks.ore.CragcliffAmberOre;
import caedus.mod.objects.blocks.ore.CragniteOre;
import caedus.mod.objects.blocks.ore.DarkIronOre;
import caedus.mod.objects.blocks.ore.ElementiumOre;
import caedus.mod.objects.blocks.ore.EmeraldOre;
import caedus.mod.objects.blocks.ore.EximiteOre;
import caedus.mod.objects.blocks.ore.HydroliteOre;
import caedus.mod.objects.blocks.ore.IgnatiusOre;
import caedus.mod.objects.blocks.ore.InfuscoliumOre;
import caedus.mod.objects.blocks.ore.KalendriteOre;
import caedus.mod.objects.blocks.ore.LeadOre;
import caedus.mod.objects.blocks.ore.LuminiteOre;
import caedus.mod.objects.blocks.ore.ManganeseOre;
import caedus.mod.objects.blocks.ore.MeutoiteOre;
import caedus.mod.objects.blocks.ore.MidasiumOre;
import caedus.mod.objects.blocks.ore.MythrilOre;
import caedus.mod.objects.blocks.ore.OrichalcumOre;
import caedus.mod.objects.blocks.ore.OureclaseOre;
import caedus.mod.objects.blocks.ore.PlatinumOre;
import caedus.mod.objects.blocks.ore.PrometheumOre;
import caedus.mod.objects.blocks.ore.PureCragniteOre;
import caedus.mod.objects.blocks.ore.PureHydroliteOre;
import caedus.mod.objects.blocks.ore.PureZephyriteOre;
import caedus.mod.objects.blocks.ore.RubraciumOre;
import caedus.mod.objects.blocks.ore.RuemusSapphireOre;
import caedus.mod.objects.blocks.ore.SanguiniteOre;
import caedus.mod.objects.blocks.ore.SapphireOre;
import caedus.mod.objects.blocks.ore.ShadowIronOre;
import caedus.mod.objects.blocks.ore.SilverOre;
import caedus.mod.objects.blocks.ore.SkyridgeEmeraldOre;
import caedus.mod.objects.blocks.ore.TinOre;
import caedus.mod.objects.blocks.ore.TitaniumOre;
import caedus.mod.objects.blocks.ore.VyroxeresOre;
import caedus.mod.objects.blocks.ore.WootzOre;
import caedus.mod.objects.blocks.ore.ZephyriteOre;
import caedus.mod.objects.blocks.ore.ZincOre;
import caedus.mod.objects.blocks.rock.Cragstone;
import caedus.mod.objects.blocks.rock.Hydrostone;
import caedus.mod.objects.blocks.rock.Zephyrstone;
import caedus.mod.objects.tree.elemental.cragcliff_larch.CragcliffLarchLeaves;
import caedus.mod.objects.tree.elemental.cragcliff_larch.CragcliffLarchLog;
import caedus.mod.objects.tree.elemental.cragcliff_larch.CragcliffLarchPlanks;
import caedus.mod.objects.tree.elemental.cragcliff_larch.CragcliffLarchSapling;
import caedus.mod.objects.tree.elemental.ruemus_teak.RuemusTeakLeaves;
import caedus.mod.objects.tree.elemental.ruemus_teak.RuemusTeakLog;
import caedus.mod.objects.tree.elemental.ruemus_teak.RuemusTeakPlanks;
import caedus.mod.objects.tree.elemental.ruemus_teak.RuemusTeakSapling;
import caedus.mod.objects.tree.elemental.skyridge_ebony.SkyridgeEbonyLeaves;
import caedus.mod.objects.tree.elemental.skyridge_ebony.SkyridgeEbonyLog;
import caedus.mod.objects.tree.elemental.skyridge_ebony.SkyridgeEbonyPlanks;
import caedus.mod.objects.tree.elemental.skyridge_ebony.SkyridgeEbonySapling;
import caedus.mod.objects.tree.normal.ash.AshLeaves;
import caedus.mod.objects.tree.normal.ash.AshLog;
import caedus.mod.objects.tree.normal.ash.AshPlanks;
import caedus.mod.objects.tree.normal.ash.AshSapling;
import caedus.mod.objects.tree.normal.cocobolo.CocoboloLeaves;
import caedus.mod.objects.tree.normal.cocobolo.CocoboloLog;
import caedus.mod.objects.tree.normal.cocobolo.CocoboloPlanks;
import caedus.mod.objects.tree.normal.cocobolo.CocoboloSapling;
import caedus.mod.objects.tree.normal.ebony.MyrtleEbonyLeaves;
import caedus.mod.objects.tree.normal.ebony.MyrtleEbonyLog;
import caedus.mod.objects.tree.normal.ebony.MyrtleEbonyPlanks;
import caedus.mod.objects.tree.normal.ebony.MyrtleEbonySapling;
import caedus.mod.objects.tree.normal.ebony.MyrtleEbonyStairs;
import caedus.mod.objects.tree.normal.larch.LarchLeaves;
import caedus.mod.objects.tree.normal.larch.LarchLog;
import caedus.mod.objects.tree.normal.larch.LarchPlanks;
import caedus.mod.objects.tree.normal.larch.LarchSapling;
import caedus.mod.objects.tree.normal.teak.TeakLeaves;
import caedus.mod.objects.tree.normal.teak.TeakLog;
import caedus.mod.objects.tree.normal.teak.TeakPlanks;
import caedus.mod.objects.tree.normal.teak.TeakSapling;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
// - Misc. - //
	
	public static final Block beef_crate = new BeefCrate("beef_crate");
	public static final Block cbeef_crate = new CondensedBeefCrate("beef_crate_c");
	public static final Block scbeef_crate = new SuperCondensedBeefCrate("beef_crate_sc");
	public static final Block ucbeef_crate = new UltraCondensedBeefCrate("beef_crate_uc");
	
	public static final Block bone_crate = new BoneCrate("bone_crate");
	public static final Block cbone_crate = new CondensedBoneCrate("bone_crate_c");
	public static final Block scbone_crate = new SuperCondensedBoneCrate("bone_crate_sc");
	public static final Block ucbone_crate = new UltraCondensedBoneCrate("bone_crate_uc");
	
	public static final Block mutton_crate = new MuttonCrate("mutton_crate");
	public static final Block cmutton_crate = new CondensedMuttonCrate("mutton_crate_c");
	public static final Block scmutton_crate = new SuperCondensedMuttonCrate("mutton_crate_sc");
	public static final Block ucmutton_crate = new UltraCondensedMuttonCrate("mutton_crate_uc");

	public static final Block rottenflesh_crate = new RottenFleshCrate("rotten_flesh_crate");
	public static final Block crottenflesh_crate = new CondensedRottenFleshCrate("rotten_flesh_crate_c");
	public static final Block scrottenflesh_crate = new SuperCondensedRottenFleshCrate("rotten_flesh_crate_sc");
	public static final Block ucrottenflesh_crate = new UltraCondensedRottenFleshCrate("rotten_flesh_crate_uc");
	
	public static final Block leather_crate = new LeatherCrate("leather_crate");
	public static final Block cleather_crate = new CondensedLeatherCrate("leather_crate_c");
	public static final Block scleather_crate = new SuperCondensedLeatherCrate("leather_crate_sc");
	public static final Block ucleather_crate = new UltraCondensedLeatherCrate("leather_crate_uc");
	
	public static final Block ender_pearl_crate = new EnderPearlCrate("ender_pearl_crate");
	public static final Block cender_pearl_crate = new CondensedEnderPearlCrate("ender_pearl_crate_c");
	public static final Block scender_pearl_crate = new SuperCondensedEnderPearlCrate("ender_pearl_crate_sc");
	public static final Block ucender_pearl_crate = new UltraCondensedEnderPearlCrate("ender_pearl_crate_uc");
	
	public static final Block porkchop_crate = new PorkchopCrate("porkchop_crate");
	public static final Block cporkchop_crate = new CondensedPorkchopCrate("porkchop_crate_c");
	public static final Block scporkchop_crate = new SuperCondensedPorkchopCrate("porkchop_crate_sc");
	public static final Block ucporkchop_crate = new UltraCondensedPorkchopCrate("porkchop_crate_uc");

// - Wood - //
	
//	public static final Block ash_log = new AshLog("ash_log");
//	public static final Block ash_leaves = new AshLeaves("ash_leaves");
//	public static final Block ash_planks = new AshPlanks("ash_planks");
//	public static final Block ash_sapling = new AshSapling("ash_sapling");
	
//	public static final Block cocobolo_log = new CocoboloLog("cocobolo_log");
//	public static final Block cocobolo_leaves = new CocoboloLeaves("cocobolo_leaves");
//	public static final Block cocobolo_planks = new CocoboloPlanks("cocobolo_planks");
//	public static final Block cocobolo_sapling = new CocoboloSapling("cocobolo_sapling");
	
//	public static final Block larch_log = new LarchLog("larch_log");
//	public static final Block larch_leaves = new LarchLeaves("larch_leaves");
//	public static final Block larch_planks = new LarchPlanks("larch_planks");
//	public static final Block larch_sapling = new LarchSapling("larch_sapling");
	
//	public static final Block myrtle_ebony_log = new MyrtleEbonyLog("ebony_log");
//	public static final Block myrtle_ebony_leaves = new MyrtleEbonyLeaves("ebony_leaves");
//	public static final Block myrtle_ebony_planks = new MyrtleEbonyPlanks("ebony_planks");
//	public static final Block myrtle_ebony_sapling = new MyrtleEbonySapling("ebony_sapling");
//	public static final Block myrtle_ebony_stairs = new MyrtleEbonyStairs("ebony_stairs", myrtle_ebony_planks.getDefaultState());
	
//	public static final Block teak_log = new TeakLog("teak_log");
//	public static final Block teak_leaves = new TeakLeaves("teak_leaves");
//	public static final Block teak_planks = new TeakPlanks("teak_planks");
//	public static final Block teak_sapling = new TeakSapling("teak_sapling");
	
//	public static final Block cragcliff_larch_log = new CragcliffLarchLog("cragcliff_larch_log");
//	public static final Block cragcliff_larch_leaves = new CragcliffLarchLeaves("cragcliff_larch_leaves");
//	public static final Block cragcliff_larch_planks = new CragcliffLarchPlanks("cragcliff_larch_planks");
//	public static final Block cragcliff_larch_sapling = new CragcliffLarchSapling("cragcliff_larch_sapling");

//	public static final Block ruemus_teak_log = new RuemusTeakLog("ruemus_teak_log");
//	public static final Block ruemus_teak_leaves = new RuemusTeakLeaves("ruemus_teak_leaves");
//	public static final Block ruemus_teak_planks = new RuemusTeakPlanks("ruemus_teak_planks");
//	public static final Block ruemus_teak_sapling = new RuemusTeakSapling("ruemus_teak_sapling");

//	public static final Block skyridge_ebony_log = new SkyridgeEbonyLog("skyridge_ebony_log");
//	public static final Block skyridge_ebony_leaves = new SkyridgeEbonyLeaves("skyridge_ebony_leaves");
//	public static final Block skyridge_ebony_planks = new SkyridgeEbonyPlanks("skyridge_ebony_planks");
//	public static final Block skyridge_ebony_sapling = new SkyridgeEbonySapling("skyridge_ebony_sapling");

// - Stone - //

	public static final Block coal_block_c = new CondensedCoalBlock("coal_block_c");
	public static final Block coal_block_sc	= new SuperCondensedCoalBlock("coal_block_sc");
	public static final Block coal_block_uc	= new UltraCondensedCoalBlock("coal_block_uc");
	
	public static final Block lapis_block_c = new CondensedLapisBlock("lapis_block_c");
	public static final Block lapis_block_sc = new SuperCondensedLapisBlock("lapis_block_sc");
	public static final Block lapis_block_uc = new UltraCondensedLapisBlock("lapis_block_uc");
	
	public static final Block tin_ore = new TinOre("tin_ore");
	public static final Block tin_block = new TinBlock("tin_block");
	
	public static final Block zinc_ore = new ZincOre("zinc_ore");
	public static final Block zinc_block = new ZincBlock("zinc_block");
	
	public static final Block infuscolium_ore = new InfuscoliumOre("infuscolium_ore");
	public static final Block infuscolium_block = new InfuscoliumBlock("infuscolium_block");
	
	public static final Block manganese_ore = new ManganeseOre("manganese_ore");
	public static final Block manganese_block = new ManganeseBlock("manganese_block");
	
	public static final Block lead_ore = new LeadOre("lead_ore");
	public static final Block lead_block = new LeadBlock("lead_block");

	public static final Block luminite_ore = new LuminiteOre("luminite_ore");
	public static final Block luminite_bricks = new LuminiteBricks("luminite_bricks");
	public static final Block luminite_block = new LuminiteBlock("luminite_block");

	public static final Block adluorite_ore = new AdluoriteOre("adluorite_ore");
	public static final Block adluorite_block = new AdluoriteBlock("adluorite_block");
	
	public static final Block rubracium_ore = new RubraciumOre("rubracium_ore");
	public static final Block rubracium_block = new RubraciumBlock("rubracium_block");
	
	public static final Block meutoite_ore = new MeutoiteOre("meutoite_ore");
	public static final Block meutoite_block = new MeutoiteBlock("meutoite_block");
	
	public static final Block cragstone = new Cragstone("cragstone");
	public static final Block hydrostone = new Hydrostone("hydrostone");
	public static final Block zephyrstone = new Zephyrstone("zephyrstone");
	
// - Gemstones - //
	
	public static final Block amber_ore = new AmberOre("amber_ore");
	public static final Block amber_block = new AmberBlock("amber_block");
	
	public static final Block sapphire_ore = new SapphireOre("sapphire_ore");
	public static final Block sapphire_block = new SapphireBlock("sapphire_block");
	
	public static final Block emerald_ore = new EmeraldOre("emerald_ore");
	
// - Tier 1 [Wood] - //
	
	public static final Block grinder = new Grinder("grinder");
	
	public static final Block brass_bricks = new BrassBricks("brass_bricks");
	public static final Block brass_block = new BrassBlock("brass_block");
	public static final Block cbrass_block = new CondensedBrassBlock("brass_block_c");
	public static final Block scbrass_block = new SuperCondensedBrassBlock("brass_block_sc");
	public static final Block ucbrass_block = new UltraCondensedBrassBlock("brass_block_uc");
	
	public static final Block silver_ore = new SilverOre("silver_ore");
	public static final Block silver_bricks = new SilverBricks("silver_bricks");
	public static final Block silver_block = new SilverBlock("silver_block");
	public static final Block csilver_block = new CondensedSilverBlock("silver_block_c");
	public static final Block scsilver_block = new SuperCondensedSilverBlock("silver_block_sc");
	public static final Block ucsilver_block = new UltraCondensedSilverBlock("silver_block_uc");
	
	public static final Block gold_bricks = new GoldBricks("gold_bricks");
	public static final Block cgold_block = new CondensedGoldBlock("gold_block_c");
	public static final Block scgold_block = new SuperCondensedGoldBlock("gold_block_sc");
	public static final Block ucgold_block = new UltraCondensedGoldBlock("gold_block_uc");
	
// - Tier 2 [Stone] - //
	
	public static final Block electrum_bricks = new ElectrumBricks("electrum_bricks");
	public static final Block electrum_block = new ElectrumBlock("electrum_block");
	public static final Block celectrum_block = new CondensedElectrumBlock("electrum_block_c");
	public static final Block scelectrum_block = new SuperCondensedElectrumBlock("electrum_block_sc");
	public static final Block ucelectrum_block = new UltraCondensedElectrumBlock("electrum_block_uc");
	
	public static final Block copper_ore = new CopperOre("copper_ore");
	public static final Block copper_bricks = new CopperBricks("copper_bricks");
	public static final Block copper_block = new CopperBlock("copper_block");
	public static final Block copper_grinder = new CopperGrinder("copper_grinder");
	public static final Block copper_furnace = new CopperFurnace("copper_furnace");
	
	public static final Block ignatius_ore = new IgnatiusOre("ignatius_ore");
	public static final Block ignatius_bricks = new IgnatiusBricks("ignatius_bricks");
	public static final Block ignatius_block = new IgnatiusBlock("ignatius_block");
	
	public static final Block prometheum_ore = new PrometheumOre("prometheum_ore");
	public static final Block prometheum_bricks = new PrometheumBricks("prometheum_bricks");
	public static final Block prometheum_block = new PrometheumBlock("prometheum_block");
	
// - Tier 3 [Iron] - //
	
	public static final Block platinum_ore = new PlatinumOre("platinum_ore");
	public static final Block platinum_bricks = new PlatinumBricks("platinum_bricks");
	public static final Block platinum_block = new PlatinumBlock("platinum_block");
	public static final Block cplatinum_block = new CondensedPlatinumBlock("platinum_block_c");
	public static final Block scplatinum_block = new SuperCondensedPlatinumBlock("platinum_block_sc");
	public static final Block ucplatinum_block = new UltraCondensedPlatinumBlock("platinum_block_uc");
	
	public static final Block bronze_bricks = new BronzeBricks("bronze_bricks");
	public static final Block bronze_block = new BronzeBlock("bronze_block");
	public static final Block bronze_grinder = new BronzeGrinder("bronze_grinder");
	public static final Block bronze_furnace = new BronzeFurnace("bronze_furnace");
	
	public static final Block iron_bricks = new IronBricks("iron_bricks");
	public static final Block iron_grinder = new IronGrinder("iron_grinder");
	public static final Block iron_furnace = new IronFurnace("iron_furnace");

	public static final Block dark_iron_ore = new DarkIronOre("dark_iron_ore");
	public static final Block dark_iron_bricks = new DarkIronBricks("dark_iron_bricks");
	public static final Block dark_iron_block = new DarkIronBlock("dark_iron_block");

	public static final Block shadow_iron_ore = new ShadowIronOre("shadow_iron_ore");
	public static final Block shadow_iron_bricks = new ShadowIronBricks("shadow_iron_bricks");
	public static final Block shadow_iron_block = new ShadowIronBlock("shadow_iron_block");
	
	public static final Block steel_bricks = new SteelBricks("steel_bricks");
	public static final Block steel_block = new SteelBlock("steel_block");
	public static final Block steel_grinder = new SteelGrinder("steel_grinder");
	public static final Block steel_furnace = new SteelFurnace("steel_furnace");
	
	public static final Block shadow_steel_bricks = new ShadowSteelBricks("shadow_steel_bricks");
	public static final Block shadow_steel_block = new ShadowSteelBlock("shadow_steel_block");
	
// - Tier 4 [Diamond] - //
	
	public static final Block midasium_ore = new MidasiumOre("midasium_ore");
	public static final Block midasium_bricks = new MidasiumBricks("midasium_bricks");
	public static final Block midasium_block = new MidasiumBlock("midasium_block");
	
	public static final Block vyroxeres_ore = new VyroxeresOre("vyroxeres_ore");
	public static final Block vyroxeres_bricks = new VyroxeresBricks("vyroxeres_bricks");
	public static final Block vyroxeres_block = new VyroxeresBlock("vyroxeres_block");
	
	public static final Block ceruclase_ore = new CeruclaseOre("ceruclase_ore");
	public static final Block ceruclase_bricks = new CeruclaseBricks("ceruclase_bricks");
	public static final Block ceruclase_block = new CeruclaseBlock("ceruclase_block");
	
	public static final Block oureclase_ore = new OureclaseOre("oureclase_ore");
	public static final Block oureclase_bricks = new OureclaseBricks("oureclase_bricks");
	public static final Block oureclase_block = new OureclaseBlock("oureclase_block");
	
	public static final Block carbon_steel_bricks = new CarbonSteelBricks("carbon_steel_bricks");
	public static final Block carbon_steel_block = new CarbonSteelBlock("carbon_steel_block");
	public static final Block carbon_steel_grinder = new CarbonSteelGrinder("carbon_steel_grinder");
	public static final Block carbon_steel_furnace = new CarbonSteelFurnace("carbon_steel_furnace");
	
	public static final Block eximite_ore = new EximiteOre("eximite_ore");
	public static final Block eximite_bricks = new EximiteBricks("eximite_bricks");
	public static final Block eximite_block = new EximiteBlock("eximite_block");
	
	public static final Block darksteel_bricks = new DarksteelBricks("darksteel_bricks");
	public static final Block darksteel_block = new DarksteelBlock("darksteel_block");
	
	public static final Block cdiamond_block = new CondensedDiamondBlock("diamond_block_c");
	public static final Block scdiamond_block = new SuperCondensedDiamondBlock("diamond_block_sc");
	public static final Block ucdiamond_block = new UltraCondensedDiamondBlock("diamond_block_uc");
	
	public static final Block obsidian_bricks = new ObsidianBricks("obsidian_bricks");
	public static final Block obsidian_block = new ObsidianBlock("obsidian_block");
	public static final Block obsidian_grinder = new ObsidianGrinder("obsidian_grinder");
	public static final Block obsidian_furnace = new ObsidianFurnace("obsidian_furnace");
	
// - Tier 5 [Damascus Steel] - //
	
	public static final Block astral_silver_ore = new AstralSilverOre("astral_silver_ore");
	public static final Block astral_silver_bricks = new AstralSilverBricks("astral_silver_bricks");
	public static final Block astral_silver_block = new AstralSilverBlock("astral_silver_block");
	
	public static final Block carmot_ore = new CarmotOre("carmot_ore");
	public static final Block carmot_bricks = new CarmotBricks("carmot_bricks");
	public static final Block carmot_block = new CarmotBlock("carmot_block");
	
	public static final Block kalendrite_ore = new KalendriteOre("kalendrite_ore");
	public static final Block kalendrite_bricks = new KalendriteBricks("kalendrite_bricks");
	public static final Block kalendrite_block = new KalendriteBlock("kalendrite_block");
	
	public static final Block inolashite_bricks = new InolashiteBricks("inolashite_bricks");
	public static final Block inolashite_block = new InolashiteBlock("inolashite_block");
	
	public static final Block amordrine_bricks = new AmordrineBricks("amordrine_bricks");
	public static final Block amordrine_block = new AmordrineBlock("amordrine_block");
	
	public static final Block mythril_ore = new MythrilOre("mythril_ore");
	public static final Block mythril_bricks = new MythrilBricks("mythril_bricks");
	public static final Block mythril_block = new MythrilBlock("mythril_block");
	
	public static final Block quicksilver_bricks = new QuicksilverBricks("quicksilver_bricks");
	public static final Block quicksilver_block = new QuicksilverBlock("quicksilver_block");
	
	public static final Block haderoth_bricks = new HaderothBricks("haderoth_bricks");
	public static final Block haderoth_block = new HaderothBlock("haderoth_block");
	
	public static final Block endersteel_bricks = new EndersteelBricks("endersteel_bricks");
	public static final Block endersteel_block = new EndersteelBlock("endersteel_block");
	
	public static final Block wootz_ore = new WootzOre("wootz_ore");
	public static final Block damascus_steel_bricks = new DamascusSteelBricks("damascus_steel_bricks");
	public static final Block damascus_steel_block = new DamascusSteelBlock("damascus_steel_block");

// - Tier 6 [Titanium] - //
	
	public static final Block titanium_ore = new TitaniumOre("titanium_ore");
	public static final Block titanium_bricks = new TitaniumBricks("titanium_bricks");
	public static final Block titanium_block = new TitaniumBlock("titanium_block");
	
	public static final Block orichalcum_ore = new OrichalcumOre("orichalcum_ore");
	public static final Block orichalcum_bricks = new OrichalcumBricks("orichalcum_bricks");
	public static final Block orichalcum_block = new OrichalcumBlock("orichalcum_block");
	
	public static final Block celenegil_bricks = new CelenegilBricks("celenegil_bricks");
	public static final Block celenegil_block = new CelenegilBlock("celenegil_block");
	
// - Tier 7 [Adamantium] - //
	
	public static final Block adamantium_ore = new AdamantiumOre("adamantium_ore");
	public static final Block adamantium_bricks = new AdamantiumBricks("adamantium_bricks");
	public static final Block adamantium_block = new AdamantiumBlock("adamantium_block");

	public static final Block sanguinite_ore = new SanguiniteOre("sanguinite_ore");
	public static final Block sanguinite_bricks = new SanguiniteBricks("sanguinite_bricks");
	public static final Block sanguinite_block = new SanguiniteBlock("sanguinite_block");

// - Tier 8 [Titansteel] - //
	
	public static final Block titansteel_bricks = new TitansteelBricks("titansteel_bricks");
	public static final Block titansteel_block = new TitansteelBlock("titansteel_block");
	
// - Tier 9 [Elemental] - //
	
	public static final Block elementium_ore = new ElementiumOre("elementium_ore");
		
	public static final Block cragnite_ore = new CragniteOre("cragnite_ore");
	public static final Block cragsteel_bricks = new CragsteelBricks("cragsteel_bricks");
	public static final Block cragsteel_block = new CragsteelBlock("cragsteel_block");
	public static final Block cragsteel_teleporter = new CragsteelTeleporter("cragsteel_teleporter");
	
	public static final Block hydrolite_ore = new HydroliteOre("hydrolite_ore");
	public static final Block hydrosteel_bricks = new HydrosteelBricks("hydrosteel_bricks");
	public static final Block hydrosteel_block = new HydrosteelBlock("hydrosteel_block");
	public static final Block hydrosteel_teleporter = new HydrosteelTeleporter("hydrosteel_teleporter");
	
	public static final Block zephyrite_ore = new ZephyriteOre("zephyrite_ore");
	public static final Block zephyrsteel_bricks = new ZephyrsteelBricks("zephyrsteel_bricks");
	public static final Block zephyrsteel_block = new ZephyrsteelBlock("zephyrsteel_block");
	public static final Block zephyrsteel_teleporter = new ZephyrsteelTeleporter("zephyrsteel_teleporter");

// - Tier 10 [Elemental Steel] - //
	
	public static final Block cragcliff_amber_ore = new CragcliffAmberOre("cragcliff_amber_ore");
	public static final Block cragcliff_amber_block = new CragcliffAmberBlock("cragcliff_amber_block");
	public static final Block pure_cragnite_ore = new PureCragniteOre("cragnite_ore_pure");
	public static final Block enchanted_cragsteel_block = new EnchantedCragsteelBlock("cragsteel_block_enchanted");
	
	public static final Block ruemus_sapphire_ore = new RuemusSapphireOre("ruemus_sapphire_ore");
	public static final Block ruemus_sapphire_block = new RuemusSapphireBlock("ruemus_sapphire_block");
	public static final Block pure_hydrolite_ore = new PureHydroliteOre("hydrolite_ore_pure");
	public static final Block enchanted_hydrosteel_block = new EnchantedHydrosteelBlock("hydrosteel_block_enchanted");
	
	public static final Block skyridge_emerald_ore = new SkyridgeEmeraldOre("skyridge_emerald_ore");
	public static final Block skyridge_emerald_block = new SkyridgeEmeraldBlock("skyridge_emerald_block");
	public static final Block pure_zephyrite_ore = new PureZephyriteOre("zephyrite_ore_pure");
	public static final Block enchanted_zephyrsteel_block = new EnchantedZephyrsteelBlock("zephyrsteel_block_enchanted");

// - Tier X [Chronosteel] - //
	
}