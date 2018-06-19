package caedus.mod.worldgen.generators;

import java.util.Random;

import caedus.mod.init.BlockInit;
import caedus.mod.objects.blocks.ore.CopperOre;
import caedus.mod.objects.blocks.ore.CragniteOre;
import caedus.mod.objects.blocks.ore.HydroliteOre;
import caedus.mod.objects.blocks.ore.PureCragniteOre;
import caedus.mod.objects.blocks.ore.PureHydroliteOre;
import caedus.mod.objects.blocks.ore.PureZephyriteOre;
import caedus.mod.objects.blocks.ore.ZephyriteOre;
import caedus.mod.util.handlers.ore.CragniteOreEnumHandler;
import caedus.mod.util.handlers.ore.HydroliteOreEnumHandler;
import caedus.mod.util.handlers.ore.ZephyriteOreEnumHandler;
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
//	private WorldGenerator coal_ore;
	private WorldGenerator tin_ore;
	private WorldGenerator zinc_ore;
	private WorldGenerator manganese_ore;
	private WorldGenerator lead_ore;
	private WorldGenerator silver_ore;
	private WorldGenerator copper_ore;
	private WorldGenerator redstone_ore;
	private WorldGenerator platinum_ore;
//	private WorldGenerator iron_ore;
//	private WorldGenerator diamond_ore;
	private WorldGenerator obsidian_overworld;
	private WorldGenerator wootz_ore;
	private WorldGenerator titanium_ore;
	private WorldGenerator elementium_ore;
	private WorldGenerator amber_ore;
	private WorldGenerator sapphire_ore;
	private WorldGenerator emerald_ore;
	private WorldGenerator cragnite_ore_overworld;
	private WorldGenerator hydrolite_ore_overworld;
	private WorldGenerator zephyrite_ore_overworld;
	
	private WorldGenerator luminite_ore;
	private WorldGenerator adluorite_ore;
	private WorldGenerator ignatius_ore;
	private WorldGenerator shadow_iron_ore;
	private WorldGenerator midasium_ore;
	private WorldGenerator vyroxeres_ore;
	private WorldGenerator ceruclase_ore;
	private WorldGenerator obsidian_nether;
	private WorldGenerator kalendrite_ore;
	private WorldGenerator sanguinite_ore;
	private WorldGenerator cragnite_ore_nether;
	private WorldGenerator hydrolite_ore_nether;
	private WorldGenerator zephyrite_ore_nether;
	
	private WorldGenerator eximite_ore;
	private WorldGenerator meutoite_ore;
	private WorldGenerator obsidian_end;
	private WorldGenerator cragnite_ore_end;
	private WorldGenerator hydrolite_ore_end;
	private WorldGenerator zephyrite_ore_end;
	
	private WorldGenerator infuscolium_ore_cragcliff;
	private WorldGenerator prometheum_ore_cragcliff;
	private WorldGenerator dark_iron_ore_cragcliff;
	private WorldGenerator rubracium_ore_cragcliff;
	private WorldGenerator oureclase_ore_cragcliff;
	private WorldGenerator astral_silver_ore_cragcliff;
	private WorldGenerator carmot_ore_cragcliff;
	private WorldGenerator mythril_ore_cragcliff;
	private WorldGenerator orichalcum_ore_cragcliff;
	private WorldGenerator elementium_ore_cragcliff;
	private WorldGenerator adamantium_ore_cragcliff;
	private WorldGenerator cragcliff_amber_ore;
	private WorldGenerator pure_cragnite_ore;
	
	private WorldGenerator infuscolium_ore_ruemus;
	private WorldGenerator prometheum_ore_ruemus;
	private WorldGenerator dark_iron_ore_ruemus;
	private WorldGenerator rubracium_ore_ruemus;
	private WorldGenerator oureclase_ore_ruemus;
	private WorldGenerator astral_silver_ore_ruemus;
	private WorldGenerator carmot_ore_ruemus;
	private WorldGenerator mythril_ore_ruemus;
	private WorldGenerator orichalcum_ore_ruemus;
	private WorldGenerator elementium_ore_ruemus;
	private WorldGenerator adamantium_ore_ruemus;
	private WorldGenerator ruemus_sapphire_ore;
	private WorldGenerator pure_hydrolite_ore;
	
	private WorldGenerator infuscolium_ore_skyridge;
	private WorldGenerator prometheum_ore_skyridge;
	private WorldGenerator dark_iron_ore_skyridge;
	private WorldGenerator rubracium_ore_skyridge;
	private WorldGenerator oureclase_ore_skyridge;
	private WorldGenerator astral_silver_ore_skyridge;
	private WorldGenerator carmot_ore_skyridge;
	private WorldGenerator mythril_ore_skyridge;
	private WorldGenerator orichalcum_ore_skyridge;
	private WorldGenerator elementium_ore_skyridge;
	private WorldGenerator adamantium_ore_skyridge;
	private WorldGenerator skyridge_emerald_ore;
	private WorldGenerator pure_zephyrite_ore;
	
	public OreGen()
	{
// - Overworld - //
//		coal_ore = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 16, BlockMatcher.forBlock(Blocks.STONE));
		tin_ore = new WorldGenMinable(BlockInit.tin_ore.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.STONE));
