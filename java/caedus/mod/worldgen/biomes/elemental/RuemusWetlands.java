package caedus.mod.worldgen.biomes.elemental;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.worldgen.trees.elemental.RuemusTeakTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class RuemusWetlands extends Biome 
{
	protected static final WorldGenAbstractTree ruemus_teak = new RuemusTeakTree(true, true);
	
	public RuemusWetlands() 
	{
		super(new BiomeProperties("Ruemus Wetlands").setBaseHeight(-0.1F).setHeightVariation(0.15F).setTemperature(1.2F).setRainfall(1.35F).setWaterColor(14745518));

		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = BlockInit.hydrostone.getDefaultState();
		
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
		return ruemus_teak;
	}
	
	@Override
	public boolean isHighHumidity()
	{
		return true;
	}
}