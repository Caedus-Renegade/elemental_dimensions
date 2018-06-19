package caedus.mod.enchantments;

import java.util.Random;

import caedus.mod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDurability;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EnchantmentDurabilityPlus extends EnchantmentDurability
{
    public EnchantmentDurabilityPlus()
    {
        super(Rarity.UNCOMMON);
        this.setName("durability");
		this.setRegistryName(new ResourceLocation("minecraft:unbreaking"));
        
        EnchantmentInit.enchantments.add(this);

    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 + (enchantmentLevel - 1) * 8;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 10;
    }

    public boolean canApply(ItemStack stack)
    {
        return stack.isItemStackDamageable() ? true : super.canApply(stack);
    }

    public static boolean negateDamage(ItemStack stack, int level, Random rand)
    {
        if (stack.getItem() instanceof ItemArmor && rand.nextFloat() < 0.6F)
        {
            return false;
        }
        else
        {
            return rand.nextInt(level + 1) > 0;
        }
    }
}