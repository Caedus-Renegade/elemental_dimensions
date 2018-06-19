package caedus.mod.worldgen.dimension.cragcliff;

import caedus.mod.init.BiomeInit;
import caedus.mod.init.DimensionInit;
import caedus.mod.init.BiomeInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class CragcliffCoreDimension extends WorldProvider
{
	public CragcliffCoreDimension()
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.cragcliff_core);
	}
	
	@Override
	public DimensionType getDimensionType()
	{
		return DimensionInit.CRAGCLIFF;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorCragcliff(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
	
	@Override
	public boolean hasSkyLight()
	{
		return false;
	}
	
}
