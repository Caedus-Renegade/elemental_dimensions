package caedus.mod.objects.blocks.machines.teleporters;

import caedus.mod.Main;
import caedus.mod.commands.util.Teleport;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ZephyrsteelTeleporter extends Block implements IHasModel 
{
	public ZephyrsteelTeleporter(String name)
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(50);
		setResistance(50);
		
		setHarvestLevel("pickaxe", 7);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(!worldIn.isRemote)
		{
			Teleport.teleportToDimension(playerIn, 2, playerIn.getPosition().getX(), playerIn.getPosition().getY() + 5, playerIn.getPosition().getZ());
			return true;
		}
		
		return false;
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isTranslucent(IBlockState state)
	{
		return true;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
}
//	@Override
//	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    
//	if(playerIn.dimension == 6)
//	{
//		Teleport.teleportToDimension(playerIn, 0, playerIn.getPosition().getX(), playerIn.getPosition().getY() + 5, playerIn.getPosition().getZ());
//	}
//	if(!(playerIn.dimension == 6))
//	{
//      BlockPos pos2 = playerIn.getPosition();
//      playerIn.changeDimension(0);
//		World world = playerIn.getEntityWorld();
//      boolean test = false;
//      for(int i = 0; i == -1; i++)
//      {
//          if(!(world.getBlockState(new BlockPos(pos2.getX(), pos2.getY() + i, pos2.getZ())) == Blocks.AIR.getDefaultState()))
//          {
            	
//          }
//          else
//          {
//              pos2 = new BlockPos(pos2.getX(), pos2.getY() + i, pos2.getZ());
//              i = -1;
//          }
//      }
//      playerIn.setPosition(pos2.getX(), pos2.getY(), pos2.getZ());
//      world.setBlockState(new BlockPos(pos2.getX(), pos2.getY() - 1, pos2.getZ()), BlockInit.zephyrsteel_teleporter.getDefaultState());
//  }
//  return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
//	}