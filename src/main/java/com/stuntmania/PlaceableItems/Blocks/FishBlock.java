package com.stuntmania.PlaceableItems.Blocks;

import com.stuntmania.PlaceableItems.TileEntities.FishBlockTileEntity;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class FishBlock extends PlaceableItemsBlock {
	
	public FishBlock(Material material) {
		super(material);
		setBlockBounds(0, 0, 0, 1, 0.1F, 1);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		return new FishBlockTileEntity();
	}
}
