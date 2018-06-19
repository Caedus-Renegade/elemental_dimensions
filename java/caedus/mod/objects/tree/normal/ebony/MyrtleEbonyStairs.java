package caedus.mod.objects.tree.normal.ebony;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MyrtleEbonyStairs extends BlockStairs
{

	public MyrtleEbonyStairs(String name, IBlockState modelState)
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public void registerModels() 
	{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
