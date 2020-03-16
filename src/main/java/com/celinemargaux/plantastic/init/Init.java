package com.celinemargaux.plantastic.init;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.common.blocks.ModCropsBlock;
import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Plantastic.MODID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);


	// CROPS
	public static final RegistryObject<Block> ASPARAGUS_CROP = BLOCKS.register("asparagus_crop", () -> new ModCropsBlock(4));

	// BLOCKS

	
	//ITEMS
	public static final RegistryObject<Item> ASPARAGUS_ITEM = ITEMS.register("asparagus_item", () -> new Item(
		new Item.Properties().food(new Food.Builder().hunger(2).fastToEat().build()).group(ModItemGroup.PLANTASTIC)));

	public static final RegistryObject<Item> PLANTASTIC_ICON = ITEMS.register("plantastic_icon",
		() -> new Item(new Item.Properties()));
	
	//SEEDS
	public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_crop",
		() -> new BlockItem(ASPARAGUS_CROP.get(), new Item.Properties().group(ModItemGroup.PLANTASTIC)));
}
