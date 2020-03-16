package com.celinemargaux.plantastic.common.blocks;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PlantasticBlocks {
	public static final DeferredRegister<Block> CROPS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Plantastic.MODID);
	//ModItemGroup.PLANTASTIC
	
	//CROPS
	public static final RegistryObject<Block> ASPARAGUS_CROP = CROPS.register("asparagus_crop",
		() -> new ModCropsBlock(4, (BlockNamedItem) ModItems.ASPARAGUS_SEEDS.get()));
	
	//BLOCKS
}
