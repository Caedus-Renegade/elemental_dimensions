package caedus.mod.worldgen.dimension.skyridge;

import caedus.mod.init.BiomeInit;
import caedus.mod.init.DimensionInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class SkyridgeDimension extends WorldProvider
{
	public SkyridgeDimension()
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.SKYRIDGE_HIGHLANDS);
	}
	
	@Override
	public DimensionType getDimensionType()
	{
		return DimensionInit.SKYRIDGE;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorSkyridge(world, true, world.getSeed());
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
	
}
