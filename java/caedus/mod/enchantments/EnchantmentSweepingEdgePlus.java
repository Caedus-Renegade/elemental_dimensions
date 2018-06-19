package caedus.mod.enchantments;

import caedus.mod.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentSweepingEdge;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentSweepingEdgePlus extends EnchantmentSweepingEdge
{
    public EnchantmentSweepingEdgePlus()
    {
        super(Rarity.RARE);
        this.setName("sweeping");
		this.setRegistryName(new ResourceLocation("minecraft:sweeping"));
        
        EnchantmentInit.enchantments.add(this);

    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 + (enchantmentLevel - 1) * 9;
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

    public static float getSweepingDamageRatio(int p_191526_0_)
    {
        return 1.0F - 1.0F / (float)(p_191526_0_ + 1);
    }

    public String getName()
    {
        return "enchantment.sweeping";
    }
}