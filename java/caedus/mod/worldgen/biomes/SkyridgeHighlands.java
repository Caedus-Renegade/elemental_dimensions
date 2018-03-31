package caedus.mod.worldgen.biomes;

import java.util.Random;

import caedus.mod.entity.EntitySkyridgeWolf;
import caedus.mod.init.BlockInit;
import caedus.mod.worldgen.SkyridgeEbonyTree;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class SkyridgeHighlands extends Biome 
{
	protected static final WorldGenAbstractTree TREE = new SkyridgeEbonyTree();
	
	public SkyridgeHighlands() 
	{
		super(new BiomeProperties("Skyridge_Highlands").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(11206570));
		
		topBlock = BlockInit.ZEPHYRSTONE.getDefaultState();
		fillerBlock = BlockInit.ZEPHYRSTONE.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(BlockInit.ELEMENTIUM_ORE.getDefaultState(), 9);
		this.decorator.ironGen = new WorldGenMinable(BlockInit.ZEPHYRITE_ORE.getDefaultState(), 9);
		
		this.decorator.treesPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySkyridgeWolf.class, 10, 1, 5));
//		this.spawnableCreatureList.add(new SpawnListEntry(EntityDragon.class, 5, 1, 2));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}
}