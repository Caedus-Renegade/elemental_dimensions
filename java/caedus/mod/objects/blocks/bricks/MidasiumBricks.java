package caedus.mod.objects.blocks.bricks;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MidasiumBricks extends Block implements IHasModel 
{
	public MidasiumBricks(String name)
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(6);
		setResistance(6);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
