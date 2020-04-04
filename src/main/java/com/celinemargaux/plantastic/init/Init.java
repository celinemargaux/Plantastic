package com.celinemargaux.plantastic.init;

import java.util.List;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.common.blocks.ModCropsBlockSEVEN;
import com.celinemargaux.plantastic.common.items.EdiblePlant;
import com.celinemargaux.plantastic.common.items.ModFood;
import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;
import com.celinemargaux.plantastic.common.util.helper.json.JSONHandler;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Plantastic.MODID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);
	public static final DeferredRegister<Block> CROPS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);
	public static final DeferredRegister<Item> SEEDS = new DeferredRegister<>(ForgeRegistries.ITEMS, Plantastic.MODID);

	// CROPS
	public static final RegistryObject<Block> ASPARAGUS_CROP = CROPS.register("asparagus_crop", () -> new ModCropsBlockSEVEN());

	// BLOCKS

	// EDIBLE PLANT ITEMS
	public static final RegistryObject<Item> ASPARAGUS = ITEMS.register("asparagus", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ALMOND = ITEMS.register("almond", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BASIL = ITEMS.register("basil", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BELL_PEPPER = ITEMS.register("bell_pepper", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BROCCOLI = ITEMS.register("broccoli", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CASHEW = ITEMS.register("cashew", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CAULIFLOWER = ITEMS.register("cauliflower", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CELERY = ITEMS.register("celery", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CHANTRELLE_MUSHROOM = ITEMS.register("chantrelle_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CHILLI_PEPPER = ITEMS.register("chilli_pepper", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> DILL = ITEMS.register("dill", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> FENNEL = ITEMS.register("fennel", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> GINGER = ITEMS.register("ginger", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> HAZELNUT = ITEMS.register("hazelnut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> JELLY_EAR_MUSHROOM = ITEMS.register("jelly_ear_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> KALE = ITEMS.register("kale", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> KING_OYSTER_MUSHROOM = ITEMS.register("kind_oyster_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> OLIVE = ITEMS.register("olive", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> OYSTER_MUSHROM = ITEMS.register("oyste_mushroom", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PARSLEY = ITEMS.register("parsley", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PEA = ITEMS.register("pea", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PECAN_NUT = ITEMS.register("pecan_nut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> RADISH = ITEMS.register("radish", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> SHIITAKE_MUSHROOM = ITEMS.register("shiitake_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> SPINACH = ITEMS.register("spinach", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> SUGAR_BEETS = ITEMS.register("sugar_beets", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> TRUFFLE = ITEMS.register("truffle", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ZUCCHINI = ITEMS.register("zucchini", () -> new EdiblePlant(2, 1.2f));

	// MODFOOD

	// DRINKS
	public static final RegistryObject<Item> ALMOND_DRINK = ITEMS.register("almond_drink", () -> new ModFood(2, 1.2f));

	// MISC
	public static final RegistryObject<Item> PLANTASTIC_ICON = ITEMS.register("plantastic_icon",
		() -> new Item(new Item.Properties()));

	// SEEDS
	public static final RegistryObject<Item> ASPARAGUS_SEEDS = SEEDS.register("asparagus_crop",
		() -> new BlockItem(ASPARAGUS_CROP.get(), new Item.Properties().group(ModItemGroup.PLANTASTIC)));

	/*
	 * 
	 * METHODS
	 * 
	 */

	public static void registerFruitsJuicesJams() {
		Plantastic.LOGGER.debug("Add Fruits, Juices and Jams to ITEMS");
		List<EdiblePlant> fruits = JSONHandler.getEdiblePlants();

		for (EdiblePlant fruit : fruits) {
			String fruitName = fruit.getRegistryName().toString();
			ITEMS.register(fruitName,
				() -> new EdiblePlant(fruit.getFood().getHealing(), fruit.getFood().getSaturation()));
			ITEMS.register(fruitName + "_juice", () -> new ModFood(4, 1.8f));
			ITEMS.register(fruitName + "_jam", () -> new ModFood(5, 2.6f));
			Plantastic.LOGGER.debug(fruitName + " added");
		}
	}
}