package caedus.mod.enchantments;

import caedus.mod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentKnockback;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentKnockbackPlus extends EnchantmentKnockback
{
    public EnchantmentKnockbackPlus()
    {
        super(Rarity.UNCOMMON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
        this.setName("knockback");
		this.setRegistryName(new ResourceLocation("minecraft:knockback"));
        
        EnchantmentInit.enchantments.add(this);
    }
    
    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 + 10 * (enchantmentLevel - 1);
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 10;
    }
}