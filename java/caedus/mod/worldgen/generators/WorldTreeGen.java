package caedus.mod.worldgen.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import caedus.mod.worldgen.AshTree;
import caedus.mod.worldgen.HailstormAshTree;
import caedus.mod.worldgen.MyrtleEbonyTree;
import caedus.mod.worldgen.SkyridgeEbonyTree;
import caedus.mod.worldgen.biomes.SkyridgeHighlands;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldTreeGen implements IWorldGenerator
{
	private final WorldGenerator ASH = new AshTree();
	private final WorldGenerator HAILSTORM = new HailstormAshTree();
	private final WorldGenerator EBONY = new MyrtleEbonyTree();
	private final WorldGenerator SKYRIDGE = new SkyridgeEbonyTree();
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			
			break;
			
		case 0:
			
//			runGenerator(ASH, world, random, chunkX, chunkZ, 3, -1, 0, BiomePlains.class);
//			runGenerator(HAILSTORM, world, random, chunkX, chunkZ, 3, -1, 0, BiomePlains.class);
//			runGenerator(EBONY, world, random, chunkX, chunkZ, 3, -1, 0, BiomePlains.class);
//			runGenerator(SKYRIDGE, world, random, chunkX, chunkZ, 3, -1, 0, BiomePlains.class, SkyridgeHighlands.class);
			
			break;
			
		case -1:
			
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chancesToSpawn, int minHeight, int maxHeight, Class<?>... classes)
	{
		if(chancesToSpawn < 1) 
		{
			if(random.nextDouble() < chancesToSpawn) chancesToSpawn = 1;
			else chancesToSpawn = 0;
		}
		
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++)
		{
			BlockPos pos = new BlockPos(chunkX * 16 + 10 + random.nextInt(15), minHeight + random.nextInt(heightDiff), chunkZ * 16 + 10 + random.nextInt(15));
			if(minHeight < 0) pos = world.getHeight(pos);
			Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
			if(classesList.contains(biome) || classes.length == 0) generator.generate(world, random, pos);
		}
	}
}