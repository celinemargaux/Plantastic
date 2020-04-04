package com.celinemargaux.plantastic;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.celinemargaux.plantastic.init.Init;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
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
import net.minecraftforge.fml.loading.FMLEnvironment;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Plantastic.MODID)
public class Plantastic {
	// Directly reference a log4j logger.
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "plantastic";
	public static Plantastic instance;

	public Plantastic() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		instance = this;
		
		Init.initFiles();
		Init.registerFruitsJuicesJams();
		Init.ITEMS.register(modEventBus);
		Init.BLOCKS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);
		modEventBus.addListener(this::processIMC);
		modEventBus.addListener(this::enqueueIMC);
		modEventBus.addListener(this::processIMC);
		modEventBus.addListener(this::onServerStarting);

	}

	private void setup(final FMLCommonSetupEvent event) {
		// some preinit code
	}

	@SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) {
		LOGGER.debug("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
		if (FMLEnvironment.dist == Dist.CLIENT) {
			RenderType cutOutRenderType = RenderType.getCutout();
			RenderTypeLookup.setRenderLayer(Init.ASPARAGUS_CROP.get(), cutOutRenderType);
		}
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		// some example code to dispatch IMC to another mod
		InterModComms.sendTo("examplemod", "helloworld", () -> {
			LOGGER.debug("Hello world from the MDK");
			return "Hello world";
		});
	}

	private void processIMC(final InterModProcessEvent event) {
		// some example code to receive and process InterModComms from other mods
		LOGGER.debug("Got IMC {}", event.getIMCStream().map(m -> m.getMessageSupplier().get()).collect(Collectors.toList()));
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		// do something when the server starts
		LOGGER.debug("HELLO from server starting");
	}
}
