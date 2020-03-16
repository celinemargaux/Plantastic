package com.celinemargaux.plantastic.common.items;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PlantasticItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Plantastic.MODID);

	public static final RegistryObject<Item> ASPARAGUS_ITEM = ITEMS.register("asparagus_item", () -> new Item(
		new Item.Properties().food(new Food.Builder().hunger(2).fastToEat().build()).group(ModItemGroup.PLANTASTIC)));

	public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds",
		() -> new Item(new Item.Properties().group(ModItemGroup.PLANTASTIC)));

	public static final RegistryObject<Item> PLANTASTIC_ICON = ITEMS.register("plantastic_icon",
		() -> new Item(new Item.Properties()));
}
