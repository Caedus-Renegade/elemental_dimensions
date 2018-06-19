package caedus.mod.enchantments;

import caedus.mod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentOxygen;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentOxygenPlus extends EnchantmentOxygen
{
    public EnchantmentOxygenPlus()
    {
		super(Rarity.RARE, new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD});
        this.setName("oxygen");
        this.setRegistryName(new ResourceLocation("minecraft:respiration"));
        
        EnchantmentInit.enchantments.add(this);
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 * enchantmentLevel;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 30;
    }

    @Override
    public int getMaxLevel()
    {
        return 10;
    }
}