//		iron_ore = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.STONE));
		redstone_ore = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));
		zinc_ore = new WorldGenMinable(BlockInit.zinc_ore.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));
		copper_ore = new WorldGenMinable(BlockInit.copper_ore.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));
		silver_ore = new WorldGenMinable(BlockInit.silver_ore.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.STONE));
		wootz_ore = new WorldGenMinable(BlockInit.wootz_ore.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		amber_ore = new WorldGenMinable(BlockInit.amber_ore.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		sapphire_ore = new WorldGenMinable(BlockInit.sapphire_ore.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		manganese_ore = new WorldGenMinable(BlockInit.manganese_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		lead_ore = new WorldGenMinable(BlockInit.lead_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		emerald_ore = new WorldGenMinable(BlockInit.emerald_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		platinum_ore = new WorldGenMinable(BlockInit.platinum_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
//		diamond_ore = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		obsidian_overworld = new WorldGenMinable(Blocks.OBSIDIAN.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		cragnite_ore_overworld = new WorldGenMinable(BlockInit.cragnite_ore.getDefaultState().withProperty(CragniteOre.VARIANT, CragniteOreEnumHandler.EnumType.overworld), 3, BlockMatcher.forBlock(Blocks.STONE));
		hydrolite_ore_overworld = new WorldGenMinable(BlockInit.hydrolite_ore.getDefaultState().withProperty(HydroliteOre.VARIANT, HydroliteOreEnumHandler.EnumType.overworld), 3, BlockMatcher.forBlock(Blocks.STONE));
		zephyrite_ore_overworld = new WorldGenMinable(BlockInit.zephyrite_ore.getDefaultState().withProperty(ZephyriteOre.VARIANT, ZephyriteOreEnumHandler.EnumType.overworld), 3, BlockMatcher.forBlock(Blocks.STONE));
		titanium_ore = new WorldGenMinable(BlockInit.titanium_ore.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
		elementium_ore = new WorldGenMinable(BlockInit.elementium_ore.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.STONE));
		
// - Nether - //
		
		ignatius_ore = new WorldGenMinable(BlockInit.ignatius_ore.getDefaultState(), 18, BlockMatcher.forBlock(Blocks.NETHERRACK));
		shadow_iron_ore = new WorldGenMinable(BlockInit.shadow_iron_ore.getDefaultState() ,14 , BlockMatcher.forBlock(Blocks.NETHERRACK));
		vyroxeres_ore = new WorldGenMinable(BlockInit.vyroxeres_ore.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.NETHERRACK));
		luminite_ore = new WorldGenMinable(BlockInit.luminite_ore.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
		midasium_ore = new WorldGenMinable(BlockInit.midasium_ore.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
		adluorite_ore = new WorldGenMinable(BlockInit.adluorite_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ceruclase_ore = new WorldGenMinable(BlockInit.ceruclase_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		kalendrite_ore = new WorldGenMinable(BlockInit.kalendrite_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		sanguinite_ore = new WorldGenMinable(BlockInit.sanguinite_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
		obsidian_nether = new WorldGenMinable(Blocks.OBSIDIAN.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		cragnite_ore_nether = new WorldGenMinable(BlockInit.cragnite_ore.getDefaultState().withProperty(CragniteOre.VARIANT, CragniteOreEnumHandler.EnumType.nether), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		hydrolite_ore_nether = new WorldGenMinable(BlockInit.hydrolite_ore.getDefaultState().withProperty(HydroliteOre.VARIANT, HydroliteOreEnumHandler.EnumType.nether), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		zephyrite_ore_nether = new WorldGenMinable(BlockInit.zephyrite_ore.getDefaultState().withProperty(ZephyriteOre.VARIANT, ZephyriteOreEnumHandler.EnumType.nether), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
// - End - //
		
		eximite_ore = new WorldGenMinable(BlockInit.eximite_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.END_STONE));
		meutoite_ore = new WorldGenMinable(BlockInit.meutoite_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.END_STONE));
		obsidian_end = new WorldGenMinable(Blocks.OBSIDIAN.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.END_STONE));
		cragnite_ore_end = new WorldGenMinable(BlockInit.cragnite_ore.getDefaultState().withProperty(CragniteOre.VARIANT, CragniteOreEnumHandler.EnumType.end), 3, BlockMatcher.forBlock(Blocks.END_STONE));
		hydrolite_ore_end = new WorldGenMinable(BlockInit.hydrolite_ore.getDefaultState().withProperty(HydroliteOre.VARIANT, HydroliteOreEnumHandler.EnumType.end), 3, BlockMatcher.forBlock(Blocks.END_STONE));
		zephyrite_ore_end = new WorldGenMinable(BlockInit.zephyrite_ore.getDefaultState().withProperty(ZephyriteOre.VARIANT, ZephyriteOreEnumHandler.EnumType.end), 3, BlockMatcher.forBlock(Blocks.END_STONE));
		
// - Cragcliff - //
		
		prometheum_ore_cragcliff = new WorldGenMinable(BlockInit.prometheum_ore.getDefaultState(), 12, BlockMatcher.forBlock(BlockInit.cragstone));
		elementium_ore_cragcliff = new WorldGenMinable(BlockInit.elementium_ore.getDefaultState(), 12, BlockMatcher.forBlock(BlockInit.cragstone));
		cragcliff_amber_ore = new WorldGenMinable(BlockInit.cragcliff_amber_ore.getDefaultState(), 9, BlockMatcher.forBlock(BlockInit.cragstone));
		dark_iron_ore_cragcliff = new WorldGenMinable(BlockInit.dark_iron_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.cragstone));
		orichalcum_ore_cragcliff = new WorldGenMinable(BlockInit.orichalcum_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.cragstone));
		adamantium_ore_cragcliff = new WorldGenMinable(BlockInit.adamantium_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.cragstone));
		infuscolium_ore_cragcliff = new WorldGenMinable(BlockInit.infuscolium_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.cragstone));
		rubracium_ore_cragcliff = new WorldGenMinable(BlockInit.rubracium_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.cragstone));
		oureclase_ore_cragcliff = new WorldGenMinable(BlockInit.oureclase_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.cragstone));
		astral_silver_ore_cragcliff = new WorldGenMinable(BlockInit.astral_silver_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.cragstone));
		carmot_ore_cragcliff = new WorldGenMinable(BlockInit.carmot_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.cragstone));
		mythril_ore_cragcliff = new WorldGenMinable(BlockInit.mythril_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.cragstone));
		pure_cragnite_ore = new WorldGenMinable(BlockInit.pure_cragnite_ore.getDefaultState().withProperty(PureCragniteOre.VARIANT, CragniteOreEnumHandler.EnumType.cragcliff), 1, BlockMatcher.forBlock(BlockInit.cragnite_ore));

// - Wetlands - //
		prometheum_ore_ruemus = new WorldGenMinable(BlockInit.prometheum_ore.getDefaultState(), 12, BlockMatcher.forBlock(BlockInit.hydrostone));
		elementium_ore_ruemus = new WorldGenMinable(BlockInit.elementium_ore.getDefaultState(), 12, BlockMatcher.forBlock(BlockInit.hydrostone));
		ruemus_sapphire_ore = new WorldGenMinable(BlockInit.ruemus_sapphire_ore.getDefaultState(), 9, BlockMatcher.forBlock(BlockInit.hydrostone));
		dark_iron_ore_ruemus = new WorldGenMinable(BlockInit.dark_iron_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.hydrostone));
		orichalcum_ore_ruemus = new WorldGenMinable(BlockInit.orichalcum_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.hydrostone));
		adamantium_ore_ruemus = new WorldGenMinable(BlockInit.adamantium_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.hydrostone));
		infuscolium_ore_ruemus = new WorldGenMinable(BlockInit.infuscolium_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.hydrostone));
		rubracium_ore_ruemus = new WorldGenMinable(BlockInit.rubracium_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.hydrostone));
		oureclase_ore_ruemus = new WorldGenMinable(BlockInit.oureclase_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.hydrostone));
		astral_silver_ore_ruemus = new WorldGenMinable(BlockInit.astral_silver_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.hydrostone));
		carmot_ore_ruemus = new WorldGenMinable(BlockInit.carmot_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.hydrostone));
		mythril_ore_ruemus = new WorldGenMinable(BlockInit.mythril_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.hydrostone));		
		
