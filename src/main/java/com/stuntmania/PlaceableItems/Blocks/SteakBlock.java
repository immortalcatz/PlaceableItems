package com.stuntmania.PlaceableItems.Blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.stuntmania.PlaceableItems.PlaceableItems;
import com.stuntmania.PlaceableItems.TileEntities.SteakTileEntity;

public class SteakBlock extends PlaceableItemsBlock {

	IIcon icon;
	
	public SteakBlock(Material p_i45386_1_) {
		super(p_i45386_1_);
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new SteakTileEntity();
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Items.cooked_beef;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icon = reg.registerIcon(PlaceableItems.MODID + ":steak");
	}
	
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return icon;
	}
	
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int x, int y, int z) {
		setBlockBounds(0, 0, 0, 1, 0.1F, 1);
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 0.1F, z + 1);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int x, int y, int z) {
		setBlockBounds(0, 0, 0, 1, 0.1F, 1);
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 0.1F, z + 1);
	}
}
