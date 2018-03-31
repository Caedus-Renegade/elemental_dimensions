package caedus.mod.init;

import java.util.ArrayList;
import java.util.List;

import caedus.mod.objects.tools.ToolSword;
import caedus.mod.util.Reference;
import caedus.mod.objects.armor.ArmorBase;
import caedus.mod.objects.items.ItemBase;
import caedus.mod.objects.tools.ToolAxe;
import caedus.mod.objects.tools.ToolHoe;
import caedus.mod.objects.tools.ToolPickaxe;
import caedus.mod.objects.tools.ToolShovel;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
// - Tier 0 - //
	public static final Item TIN_DUST = new ItemBase("tin_dust");
	public static final Item ZINC_DUST = new ItemBase("zinc_dust");
// - Tier 1 (Wood)- //
	public static final ToolMaterial TOOL_BRASS = EnumHelper.addToolMaterial("tool_brass", 0, 11, 4, 1, 11);
	public static final ArmorMaterial ARMOR_BRASS = EnumHelper.addArmorMaterial("armor_brass", Reference.MODID + ":brass", 3, new int[] {2,2,3,1}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static final Item BRASS_DUST = new ItemBase("brass_dust");
	public static final Item BRASS_INGOT = new ItemBase("brass_ingot");
	public static final Item SWORD_BRASS = new ToolSword("brass_sword", TOOL_BRASS);
	public static final Item PICKAXE_BRASS = new ToolPickaxe("brass_pickaxe", TOOL_BRASS);
	public static final Item AXE_BRASS = new ToolAxe("brass_axe", TOOL_BRASS);
	public static final Item SHOVEL_BRASS = new ToolShovel("brass_shovel", TOOL_BRASS);
	public static final Item HOE_BRASS = new ToolHoe("brass_hoe", TOOL_BRASS);
	public static final Item HELMET_BRASS = new ArmorBase("brass_helmet", ARMOR_BRASS, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_BRASS = new ArmorBase("brass_chestplate", ARMOR_BRASS, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_BRASS = new ArmorBase("brass_leggings", ARMOR_BRASS, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_BRASS = new ArmorBase("brass_boots", ARMOR_BRASS, 1, EntityEquipmentSlot.FEET);
	public static final ToolMaterial TOOL_SILVER = EnumHelper.addToolMaterial("tool_silver", 0, 22, 6, 1, 16);
	public static final ArmorMaterial ARMOR_SILVER = EnumHelper.addArmorMaterial("armor_silver", Reference.MODID + ":silver", 5, new int[] {2,3,4,2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static final Item SILVER_DUST = new ItemBase("silver_dust");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item SWORD_SILVER = new ToolSword("silver_sword", TOOL_SILVER);
	public static final Item PICKAXE_SILVER = new ToolPickaxe("silver_pickaxe", TOOL_SILVER);
	public static final Item AXE_SILVER = new ToolAxe("silver_axe", TOOL_SILVER);
	public static final Item SHOVEL_SILVER = new ToolShovel("silver_shovel", TOOL_SILVER);
	public static final Item HOE_SILVER = new ToolHoe("silver_hoe", TOOL_SILVER);
	public static final Item HELMET_SILVER = new ArmorBase("silver_helmet", ARMOR_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_SILVER = new ArmorBase("silver_chestplate", ARMOR_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_SILVER = new ArmorBase("silver_leggings", ARMOR_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_SILVER = new ArmorBase("silver_boots", ARMOR_SILVER, 1, EntityEquipmentSlot.FEET);
	public static final Item GOLD_DUST = new ItemBase("gold_dust");
// - Tier 2 (Stone) - //
	public static final ToolMaterial TOOL_ELECTRUM = EnumHelper.addToolMaterial("tool_electrum", 1, 50, 14, 1, 30);
	public static final ArmorMaterial ARMOR_ELECTRUM = EnumHelper.addArmorMaterial("armor_electrum", Reference.MODID + ":electrum", 9, new int[] {2,5,6,2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static final Item ELECTRUM_DUST = new ItemBase("electrum_dust");
	public static final Item ELECTRUM_INGOT = new ItemBase("electrum_ingot");
	public static final Item SWORD_ELECTRUM = new ToolSword("electrum_sword", TOOL_ELECTRUM);
	public static final Item PICKAXE_ELECTRUM = new ToolPickaxe("electrum_pickaxe", TOOL_ELECTRUM);
	public static final Item AXE_ELECTRUM = new ToolAxe("electrum_axe", TOOL_ELECTRUM);
	public static final Item SHOVEL_ELECTRUM = new ToolShovel("electrum_shovel", TOOL_ELECTRUM);
	public static final Item HOE_ELECTRUM = new ToolHoe("electrum_hoe", TOOL_ELECTRUM);
	public static final Item HELMET_ELECTRUM = new ArmorBase("electrum_helmet", ARMOR_ELECTRUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_ELECTRUM = new ArmorBase("electrum_chestplate", ARMOR_ELECTRUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_ELECTRUM = new ArmorBase("electrum_leggings", ARMOR_ELECTRUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_ELECTRUM = new ArmorBase("electrum_boots", ARMOR_ELECTRUM, 1, EntityEquipmentSlot.FEET);
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 1, 198, 5, 1, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 10, new int[] {2,2,3,1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static final Item COPPER_DUST = new ItemBase("copper_dust");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_ROD = new ItemBase("copper_rod");
	public static final Item COPPER_PLATE = new ItemBase("copper_plate");
	public static final Item SWORD_COPPER = new ToolSword("copper_sword", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
	public static final Item AXE_COPPER = new ToolAxe("copper_axe", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("copper_shovel", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("copper_hoe", TOOL_COPPER);
	public static final Item HELMET_COPPER = new ArmorBase("copper_helmet", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmorBase("copper_chestplate", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmorBase("copper_leggings", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmorBase("copper_boots", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
	public static final ToolMaterial TOOL_IGNATIUS = EnumHelper.addToolMaterial("tool_ignatius", 2, 200, 4, 2, 15);
	public static final ArmorMaterial ARMOR_IGNATIUS = EnumHelper.addArmorMaterial("armor_ignatius", Reference.MODID + ":ignatius", 15, new int[] {2,5,6,2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item IGNATIUS_DUST = new ItemBase("ignatius_dust");
	public static final Item IGNATIUS_INGOT = new ItemBase("ignatius_ingot");
	public static final Item SWORD_IGNATIUS = new ToolSword("ignatius_sword", TOOL_IGNATIUS);
	public static final Item PICKAXE_IGNATIUS = new ToolPickaxe("ignatius_pickaxe", TOOL_IGNATIUS);
	public static final Item AXE_IGNATIUS = new ToolAxe("ignatius_axe", TOOL_IGNATIUS);
	public static final Item SHOVEL_IGNATIUS = new ToolShovel("ignatius_shovel", TOOL_IGNATIUS);
	public static final Item HOE_IGNATIUS = new ToolHoe("ignatius_hoe", TOOL_IGNATIUS);
	public static final Item HELMET_IGNATIUS = new ArmorBase("ignatius_helmet", ARMOR_IGNATIUS, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_IGNATIUS = new ArmorBase("ignatius_chestplate", ARMOR_IGNATIUS, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_IGNATIUS = new ArmorBase("ignatius_leggings", ARMOR_IGNATIUS, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_IGNATIUS = new ArmorBase("ignatius_boots", ARMOR_IGNATIUS, 1, EntityEquipmentSlot.FEET);
// - Tier 3 [Iron] - //	
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("tool_bronze", 2, 125, 6, 1, 9);
	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("armor_bronze", Reference.MODID + ":bronze", 13, new int[] {2,3,4,3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item BRONZE_DUST = new ItemBase("bronze_dust");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item BRONZE_ROD = new ItemBase("bronze_rod");
	public static final Item BRONZE_PLATE = new ItemBase("bronze_plate");
	public static final Item SWORD_BRONZE = new ToolSword("bronze_sword", TOOL_BRONZE);
	public static final Item PICKAXE_BRONZE = new ToolPickaxe("bronze_pickaxe", TOOL_BRONZE);
	public static final Item AXE_BRONZE = new ToolAxe("bronze_axe", TOOL_BRONZE);
	public static final Item SHOVEL_BRONZE = new ToolShovel("bronze_shovel", TOOL_BRONZE);
	public static final Item HOE_BRONZE = new ToolHoe("bronze_hoe", TOOL_BRONZE);
	public static final Item HELMET_BRONZE = new ArmorBase("bronze_helmet", ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_BRONZE = new ArmorBase("bronze_chestplate", ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_BRONZE = new ArmorBase("bronze_leggings", ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_BRONZE = new ArmorBase("bronze_boots", ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);
// - Tier 4 [Diamond] - //
// - Tier 5 [Damascus Steel] - //
// - Tier 6 [Titanium] - //
// - Tier 7 [Adamantium] - //
// - Tier 8 [Titansteel] - //
// - Tier 9 [Elementium] - //
	public static final Item ELEMENTIUM_INGOT = new ItemBase("elementium_ingot");
// - Tier 10 [Elemental Steel] - //
//	public static final Item ZEPHYRITE_INGOT = new ItemBase("zephyrite_ingot");
//	public static final Item ZEPHYRSTEEL_INGOT = new ItemBase("zephyrsteel_ingot");
//	public static final Item ZEPHYRSTEEL_INGOT_ENCHANTED = new EnchantedZephyrsteelIngot("zephyrsteel_ingot_enchanted");
// - Tier X [Chronosteel] - //
}
