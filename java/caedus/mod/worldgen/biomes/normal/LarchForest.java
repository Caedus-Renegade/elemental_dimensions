package caedus.mod.worldgen.biomes.normal;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.worldgen.trees.elemental.CragcliffLarchTree;
import caedus.mod.worldgen.trees.normal.LarchTree;
import caedus.mod.worldgen.trees.normal.TeakTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;


public class LarchForest extends Biome 
{
	protected static final WorldGenAbstractTree larch_tree = new LarchTree(true, true);
	
	public LarchForest() 
	{
		super(new BiomeProperties("Larch Forest").setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.5F).setRainfall(0.5F).setWaterColor(16777215));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.STONE.getDefaultState();
		
//		this.decorator.coalGen = new WorldGenMinable(BlockInit.elementium_ore.getDefaultState(), 9);
//		this.decorator.ironGen = new WorldGenMinable(BlockInit.zephyrite_ore.getDefaultState(), 9);
		
		this.decorator.treesPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
//		this.spawnableCreatureList.add(new SpawnListEntry(EntitySkyridgeWolf.class, 10, 1, 5));
//		this.spawnableCreatureList.add(new SpawnListEntry(EntityDragon.class, 5, 1, 2));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return larch_tree;
	}
}