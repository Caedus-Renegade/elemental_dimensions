package caedus.mod.objects.blocks.ore;

import java.util.Random;

import caedus.mod.Main;
import caedus.mod.init.BlockInit;
import caedus.mod.init.ItemInit;
import caedus.mod.util.ItemBlockVariants;
import caedus.mod.util.handlers.ore.ZephyriteOreEnumHandler;
import caedus.mod.util.interfaces.IHasModel;
import caedus.mod.util.interfaces.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class PureZephyriteOre extends Block implements IHasModel, IMetaName
{
	public static final PropertyEnum<ZephyriteOreEnumHandler.EnumType> VARIANT = PropertyEnum.<ZephyriteOreEnumHandler.EnumType>create("variant", ZephyriteOreEnumHandler.EnumType.class);
	
	private String name, dimension;
	
	public PureZephyriteOre(String name)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(18);
		setResistance(18);
		setLightLevel(1);
		setHarvestLevel("pickaxe", 8);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, ZephyriteOreEnumHandler.EnumType.overworld));
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemInit.pure_zephyrite_shard;
    }
	
    public int quantityDropped(Random random)
    {
        return 4 + random.nextInt(2);
    }
	 	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((ZephyriteOreEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, ZephyriteOreEnumHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(ZephyriteOreEnumHandler.EnumType variant : ZephyriteOreEnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return ZephyriteOreEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < ZephyriteOreEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "pure_zephyrite_ore_" + ZephyriteOreEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}