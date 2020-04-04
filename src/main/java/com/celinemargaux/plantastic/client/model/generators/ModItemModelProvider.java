package com.celinemargaux.plantastic.client.model.generators;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, modid, existingFileHelper);
	}

	@Override
	public String getName() {
		return "Mod Item Model Provider: " + this.toString();
	}

	@Override
	protected void registerModels() {
		// TODO Auto-generated method stub
		
	}



}
