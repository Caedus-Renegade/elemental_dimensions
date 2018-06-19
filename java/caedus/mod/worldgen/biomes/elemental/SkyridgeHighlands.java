package caedus.mod.worldgen.biomes.elemental;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.entity.EntitySkyridgeWolf;
import caedus.mod.worldgen.trees.elemental.SkyridgeEbonyTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;


public class SkyridgeHighlands extends Biome 
{
	protected static final WorldGenAbstractTree skyridge_ebony = new SkyridgeEbonyTree(true, true);
	
	public SkyridgeHighlands() 
	{
		
		super(new BiomeProperties("Skyridge Highlands").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(11206570));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = BlockInit.zephyrstone.getDefaultState();
		
		this.decorator.treesPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySkyridgeWolf.class, 10, 1, 5));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return skyridge_ebony;
	}
	
}