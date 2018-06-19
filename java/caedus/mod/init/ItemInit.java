package caedus.mod.init;

import java.util.ArrayList;
import java.util.List;

import caedus.mod.objects.tools.ToolSword;
import caedus.mod.util.Reference;
import caedus.mod.objects.armor.ArmorBase;
import caedus.mod.objects.armor.ElementalArmorBase;
import caedus.mod.objects.items.CoalDust;
import caedus.mod.objects.items.ElementalItemBase;
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
	
// - Misc - //
	
	public static final Item coal_dust = new CoalDust("coal_dust");
	public static final Item carbon_fiber = new ItemBase("carbon_fiber");
	public static final Item carbon_mesh = new ItemBase("carbon_mesh");
	public static final Item carbon_plate = new ItemBase("carbon_plate");
	
// - Tier 0 - //
	
	public static final Item amber_dust = new ItemBase("amber_dust");
	public static final Item amber = new ItemBase("amber");
	
	public static final Item sapphire_dust = new ItemBase("sapphire_dust");
	public static final Item sapphire = new ItemBase("sapphire");
	
	public static final Item emerald_dust = new ItemBase("emerald_dust");

	public static final Item tin_dust = new ItemBase("tin_dust");
	public static final Item tin_ingot = new ItemBase("tin_ingot");
	
	public static final Item zinc_dust = new ItemBase("zinc_dust");
	public static final Item zinc_ingot = new ItemBase("zinc_ingot");
	
	public static final Item infuscolium_dust = new ItemBase("infuscolium_dust");
	public static final Item infuscolium_ingot = new ItemBase("infuscolium_ingot");
	
	public static final Item manganese_dust = new ItemBase("manganese_dust");
	public static final Item manganese_ingot = new ItemBase("manganese_ingot");
	
	public static final Item rubracium_dust = new ItemBase("rubracium_dust");
	public static final Item rubracium_ingot = new ItemBase("rubracium_ingot");

	public static final Item luminite_dust = new ItemBase("luminite_dust");
	public static final Item luminite_ingot = new ItemBase("luminite_ingot");
	
	public static final Item adluorite_dust = new ItemBase("adluorite_dust");
	public static final Item adluorite_ingot = new ItemBase("adluorite_ingot");
	
	public static final Item meutoite_dust = new ItemBase("meutoite_dust");
	public static final Item meutoite_ingot = new ItemBase("meutoite_ingot");
	
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
	
	public static final ToolMaterial TOOL_IGNATIUS = EnumHelper.addToolMaterial("tool_ignatius", 1, 200, 4, 2, 15);
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
	
	public static final ToolMaterial TOOL_PROMETHEUM = EnumHelper.addToolMaterial("tool_prometheum", 1, 200, 4, 1, 16);
	public static final ArmorMaterial ARMOR_PROMETHEUM = EnumHelper.addArmorMaterial("armor_prometheum", Reference.MODID + ":prometheum", 9, new int[] {2,2,3,1}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static final Item PROMETHEUM_DUST = new ItemBase("prometheum_dust");
	public static final Item PROMETHEUM_INGOT = new ItemBase("prometheum_ingot");
	public static final Item SWORD_PROMETHEUM = new ToolSword("prometheum_sword", TOOL_PROMETHEUM);
	public static final Item PICKAXE_PROMETHEUM = new ToolPickaxe("prometheum_pickaxe", TOOL_PROMETHEUM);
	public static final Item AXE_PROMETHEUM = new ToolAxe("prometheum_axe", TOOL_PROMETHEUM);
	public static final Item SHOVEL_PROMETHEUM = new ToolShovel("prometheum_shovel", TOOL_PROMETHEUM);
	public static final Item HOE_PROMETHEUM = new ToolHoe("prometheum_hoe", TOOL_PROMETHEUM);
	public static final Item HELMET_PROMETHEUM = new ArmorBase("prometheum_helmet", ARMOR_PROMETHEUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PROMETHEUM = new ArmorBase("prometheum_chestplate", ARMOR_PROMETHEUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_PROMETHEUM = new ArmorBase("prometheum_leggings", ARMOR_PROMETHEUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PROMETHEUM = new ArmorBase("prometheum_boots", ARMOR_PROMETHEUM, 1, EntityEquipmentSlot.FEET);
	
// - Tier 3 [Iron] - //	
	
	public static final ToolMaterial TOOL_PLATINUM = EnumHelper.addToolMaterial("tool_platinum", 2, 100, 16, 1, 50);
	public static final ArmorMaterial ARMOR_PLATINUM = EnumHelper.addArmorMaterial("armor_platinum", Reference.MODID + ":platinum", 11, new int[] {3,5,6,3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1);
	public static final Item PLATINUM_DUST = new ItemBase("platinum_dust");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item SWORD_PLATINUM = new ToolSword("platinum_sword", TOOL_PLATINUM);
	public static final Item PICKAXE_PLATINUM = new ToolPickaxe("platinum_pickaxe", TOOL_PLATINUM);
	public static final Item AXE_PLATINUM = new ToolAxe("platinum_axe", TOOL_PLATINUM);
	public static final Item SHOVEL_PLATINUM = new ToolShovel("platinum_shovel", TOOL_PLATINUM);
	public static final Item HOE_PLATINUM = new ToolHoe("platinum_hoe", TOOL_PLATINUM);
	public static final Item HELMET_PLATINUM = new ArmorBase("platinum_helmet", ARMOR_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLATINUM = new ArmorBase("platinum_chestplate", ARMOR_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_PLATINUM = new ArmorBase("platinum_leggings", ARMOR_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLATINUM = new ArmorBase("platinum_boots", ARMOR_PLATINUM, 1, EntityEquipmentSlot.FEET);

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
	
	public static final Item IRON_DUST = new ItemBase("iron_dust");
	public static final Item IRON_ROD = new ItemBase("iron_rod");
	public static final Item IRON_PLATE = new ItemBase("iron_plate");
	
	public static final Item lead_dust = new ItemBase("lead_dust");
	public static final Item lead_ingot = new ItemBase("lead_ingot");

	public static final ToolMaterial tool_dark_iron = EnumHelper.addToolMaterial("tool_dark_iron", 2, 250, 6, 2, 14);
	public static final ArmorMaterial armor_dark_iron = EnumHelper.addArmorMaterial("armor_dark_iron", Reference.MODID + ":dark_iron", 15, new int[] {2,5,6,2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item dark_iron_dust = new ItemBase("dark_iron_dust");
	public static final Item dark_iron_ingot = new ItemBase("dark_iron_ingot");
	public static final Item sword_dark_iron = new ToolSword("dark_iron_sword", tool_dark_iron);
	public static final Item pickaxe_dark_iron = new ToolPickaxe("dark_iron_pickaxe", tool_dark_iron);
	public static final Item axe_dark_iron = new ToolAxe("dark_iron_axe", tool_dark_iron);
	public static final Item shovel_dark_iron = new ToolShovel("dark_iron_shovel", tool_dark_iron);
	public static final Item hoe_dark_iron = new ToolHoe("dark_iron_hoe", tool_dark_iron);
	public static final Item helmet_dark_iron = new ArmorBase("dark_iron_helmet", armor_dark_iron, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_dark_iron = new ArmorBase("dark_iron_chestplate", armor_dark_iron, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_dark_iron = new ArmorBase("dark_iron_leggings", armor_dark_iron, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_dark_iron = new ArmorBase("dark_iron_boots", armor_dark_iron, 1, EntityEquipmentSlot.FEET);

	public static final ToolMaterial TOOL_SHADOW_IRON = EnumHelper.addToolMaterial("tool_shadow_iron", 2, 275, 5, 2, 3);
	public static final ArmorMaterial ARMOR_SHADOW_IRON = EnumHelper.addArmorMaterial("armor_shadow_iron", Reference.MODID + ":shadow_iron", 16, new int[] {3,5,6,2}, 3, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item SHADOW_IRON_DUST = new ItemBase("shadow_iron_dust");
	public static final Item SHADOW_IRON_INGOT = new ItemBase("shadow_iron_ingot");
	public static final Item SWORD_SHADOW_IRON = new ToolSword("shadow_iron_sword", TOOL_SHADOW_IRON);
	public static final Item PICKAXE_SHADOW_IRON = new ToolPickaxe("shadow_iron_pickaxe", TOOL_SHADOW_IRON);
	public static final Item AXE_SHADOW_IRON = new ToolAxe("shadow_iron_axe", TOOL_SHADOW_IRON);
	public static final Item SHOVEL_SHADOW_IRON = new ToolShovel("shadow_iron_shovel", TOOL_SHADOW_IRON);
	public static final Item HOE_SHADOW_IRON = new ToolHoe("shadow_iron_hoe", TOOL_SHADOW_IRON);
	public static final Item HELMET_SHADOW_IRON = new ArmorBase("shadow_iron_helmet", ARMOR_SHADOW_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_SHADOW_IRON = new ArmorBase("shadow_iron_chestplate", ARMOR_SHADOW_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_SHADOW_IRON = new ArmorBase("shadow_iron_leggings", ARMOR_SHADOW_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_SHADOW_IRON = new ArmorBase("shadow_iron_boots", ARMOR_SHADOW_IRON, 1, EntityEquipmentSlot.FEET);

	public static final ToolMaterial tool_steel = EnumHelper.addToolMaterial("tool_steel", 2, 400, 6, 3, 5);
	public static final ArmorMaterial armor_steel = EnumHelper.addArmorMaterial("armor_steel", Reference.MODID + ":steel", 20, new int[] {3,5,6,3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item steel_dust = new ItemBase("steel_dust");
	public static final Item steel_ingot = new ItemBase("steel_ingot");
	public static final Item steel_rod = new ItemBase("steel_rod");
	public static final Item steel_plate = new ItemBase("steel_plate");
	public static final Item sword_steel = new ToolSword("steel_sword", tool_steel);
	public static final Item pickaxe_steel = new ToolPickaxe("steel_pickaxe", tool_steel);
	public static final Item axe_steel = new ToolAxe("steel_axe", tool_steel);
	public static final Item shovel_steel = new ToolShovel("steel_shovel", tool_steel);
	public static final Item hoe_steel = new ToolHoe("steel_hoe", tool_steel);
	public static final Item helmet_steel = new ArmorBase("steel_helmet", armor_steel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_steel = new ArmorBase("steel_chestplate", armor_steel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_steel = new ArmorBase("steel_leggings", armor_steel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_steel = new ArmorBase("steel_boots", armor_steel, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_shadow_steel = EnumHelper.addToolMaterial("tool_shadow_steel", 2, 500, 8, 2, 17);
	public static final ArmorMaterial armor_shadow_steel = EnumHelper.addArmorMaterial("armor_shadow_steel", Reference.MODID + ":shadow_steel", 20, new int[] {3,5,6,4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item shadow_steel_dust = new ItemBase("shadow_steel_dust");
	public static final Item shadow_steel_ingot = new ItemBase("shadow_steel_ingot");
	public static final Item sword_shadow_steel = new ToolSword("shadow_steel_sword", tool_shadow_steel);
	public static final Item pickaxe_shadow_steel = new ToolPickaxe("shadow_steel_pickaxe", tool_shadow_steel);
	public static final Item axe_shadow_steel = new ToolAxe("shadow_steel_axe", tool_shadow_steel);
	public static final Item shovel_shadow_steel = new ToolShovel("shadow_steel_shovel", tool_shadow_steel);
	public static final Item hoe_shadow_steel = new ToolHoe("shadow_steel_hoe", tool_shadow_steel);
	public static final Item helmet_shadow_steel = new ArmorBase("shadow_steel_helmet", armor_shadow_steel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_shadow_steel = new ArmorBase("shadow_steel_chestplate", armor_shadow_steel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_shadow_steel = new ArmorBase("shadow_steel_leggings", armor_shadow_steel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_shadow_steel = new ArmorBase("shadow_steel_boots", armor_shadow_steel, 1, EntityEquipmentSlot.FEET);

// - Tier 4 [Diamond] - //
	
	public static final ToolMaterial tool_midasium = EnumHelper.addToolMaterial("tool_midasium", 3, 100, 10, 3, 35);
	public static final ArmorMaterial armor_midasium = EnumHelper.addArmorMaterial("armor_midasium", Reference.MODID + ":midasium", 8, new int[] {2,3,5,3}, 35, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static final Item midasium_dust = new ItemBase("midasium_dust");
	public static final Item midasium_ingot = new ItemBase("midasium_ingot");
	public static final Item sword_midasium = new ToolSword("midasium_sword", tool_midasium);
	public static final Item pickaxe_midasium = new ToolPickaxe("midasium_pickaxe", tool_midasium);
	public static final Item axe_midasium = new ToolAxe("midasium_axe", tool_midasium);
	public static final Item shovel_midasium = new ToolShovel("midasium_shovel", tool_midasium);
	public static final Item hoe_midasium = new ToolHoe("midasium_hoe", tool_midasium);
	public static final Item helmet_midasium = new ArmorBase("midasium_helmet", armor_midasium, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_midasium = new ArmorBase("midasium_chestplate", armor_midasium, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_midasium = new ArmorBase("midasium_leggings", armor_midasium, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_midasium = new ArmorBase("midasium_boots", armor_midasium, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_vyroxeres = EnumHelper.addToolMaterial("tool_vyroxeres", 3, 300, 7, 3, 16);
	public static final ArmorMaterial armor_vyroxeres = EnumHelper.addArmorMaterial("armor_vyroxeres", Reference.MODID + ":vyroxeres", 23, new int[] {3,5,6,4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item vyroxeres_dust = new ItemBase("vyroxeres_dust");
	public static final Item vyroxeres_ingot = new ItemBase("vyroxeres_ingot");
	public static final Item sword_vyroxeres = new ToolSword("vyroxeres_sword", tool_vyroxeres);
	public static final Item pickaxe_vyroxeres = new ToolPickaxe("vyroxeres_pickaxe", tool_vyroxeres);
	public static final Item axe_vyroxeres = new ToolAxe("vyroxeres_axe", tool_vyroxeres);
	public static final Item shovel_vyroxeres = new ToolShovel("vyroxeres_shovel", tool_vyroxeres);
	public static final Item hoe_vyroxeres = new ToolHoe("vyroxeres_hoe", tool_vyroxeres);
	public static final Item helmet_vyroxeres = new ArmorBase("vyroxeres_helmet", armor_vyroxeres, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_vyroxeres = new ArmorBase("vyroxeres_chestplate", armor_vyroxeres, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_vyroxeres = new ArmorBase("vyroxeres_leggings", armor_vyroxeres, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_vyroxeres = new ArmorBase("vyroxeres_boots", armor_vyroxeres, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_ceruclase = EnumHelper.addToolMaterial("tool_ceruclase", 3, 500, 7, 3, 18);
	public static final ArmorMaterial armor_ceruclase = EnumHelper.addArmorMaterial("armor_ceruclase", Reference.MODID + ":ceruclase", 25, new int[] {3,5,6,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item ceruclase_dust = new ItemBase("ceruclase_dust");
	public static final Item ceruclase_ingot = new ItemBase("ceruclase_ingot");
	public static final Item sword_ceruclase = new ToolSword("ceruclase_sword", tool_ceruclase);
	public static final Item pickaxe_ceruclase = new ToolPickaxe("ceruclase_pickaxe", tool_ceruclase);
	public static final Item axe_ceruclase = new ToolAxe("ceruclase_axe", tool_ceruclase);
	public static final Item shovel_ceruclase = new ToolShovel("ceruclase_shovel", tool_ceruclase);
	public static final Item hoe_ceruclase = new ToolHoe("ceruclase_hoe", tool_ceruclase);
	public static final Item helmet_ceruclase = new ArmorBase("ceruclase_helmet", armor_ceruclase, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_ceruclase = new ArmorBase("ceruclase_chestplate", armor_ceruclase, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_ceruclase = new ArmorBase("ceruclase_leggings", armor_ceruclase, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_ceruclase = new ArmorBase("ceruclase_boots", armor_ceruclase, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_oureclase = EnumHelper.addToolMaterial("tool_oureclase", 3, 750, 8, 2, 18);
	public static final ArmorMaterial armor_oureclase = EnumHelper.addArmorMaterial("armor_oureclase", Reference.MODID + ":oureclase", 20, new int[] {3,5,6,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
	public static final Item oureclase_dust = new ItemBase("oureclase_dust");
	public static final Item oureclase_ingot = new ItemBase("oureclase_ingot");
	public static final Item sword_oureclase = new ToolSword("oureclase_sword", tool_oureclase);
	public static final Item pickaxe_oureclase = new ToolPickaxe("oureclase_pickaxe", tool_oureclase);
	public static final Item axe_oureclase = new ToolAxe("oureclase_axe", tool_oureclase);
	public static final Item shovel_oureclase = new ToolShovel("oureclase_shovel", tool_oureclase);
	public static final Item hoe_oureclase = new ToolHoe("oureclase_hoe", tool_oureclase);
	public static final Item helmet_oureclase = new ArmorBase("oureclase_helmet", armor_oureclase, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_oureclase = new ArmorBase("oureclase_chestplate", armor_oureclase, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_oureclase = new ArmorBase("oureclase_leggings", armor_oureclase, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_oureclase = new ArmorBase("oureclase_boots", armor_oureclase, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_carbon_steel = EnumHelper.addToolMaterial("tool_carbon_steel", 3, 781, 8, 3, 10);
	public static final ArmorMaterial armor_carbon_steel = EnumHelper.addArmorMaterial("armor_carbon_steel", Reference.MODID + ":carbon_steel", 22, new int[] {3,5,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item carbon_steel_dust = new ItemBase("carbon_steel_dust");
	public static final Item carbon_steel_ingot = new ItemBase("carbon_steel_ingot");
	public static final Item carbon_steel_rod = new ItemBase("carbon_steel_rod");
	public static final Item carbon_steel_plate = new ItemBase("carbon_steel_plate");
	public static final Item sword_carbon_steel = new ToolSword("carbon_steel_sword", tool_carbon_steel);
	public static final Item pickaxe_carbon_steel = new ToolPickaxe("carbon_steel_pickaxe", tool_carbon_steel);
	public static final Item axe_carbon_steel = new ToolAxe("carbon_steel_axe", tool_carbon_steel);
	public static final Item shovel_carbon_steel = new ToolShovel("carbon_steel_shovel", tool_carbon_steel);
	public static final Item hoe_carbon_steel = new ToolHoe("carbon_steel_hoe", tool_carbon_steel);
	public static final Item helmet_carbon_steel = new ArmorBase("carbon_steel_helmet", armor_carbon_steel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_carbon_steel = new ArmorBase("carbon_steel_chestplate", armor_carbon_steel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_carbon_steel = new ArmorBase("carbon_steel_leggings", armor_carbon_steel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_carbon_steel = new ArmorBase("carbon_steel_boots", armor_carbon_steel, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_eximite = EnumHelper.addToolMaterial("tool_eximite", 3, 1000, 8, 3, 25);
	public static final ArmorMaterial armor_eximite = EnumHelper.addArmorMaterial("armor_eximite", Reference.MODID + ":eximite", 24, new int[] {4,5,6,4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item eximite_dust = new ItemBase("eximite_dust");
	public static final Item eximite_ingot = new ItemBase("eximite_ingot");
	public static final Item sword_eximite = new ToolSword("eximite_sword", tool_eximite);
	public static final Item pickaxe_eximite = new ToolPickaxe("eximite_pickaxe", tool_eximite);
	public static final Item axe_eximite = new ToolAxe("eximite_axe", tool_eximite);
	public static final Item shovel_eximite = new ToolShovel("eximite_shovel", tool_eximite);
	public static final Item hoe_eximite = new ToolHoe("eximite_hoe", tool_eximite);
	public static final Item helmet_eximite = new ArmorBase("eximite_helmet", armor_eximite, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_eximite = new ArmorBase("eximite_chestplate", armor_eximite, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_eximite = new ArmorBase("eximite_leggings", armor_eximite, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_eximite = new ArmorBase("eximite_boots", armor_eximite, 1, EntityEquipmentSlot.FEET);

	public static final Item diamond_rod = new ItemBase("diamond_rod");
	
	public static final ToolMaterial tool_darksteel = EnumHelper.addToolMaterial("tool_darksteel", 3, 1562, 8, 3, 10);
	public static final ArmorMaterial armor_darksteel = EnumHelper.addArmorMaterial("armor_darksteel", Reference.MODID + ":darksteel", 33, new int[] {3,6,8,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item darksteel_dust = new ItemBase("darksteel_dust");
	public static final Item darksteel_ingot = new ItemBase("darksteel_ingot");
	public static final Item sword_darksteel = new ToolSword("darksteel_sword", tool_darksteel);
	public static final Item pickaxe_darksteel = new ToolPickaxe("darksteel_pickaxe", tool_darksteel);
	public static final Item axe_darksteel = new ToolAxe("darksteel_axe", tool_darksteel);
	public static final Item shovel_darksteel = new ToolShovel("darksteel_shovel", tool_darksteel);
	public static final Item hoe_darksteel = new ToolHoe("darksteel_hoe", tool_darksteel);
	public static final Item helmet_darksteel = new ArmorBase("darksteel_helmet", armor_darksteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_darksteel = new ArmorBase("darksteel_chestplate", armor_darksteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_darksteel = new ArmorBase("darksteel_leggings", armor_darksteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_darksteel = new ArmorBase("darksteel_boots", armor_darksteel, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_obsidian = EnumHelper.addToolMaterial("tool_obsidian", 3, 1750, 10, 4, 15);
	public static final ArmorMaterial armor_obsidian = EnumHelper.addArmorMaterial("armor_obsidian", Reference.MODID + ":obsidian", 36, new int[] {4,7,9,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item obsidian_ingot = new ItemBase("obsidian_ingot");
	public static final Item obsidian_rod = new ItemBase("obsidian_rod");
	public static final Item sword_obsidian = new ToolSword("obsidian_sword", tool_obsidian);
	public static final Item pickaxe_obsidian = new ToolPickaxe("obsidian_pickaxe", tool_obsidian);
	public static final Item axe_obsidian = new ToolAxe("obsidian_axe", tool_obsidian);
	public static final Item shovel_obsidian = new ToolShovel("obsidian_shovel", tool_obsidian);
	public static final Item hoe_obsidian = new ToolHoe("obsidian_hoe", tool_obsidian);
	public static final Item helmet_obsidian = new ArmorBase("obsidian_helmet", armor_obsidian, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_obsidian = new ArmorBase("obsidian_chestplate", armor_obsidian, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_obsidian = new ArmorBase("obsidian_leggings", armor_obsidian, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_obsidian = new ArmorBase("obsidian_boots", armor_obsidian, 1, EntityEquipmentSlot.FEET);
	
// - Tier 5 [Damascus Steel] - //
	
	public static final ToolMaterial tool_astral_silver = EnumHelper.addToolMaterial("tool_astral_silver", 4, 35, 12, 1, 30);
	public static final ArmorMaterial armor_astral_silver = EnumHelper.addArmorMaterial("armor_astral_silver", Reference.MODID + ":astral_silver", 10, new int[] {2,5,6,2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static final Item astral_silver_dust = new ItemBase("astral_silver_dust");
	public static final Item astral_silver_ingot = new ItemBase("astral_silver_ingot");
	public static final Item sword_astral_silver = new ToolSword("astral_silver_sword", tool_astral_silver);
	public static final Item pickaxe_astral_silver = new ToolPickaxe("astral_silver_pickaxe", tool_astral_silver);
	public static final Item axe_astral_silver = new ToolAxe("astral_silver_axe", tool_astral_silver);
	public static final Item shovel_astral_silver = new ToolShovel("astral_silver_shovel", tool_astral_silver);
	public static final Item hoe_astral_silver = new ToolHoe("astral_silver_hoe", tool_astral_silver);
	public static final Item helmet_astral_silver = new ArmorBase("astral_silver_helmet", armor_astral_silver, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_astral_silver = new ArmorBase("astral_silver_chestplate", armor_astral_silver, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_astral_silver = new ArmorBase("astral_silver_leggings", armor_astral_silver, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_astral_silver = new ArmorBase("astral_silver_boots", armor_astral_silver, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_carmot = EnumHelper.addToolMaterial("tool_carmot", 4, 50, 12, 1, 40);
	public static final ArmorMaterial armor_carmot = EnumHelper.addArmorMaterial("armor_carmot", Reference.MODID + ":carmot", 12, new int[] {3,5,6,3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1);
	public static final Item carmot_dust = new ItemBase("carmot_dust");
	public static final Item carmot_ingot = new ItemBase("carmot_ingot");
	public static final Item sword_carmot = new ToolSword("carmot_sword", tool_carmot);
	public static final Item pickaxe_carmot = new ToolPickaxe("carmot_pickaxe", tool_carmot);
	public static final Item axe_carmot = new ToolAxe("carmot_axe", tool_carmot);
	public static final Item shovel_carmot = new ToolShovel("carmot_shovel", tool_carmot);
	public static final Item hoe_carmot = new ToolHoe("carmot_hoe", tool_carmot);
	public static final Item helmet_carmot = new ArmorBase("carmot_helmet", armor_carmot, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_carmot = new ArmorBase("carmot_chestplate", armor_carmot, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_carmot = new ArmorBase("carmot_leggings", armor_carmot, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_carmot = new ArmorBase("carmot_boots", armor_carmot, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_kalendrite = EnumHelper.addToolMaterial("tool_kalendrite", 4, 500, 8, 2, 20);
	public static final ArmorMaterial armor_kalendrite = EnumHelper.addArmorMaterial("armor_kalendrite", Reference.MODID + ":kalendrite", 28, new int[] {4,5,6,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item kalendrite_dust = new ItemBase("kalendrite_dust");
	public static final Item kalendrite_ingot = new ItemBase("kalendrite_ingot");
	public static final Item sword_kalendrite = new ToolSword("kalendrite_sword", tool_kalendrite);
	public static final Item pickaxe_kalendrite = new ToolPickaxe("kalendrite_pickaxe", tool_kalendrite);
	public static final Item axe_kalendrite = new ToolAxe("kalendrite_axe", tool_kalendrite);
	public static final Item shovel_kalendrite = new ToolShovel("kalendrite_shovel", tool_kalendrite);
	public static final Item hoe_kalendrite = new ToolHoe("kalendrite_hoe", tool_kalendrite);
	public static final Item helmet_kalendrite = new ArmorBase("kalendrite_helmet", armor_kalendrite, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_kalendrite = new ArmorBase("kalendrite_chestplate", armor_kalendrite, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_kalendrite = new ArmorBase("kalendrite_leggings", armor_kalendrite, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_kalendrite = new ArmorBase("kalendrite_boots", armor_kalendrite, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_inolashite = EnumHelper.addToolMaterial("tool_inolashite", 4, 900, 8, 3, 25);
	public static final ArmorMaterial armor_inolashite = EnumHelper.addArmorMaterial("armor_inolashite", Reference.MODID + ":inolashite", 30, new int[] {4,5,7,4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item inolashite_dust = new ItemBase("inolashite_dust");
	public static final Item inolashite_ingot = new ItemBase("inolashite_ingot");
	public static final Item sword_inolashite = new ToolSword("inolashite_sword", tool_inolashite);
	public static final Item pickaxe_inolashite = new ToolPickaxe("inolashite_pickaxe", tool_inolashite);
	public static final Item axe_inolashite = new ToolAxe("inolashite_axe", tool_inolashite);
	public static final Item shovel_inolashite = new ToolShovel("inolashite_shovel", tool_inolashite);
	public static final Item hoe_inolashite = new ToolHoe("inolashite_hoe", tool_inolashite);
	public static final Item helmet_inolashite = new ArmorBase("inolashite_helmet", armor_inolashite, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_inolashite = new ArmorBase("inolashite_chestplate", armor_inolashite, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_inolashite = new ArmorBase("inolashite_leggings", armor_inolashite, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_inolashite = new ArmorBase("inolashite_boots", armor_inolashite, 1, EntityEquipmentSlot.FEET);

	public static final ToolMaterial tool_mythril = EnumHelper.addToolMaterial("tool_mythril", 4, 1000, 9, 3, 18);
	public static final ArmorMaterial armor_mythril = EnumHelper.addArmorMaterial("armor_mythril", Reference.MODID + ":mythril", 28, new int[] {4,5,6,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2);
	public static final Item mythril_dust = new ItemBase("mythril_dust");
	public static final Item mythril_ingot = new ItemBase("mythril_ingot");
	public static final Item sword_mythril = new ToolSword("mythril_sword", tool_mythril);
	public static final Item pickaxe_mythril = new ToolPickaxe("mythril_pickaxe", tool_mythril);
	public static final Item axe_mythril = new ToolAxe("mythril_axe", tool_mythril);
	public static final Item shovel_mythril = new ToolShovel("mythril_shovel", tool_mythril);
	public static final Item hoe_mythril = new ToolHoe("mythril_hoe", tool_mythril);
	public static final Item helmet_mythril = new ArmorBase("mythril_helmet", armor_mythril, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_mythril = new ArmorBase("mythril_chestplate", armor_mythril, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_mythril = new ArmorBase("mythril_leggings", armor_mythril, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_mythril = new ArmorBase("mythril_boots", armor_mythril, 1, EntityEquipmentSlot.FEET);

	public static final ToolMaterial tool_amordrine = EnumHelper.addToolMaterial("tool_amordrine", 4, 1000, 14, 3, 25);
	public static final ArmorMaterial armor_amordrine = EnumHelper.addArmorMaterial("armor_amordrine", Reference.MODID + ":amordrine", 32, new int[] {4,5,7,4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item amordrine_dust = new ItemBase("amordrine_dust");
	public static final Item amordrine_ingot = new ItemBase("amordrine_ingot");
	public static final Item sword_amordrine = new ToolSword("amordrine_sword", tool_amordrine);
	public static final Item pickaxe_amordrine = new ToolPickaxe("amordrine_pickaxe", tool_amordrine);
	public static final Item axe_amordrine = new ToolAxe("amordrine_axe", tool_amordrine);
	public static final Item shovel_amordrine = new ToolShovel("amordrine_shovel", tool_amordrine);
	public static final Item hoe_amordrine = new ToolHoe("amordrine_hoe", tool_amordrine);
	public static final Item helmet_amordrine = new ArmorBase("amordrine_helmet", armor_amordrine, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_amordrine = new ArmorBase("amordrine_chestplate", armor_amordrine, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_amordrine = new ArmorBase("amordrine_leggings", armor_amordrine, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_amordrine = new ArmorBase("amordrine_boots", armor_amordrine, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_quicksilver = EnumHelper.addToolMaterial("tool_quicksilver", 4, 1100, 14, 3, 20);
	public static final ArmorMaterial armor_quicksilver = EnumHelper.addArmorMaterial("armor_quicksilver", Reference.MODID + ":quicksilver", 30, new int[] {4,5,7,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2);
	public static final Item quicksilver_dust = new ItemBase("quicksilver_dust");
	public static final Item quicksilver_ingot = new ItemBase("quicksilver_ingot");
	public static final Item sword_quicksilver = new ToolSword("quicksilver_sword", tool_quicksilver);
	public static final Item pickaxe_quicksilver = new ToolPickaxe("quicksilver_pickaxe", tool_quicksilver);
	public static final Item axe_quicksilver = new ToolAxe("quicksilver_axe", tool_quicksilver);
	public static final Item shovel_quicksilver = new ToolShovel("quicksilver_shovel", tool_quicksilver);
	public static final Item hoe_quicksilver = new ToolHoe("quicksilver_hoe", tool_quicksilver);
	public static final Item helmet_quicksilver = new ArmorBase("quicksilver_helmet", armor_quicksilver, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_quicksilver = new ArmorBase("quicksilver_chestplate", armor_quicksilver, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_quicksilver = new ArmorBase("quicksilver_leggings", armor_quicksilver, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_quicksilver = new ArmorBase("quicksilver_boots", armor_quicksilver, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_haderoth = EnumHelper.addToolMaterial("tool_haderoth", 4, 1250, 12, 3, 19);
	public static final ArmorMaterial armor_haderoth = EnumHelper.addArmorMaterial("armor_haderoth", Reference.MODID + ":haderoth", 32, new int[] {4,5,7,4}, 19, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item haderoth_dust = new ItemBase("haderoth_dust");
	public static final Item haderoth_ingot = new ItemBase("haderoth_ingot");
	public static final Item sword_haderoth = new ToolSword("haderoth_sword", tool_haderoth);
	public static final Item pickaxe_haderoth = new ToolPickaxe("haderoth_pickaxe", tool_haderoth);
	public static final Item axe_haderoth = new ToolAxe("haderoth_axe", tool_haderoth);
	public static final Item shovel_haderoth = new ToolShovel("haderoth_shovel", tool_haderoth);
	public static final Item hoe_haderoth = new ToolHoe("haderoth_hoe", tool_haderoth);
	public static final Item helmet_haderoth = new ArmorBase("haderoth_helmet", armor_haderoth, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_haderoth = new ArmorBase("haderoth_chestplate", armor_haderoth, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_haderoth = new ArmorBase("haderoth_leggings", armor_haderoth, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_haderoth = new ArmorBase("haderoth_boots", armor_haderoth, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_endersteel = EnumHelper.addToolMaterial("tool_endersteel", 4, 1800, 10, 4, 30);
	public static final ArmorMaterial armor_endersteel = EnumHelper.addArmorMaterial("armor_endersteel", Reference.MODID + ":endersteel", 30, new int[] {4,5,7,4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	public static final Item endersteel_dust = new ItemBase("endersteel_dust");
	public static final Item endersteel_ingot = new ItemBase("endersteel_ingot");
	public static final Item sword_endersteel = new ToolSword("endersteel_sword", tool_endersteel);
	public static final Item pickaxe_endersteel = new ToolPickaxe("endersteel_pickaxe", tool_endersteel);
	public static final Item axe_endersteel = new ToolAxe("endersteel_axe", tool_endersteel);
	public static final Item shovel_endersteel = new ToolShovel("endersteel_shovel", tool_endersteel);
	public static final Item hoe_endersteel = new ToolHoe("endersteel_hoe", tool_endersteel);
	public static final Item helmet_endersteel = new ArmorBase("endersteel_helmet", armor_endersteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_endersteel = new ArmorBase("endersteel_chestplate", armor_endersteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_endersteel = new ArmorBase("endersteel_leggings", armor_endersteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_endersteel = new ArmorBase("endersteel_boots", armor_endersteel, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_damascus_steel = EnumHelper.addToolMaterial("tool_damascus_steel", 4, 2000, 15, 6, 20);
	public static final ArmorMaterial armor_damascus_steel = EnumHelper.addArmorMaterial("armor_damascus_steel", Reference.MODID + ":damascus_steel", 40, new int[] {5,6,8,5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item wootz_dust = new ItemBase("wootz_dust");
	public static final Item wootz_iron_chunk = new ItemBase("wootz_iron_chunk");
	public static final Item damascus_steel_ingot = new ItemBase("damascus_steel_ingot");
	public static final Item damascus_steel_rod = new ItemBase("damascus_steel_rod");
	public static final Item damascus_steel_plate = new ItemBase("damascus_steel_plate");
	public static final Item sword_damascus_steel = new ToolSword("damascus_steel_sword", tool_damascus_steel);
	public static final Item pickaxe_damascus_steel = new ToolPickaxe("damascus_steel_pickaxe", tool_damascus_steel);
	public static final Item axe_damascus_steel = new ToolAxe("damascus_steel_axe", tool_damascus_steel);
	public static final Item shovel_damascus_steel = new ToolShovel("damascus_steel_shovel", tool_damascus_steel);
	public static final Item hoe_damascus_steel = new ToolHoe("damascus_steel_hoe", tool_damascus_steel);
	public static final Item helmet_damascus_steel = new ArmorBase("damascus_steel_helmet", armor_damascus_steel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_damascus_steel = new ArmorBase("damascus_steel_chestplate", armor_damascus_steel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_damascus_steel = new ArmorBase("damascus_steel_leggings", armor_damascus_steel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_damascus_steel = new ArmorBase("damascus_steel_boots", armor_damascus_steel, 1, EntityEquipmentSlot.FEET);
	
// - Tier 6 [Titanium] - //
	
	public static final ToolMaterial tool_orichalcum = EnumHelper.addToolMaterial("tool_orichalcum", 5, 1350, 9, 3, 20);
	public static final ArmorMaterial armor_orichalcum = EnumHelper.addArmorMaterial("armor_orichalcum", Reference.MODID + ":orichalcum", 34, new int[] {4,6,7,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item orichalcum_dust = new ItemBase("orichalcum_dust");
	public static final Item orichalcum_ingot = new ItemBase("orichalcum_ingot");
	public static final Item sword_orichalcum = new ToolSword("orichalcum_sword", tool_orichalcum);
	public static final Item pickaxe_orichalcum = new ToolPickaxe("orichalcum_pickaxe", tool_orichalcum);
	public static final Item axe_orichalcum = new ToolAxe("orichalcum_axe", tool_orichalcum);
	public static final Item shovel_orichalcum = new ToolShovel("orichalcum_shovel", tool_orichalcum);
	public static final Item hoe_orichalcum = new ToolHoe("orichalcum_hoe", tool_orichalcum);
	public static final Item helmet_orichalcum = new ArmorBase("orichalcum_helmet", armor_orichalcum, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_orichalcum = new ArmorBase("orichalcum_chestplate", armor_orichalcum, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_orichalcum = new ArmorBase("orichalcum_leggings", armor_orichalcum, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_orichalcum = new ArmorBase("orichalcum_boots", armor_orichalcum, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_titanium = EnumHelper.addToolMaterial("tool_titanium", 5, 1500, 10, 3, 20);
	public static final ArmorMaterial armor_titanium = EnumHelper.addArmorMaterial("armor_titanium", Reference.MODID + ":titanium", 34, new int[] {4,6,7,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item titanium_dust = new ItemBase("titanium_dust");
	public static final Item titanium_ingot = new ItemBase("titanium_ingot");
	public static final Item titanium_rod = new ItemBase("titanium_rod");
	public static final Item titanium_plate = new ItemBase("titanium_plate");
	public static final Item sword_titanium = new ToolSword("titanium_sword", tool_titanium);
	public static final Item pickaxe_titanium = new ToolPickaxe("titanium_pickaxe", tool_titanium);
	public static final Item axe_titanium = new ToolAxe("titanium_axe", tool_titanium);
	public static final Item shovel_titanium = new ToolShovel("titanium_shovel", tool_titanium);
	public static final Item hoe_titanium = new ToolHoe("titanium_hoe", tool_titanium);
	public static final Item helmet_titanium = new ArmorBase("titanium_helmet", armor_titanium, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_titanium = new ArmorBase("titanium_chestplate", armor_titanium, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_titanium = new ArmorBase("titanium_leggings", armor_titanium, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_titanium = new ArmorBase("titanium_boots", armor_titanium, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_celenegil = EnumHelper.addToolMaterial("tool_celenegil", 5, 1600, 14, 3, 25);
	public static final ArmorMaterial armor_celenegil = EnumHelper.addArmorMaterial("armor_celenegil", Reference.MODID + ":celenegil", 36, new int[] {5,6,7,4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item celenegil_dust = new ItemBase("celenegil_dust");
	public static final Item celenegil_ingot = new ItemBase("celenegil_ingot");
	public static final Item sword_celenegil = new ToolSword("celenegil_sword", tool_celenegil);
	public static final Item pickaxe_celenegil = new ToolPickaxe("celenegil_pickaxe", tool_celenegil);
	public static final Item axe_celenegil = new ToolAxe("celenegil_axe", tool_celenegil);
	public static final Item shovel_celenegil = new ToolShovel("celenegil_shovel", tool_celenegil);
	public static final Item hoe_celenegil = new ToolHoe("celenegil_hoe", tool_celenegil);
	public static final Item helmet_celenegil = new ArmorBase("celenegil_helmet", armor_celenegil, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_celenegil = new ArmorBase("celenegil_chestplate", armor_celenegil, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_celenegil = new ArmorBase("celenegil_leggings", armor_celenegil, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_celenegil = new ArmorBase("celenegil_boots", armor_celenegil, 1, EntityEquipmentSlot.FEET);
	
// - Tier 7 [Adamantium] - //
	
	public static final ToolMaterial tool_adamantium = EnumHelper.addToolMaterial("tool_adamantium", 6, 1550, 10, 4, 22);
	public static final ArmorMaterial armor_adamantium = EnumHelper.addArmorMaterial("armor_adamantium", Reference.MODID + ":adamantium", 38, new int[] {5,6,7,4}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item adamantium_dust = new ItemBase("adamantium_dust");
	public static final Item adamantium_ingot = new ItemBase("adamantium_ingot");
	public static final Item adamantium_rod = new ItemBase("adamantium_rod");
	public static final Item adamantium_plate = new ItemBase("adamantium_plate");
	public static final Item sword_adamantium = new ToolSword("adamantium_sword", tool_adamantium);
	public static final Item pickaxe_adamantium = new ToolPickaxe("adamantium_pickaxe", tool_adamantium);
	public static final Item axe_adamantium = new ToolAxe("adamantium_axe", tool_adamantium);
	public static final Item shovel_adamantium = new ToolShovel("adamantium_shovel", tool_adamantium);
	public static final Item hoe_adamantium = new ToolHoe("adamantium_hoe", tool_adamantium);
	public static final Item helmet_adamantium = new ArmorBase("adamantium_helmet", armor_adamantium, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_adamantium = new ArmorBase("adamantium_chestplate", armor_adamantium, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_adamantium = new ArmorBase("adamantium_leggings", armor_adamantium, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_adamantium = new ArmorBase("adamantium_boots", armor_adamantium, 1, EntityEquipmentSlot.FEET);

	public static final ToolMaterial tool_sanguinite = EnumHelper.addToolMaterial("tool_sanguinite", 6, 1750, 12, 4, 25);
	public static final ArmorMaterial armor_sanguinite = EnumHelper.addArmorMaterial("armor_sanguinite", Reference.MODID + ":sanguinite", 36, new int[] {5,6,7,4}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item sanguinite_dust = new ItemBase("sanguinite_dust");
	public static final Item sanguinite_ingot = new ItemBase("sanguinite_ingot");
	public static final Item sword_sanguinite = new ToolSword("sanguinite_sword", tool_sanguinite);
	public static final Item pickaxe_sanguinite = new ToolPickaxe("sanguinite_pickaxe", tool_sanguinite);
	public static final Item axe_sanguinite = new ToolAxe("sanguinite_axe", tool_sanguinite);
	public static final Item shovel_sanguinite = new ToolShovel("sanguinite_shovel", tool_sanguinite);
	public static final Item hoe_sanguinite = new ToolHoe("sanguinite_hoe", tool_sanguinite);
	public static final Item helmet_sanguinite = new ArmorBase("sanguinite_helmet", armor_sanguinite, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_sanguinite = new ArmorBase("sanguinite_chestplate", armor_sanguinite, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_sanguinite = new ArmorBase("sanguinite_leggings", armor_sanguinite, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_sanguinite = new ArmorBase("sanguinite_boots", armor_sanguinite, 1, EntityEquipmentSlot.FEET);
	
	
// - Tier 8 [Titansteel] - //
	
	public static final ToolMaterial tool_titansteel = EnumHelper.addToolMaterial("tool_titansteel", 7, 2250, 14, 5, 25);
	public static final ArmorMaterial armor_titansteel = EnumHelper.addArmorMaterial("armor_titansteel", Reference.MODID + ":titansteel", 42, new int[] {5,6,7,5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	public static final Item titansteel_dust = new ItemBase("titansteel_dust");
	public static final Item titansteel_ingot = new ItemBase("titansteel_ingot");
	public static final Item titansteel_rod = new ItemBase("titansteel_rod");
	public static final Item titansteel_plate = new ItemBase("titansteel_plate");
	public static final Item sword_titansteel = new ToolSword("titansteel_sword", tool_titansteel);
	public static final Item pickaxe_titansteel = new ToolPickaxe("titansteel_pickaxe", tool_titansteel);
	public static final Item axe_titansteel = new ToolAxe("titansteel_axe", tool_titansteel);
	public static final Item shovel_titansteel = new ToolShovel("titansteel_shovel", tool_titansteel);
	public static final Item hoe_titansteel = new ToolHoe("titansteel_hoe", tool_titansteel);
	public static final Item helmet_titansteel = new ArmorBase("titansteel_helmet", armor_titansteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_titansteel = new ArmorBase("titansteel_chestplate", armor_titansteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_titansteel = new ArmorBase("titansteel_leggings", armor_titansteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_titansteel = new ArmorBase("titansteel_boots", armor_titansteel, 1, EntityEquipmentSlot.FEET);

// - Tier 9 [Elementium] - //
	
	public static final Item elementium_ingot = new ItemBase("elementium_ingot");

	public static final ToolMaterial tool_cragsteel = EnumHelper.addToolMaterial("tool_cragsteel", 8, 1500, 7, 5, 20);
	public static final ArmorMaterial armor_cragsteel = EnumHelper.addArmorMaterial("armor_cragsteel", Reference.MODID + ":cragsteel", 45, new int[] {4,10,12,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final Item cragnite_shard = new ItemBase("cragnite_shard");
	public static final Item cragnite_fragment = new ItemBase("cragnite_fragment");
	public static final Item cragnite_crystal = new ItemBase("cragnite_crystal");
	public static final Item cragnite_ingot = new ItemBase("cragnite_ingot");
	public static final Item cragsteel_ingot = new ItemBase("cragsteel_ingot");
	public static final Item cragsteel_rod = new ItemBase("cragsteel_rod");
	public static final Item cragsteel_plate = new ItemBase("cragsteel_plate");
	public static final Item sword_cragsteel = new ToolSword("cragsteel_sword", tool_cragsteel);
	public static final Item pickaxe_cragsteel = new ToolPickaxe("cragsteel_pickaxe", tool_cragsteel);
	public static final Item axe_cragsteel = new ToolAxe("cragsteel_axe", tool_cragsteel);
	public static final Item shovel_cragsteel = new ToolShovel("cragsteel_shovel", tool_cragsteel);
	public static final Item hoe_cragsteel = new ToolHoe("cragsteel_hoe", tool_cragsteel);
	public static final Item helmet_cragsteel = new ArmorBase("cragsteel_helmet", armor_cragsteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_cragsteel = new ArmorBase("cragsteel_chestplate", armor_cragsteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_cragsteel = new ArmorBase("cragsteel_leggings", armor_cragsteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_cragsteel = new ArmorBase("cragsteel_boots", armor_cragsteel, 1, EntityEquipmentSlot.FEET);
	
	public static final ToolMaterial tool_hydrosteel = EnumHelper.addToolMaterial("tool_hydrosteel", 8, 1500, 7, 5, 20);
	public static final ArmorMaterial armor_hydrosteel = EnumHelper.addArmorMaterial("armor_hydrosteel", Reference.MODID + ":hydrosteel", 45, new int[] {4,10,12,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final Item hydrolite_shard = new ItemBase("hydrolite_shard");
	public static final Item hydrolite_fragment = new ItemBase("hydrolite_fragment");
	public static final Item hydrolite_crystal = new ItemBase("hydrolite_crystal");
	public static final Item hydrolite_ingot = new ItemBase("hydrolite_ingot");
	public static final Item hydrosteel_ingot = new ItemBase("hydrosteel_ingot");
	public static final Item hydrosteel_rod = new ItemBase("hydrosteel_rod");
	public static final Item hydrosteel_plate = new ItemBase("hydrosteel_plate");
	public static final Item sword_hydrosteel = new ToolSword("hydrosteel_sword", tool_hydrosteel);
	public static final Item pickaxe_hydrosteel = new ToolPickaxe("hydrosteel_pickaxe", tool_hydrosteel);
	public static final Item axe_hydrosteel = new ToolAxe("hydrosteel_axe", tool_hydrosteel);
	public static final Item shovel_hydrosteel = new ToolShovel("hydrosteel_shovel", tool_hydrosteel);
	public static final Item hoe_hydrosteel = new ToolHoe("hydrosteel_hoe", tool_hydrosteel);
	public static final Item helmet_hydrosteel = new ArmorBase("hydrosteel_helmet", armor_hydrosteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_hydrosteel = new ArmorBase("hydrosteel_chestplate", armor_hydrosteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_hydrosteel = new ArmorBase("hydrosteel_leggings", armor_hydrosteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_hydrosteel = new ArmorBase("hydrosteel_boots", armor_hydrosteel, 1, EntityEquipmentSlot.FEET);

	public static final ToolMaterial tool_zephyrsteel = EnumHelper.addToolMaterial("tool_zephyrsteel", 8, 1500, 7, 5, 20);
	public static final ArmorMaterial armor_zephyrsteel = EnumHelper.addArmorMaterial("armor_zephyrsteel", Reference.MODID + ":zephyrsteel", 45, new int[] {4,10,12,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final Item zephyrite_shard = new ItemBase("zephyrite_shard");
	public static final Item zephyrite_fragment = new ItemBase("zephyrite_fragment");
	public static final Item zephyrite_crystal = new ItemBase("zephyrite_crystal");
	public static final Item zephyrite_ingot = new ItemBase("zephyrite_ingot");
	public static final Item zephyrsteel_ingot = new ItemBase("zephyrsteel_ingot");
	public static final Item zephyrsteel_rod = new ItemBase("zephyrsteel_rod");
	public static final Item zephyrsteel_plate = new ItemBase("zephyrsteel_plate");
	public static final Item sword_zephyrsteel = new ToolSword("zephyrsteel_sword", tool_zephyrsteel);
	public static final Item pickaxe_zephyrsteel = new ToolPickaxe("zephyrsteel_pickaxe", tool_zephyrsteel);
	public static final Item axe_zephyrsteel = new ToolAxe("zephyrsteel_axe", tool_zephyrsteel);
	public static final Item shovel_zephyrsteel = new ToolShovel("zephyrsteel_shovel", tool_zephyrsteel);
	public static final Item hoe_zephyrsteel = new ToolHoe("zephyrsteel_hoe", tool_zephyrsteel);
	public static final Item helmet_zephyrsteel = new ArmorBase("zephyrsteel_helmet", armor_zephyrsteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item chestplate_zephyrsteel = new ArmorBase("zephyrsteel_chestplate", armor_zephyrsteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item leggings_zephyrsteel = new ArmorBase("zephyrsteel_leggings", armor_zephyrsteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item boots_zephyrsteel = new ArmorBase("zephyrsteel_boots", armor_zephyrsteel, 1, EntityEquipmentSlot.FEET);

	
// - Tier 10 [Elemental Steel] - //
	
	public static final Item cragcliff_amber = new ElementalItemBase("cragcliff_amber");
	public static final ToolMaterial tool_enchanted_cragsteel = EnumHelper.addToolMaterial("tool_enchanted_cragsteel", 9, 1750, 8, 6, 25);
	public static final ArmorMaterial armor_enchanted_cragsteel = EnumHelper.addArmorMaterial("armor_enchanted_cragsteel", Reference.MODID + ":enchanted_cragsteel", 50, new int[] {5,10,12,5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final Item pure_cragnite_shard = new ElementalItemBase("pure_cragnite_shard");
	public static final Item pure_cragnite_fragment = new ElementalItemBase("pure_cragnite_fragment");
	public static final Item pure_cragnite_crystal = new ElementalItemBase("pure_cragnite_crystal");
	public static final Item enchanted_cragsteel_ingot = new ElementalItemBase("enchanted_cragsteel_ingot");
	public static final Item enchanted_cragsteel_rod = new ElementalItemBase("enchanted_cragsteel_rod");
	public static final Item enchanted_cragsteel_plate = new ElementalItemBase("enchanted_cragsteel_plate");
//	public static final Item enchanted_cragsteel_shield = new EnchantedCragsteelShield("enchanted_cragsteel_shield");
	public static final Item enchanted_helmet_cragsteel = new ElementalArmorBase("enchanted_cragsteel_helmet", armor_cragsteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item enchanted_chestplate_cragsteel = new ElementalArmorBase("enchanted_cragsteel_chestplate", armor_cragsteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item enchanted_leggings_cragsteel = new ElementalArmorBase("enchanted_cragsteel_leggings", armor_cragsteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item enchanted_boots_cragsteel = new ElementalArmorBase("enchanted_cragsteel_boots", armor_cragsteel, 1, EntityEquipmentSlot.FEET);
	
	public static final Item skyridge_emerald = new ElementalItemBase("skyridge_emerald");
	public static final ToolMaterial tool_enchanted_zephyrsteel = EnumHelper.addToolMaterial("tool_enchanted_zephyrsteel", 9, 1750, 8, 6, 25);
	public static final ArmorMaterial armor_enchanted_zephyrsteel = EnumHelper.addArmorMaterial("armor_enchanted_zephyrsteel", Reference.MODID + ":enchanted_zephyrsteel", 50, new int[] {5,10,12,5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final Item pure_zephyrite_shard = new ElementalItemBase("pure_zephyrite_shard");
	public static final Item pure_zephyrite_fragment = new ElementalItemBase("pure_zephyrite_fragment");
	public static final Item pure_zephyrite_crystal = new ElementalItemBase("pure_zephyrite_crystal");
	public static final Item enchanted_zephyrsteel_ingot = new ElementalItemBase("enchanted_zephyrsteel_ingot");
	public static final Item enchanted_zephyrsteel_rod = new ElementalItemBase("enchanted_zephyrsteel_rod");
	public static final Item enchanted_zephyrsteel_plate = new ElementalItemBase("enchanted_zephyrsteel_plate");
//	public static final Item enchanted_zephyrsteel_bow = new EnchantedZephyrsteelBow("enchanted_zephyrsteel_bow");
	public static final Item enchanted_helmet_zephyrsteel = new ElementalArmorBase("enchanted_zephyrsteel_helmet", armor_zephyrsteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item enchanted_chestplate_zephyrsteel = new ElementalArmorBase("enchanted_zephyrsteel_chestplate", armor_zephyrsteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item enchanted_leggings_zephyrsteel = new ElementalArmorBase("enchanted_zephyrsteel_leggings", armor_zephyrsteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item enchanted_boots_zephyrsteel = new ElementalArmorBase("enchanted_zephyrsteel_boots", armor_zephyrsteel, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ruemus_sapphire = new ElementalItemBase("ruemus_sapphire");
	public static final ToolMaterial tool_enchanted_hydrosteel = EnumHelper.addToolMaterial("tool_enchanted_hydrosteel", 9, 1750, 8, 6, 25);
	public static final ArmorMaterial armor_enchanted_hydrosteel = EnumHelper.addArmorMaterial("armor_enchanted_hydrosteel", Reference.MODID + ":enchanted_hydrosteel", 50, new int[] {5,10,12,5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final Item pure_hydrolite_shard = new ElementalItemBase("pure_hydrolite_shard");
	public static final Item pure_hydrolite_fragment = new ElementalItemBase("pure_hydrolite_fragment");
	public static final Item pure_hydrolite_crystal = new ElementalItemBase("pure_hydrolite_crystal");
	public static final Item enchanted_hydrosteel_ingot = new ElementalItemBase("enchanted_hydrosteel_ingot");
	public static final Item enchanted_hydrosteel_rod = new ElementalItemBase("enchanted_hydrosteel_rod");
	public static final Item enchanted_hydrosteel_plate = new ElementalItemBase("enchanted_hydrosteel_plate");
//	public static final Item enchanted_hydrosteel_hoe = new EnchantedHydrosteelShield("enchanted_hydrosteel_hoe");
	public static final Item enchanted_helmet_hydrosteel = new ElementalArmorBase("enchanted_hydrosteel_helmet", armor_hydrosteel, 1, EntityEquipmentSlot.HEAD);
	public static final Item enchanted_chestplate_hydrosteel = new ElementalArmorBase("enchanted_hydrosteel_chestplate", armor_hydrosteel, 1, EntityEquipmentSlot.CHEST);
	public static final Item enchanted_leggings_hydrosteel = new ElementalArmorBase("enchanted_hydrosteel_leggings", armor_hydrosteel, 2, EntityEquipmentSlot.LEGS);
	public static final Item enchanted_boots_hydrosteel = new ElementalArmorBase("enchanted_hydrosteel_boots", armor_hydrosteel, 1, EntityEquipmentSlot.FEET);
	
// - Tier X [Chronosteel] - //
	
	
}
