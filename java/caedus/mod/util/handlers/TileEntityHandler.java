package caedus.mod.util.handlers;

import caedus.mod.objects.blocks.machines.furnace.bronze.TileEntityBronzeFurnace;
import caedus.mod.objects.blocks.machines.furnace.carbonsteel.TileEntityCarbonSteelFurnace;
import caedus.mod.objects.blocks.machines.furnace.copper.TileEntityCopperFurnace;
import caedus.mod.objects.blocks.machines.furnace.iron.TileEntityIronFurnace;
import caedus.mod.objects.blocks.machines.furnace.obsidian.TileEntityObsidianFurnace;
import caedus.mod.objects.blocks.machines.furnace.steel.TileEntitySteelFurnace;
import caedus.mod.objects.blocks.machines.grinder.bronze.TileEntityBronzeGrinder;
import caedus.mod.objects.blocks.machines.grinder.carbonsteel.TileEntityCarbonSteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.copper.TileEntityCopperGrinder;
import caedus.mod.objects.blocks.machines.grinder.iron.TileEntityIronGrinder;
import caedus.mod.objects.blocks.machines.grinder.obsidian.TileEntityObsidianGrinder;
import caedus.mod.objects.blocks.machines.grinder.steel.TileEntitySteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.stone.TileEntityGrinder;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityGrinder.class, "grinder");
		GameRegistry.registerTileEntity(TileEntityCopperGrinder.class, "copper_grinder");
		GameRegistry.registerTileEntity(TileEntityBronzeGrinder.class, "bronze_grinder");
		GameRegistry.registerTileEntity(TileEntityIronGrinder.class, "iron_grinder");
		GameRegistry.registerTileEntity(TileEntitySteelGrinder.class, "steel_grinder");
		GameRegistry.registerTileEntity(TileEntityCarbonSteelGrinder.class, "carbon_steel_grinder");
		GameRegistry.registerTileEntity(TileEntityObsidianGrinder.class, "obsidian_grinder");
		
		GameRegistry.registerTileEntity(TileEntityCopperFurnace.class, "copper_furnace");
		GameRegistry.registerTileEntity(TileEntityBronzeFurnace.class, "bronze_furnace");
		GameRegistry.registerTileEntity(TileEntityIronFurnace.class, "iron_furnace");
		GameRegistry.registerTileEntity(TileEntitySteelFurnace.class, "steel_furnace");
		GameRegistry.registerTileEntity(TileEntityCarbonSteelFurnace.class, "carbon_steel_furnace");
		GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, "obsidian_furnace");
	}
}