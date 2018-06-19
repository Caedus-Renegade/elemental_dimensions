package caedus.mod.enchantments;

import caedus.mod.init.EnchantmentInit;
import caedus.mod.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLootBonus;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentFortunePlus extends EnchantmentLootBonus
{
	public EnchantmentFortunePlus()
	{
		super(Rarity.RARE, EnumEnchantmentType.DIGGER, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
		this.setName("fortune");
		this.setRegistryName(new ResourceLocation("minecraft:fortune"));
		
		EnchantmentInit.enchantments.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel)
	{
		return 10 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel)
	{
		return this.getMinEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxLevel()
	{
		return 10;
	}	

}
