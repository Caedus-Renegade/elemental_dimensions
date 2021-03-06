package caedus.mod.objects.blocks.block.condensed;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CondensedCoalBlock extends Block implements IHasModel 
{
	public CondensedCoalBlock(String name)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(7);
		setResistance(2);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public int getItemBurnTime(ItemStack itemStack)
	{
		return 129600;
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
