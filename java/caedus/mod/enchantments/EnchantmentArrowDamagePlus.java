package caedus.mod.enchantments;

import caedus.mod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentArrowDamage;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentArrowDamagePlus extends EnchantmentArrowDamage
{
    public EnchantmentArrowDamagePlus()
    {
        super(Rarity.COMMON);
        this.setName("arrowDamage");
        this.setRegistryName(new ResourceLocation("minecraft:power"));
        
        EnchantmentInit.enchantments.add(this);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 1 + (enchantmentLevel - 1) * 10;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 15;
    }

    @Override
    public int getMaxLevel()
    {
        return 10;
    }
}