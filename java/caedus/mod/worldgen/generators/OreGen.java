package caedus.mod.worldgen.generators;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.objects.blocks.ore.CopperOre;
import caedus.mod.util.handlers.trees.EbonyTreeEnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator
{
	private WorldGenerator tin_ore;
	private WorldGenerator zinc_ore;
	private WorldGenerator silver_ore;
	private WorldGenerator copper_overworld;
	private WorldGenerator copper_nether;
	private WorldGenerator copper_end;
	private WorldGenerator ignatius_ore;
	private WorldGenerator elementium_ore;
	private WorldGenerator zephyrite_ore;
	
	public OreGen()
	{
// - Tier 1 - //
		tin_ore = new WorldGenMinable(BlockInit.TIN_ORE.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.STONE));
		zinc_ore = new WorldGenMinable(BlockInit.ZINC_ORE.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));
		silver_ore = new WorldGenMinable(BlockInit.SILVER_ORE.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.STONE));
// - Tier 2 - //
		copper_overworld = new WorldGenMinable(BlockInit.COPPER_ORE.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));
		copper_nether = new WorldGenMinable(BlockInit.COPPER_ORE_NETHER.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
		copper_end = new WorldGenMinable(BlockInit.COPPER_ORE_END.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.END_STONE));
		ignatius_ore = new WorldGenMinable(BlockInit.IGNATIUS_ORE.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
// - Tier 8 - //
		elementium_ore = new WorldGenMinable(BlockInit.ELEMENTIUM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
// - Tier 9 - //
		zephyrite_ore = new WorldGenMinable(BlockInit.ZEPHYRITE_ORE.getDefaultState(), 3, BlockMatcher.forBlock(BlockInit.ZEPHYRSTONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
		case -1:
		
			runGenerator(copper_nether, world, random, chunkX, chunkZ, 24, 0, 256);
			runGenerator(ignatius_ore, world, random, chunkX, chunkZ, 18, 0, 256);
			
			break;
			
		case 0:
			
			runGenerator(tin_ore, world, random, chunkX, chunkZ, 20, 0, 256);
			runGenerator(zinc_ore, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(silver_ore, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(copper_overworld, world, random, chunkX, chunkZ, 24, 0, 256);
			runGenerator(elementium_ore, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(zephyrite_ore, world, random, chunkX, chunkZ, 3, 0, 256);
			break;
			
		case 1:
			
			runGenerator(copper_end, world, random, chunkX, chunkZ, 24, 0, 256);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}