// - Skyridge - //
		
		prometheum_ore_skyridge = new WorldGenMinable(BlockInit.prometheum_ore.getDefaultState(), 12, BlockMatcher.forBlock(BlockInit.zephyrstone));
		elementium_ore_skyridge = new WorldGenMinable(BlockInit.elementium_ore.getDefaultState(), 12, BlockMatcher.forBlock(BlockInit.zephyrstone));
		skyridge_emerald_ore = new WorldGenMinable(BlockInit.skyridge_emerald_ore.getDefaultState(), 9, BlockMatcher.forBlock(BlockInit.zephyrite_ore));
		dark_iron_ore_skyridge = new WorldGenMinable(BlockInit.dark_iron_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.zephyrstone));
		orichalcum_ore_skyridge = new WorldGenMinable(BlockInit.orichalcum_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.zephyrstone));
		adamantium_ore_skyridge = new WorldGenMinable(BlockInit.adamantium_ore.getDefaultState(), 8, BlockMatcher.forBlock(BlockInit.zephyrstone));
		infuscolium_ore_skyridge = new WorldGenMinable(BlockInit.infuscolium_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.zephyrstone));
		rubracium_ore_skyridge = new WorldGenMinable(BlockInit.rubracium_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.zephyrstone));
		oureclase_ore_skyridge = new WorldGenMinable(BlockInit.oureclase_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.zephyrstone));
		astral_silver_ore_skyridge = new WorldGenMinable(BlockInit.astral_silver_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.zephyrstone));
		carmot_ore_skyridge = new WorldGenMinable(BlockInit.carmot_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.zephyrstone));
		mythril_ore_skyridge = new WorldGenMinable(BlockInit.mythril_ore.getDefaultState(), 6, BlockMatcher.forBlock(BlockInit.zephyrstone));
		pure_zephyrite_ore = new WorldGenMinable(BlockInit.pure_zephyrite_ore.getDefaultState().withProperty(PureZephyriteOre.VARIANT, ZephyriteOreEnumHandler.EnumType.skyridge), 1, BlockMatcher.forBlock(BlockInit.zephyrite_ore));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ignatius_ore, world, random, chunkX, chunkZ, 18, 0, 256);
			runGenerator(shadow_iron_ore, world, random, chunkX, chunkZ, 14, 0, 256);
			runGenerator(luminite_ore, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(midasium_ore, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(vyroxeres_ore, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(ceruclase_ore, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(adluorite_ore, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(kalendrite_ore, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(obsidian_overworld, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(sanguinite_ore, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(cragnite_ore_nether, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(hydrolite_ore_nether, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(zephyrite_ore_nether, world, random, chunkX, chunkZ, 3, 0, 256);
			
			break;
			
		case 0:
			
//			runGenerator(coal_ore, world, random, chunkX, chunkZ, 28, 0, 256);
			runGenerator(copper_ore, world, random, chunkX, chunkZ, 24, 0, 256);			
			runGenerator(tin_ore, world, random, chunkX, chunkZ, 20, 0, 256);
//			runGenerator(iron_ore, world, random, chunkX, chunkZ, 20, 0, 256);
			runGenerator(redstone_ore, world, random, chunkX, chunkZ, 16, 0, 256);
			runGenerator(zinc_ore, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(silver_ore, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(manganese_ore, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(lead_ore, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(platinum_ore, world, random, chunkX, chunkZ, 6, 0, 256);
//			runGenerator(diamond_ore, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(obsidian_nether, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(amber_ore, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(emerald_ore, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(sapphire_ore, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(titanium_ore, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(cragnite_ore_overworld, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(hydrolite_ore_overworld, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(zephyrite_ore_overworld, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(elementium_ore, world, random, chunkX, chunkZ, 2, 0, 256);
			runGenerator(wootz_ore, world, random, chunkX, chunkZ, 1, 0, 256);

			
			break;
			
		case 1:
			
			runGenerator(eximite_ore, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(meutoite_ore, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(obsidian_end, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(cragnite_ore_end, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(hydrolite_ore_end, world, random, chunkX, chunkZ, 3, 0, 256);
			runGenerator(zephyrite_ore_end, world, random, chunkX, chunkZ, 3, 0, 256);
			
			break;
			
		case 2:
			
			runGenerator(elementium_ore_cragcliff, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(infuscolium_ore_cragcliff, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(prometheum_ore_cragcliff, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(dark_iron_ore_cragcliff, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(oureclase_ore_cragcliff, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(adamantium_ore_cragcliff, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(astral_silver_ore_cragcliff, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(carmot_ore_cragcliff, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(mythril_ore_cragcliff, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(rubracium_ore_cragcliff, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(orichalcum_ore_cragcliff, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(cragcliff_amber_ore, world, random, chunkX, chunkZ, 1, 0, 256);
			runGenerator(pure_cragnite_ore, world, random, chunkX, chunkZ, 1, 0, 256);
			
			break;
			
		case 3:
			
			runGenerator(elementium_ore_ruemus, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(infuscolium_ore_ruemus, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(prometheum_ore_ruemus, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(dark_iron_ore_ruemus, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(oureclase_ore_ruemus, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(adamantium_ore_ruemus, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(astral_silver_ore_ruemus, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(carmot_ore_ruemus, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(mythril_ore_ruemus, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(rubracium_ore_ruemus, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(orichalcum_ore_ruemus, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(ruemus_sapphire_ore, world, random, chunkX, chunkZ, 1, 0, 256);
			runGenerator(pure_hydrolite_ore, world, random, chunkX, chunkZ, 1, 0, 256);

			
			break;
			
		case 6:

			runGenerator(elementium_ore_skyridge, world, random, chunkX, chunkZ, 12, 0, 256);
			runGenerator(infuscolium_ore_skyridge, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(prometheum_ore_skyridge, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(dark_iron_ore_skyridge, world, random, chunkX, chunkZ, 10, 0, 256);
			runGenerator(oureclase_ore_skyridge, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(adamantium_ore_skyridge, world, random, chunkX, chunkZ, 8, 0, 256);
			runGenerator(astral_silver_ore_skyridge, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(carmot_ore_skyridge, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(mythril_ore_skyridge, world, random, chunkX, chunkZ, 6, 0, 256);
			runGenerator(rubracium_ore_skyridge, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(orichalcum_ore_skyridge, world, random, chunkX, chunkZ, 4, 0, 256);
			runGenerator(skyridge_emerald_ore, world, random, chunkX, chunkZ, 1, 0, 256);
			runGenerator(pure_zephyrite_ore, world, random, chunkX, chunkZ, 1, 0, 256);

			break;
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