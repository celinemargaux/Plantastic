package com.celinemargaux.plantastic.common.util.helper.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.common.blocks.ModCropsBlockTHREE;
import com.celinemargaux.plantastic.common.items.EdiblePlant;
import com.celinemargaux.plantastic.common.items.ModFood;
import com.celinemargaux.plantastic.common.util.helper.ItemOrBlock;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import net.minecraft.block.BushBlock;
import net.minecraft.item.Item;

public class JSONHandler {
	public static Gson gson = new Gson();
	private static List<EdiblePlant> ediblePlants = new ArrayList<>();
	private static List<String> ediblePlantNames = new ArrayList<>();

	private static List<ModFood> modFoods = new ArrayList<>();
	private static List<String> modFoodNames = new ArrayList<>();

	private static List<BushBlock> modCrops = new ArrayList<>();
	private static List<String> modCropsNames = new ArrayList<>();

	private static List<Item> items = new ArrayList<>();
	private static List<Object> blocks = new ArrayList<>();

	private static List<ItemOrBlock> list = new ArrayList<>();

	public static void deserializeToLists(String fileSource) {
		try (JsonReader reader = new JsonReader(new FileReader(fileSource))) {
			Type collectionType = new TypeToken<Collection<ItemOrBlock>>() {
			}.getType();
			Plantastic.LOGGER.debug("Deserializing started!");
			System.out.println("Hello from deserializing!");
			list = gson.fromJson(reader, collectionType);

			Plantastic.LOGGER.debug("First Item on list: " + list.get(0).getRegistryName());

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

	public static List<Item> getItems() {
		return items;
	}

	public static List<EdiblePlant> getEdiblePlants() {
		return ediblePlants;
	}

	public static List<String> getEdiblePlantNames() {
		return ediblePlantNames;
	}

	public static List<ModFood> getModFoods() {
		return modFoods;
	}

	public static List<String> getModFoodNames() {
		return modFoodNames;
	}

	public static List<BushBlock> getModCrops() {
		return modCrops;
	}

	public static List<String> getModCropsNames() {
		return modCropsNames;
	}

	public static List<Object> getBlocks() {
			return blocks;
		}
}