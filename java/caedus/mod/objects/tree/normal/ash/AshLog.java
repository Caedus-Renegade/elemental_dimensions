package caedus.mod.objects.tree.normal.ash;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.ItemBlockVariants;
import caedus.mod.util.handlers.trees.TreeEnumHandler;
import caedus.mod.util.interfaces.IHasModel;
import caedus.mod.util.interfaces.IMetaName;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AshLog extends BlockLog implements IMetaName, IHasModel
{
	public static final PropertyEnum<TreeEnumHandler.EnumType> VARIANT = PropertyEnum.<TreeEnumHandler.EnumType>create("variant", TreeEnumHandler.EnumType.class, new Predicate<TreeEnumHandler.EnumType>()
	{
		public boolean apply(@Nullable TreeEnumHandler.EnumType apply)
		{
			return apply.getMeta() < 1;
		}
	});
	
	private String name;
	
	public AshLog(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2);
		setResistance(2);
		setSoundType(SoundType.WOOD);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeEnumHandler.EnumType.BASE).withProperty(LOG_AXIS, EnumAxis.Y));
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
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
	public IBlockState getStateFromMeta(int meta) 
	{
		IBlockState state = this.getDefaultState().withProperty(VARIANT, TreeEnumHandler.EnumType.byMetadata((meta & 1) % 1));
		
		switch(meta & 3)
		{
		case 0:
			state = state.withProperty(LOG_AXIS, EnumAxis.Y);
			break;
			
		case 1:
			state = state.withProperty(LOG_AXIS, EnumAxis.X);
			break;
			
		case 2:
			state = state.withProperty(LOG_AXIS, EnumAxis.Z);
			break;
			
		default:
			state = state.withProperty(LOG_AXIS, EnumAxis.NONE);
		}
		
		return state;
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		int i = 0;
		i = i | ((TreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
		
		switch((BlockLog.EnumAxis)state.getValue(LOG_AXIS))
		{
		case X:
			i |= 1;
			break;
			
		case Y:
			i |= 2;
			break;
			
		case Z:
			i |= 3;
		}
		
		return i;
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT,LOG_AXIS});
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
	public void registerModels() 
	{
		for(int i = 0; i < TreeEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ash_log_" + TreeEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}	
}