package caedus.mod.init;

import java.util.ArrayList;
import java.util.List;

import caedus.mod.enchantments.EnchantmentArrowDamagePlus;
import caedus.mod.enchantments.EnchantmentArrowKnockbackPlus;
import caedus.mod.enchantments.EnchantmentDurabilityPlus;
import caedus.mod.enchantments.EnchantmentFortunePlus;
import caedus.mod.enchantments.EnchantmentKnockbackPlus;
import caedus.mod.enchantments.EnchantmentLootingPlus;
import caedus.mod.enchantments.EnchantmentOxygenPlus;
import caedus.mod.enchantments.EnchantmentSweepingEdgePlus;
import caedus.mod.enchantments.EnchantmentThornsPlus;
import caedus.mod.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class EnchantmentInit
{
	public static final List<Enchantment> enchantments = new ArrayList<Enchantment>();
//Common
	public static final Enchantment power = new EnchantmentArrowDamagePlus();
//Uncommon
	public static final Enchantment knockback = new EnchantmentKnockbackPlus();
	public static final Enchantment unbreaking = new EnchantmentDurabilityPlus();
//Rare
	public static final Enchantment sweepingedge = new EnchantmentSweepingEdgePlus();
	public static final Enchantment oxygen = new EnchantmentOxygenPlus();
	public static final Enchantment looting = new EnchantmentLootingPlus();
	public static final Enchantment fortune = new EnchantmentFortunePlus();
	public static final Enchantment punch = new EnchantmentArrowKnockbackPlus();
//Very Rare
	public static final Enchantment thorns = new EnchantmentThornsPlus();
	
	@SubscribeEvent
	public static void Enchantment1Function(LivingUpdateEvent event)
	{
		EntityLivingBase living = event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(fortune, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
	}
}
