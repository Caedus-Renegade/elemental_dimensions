package caedus.mod.util.handlers;

import caedus.mod.objects.blocks.machines.alloyer.TileEntityAlloyer;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityAlloyer.class, "alloyer");
	}
}