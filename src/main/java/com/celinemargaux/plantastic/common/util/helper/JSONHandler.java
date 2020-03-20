package com.celinemargaux.plantastic.common.util.helper;

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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONHandler {
	public Gson gson = new Gson();
	List<Object> ediblePlants = new ArrayList<>();
	List<String> ediblePlantNames = new ArrayList<>();
	
	List<Object> modFoods = new ArrayList<>();
	List<String> modFoodNames = new ArrayList<>();

	List<Object> modCrops = new ArrayList<>();
	List<String> modCropsNames = new ArrayList<>();

	List<Object> items = new ArrayList<>();
	List<Object> blocks = new ArrayList<>();
	private List<ItemOrBlock> list = new ArrayList<>();

	public void deserializeToList(String fileSource) {
		try (FileReader reader = new FileReader(fileSource)) {
			Type collectionType = new TypeToken<Collection<ItemOrBlock>>() {
			}.getType();
			list = gson.fromJson(reader, collectionType);

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
					}
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
}
