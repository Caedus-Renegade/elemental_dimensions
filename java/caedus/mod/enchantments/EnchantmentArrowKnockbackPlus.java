package caedus.mod.enchantments;

import caedus.mod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentArrowKnockback;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentArrowKnockbackPlus extends EnchantmentArrowKnockback
{
    public EnchantmentArrowKnockbackPlus()
    {
        super(Rarity.RARE);
        this.setName("arrowKnockback");
		this.setRegistryName(new ResourceLocation("minecraft:arrowKnockback"));
        
        EnchantmentInit.enchantments.add(this);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 6 + (enchantmentLevel - 1) * 10;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 25;
    }

    @Override
    public int getMaxLevel()
    {
        return 10;
    }
}