package caedus.mod.worldgen.dimension.ruemus;

import caedus.mod.init.BiomeInit;
import caedus.mod.init.DimensionInit;
import caedus.mod.init.BiomeInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class RuemusDimension extends WorldProvider
{
	public RuemusDimension()
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.ruemus_wetlands);
	}
	
	@Override
	public DimensionType getDimensionType()
	{
		return DimensionInit.RUEMUS;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorRuemusWetlands(world, true, world.getSeed());
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
