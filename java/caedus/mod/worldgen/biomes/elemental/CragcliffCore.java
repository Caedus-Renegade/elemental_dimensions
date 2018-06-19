package caedus.mod.worldgen.biomes.elemental;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.worldgen.trees.elemental.CragcliffLarchTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;


public class CragcliffCore extends Biome 
{
	protected static final WorldGenAbstractTree cragcliffLarch = new CragcliffLarchTree(true, true);
	
	public CragcliffCore() 
	{
		super(new BiomeProperties("Cragcliff Core").setBaseHeight(0.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(11206570));
		
		topBlock = Blocks.DIRT.getDefaultState();
		fillerBlock = BlockInit.cragstone.getDefaultState();
		
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
		return cragcliffLarch;
	}
}