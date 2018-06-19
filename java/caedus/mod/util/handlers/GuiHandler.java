package caedus.mod.util.handlers;

import caedus.mod.objects.blocks.machines.furnace.bronze.BronzeFurnaceGui;
import caedus.mod.objects.blocks.machines.furnace.bronze.ContainerBronzeFurnace;
import caedus.mod.objects.blocks.machines.furnace.bronze.TileEntityBronzeFurnace;
import caedus.mod.objects.blocks.machines.furnace.carbonsteel.CarbonSteelFurnaceGui;
import caedus.mod.objects.blocks.machines.furnace.carbonsteel.ContainerCarbonSteelFurnace;
import caedus.mod.objects.blocks.machines.furnace.carbonsteel.TileEntityCarbonSteelFurnace;
import caedus.mod.objects.blocks.machines.furnace.copper.ContainerCopperFurnace;
import caedus.mod.objects.blocks.machines.furnace.copper.CopperFurnaceGui;
import caedus.mod.objects.blocks.machines.furnace.copper.TileEntityCopperFurnace;
import caedus.mod.objects.blocks.machines.furnace.iron.ContainerIronFurnace;
import caedus.mod.objects.blocks.machines.furnace.iron.IronFurnaceGui;
import caedus.mod.objects.blocks.machines.furnace.iron.TileEntityIronFurnace;
import caedus.mod.objects.blocks.machines.furnace.obsidian.ContainerObsidianFurnace;
import caedus.mod.objects.blocks.machines.furnace.obsidian.ObsidianFurnaceGui;
import caedus.mod.objects.blocks.machines.furnace.obsidian.TileEntityObsidianFurnace;
import caedus.mod.objects.blocks.machines.furnace.steel.ContainerSteelFurnace;
import caedus.mod.objects.blocks.machines.furnace.steel.SteelFurnaceGui;
import caedus.mod.objects.blocks.machines.furnace.steel.TileEntitySteelFurnace;
import caedus.mod.objects.blocks.machines.grinder.bronze.BronzeGrinderGui;
import caedus.mod.objects.blocks.machines.grinder.bronze.ContainerBronzeGrinder;
import caedus.mod.objects.blocks.machines.grinder.bronze.TileEntityBronzeGrinder;
import caedus.mod.objects.blocks.machines.grinder.carbonsteel.CarbonSteelGrinderGui;
import caedus.mod.objects.blocks.machines.grinder.carbonsteel.ContainerCarbonSteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.carbonsteel.TileEntityCarbonSteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.copper.ContainerCopperGrinder;
import caedus.mod.objects.blocks.machines.grinder.copper.CopperGrinderGui;
import caedus.mod.objects.blocks.machines.grinder.copper.TileEntityCopperGrinder;
import caedus.mod.objects.blocks.machines.grinder.iron.ContainerIronGrinder;
import caedus.mod.objects.blocks.machines.grinder.iron.IronGrinderGui;
import caedus.mod.objects.blocks.machines.grinder.iron.TileEntityIronGrinder;
import caedus.mod.objects.blocks.machines.grinder.obsidian.ContainerObsidianGrinder;
import caedus.mod.objects.blocks.machines.grinder.obsidian.ObsidianGrinderGui;
import caedus.mod.objects.blocks.machines.grinder.obsidian.TileEntityObsidianGrinder;
import caedus.mod.objects.blocks.machines.grinder.steel.ContainerSteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.steel.SteelGrinderGui;
import caedus.mod.objects.blocks.machines.grinder.steel.TileEntitySteelGrinder;
import caedus.mod.objects.blocks.machines.grinder.stone.ContainerGrinder;
import caedus.mod.objects.blocks.machines.grinder.stone.GrinderGui;
import caedus.mod.objects.blocks.machines.grinder.stone.TileEntityGrinder;
import caedus.mod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID == Reference.gui_grinder) return new ContainerGrinder(player.inventory, (TileEntityGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_copper_grinder) return new ContainerCopperGrinder(player.inventory, (TileEntityCopperGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_bronze_grinder) return new ContainerBronzeGrinder(player.inventory, (TileEntityBronzeGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_iron_grinder) return new ContainerIronGrinder(player.inventory, (TileEntityIronGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_steel_grinder)return new ContainerSteelGrinder(player.inventory, (TileEntitySteelGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_carbon_steel_grinder)return new ContainerCarbonSteelGrinder(player.inventory, (TileEntityCarbonSteelGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_obsidian_grinder)return new ContainerObsidianGrinder(player.inventory, (TileEntityObsidianGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		
		if (ID == Reference.gui_copper_furnace)return new ContainerCopperFurnace(player.inventory, (TileEntityCopperFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_bronze_furnace)return new ContainerBronzeFurnace(player.inventory, (TileEntityBronzeFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_iron_furnace)return new ContainerIronFurnace(player.inventory, (TileEntityIronFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_steel_furnace)return new ContainerSteelFurnace(player.inventory, (TileEntitySteelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_carbon_steel_furnace)return new ContainerCarbonSteelFurnace(player.inventory, (TileEntityCarbonSteelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_obsidian_furnace)return new ContainerObsidianFurnace(player.inventory, (TileEntityObsidianFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID == Reference.gui_grinder) return new GrinderGui(player.inventory, (TileEntityGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_copper_grinder) return new CopperGrinderGui(player.inventory, (TileEntityCopperGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_bronze_grinder) return new BronzeGrinderGui(player.inventory, (TileEntityBronzeGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_iron_grinder) return new IronGrinderGui(player.inventory, (TileEntityIronGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_steel_grinder) return new SteelGrinderGui(player.inventory, (TileEntitySteelGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_carbon_steel_grinder) return new CarbonSteelGrinderGui(player.inventory, (TileEntityCarbonSteelGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_obsidian_grinder) return new ObsidianGrinderGui(player.inventory, (TileEntityObsidianGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		
		if (ID == Reference.gui_copper_furnace)return new CopperFurnaceGui(player.inventory, (TileEntityCopperFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_bronze_furnace)return new BronzeFurnaceGui(player.inventory, (TileEntityBronzeFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_iron_furnace)return new IronFurnaceGui(player.inventory, (TileEntityIronFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_steel_furnace)return new SteelFurnaceGui(player.inventory, (TileEntitySteelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_carbon_steel_furnace)return new CarbonSteelFurnaceGui(player.inventory, (TileEntityCarbonSteelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if (ID == Reference.gui_obsidian_furnace)return new ObsidianFurnaceGui(player.inventory, (TileEntityObsidianFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}

}