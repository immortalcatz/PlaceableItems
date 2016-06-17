package me.ferdz.placeableitems.block;

import java.util.Random;

import me.ferdz.placeableitems.block.state.EnumArrowType;
import me.ferdz.placeableitems.init.ModBlocks;
import me.ferdz.placeableitems.tileentity.TEArrow;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockArrow extends BlockPlaceableItems implements ITileEntityProvider {

	public static final PropertyEnum<EnumArrowType> TYPE = PropertyEnum.create("type", EnumArrowType.class);
	
	public BlockArrow(String name) {
		super(name);
		
		this.isBlockContainer = true;
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		TileEntity te = worldIn.getTileEntity(pos);
		if (te instanceof TEArrow) {
			ItemStack is = stack.copy();
			is.stackSize = 1;
			((TEArrow) te).setType(is);
			worldIn.notifyBlockOfStateChange(pos, ModBlocks.blockArrow);
			te.markDirty();
		}
	}
	
	// handled in BlockBreakHandler
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		TEArrow te = (TEArrow) world.getTileEntity(pos);
		return te.getType();
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		TEArrow te = (TEArrow)worldIn.getTileEntity(pos);
	
		if(te.getType().getItem().equals(Items.ARROW)) {
			return state.withProperty(TYPE, EnumArrowType.NORMAL);
		} else if (te.getType().getItem().equals(Items.TIPPED_ARROW)) {
			String type = te.getType().getTagCompound().getString("Potion").substring(10).toUpperCase();
			EnumArrowType arrowType = null;
			if(type.contains("FIRE_RESISTANCE"))
				arrowType = EnumArrowType.FIRE_RESISTANCE;
			else if (type.contains("HEALING"))
				arrowType = EnumArrowType.HEALING;
			else if (type.contains("INVISIBILITY"))
				arrowType = EnumArrowType.INVISIBILITY;
			else if (type.contains("LEAPING"))
				arrowType = EnumArrowType.LEAPING;
			else if (type.contains("NIGHT_VISION"))
				arrowType = EnumArrowType.NIGHT_VISION;
			else if (type.contains("POISON"))
				arrowType = EnumArrowType.POISON;
			else if (type.contains("REGENERATION"))
				arrowType = EnumArrowType.REGENERATION;
			else if (type.contains("SLOWNESS"))
				arrowType = EnumArrowType.SLOWNESS;
			else if (type.contains("STRENGTH"))
				arrowType = EnumArrowType.STRENGTH;
			else if (type.contains("SWIFTNESS"))
				arrowType = EnumArrowType.SWIFTNESS;
			else if (type.contains("WATER_BREATHING"))
				arrowType = EnumArrowType.WATER_BREATHING;
			else if (type.contains("WEAKNESS"))
				arrowType = EnumArrowType.WEAKNESS;
			return state.withProperty(TYPE, arrowType);
		} else if (te.getType().getItem().equals(Items.SPECTRAL_ARROW)) {
			return state.withProperty(TYPE, EnumArrowType.SPECTRAL);
		} else {
			return state;
		}
	}
	
	public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param) {
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }
	
	@Override
	protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{ TYPE, FACING });
    }
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TEArrow();
	}
}
