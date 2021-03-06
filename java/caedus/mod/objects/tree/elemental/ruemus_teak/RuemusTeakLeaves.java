package caedus.mod.objects.tree.elemental.ruemus_teak;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.ItemBlockVariants;
import caedus.mod.util.handlers.trees.TreeEnumHandler;
import caedus.mod.util.interfaces.IHasModel;
import caedus.mod.util.interfaces.IMetaName;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RuemusTeakLeaves extends BlockLeaves implements IMetaName, IHasModel
{
	public static final PropertyEnum<TreeEnumHandler.EnumType> VARIANT = PropertyEnum.<TreeEnumHandler.EnumType>create("variant", TreeEnumHandler.EnumType.class, new Predicate<TreeEnumHandler.EnumType>()
	{
		public boolean apply(@Nullable TreeEnumHandler.EnumType apply)
		{
			return apply.getMeta() < 1;
		}
	});
	
	private String name;
	
	public RuemusTeakLeaves(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(0.2F);
		setResistance(10);
		setSoundType(SoundType.PLANT);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeEnumHandler.EnumType.BASE).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
	    return this.getDefaultState().withProperty(VARIANT, TreeEnumHandler.EnumType.byMetadata(meta % 1)).withProperty(DECAYABLE, Boolean.valueOf((meta & 1) == 1)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 2) > 1));
	}
	
//	@Override
//	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
//	{
//		return Item.getItemFromBlock(BlockInit.ruemus_teak_sapling);
//	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		int i = ((TreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
		
		if(!((Boolean)state.getValue(DECAYABLE)).booleanValue())
		{
			i |= 1;
		}
		
		if(!((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
		{
			i |= 2;
		}
		
		return i;
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(TreeEnumHandler.EnumType customblockplanks$enumtype : TreeEnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
	}
	
	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta());
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((TreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return TreeEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {return;}
	
	@Override
	protected int getSaplingDropChance(IBlockState state) {return 20;}
	
	@Override
	public EnumType getWoodType(int meta) {return null;}
	
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMeta()));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT,DECAYABLE,CHECK_DECAY});
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() 
	{
		return BlockRenderLayer.TRANSLUCENT;
	}	
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < TreeEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ruemus_teak_leaves" +"_" + TreeEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}