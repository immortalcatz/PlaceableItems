package com.stuntmania.placeableitems.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.stuntmania.placeableitems.PlaceableItems;
import com.stuntmania.placeableitems.tileentity.TESteak;

public class BlockSteak extends BlockPlaceableItems {
	
	/**
	 * 0 = raw 1 = cooked
	 */
	IIcon[] icons = new IIcon[2];
	
	public BlockSteak() {
		super(Material.sponge);
		this.setBlockBounds(0.125F, 0, 0.125F, 0.875F, 0.0625F, 0.875F);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		switch (world.getBlockMetadata(x, y, z)) {
		case 0:
			return ((TESteak) world.getTileEntity(x, y, z)).bite(3, 0.6F, player, world, x, y, z);
		case 1:
			return ((TESteak) world.getTileEntity(x, y, z)).bite(8, 1.6F, player, world, x, y, z);
		default:
			return false;
		}
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(PlaceableItems.MODID + ":destroy/steak_raw");
		icons[1] = reg.registerIcon(PlaceableItems.MODID + ":destroy/steak_cooked");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TESteak();
	}
	
	@Override
	public Item getItemDropped(int meta, Random rand, int par2) {
		if (meta == 0)
			return Items.beef;
		else
			return Items.cooked_beef;
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		switch (world.getBlockMetadata(x, y, z)) {
		case 0:
			return new ItemStack(Items.beef);
		default:
			return new ItemStack(Items.cooked_beef);
		}
	}
}
