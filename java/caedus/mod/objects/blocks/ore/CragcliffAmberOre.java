package caedus.mod.objects.blocks.ore;

import java.util.Random;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CragcliffAmberOre extends Block implements IHasModel 
{
	public CragcliffAmberOre(String name)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(18);
		setResistance(18);
		setLightLevel(1);
		setHarvestLevel("pickaxe", 8);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemInit.cragcliff_amber;
    }
	
	 @Override
	    public int quantityDroppedWithBonus(int fortune, Random random)
	    {
	        return Math.max(0, random.nextInt(fortune + 2) - 1) + 1;
	    }

	 
//	 @SideOnly(Side.CLIENT)
//	    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
//	 {
//	        super.randomDisplayTick(stateIn, worldIn, pos, rand);
//	        if (rand.nextInt(1) == 0)
//	        {
//	            worldIn.spawnParticle(EnumParticleTypes.BLOCK_DUST, (double)((float)pos.getX() + rand.nextFloat()), (double)((float)pos.getY() + 1.1F), (double)((float)pos.getZ() + rand.nextFloat()), 0.0D, 0.0D, 0.0D);
//	        }
//	 }
}
