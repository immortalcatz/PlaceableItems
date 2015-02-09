package com.stuntmania.PlaceableItems.Init;

import net.minecraft.block.Block;

import com.stuntmania.PlaceableItems.Blocks.*;
import com.stuntmania.PlaceableItems.TileEntities.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block ingot;
	public static Block brick;
	public static Block bowl;
	public static Block saddle;
	public static Block horse_armor_stand;
	
	public static Block steak;
	public static Block apple;
	public static Block fish;
	public static Block melon;
	public static Block egg;
	public static Block pumpkin_pie;
	
	public static Block gunpowder;
	
	public static Block ender_pearl;
	public static Block ender_eye;
	
	public static Block bucket;
	
	public static void init() {
		
		ingot = new BlockIngot();
		brick = new BlockBrick();
		bowl = new BlockBowl();
		saddle = new BlockSaddleStand();
		horse_armor_stand = new BlockHorseArmorStand();
		
		steak = new BlockSteak(); // TODO fix block texture
		apple = new BlockApple();
		fish = new BlockFish();
		melon = new BlockMelon();
		egg = new BlockEgg();
		pumpkin_pie = new BlockPumpkinPie();
		
		gunpowder = new BlockGunpowder();
		
		ender_pearl = new BlockEnderPearl();
		ender_eye = new BlockEnderEye();
		
		bucket = new BlockBucket();

		
		GameRegistry.registerTileEntity(TEIngot.class, "ingotBlock");
		GameRegistry.registerTileEntity(TEBrick.class, "brickBlock");
		GameRegistry.registerTileEntity(TEBowl.class, "bowlBlock");
		GameRegistry.registerTileEntity(TESaddleStand.class, "saddleStandBlock");
		GameRegistry.registerTileEntity(TEHorseArmorStand.class, "horseArmorStandBlock");

		GameRegistry.registerTileEntity(TESteak.class, "steakBlock");
		GameRegistry.registerTileEntity(TEApple.class, "appleBlock");
		GameRegistry.registerTileEntity(TEFish.class, "fishBlock");
		GameRegistry.registerTileEntity(TEMelon.class, "melonBlock");
		GameRegistry.registerTileEntity(TEEgg.class, "eggBlock");
		GameRegistry.registerTileEntity(TEPumpkinPie.class, "pumpkinPieBlock");

		GameRegistry.registerTileEntity(TEGunpowder.class, "gunpowderBlock");

		GameRegistry.registerTileEntity(TEEnderPearl.class, "enderPearlBlock");
		GameRegistry.registerTileEntity(TEEnderEye.class, "enderEyeBlock");
		
		GameRegistry.registerTileEntity(TEBucket.class, "bucketBlock");
	}
}