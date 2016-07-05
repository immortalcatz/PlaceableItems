package me.ferdz.placeableitems.init;

import java.util.HashMap;

import me.ferdz.placeableitems.block.BlockApple;
import me.ferdz.placeableitems.block.BlockAppleGolden;
import me.ferdz.placeableitems.block.BlockArrow;
import me.ferdz.placeableitems.block.BlockBeetrootSoup;
import me.ferdz.placeableitems.block.BlockBiEdible;
import me.ferdz.placeableitems.block.BlockBone;
import me.ferdz.placeableitems.block.BlockBookAndQuill;
import me.ferdz.placeableitems.block.BlockCarrot;
import me.ferdz.placeableitems.block.BlockChorusFruit;
import me.ferdz.placeableitems.block.BlockCoal;
import me.ferdz.placeableitems.block.BlockCompass;
import me.ferdz.placeableitems.block.BlockDisc;
import me.ferdz.placeableitems.block.BlockEdible;
import me.ferdz.placeableitems.block.BlockEgg;
import me.ferdz.placeableitems.block.BlockEmptyBucket;
import me.ferdz.placeableitems.block.BlockFilledBucket;
import me.ferdz.placeableitems.block.BlockIngot;
import me.ferdz.placeableitems.block.BlockPlaceableItems;
import me.ferdz.placeableitems.block.BlockPotatoPoisoned;
import me.ferdz.placeableitems.block.BlockPotion;
import me.ferdz.placeableitems.block.BlockSalmon;
import me.ferdz.placeableitems.block.BlockSplashPotion;
import me.ferdz.placeableitems.block.tool.BlockSword;
import me.ferdz.placeableitems.block.tool.BlockTool;
import me.ferdz.placeableitems.tileentity.TEEdible;
import me.ferdz.placeableitems.tileentity.TEStack;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static HashMap<Item, BlockPlaceableItems> blockMap;

	public static Block blockLavaBucket, blockWaterBucket, blockMilkBucket, blockEmptyBucket;
	public static Block blockBook;
	public static Block blockBowl;
	public static Block blockBread;
	public static Block blockCarrot;
	public static Block blockApple, blockGoldenApple;
	public static Block blockArrow;
	public static Block blockPotato, blockPoisonedPotato;
	public static Block blockBeetroot, blockBeetrootSoup, blockBeetrootSeeds;
	public static Block blockBookAndQuill;
	public static Block blockBone;
	public static BlockPlaceableItems blockFish, blockSalmon;
	public static Block blockBottleEmpty, blockPotion, blockExperienceBottle, blockSplashPotion;
	public static Block blockBow;
	public static Block blockCarrotOnStick;
	public static Block blockCookie;
	public static Block blockEgg;
	public static Block blockCoal;
	public static Block blockBrick, blockBrickNether;
	public static Block blockChorusFruit, blockChorusPopped;
	public static Block blockMelon, blockMelonGlistering;
	public static Block blockSword;
	public static Block blockClayBall;
	public static Block blockDiamond;
	public static Block blockChicken;
	public static Block blockFeather;
	public static Block blockIngot;
	public static Block blockEmerald;
	public static Block blockPumkinPie;
	public static Block blockDisc;
	public static Block blockFireCharge;
	public static Block blockCompass;
	
	public static void init() {
		blockMap = new HashMap<Item, BlockPlaceableItems>();

		blockLavaBucket = new BlockFilledBucket("block_lava_bucket").setBucketItem(Items.LAVA_BUCKET).setItem(Items.LAVA_BUCKET).setBoundingBox(1, 0, 1, 15, 14, 15);
		blockWaterBucket = new BlockFilledBucket("block_water_bucket").setBucketItem(Items.WATER_BUCKET).setItem(Items.WATER_BUCKET).setBoundingBox(1, 0, 1, 15, 14, 15);
		blockMilkBucket = new BlockFilledBucket("block_milk_bucket").setBucketItem(Items.MILK_BUCKET).setItem(Items.MILK_BUCKET).setBoundingBox(1, 0, 1, 15, 14, 15);
		blockEmptyBucket = new BlockEmptyBucket("block_empty_bucket").setItem(Items.BUCKET).setBoundingBox(1, 0, 1, 15, 14, 15);
		blockBook = new BlockPlaceableItems("block_book").setItem(Items.BOOK).setBoundingBox(2, 0, 2, 14, 3, 14);
		blockBowl = new BlockPlaceableItems("block_bowl").setItem(Items.BOWL).setBoundingBox(2, 0, 2, 14, 3, 14);
		blockBread = new BlockEdible("block_bread", 5, 1.2F).setItem(Items.BREAD).setBoundingBox(2, 0, 2, 14, 5, 14);
		blockCarrot = new BlockCarrot("block_carrot").setItem(Items.CARROT).setItem(Items.GOLDEN_CARROT).setBoundingBox(2, 0, 2, 14, 5, 14);
		blockApple = new BlockApple("block_apple", 4, 0.6F).setItem(Items.APPLE);
		blockGoldenApple = new BlockAppleGolden("block_apple_golden", 4, 2.4F).setItem(Items.GOLDEN_APPLE);
		blockArrow = new BlockArrow("block_arrow").setItem(Items.ARROW).setItem(Items.TIPPED_ARROW).setItem(Items.SPECTRAL_ARROW).setBoundingBox(1, 0, 1, 15, 4, 15);
		blockPotato = new BlockBiEdible("block_potato", Items.POTATO, 1, 0.6F, Items.BAKED_POTATO, 5, 1.44F).setItem(Items.POTATO).setItem(Items.BAKED_POTATO).setBoundingBox(3, 0, 3, 13, 7, 13);
		blockPoisonedPotato = new BlockPotatoPoisoned("block_potato_poisoned", 2, 0.6F).setItem(Items.POISONOUS_POTATO).setBoundingBox(3, 0, 3, 13, 7, 13);
		blockBeetroot = new BlockEdible("block_beetroot", 1, 1.2F).setItem(Items.BEETROOT).setBoundingBox(3, 0, 3, 13, 5, 13);
		blockBeetrootSoup = new BlockBeetrootSoup("block_beetroot_soup", 6, 1.2F).setItem(Items.BEETROOT_SOUP).setBoundingBox(2, 0, 2, 14, 3, 14);
		blockBeetrootSeeds = new BlockPlaceableItems("block_beetroot_seeds").setItem(Items.BEETROOT_SEEDS).setBoundingBox(2, 0, 2, 14, 3, 14);
		blockBookAndQuill = new BlockBookAndQuill("block_book_and_quill").setItem(Items.WRITABLE_BOOK).setBoundingBox(0, 0, 0, 16, 5, 16);
		blockBone = new BlockBone("block_bone").setItem(Items.BONE).setBoundingBox(0, 0, 0, 16, 3, 16);
		blockFish = new BlockBiEdible("block_fish", Items.FISH, 2, 0.2F, Items.COOKED_FISH, 5, 1.2F).setItem(Items.FISH).setItem(Items.COOKED_FISH).setBoundingBox(0, 0, 0, 16, 3, 16);
		blockSalmon = new BlockSalmon("block_salmon", Items.FISH, 2, 0.2F, Items.COOKED_FISH, 6, 1.6F).setItem(Items.FISH).setItem(Items.COOKED_FISH).setBoundingBox(0, 0, 0, 16, 3, 16);
		blockBottleEmpty = new BlockPlaceableItems("block_bottle_empty").setItem(Items.GLASS_BOTTLE).setBoundingBox(4, 0, 4, 12, 10, 12);
		blockPotion = new BlockPotion("block_potion").setItem(Items.POTIONITEM).setBoundingBox(4, 0, 4, 12, 10, 12);
		blockSplashPotion = new BlockSplashPotion("block_splash_potion").setItem(Items.SPLASH_POTION).setBoundingBox(4, 0, 4, 12, 10, 12);
		blockExperienceBottle = new BlockPlaceableItems("block_bottle_experience").setItem(Items.EXPERIENCE_BOTTLE).setBoundingBox(4, 0, 4, 12, 10, 12);
		blockBow = new BlockTool("block_bow").setItem(Items.BOW).setBoundingBox(0, 0, 0, 16, 4, 16);
		blockCarrotOnStick = new BlockTool("block_carrot_on_stick").setItem(Items.CARROT_ON_A_STICK).setBoundingBox(0, 0, 0, 16, 4, 16);
		blockCookie = new BlockEdible("block_cookie", 2, 0.2F).setItem(Items.COOKIE).setBoundingBox(3, 0, 3, 13, 4, 13);
		blockEgg = new BlockEgg("block_egg").setItem(Items.EGG).setBoundingBox(3, 0, 3, 13, 10, 13);
		blockCoal = new BlockCoal("block_coal").setItem(Items.COAL).setBoundingBox(3, 0, 3, 13, 10, 13);
		blockBrick = new BlockPlaceableItems("block_brick").setItem(Items.BRICK).setBoundingBox(1, 0, 1, 15, 6, 15);
		blockBrickNether = new BlockPlaceableItems("block_brick_nether").setItem(Items.NETHERBRICK).setBoundingBox(1, 0, 1, 15, 6, 15);
		blockChorusFruit = new BlockChorusFruit("block_chorus_fruit", 4, 2.4F).setItem(Items.CHORUS_FRUIT).setBoundingBox(2, 6, 2);
		blockChorusPopped = new BlockPlaceableItems("block_chorus_popped").setItem(Items.CHORUS_FRUIT_POPPED).setBoundingBox(2, 6, 2);
		blockMelon = new BlockEdible("block_melon", 2, 1.2F).setItem(Items.MELON).setBoundingBox(5, 0, 1, 11, 14, 15);
		blockMelonGlistering = new BlockPlaceableItems("block_melon_glistering").setItem(Items.SPECKLED_MELON).setBoundingBox(5, 0, 1, 11, 14, 15);
		blockSword = new BlockSword("block_sword").setItem(Items.WOODEN_SWORD).setItem(Items.STONE_SWORD).setItem(Items.IRON_SWORD).setItem(Items.GOLDEN_SWORD).setItem(Items.DIAMOND_SWORD);
		blockClayBall = new BlockPlaceableItems("block_clay_ball").setItem(Items.CLAY_BALL).setBoundingBox(3, 0, 3, 13, 7, 13);
		blockDiamond = new BlockPlaceableItems("block_diamond").setItem(Items.DIAMOND).setBoundingBox(5, 0, 5, 11, 8, 11);
		blockChicken = new BlockBiEdible("block_chicken", Items.CHICKEN, 2, 1.2F, Items.COOKED_CHICKEN, 6, 7.2F).setItem(Items.CHICKEN).setItem(Items.COOKED_CHICKEN).setBoundingBox(1, 0, 1, 15, 8, 15);
		blockFeather = new BlockPlaceableItems("block_feather").setItem(Items.FEATHER).setBoundingBox(3, 3, 3);
		blockIngot = new BlockIngot("block_ingot").setItem(Items.IRON_INGOT).setItem(Items.GOLD_INGOT).setBoundingBox(2, 4, 2);
		blockEmerald = new BlockPlaceableItems("block_emerald").setItem(Items.EMERALD).setBoundingBox(2, 8, 2);
		blockPumkinPie = new BlockEdible("block_pumpkin_pie", 8, 4.8F).setItem(Items.PUMPKIN_PIE).setBoundingBox(0, 6, 0);
		blockDisc = new BlockDisc("block_disc").setItem(Items.RECORD_11).setItem(Items.RECORD_13).setItem(Items.RECORD_BLOCKS).setItem(Items.RECORD_CAT).setItem(Items.RECORD_CHIRP).setItem(Items.RECORD_FAR).setItem(Items.RECORD_MALL).setItem(Items.RECORD_MELLOHI).setItem(Items.RECORD_STAL).setItem(Items.RECORD_STRAD).setItem(Items.RECORD_WAIT).setItem(Items.RECORD_WARD).setBoundingBox(3, 3, 3);
		blockFireCharge = new BlockPlaceableItems("block_fire_charge").setItem(Items.FIRE_CHARGE).setBoundingBox(2, 10, 2);
		blockCompass = new BlockCompass("block_compass").setItem(Items.COMPASS);
		
		GameRegistry.registerTileEntity(TEStack.class, "te_stack");
		GameRegistry.registerTileEntity(TEEdible.class, "te_edible");
		GameRegistry.registerTileEntity(TEGoldenApple.class, "te_golden_apple");
	}
}
