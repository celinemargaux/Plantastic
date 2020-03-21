package com.celinemargaux.plantastic.init;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.common.blocks.ModCropsBlockSEVEN;
import com.celinemargaux.plantastic.common.blocks.ModCropsBlockTHREE;
import com.celinemargaux.plantastic.common.items.EdiblePlant;
import com.celinemargaux.plantastic.common.items.ModFood;
import com.celinemargaux.plantastic.common.util.helper.ItemOrBlock;
import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;
import com.celinemargaux.plantastic.common.util.helper.json.ItemModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {
	static Init.JSONHandler jsonHandler = new Init().new JSONHandler();

	public static void initFiles() {
		jsonHandler.deserializeToLists("/Plantastic/src/main/resources/lists/fruits.json");
	}

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Plantastic.MODID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);

	// CROPS
	public static final RegistryObject<Block> ASPARAGUS_CROP = BLOCKS.register("asparagus_crop", () -> new ModCropsBlockSEVEN());

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
	public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_crop",
		() -> new BlockItem(ASPARAGUS_CROP.get(), new Item.Properties().group(ModItemGroup.PLANTASTIC)));

	/*
	 * 
	 * METHODS
	 * 
	 */

	public static void registerFruitsJuicesJams() {
		List<EdiblePlant> fruits = jsonHandler.getEdiblePlants();

		for (EdiblePlant fruit : fruits) {
			ITEMS.register(fruit.getRegistryName().toString(),
				() -> new EdiblePlant(fruit.getFood().getHealing(), fruit.getFood().getSaturation()));
			ITEMS.register(fruit + "_juice", () -> new ModFood(4, 1.8f));
			ITEMS.register(fruit + "_jam", () -> new ModFood(5, 2.6f));
			jsonHandler.makeItemModelFile(fruit);
		}
	}

	@SuppressWarnings("unused")
	private class JSONHandler {
		public Gson gson = new Gson();
		private List<EdiblePlant> ediblePlants = new ArrayList<>();
		private List<String> ediblePlantNames = new ArrayList<>();

		private List<ModFood> modFoods = new ArrayList<>();
		private List<String> modFoodNames = new ArrayList<>();

		private List<BushBlock> modCrops = new ArrayList<>();
		private List<String> modCropsNames = new ArrayList<>();

		private List<Item> items = new ArrayList<>();
		private List<Object> blocks = new ArrayList<>();

		private List<ItemOrBlock> list = new ArrayList<>();

		public void deserializeToLists(String fileSource) {
			try (FileReader reader = new FileReader(fileSource)) {
				Type collectionType = new TypeToken<Collection<ItemOrBlock>>() {
				}.getType();
				Plantastic.LOGGER.info("deserializing started!");
				list = gson.fromJson(reader, collectionType);

				Plantastic.LOGGER.info("First Item on list: " + list.get(0));

				for (ItemOrBlock thing : list) {
					switch (thing.getType()) {
					case "EdiblePlant": {
						ediblePlants.add(new EdiblePlant(thing.getHunger(), thing.getSaturaiont()));
						ediblePlantNames.add(thing.getRegistryName());
						break;
					}
					case "ModFood": {
						modFoods.add(new ModFood(thing.getHunger(), thing.getSaturaiont()));
						modFoodNames.add(thing.getRegistryName());
						break;
					}
					case "ModCrop": {
						if (thing.getGrowTime() == 3) {
							modCrops.add(new ModCropsBlockTHREE());
							modCropsNames.add(thing.getRegistryName());
						} else if (thing.getGrowTime() == 5) {
							modCrops.add(new ModCropsBlockTHREE());
							modCropsNames.add(thing.getRegistryName());
						} else if (thing.getGrowTime() == 7) {
							modCrops.add(new ModCropsBlockTHREE());
							modCropsNames.add(thing.getRegistryName());
						} else {
							Plantastic.LOGGER.warn(
								"This Crop has a nondefault grow time: " + thing.getGrowTime() + ", Object: " + thing.toString());
						}
						break;
					}
					default: {
						Plantastic.LOGGER
							.warn("This Crop has a nondefault type: " + thing.getType() + ", Object: " + thing.toString());
						break;
					}
					}
				}
			} catch (FileNotFoundException e) {
				Plantastic.LOGGER.error(e.getStackTrace());
			} catch (IOException e1) {
				Plantastic.LOGGER.error(e1.getStackTrace());
			}

		}

		public void makeBlockStatesFile(Block block) {

		}

		public void makeBlockModelFiles(Block block) {

		}

		public void makeItemModelFile(Item item) {
			String name = item.getRegistryName().toString();
			ItemModel itemModel = new ItemModel("item/generated", 1, Plantastic.MODID + ":items/" + name);
			Path newFilePath = Paths.get("/Plantastic/src/main/resources/assets/plantastic/models/item/" + name);
			File modeljson = new File(newFilePath.toString());
			try (FileWriter writer = new FileWriter(modeljson)) {
				Files.createFile(newFilePath);
				String json = gson.toJson(itemModel);
				writer.write(json);
			} catch (IOException e) {
				Plantastic.LOGGER.warn(e.getStackTrace());
			}
		}

		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			jsonHandler.items = items;
		}

		public List<EdiblePlant> getEdiblePlants() {
			return ediblePlants;
		}

		public List<String> getEdiblePlantNames() {
			return ediblePlantNames;
		}

		public List<ModFood> getModFoods() {
			return modFoods;
		}

		public List<String> getModFoodNames() {
			return modFoodNames;
		}

		public List<BushBlock> getModCrops() {
			return modCrops;
		}

		public List<String> getModCropsNames() {
			return modCropsNames;
		}

		public List<Object> getBlocks() {
			return blocks;
		}
	}
}
