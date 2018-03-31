package caedus.mod.util.handlers;

import caedus.mod.objects.blocks.machines.alloyer.ContainerAlloyer;
import caedus.mod.objects.blocks.machines.alloyer.GuiAlloyer;
import caedus.mod.objects.blocks.machines.alloyer.TileEntityAlloyer;
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
		if(ID == Reference.GUI_ALLOYER) return new ContainerAlloyer(player.inventory, (TileEntityAlloyer)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ALLOYER) return new GuiAlloyer(player.inventory, (TileEntityAlloyer)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}