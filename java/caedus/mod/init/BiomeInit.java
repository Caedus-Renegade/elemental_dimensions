package caedus.mod.init;

import org.lwjgl.Sys;

import caedus.mod.worldgen.biomes.elemental.CragcliffCore;
import caedus.mod.worldgen.biomes.elemental.RuemusWetlands;
import caedus.mod.worldgen.biomes.elemental.SkyridgeHighlands;
import caedus.mod.worldgen.biomes.normal.EbonyForest;
import caedus.mod.worldgen.biomes.normal.LarchForest;
import caedus.mod.worldgen.biomes.normal.TeakForest;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{
//	public static final Biome larch_forest = new LarchForest();
//	public static final Biome teak_forest = new TeakForest();
//	public static final Biome ebony_forest = new EbonyForest();
	public static final Biome cragcliff_core = new CragcliffCore();
	public static final Biome ruemus_wetlands = new RuemusWetlands();
	public static final Biome SKYRIDGE_HIGHLANDS = new SkyridgeHighlands();
	
	public static void registerBiomes()
	{
//		initBiome(larch_forest, "Larch Forest", BiomeType.COOL, Type.MOUNTAIN, Type.HILLS, Type.DRY);
//		initBiome(teak_forest, "Teak Forest", BiomeType.COOL, Type.MOUNTAIN, Type.HILLS, Type.DRY);
//		initBiome(ebony_forest, "Ebony Forest", BiomeType.COOL, Type.MOUNTAIN, Type.HILLS, Type.DRY);
//		initBiome(cragcliff_core, "Cragcliff Core", BiomeType.COOL, Type.MOUNTAIN, Type.HILLS, Type.DRY);
//		initBiome(ruemus_wetlands, "Ruemus Wetlands", BiomeType.WARM, Type.SWAMP, Type.PLAINS, Type.WET);
//		initBiome(SKYRIDGE_HIGHLANDS, "Skyridge Highlands", BiomeType.COOL, Type.HILLS, Type.MOUNTAIN, Type.DRY);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 5));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}
}