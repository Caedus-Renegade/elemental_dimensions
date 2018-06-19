package caedus.mod.worldgen.biomes.normal;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.worldgen.trees.normal.MyrtleEbonyTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;


public class EbonyForest extends Biome 
{
	protected static final WorldGenAbstractTree ebony_tree = new MyrtleEbonyTree(true, true);
	
	public EbonyForest() 
	{
		super(new BiomeProperties("Ebony Forest").setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.5F).setRainfall(0.5F).setWaterColor(16777215));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.STONE.getDefaultState();
		
		this.decorator.treesPerChunk = 1;
		this.decorator.grassPerChunk = 1;
		this.decorator.flowersPerChunk =1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return ebony_tree;
	}
}