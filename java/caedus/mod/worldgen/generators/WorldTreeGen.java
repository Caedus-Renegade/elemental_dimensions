package caedus.mod.worldgen.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import caedus.mod.init.BiomeInit;
import caedus.mod.worldgen.biomes.elemental.CragcliffCore;
import caedus.mod.worldgen.biomes.elemental.RuemusWetlands;
import caedus.mod.worldgen.biomes.elemental.SkyridgeHighlands;
import caedus.mod.worldgen.biomes.normal.EbonyForest;
import caedus.mod.worldgen.biomes.normal.LarchForest;
import caedus.mod.worldgen.biomes.normal.TeakForest;
import caedus.mod.worldgen.trees.elemental.CragcliffLarchTree;
import caedus.mod.worldgen.trees.elemental.RuemusTeakTree;
import caedus.mod.worldgen.trees.elemental.SkyridgeEbonyTree;
import caedus.mod.worldgen.trees.normal.AshTree;
import caedus.mod.worldgen.trees.normal.CocoboloTree;
import caedus.mod.worldgen.trees.normal.LarchTree;
import caedus.mod.worldgen.trees.normal.MyrtleEbonyTree;
import caedus.mod.worldgen.trees.normal.TeakTree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldTreeGen implements IWorldGenerator
{
//	private final WorldGenerator ASH = new AshTree(false, false);
//	private final WorldGenerator COCOBOLO = new CocoboloTree(false, false);
	private final WorldGenerator EBONY = new MyrtleEbonyTree(false, false);
	private final WorldGenerator LARCH = new LarchTree(false, false);
	private final WorldGenerator TEAK = new TeakTree(false, false);
	private final WorldGenerator CRAGCLIFF = new CragcliffLarchTree(true, true);
	private final WorldGenerator RUEMUS = new RuemusTeakTree(true, true);
	private final WorldGenerator SKYRIDGE = new SkyridgeEbonyTree(true, true);
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			
			break;
			
		case 0:
			
//			runGenerator(ASH, world, random, chunkX, chunkZ, 1, -1, 0, BiomeForest.class);
//			runGenerator(COCOBOLO, world, random, chunkX, chunkZ, 1, -1, 0, BiomeJungle.class, BiomeSwamp.class);
			runGenerator(EBONY, world, random, chunkX, chunkZ, 1, -1, 0, EbonyForest.class, SkyridgeHighlands.class);
			runGenerator(LARCH, world, random, chunkX, chunkZ, 1, -1, 0, LarchForest.class, CragcliffCore.class);
			runGenerator(TEAK, world, random, chunkX, chunkZ, 1, -1, 0, TeakForest.class, RuemusWetlands.class);
			runGenerator(CRAGCLIFF, world, random, chunkX, chunkZ, 1, -1, 0, CragcliffCore.class);
			runGenerator(RUEMUS, world, random, chunkX, chunkZ, 1, -1, 0, RuemusWetlands.class);
			runGenerator(SKYRIDGE, world, random, chunkX, chunkZ, 1, -1, 0, SkyridgeHighlands.class);
			
			break;
			
		case -1:
			
			break;
			
		case 2:
			
			runGenerator(CRAGCLIFF, world, random, chunkX, chunkZ, 3, -1, 0, CragcliffCore.class);
			
			break;
			
		case 3:
			
			runGenerator(RUEMUS, world, random, chunkX, chunkZ, 3, -1, 0, RuemusWetlands.class);
			
			break;
			
		case 6:
			
			runGenerator(SKYRIDGE, world, random, chunkX, chunkZ, 3, -1, 0, SkyridgeHighlands.class);
			
			break;
			
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