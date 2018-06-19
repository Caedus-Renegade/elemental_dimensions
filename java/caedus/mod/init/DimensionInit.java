package caedus.mod.init;

import caedus.mod.worldgen.dimension.cragcliff.CragcliffCoreDimension;
import caedus.mod.worldgen.dimension.ruemus.RuemusDimension;
import caedus.mod.worldgen.dimension.skyridge.SkyridgeDimension;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType CRAGCLIFF = DimensionType.register("Cragcliff", "_cragcliff", 2, CragcliffCoreDimension.class, false);
	public static final DimensionType RUEMUS = DimensionType.register("Ruemus", "_ruemus", 3, RuemusDimension.class, false);
	public static final DimensionType SKYRIDGE = DimensionType.register("Skyridge", "_skyridge", 6, SkyridgeDimension.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(2, CRAGCLIFF);
		DimensionManager.registerDimension(3, RUEMUS);
//		4
//		5
		DimensionManager.registerDimension(6, SKYRIDGE);
//		7
//		8
	}
}
