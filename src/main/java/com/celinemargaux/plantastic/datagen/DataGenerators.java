package com.celinemargaux.plantastic.datagen;

import com.celinemargaux.plantastic.Plantastic;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		if (event.includeServer()) {
//            generator.addProvider(new Recipes(generator));
//            generator.addProvider(new LootTables(generator));
//            generator.addProvider(new BlockTags(generator));
//            generator.addProvider(new ItemTags(generator));
//            generator.addProvider(new Advancements(generator));
		}
		if (event.includeClient()) {
//            generator.addProvider(new BlockStates(generator, Allomancy.MODID, event.getExistingFileHelper()));
			generator.addProvider(new ItemModels(generator, Plantastic.MODID, event.getExistingFileHelper()));
			generator.addProvider(new Languages(generator, Plantastic.MODID, "en_us"));
		}
	}
}
