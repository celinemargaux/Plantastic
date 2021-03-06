package com.celinemargaux.plantastic.init;

import java.util.ArrayList;
import java.util.List;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.common.blocks.ModCropsBlockSEVEN;
import com.celinemargaux.plantastic.common.items.EdiblePlant;
import com.celinemargaux.plantastic.common.items.ModFood;
import com.celinemargaux.plantastic.common.util.helper.FormattingListReader;
import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Plantastic.MODID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);

	// CROPS
	public static final RegistryObject<Block> ASPARAGUS_CROP = BLOCKS.register("asparagus_crop", () -> new ModCropsBlockSEVEN());

	// BLOCKS

	// EDIBLE PLANT ITEMS
	public static final RegistryObject<Item> ASPARAGUS = ITEMS.register("asparagus", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> RED_CURRANT = ITEMS.register("red_currant", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> WHITE_CURRANT = ITEMS.register("white_currant", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BLACK_CURRANT = ITEMS.register("black_currant", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PEACH = ITEMS.register("peach", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ALMOND = ITEMS.register("almond", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> APRICOT = ITEMS.register("apricot", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> AVOCADO = ITEMS.register("Avocado", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () -> new EdiblePlant(2, 1.2f));
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
	public static final RegistryObject<Item> FIG = ITEMS.register("fig", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> GALIC = ITEMS.register("garlic", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> GINGER = ITEMS.register("ginger", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> HAZELNUT = ITEMS.register("hazelnut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> JELLY_EAR_MUSHROOM = ITEMS.register("jelly_ear_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> KALE = ITEMS.register("kale", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> KING_OYSTER_MUSHROOM = ITEMS.register("kind_oyster_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> LYCHEE = ITEMS.register("lychee", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> MANGO = ITEMS.register("mango", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> OLIVE = ITEMS.register("olive", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ORANGE = ITEMS.register("orange", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> OYSTER_MUSHROM = ITEMS.register("oyste_mushroom", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PARSLEY = ITEMS.register("parsley", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PEA = ITEMS.register("pea", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PEAR = ITEMS.register("pear", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PECAN_NUT = ITEMS.register("pecan_nut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PERSIMMON = ITEMS.register("persimmon", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> PLUM = ITEMS.register("plum", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> POMMEGRANATE = ITEMS.register("pommegranate", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> RADISH = ITEMS.register("radish", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> RHUBARB = ITEMS.register("rhubarb", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> SHIITAKE_MUSHROOM = ITEMS.register("shiitake_mushroom",
		() -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> SPINACH = ITEMS.register("spinach", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> STARFRUIT = ITEMS.register("starfruit", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> SUGAR_BEETS = ITEMS.register("sugar_beets", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> TRUFFLE = ITEMS.register("truffle", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut", () -> new EdiblePlant(2, 1.2f));
	public static final RegistryObject<Item> ZUCCHINI = ITEMS.register("zucchini", () -> new EdiblePlant(2, 1.2f));

	// MODFOOD
	// JAMS
	public static final RegistryObject<Item> ORANGE_JAM = ITEMS.register("orange_jam", () -> new ModFood(2, 1.2f));
	public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new ModFood(2, 1.2f));
	public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam", () -> new ModFood(2, 1.2f));
	// JUICES & DRINKS
	public static final RegistryObject<Item> ALMOND_DRINK = ITEMS.register("almond_drink", () -> new ModFood(2, 1.2f));

	public static void registerJuices() {
		List<String> fruits = FormattingListReader.main("/Plantastic/src/main/resources/lists/fruit_list.txt");
		

//		List<String> fruits = new ArrayList<>();
//		fruits.add("apple");
//		fruits.add("apricot");
//		fruits.add("banana");
//		fruits.add("blackberry");
//		fruits.add("blueberry");
//		fruits.add("cherry");
//		fruits.add("black_currant");
//		fruits.add("red_currant");
//		fruits.add("white_currant");
//		fruits.add("elderberry");
//		fruits.add("fig");
//		fruits.add("grape");
//		fruits.add("lemon");
//		fruits.add("lychee");
//		fruits.add("mango");
//		fruits.add("melon");
//		fruits.add("peach");
//		fruits.add("pear");
//		fruits.add("persimmon");
//		fruits.add("plum");
//		fruits.add("pommegranate");
//		fruits.add("raspberry");
//		fruits.add("starfruit");
//		fruits.add("strawberry");

		for (String fruit : fruits) {
			ITEMS.register(fruit, () -> new EdiblePlant(0, 0));
			ITEMS.register(fruit + "_juice", () -> new ModFood(4, 2.2f));
			ITEMS.register(fruit + "_jam", () -> new ModFood(5, 2.6f));
		}
	}

	/*
	 * 
	 * Bread
	 * 
	 * Apple Jam Apricot Jam Blackberry Jam Blueberry Jam Cherry Jam Currant (red,
	 * white, black) Jam
	 * 
	 * Apricot Juice Blackberry Juice Blueberry Juice Cherry Juice Chocolate
	 * Milkshake Currant (red, white, black) Juice
	 * 
	 * Cooked Rice
	 * 
	 * 
	 * Dough Elderberry Jam Elderberry Juice Fig Jam Fig Juice Grape Jam Grape Juice
	 * Lemon Jam Lemon Juice Lychee Jam Lychee Juice
	 * 
	 * Mango Jam Mango Juice Oat Drink Orange Jam Orange Juice Pasta Peach Jam Peach
	 * Juice Pear Jam Pear Juice Persimmon Jam Persimmon Juice Pizza Bread Plum Jam
	 * Plum Juice Pommegranate Jam Pommegranate Juice Raspberry Jam Raspberry Juice
	 * Rice Drink Soy Drink Starfruit Jam Starfruit Juice Strawberry Jam Strawberry
	 * Juice Strawberry Milkshake Sugar Vanilla Milkshake Vanilla Sugar Whipped
	 * Cream
	 */

	// MISC
	public static final RegistryObject<Item> PLANTASTIC_ICON = ITEMS.register("plantastic_icon",
		() -> new Item(new Item.Properties()));

	// SEEDS
	public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_crop",
		() -> new BlockItem(ASPARAGUS_CROP.get(), new Item.Properties().group(ModItemGroup.PLANTASTIC)));
}
