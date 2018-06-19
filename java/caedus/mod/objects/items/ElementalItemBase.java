package caedus.mod.objects.items;

import caedus.mod.Main;
import caedus.mod.init.ItemInit;
import caedus.mod.proxy.ClientProxy;
import caedus.mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ElementalItemBase extends Item implements IHasModel
{
	public ElementalItemBase (String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public boolean hasEffect(ItemStack is)
	{
		return true;
	}
}
