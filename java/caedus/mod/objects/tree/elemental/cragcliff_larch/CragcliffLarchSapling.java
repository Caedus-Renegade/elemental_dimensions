package caedus.mod.objects.tree.elemental.cragcliff_larch;

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
import caedus.mod.worldgen.trees.elemental.CragcliffLarchTree;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class CragcliffLarchSapling extends BlockBush implements IGrowable, IMetaName, IHasModel
{	
	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
    
    public static final PropertyEnum<TreeEnumHandler.EnumType> VARIANT = PropertyEnum.<TreeEnumHandler.EnumType>create("variant", TreeEnumHandler.EnumType.class, new Predicate<TreeEnumHandler.EnumType>()
	{
		public boolean apply(@Nullable TreeEnumHandler.EnumType apply)
		{
			return apply.getMeta() < 1;
		}
	});
    
    private String name;
    
    public CragcliffLarchSapling(String name) 
    {
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(10);
		setSoundType(SoundType.PLANT);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeEnumHandler.EnumType.BASE).withProperty(STAGE, Integer.valueOf(0)));
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
    
    //Sapling Shape
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
    {
    	return SAPLING_AABB;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) 
    {
    	return NULL_AABB;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) 
    {
    	return false;
    }
    
    @Override
    public boolean isFullCube(IBlockState state) 
    {
    	return false;
    }
        
    //Variants
    
    @Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(TreeEnumHandler.EnumType customblockplanks$enumtype : TreeEnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
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
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, TreeEnumHandler.EnumType.byMetadata(meta & 1)).withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((TreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
		i = i | ((Integer)state.getValue(STAGE)).intValue() << 3;
		return i;
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT, STAGE});	
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < TreeEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "cragcliff_larch_sapling" + "_" + TreeEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
	
	//Tree Code
	
	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) 
	{
		if(((Integer)state.getValue(STAGE)).intValue() == 0)
		{
			worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
		}
		else
		{
			this.generateTree(worldIn, rand, pos, state);
		}
	}
	
	public void generateTree(World world, Random rand, BlockPos pos, IBlockState state)
	{
		if(!TerrainGen.saplingGrowTree(world, rand, pos)) return;
		WorldGenerator gen = (WorldGenerator)(rand.nextInt(10) == 0 ? new WorldGenBigTree(false) : new WorldGenTrees(false));
		boolean flag = false;
		int i = 0, j = 0;
		
		switch((TreeEnumHandler.EnumType)state.getValue(VARIANT))
		{
		case BASE:
			gen = new CragcliffLarchTree(true, true);
			break;
		}
		
		IBlockState iblockstate = Blocks.AIR.getDefaultState();
		if(flag)
		{
			world.setBlockState(pos.add(i, 0, j), iblockstate, 4);
			world.setBlockState(pos.add(i + 1, 0, j), iblockstate, 4);
			world.setBlockState(pos.add(i, 0, j + 1), iblockstate, 4);
			world.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate, 4);
		}
		else
		{
			world.setBlockState(pos, iblockstate, 4);
		}
		
		if(!gen.generate(world, rand, pos.add(i, 0, j)))
		{
			if(flag)
			{
				world.setBlockState(pos.add(i, 0, j), iblockstate, 4);
				world.setBlockState(pos.add(i + 1, 0, j), iblockstate, 4);
				world.setBlockState(pos.add(i, 0, j + 1), iblockstate, 4);
				world.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate, 4);
			}
			else
			{
				world.setBlockState(pos, iblockstate, 4);
			}
		}
	}
	
	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return true;
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
	{
		if(!worldIn.isRemote)
		{
			super.updateTick(worldIn, pos, state, rand);
			if(worldIn.getLightFromNeighbors(pos.up())>= 9 && rand.nextInt(7)==0)
			{
				this.grow(worldIn, rand, pos, state);
			}
		}
	}
	
	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) 
	{
		return (double)worldIn.rand.nextFloat() < 0.45D;
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state) 
	{
		return state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.FARMLAND || state.getBlock() == BlockInit.cragstone;
	}

}