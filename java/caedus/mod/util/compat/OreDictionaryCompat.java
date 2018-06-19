package caedus.mod.util.compat;

import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat
{
	public static void registerOres()
	{
//Gemstones//
		OreDictionary.registerOre("oreAmber", BlockInit.amber_ore);
		OreDictionary.registerOre("gemAmber", ItemInit.amber);
		OreDictionary.registerOre("oreSapphire", BlockInit.sapphire_ore);
		OreDictionary.registerOre("gemSapphire", ItemInit.sapphire);
//Other//
		OreDictionary.registerOre("dustCoal", ItemInit.coal_dust);
//Tin//
		OreDictionary.registerOre("oreTin", BlockInit.tin_ore);
		OreDictionary.registerOre("dustTin", ItemInit.tin_dust);
		OreDictionary.registerOre("ingotTin", ItemInit.tin_ingot);
		OreDictionary.registerOre("blockTin", BlockInit.tin_block);
//Copper//
		OreDictionary.registerOre("oreCopper", BlockInit.copper_ore);
		OreDictionary.registerOre("dustCopper", ItemInit.COPPER_DUST);
		OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
		OreDictionary.registerOre("rodCopper", ItemInit.COPPER_ROD);
		OreDictionary.registerOre("plateCopper", ItemInit.COPPER_PLATE);
		OreDictionary.registerOre("blockCopper", BlockInit.copper_block);
//Silver//
		OreDictionary.registerOre("oreSilver", BlockInit.silver_ore);
		OreDictionary.registerOre("dustSilver", ItemInit.SILVER_DUST);
		OreDictionary.registerOre("ingotSilver", ItemInit.SILVER_INGOT);
		OreDictionary.registerOre("blockSilver", BlockInit.silver_block);
//Gold//
		OreDictionary.registerOre("dustGold", ItemInit.GOLD_DUST);
//Bronze//
		OreDictionary.registerOre("dustBronze", ItemInit.BRONZE_DUST);
		OreDictionary.registerOre("ingotBronze", ItemInit.BRONZE_INGOT);
		OreDictionary.registerOre("rodBronze", ItemInit.BRONZE_ROD);
		OreDictionary.registerOre("plateBronze", ItemInit.BRONZE_PLATE);
		OreDictionary.registerOre("blockBronze", BlockInit.bronze_block);
//Iron//
		OreDictionary.registerOre("dustIron", ItemInit.IRON_DUST);
		OreDictionary.registerOre("rodIron", ItemInit.IRON_ROD);
		OreDictionary.registerOre("plateIron", ItemInit.IRON_PLATE);
//Lead//
		OreDictionary.registerOre("oreLead", BlockInit.lead_ore);
		OreDictionary.registerOre("dustLead", ItemInit.lead_dust);
		OreDictionary.registerOre("ingotLead", ItemInit.lead_ingot);
		OreDictionary.registerOre("blockLead", BlockInit.lead_block);
//Steel//
		OreDictionary.registerOre("dustSteel", ItemInit.steel_dust);
		OreDictionary.registerOre("ingotSteel", ItemInit.steel_ingot);
		OreDictionary.registerOre("rodSteel", ItemInit.steel_rod);
		OreDictionary.registerOre("plateIron", ItemInit.steel_plate);
		OreDictionary.registerOre("blockSteel", BlockInit.steel_block);
	}
}
