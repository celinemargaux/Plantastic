package com.celinemargaux.plantastic;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.celinemargaux.plantastic.common.blocks.PlantasticBlocks;
import com.celinemargaux.plantastic.common.items.PlantasticItems;

import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Plantastic.MODID)
public class Plantastic {
	// Directly reference a log4j logger.
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "plantastic";
	public static Plantastic instance;

	public Plantastic() {
		instance = this;

		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		PlantasticItems.ITEMS.register(modEventBus);
		PlantasticBlocks.BLOCKS.register(modEventBus);
		PlantasticBlocks.CROPS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);
		modEventBus.addListener(this::processIMC);
		modEventBus.addListener(this::enqueueIMC);
		modEventBus.addListener(this::processIMC);
		modEventBus.addListener(this::onServerStarting);

	}

//    @SubscribeEvent
//    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
//    	final IForgeRegistry<Item> registry = event.getRegistry();
//    	
//    	ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
//    		final Item.Properties properties = new Item.Properties().group(ModItemGroup.PLANTASTIC);
//    		final BlockItem blockItem = new BlockItem(block, properties);
//    		blockItem.setRegistryName(block.getRegistryName());
//    		registry.register(blockItem);
//    	});
//    	
//    	ModCrops.CROPS.getEntries().stream().map(RegistryObject::get).forEach(crop -> {
//    		final Item.Properties properties = new Item.Properties().group(ModItemGroup.PLANTASTIC);
//    		final BlockItem blockItem = new BlockItem(crop, properties);
//    		blockItem.setRegistryName(Helper.getSeedsName(crop));
//    		registry.register(blockItem);
//    	});
//    	
//    }

	private void setup(final FMLCommonSetupEvent event) {
		// some preinit code
		LOGGER.info("HELLO FROM PREINIT");
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		// do something that can only be done on the client
		LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		// some example code to dispatch IMC to another mod
		InterModComms.sendTo("examplemod", "helloworld", () -> {
			LOGGER.info("Hello world from the MDK");
			return "Hello world";
		});
	}

	private void processIMC(final InterModProcessEvent event) {
		// some example code to receive and process InterModComms from other mods
		LOGGER.info("Got IMC {}", event.getIMCStream().map(m -> m.getMessageSupplier().get()).collect(Collectors.toList()));
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		// do something when the server starts
		LOGGER.info("HELLO from server starting");
	}
}
