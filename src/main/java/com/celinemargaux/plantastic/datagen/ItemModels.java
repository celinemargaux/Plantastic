package com.celinemargaux.plantastic.datagen;

import com.celinemargaux.plantastic.Plantastic;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class ItemModels extends ItemModelProvider {
	public ItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, modid, existingFileHelper);
	}

	@Override
	protected void registerModels() {
//        parentedBlock(ExtrasSetup.IRON_BUTTON.get(), "block/iron_button_inventory");
//        itemHandheld(ExtrasSetup.IRON_LEVER_ITEM.get(), "block/iron_lever");
//
//        itemHandheld(CombatSetup.MISTCLOAK.get(), "item/mistcloak");
//        itemHandheld(CombatSetup.COIN_BAG.get(), "item/coin_bag");
//        itemHandheld(CombatSetup.OBSIDIAN_DAGGER.get(), "item/obsidian_dagger");
//        largeItemHandheld(CombatSetup.KOLOSS_BLADE.get(), "item/koloss_blade");
//
//        itemHandheld(ConsumeSetup.ALLOMANTIC_GRINDER.get(), "item/allomantic_grinder");
//        itemHandheld(ConsumeSetup.LERASIUM_NUGGET.get(), "item/lerasium_nugget");
//
//        parentedBlock(MaterialsSetup.ALUMINUM_ORE.get(), "block/aluminum_ore");
//        parentedBlock(MaterialsSetup.CADMIUM_ORE.get(), "block/cadmium_ore");
//        parentedBlock(MaterialsSetup.CHROMIUM_ORE.get(), "block/chromium_ore");
//        parentedBlock(MaterialsSetup.COPPER_ORE.get(), "block/copper_ore");
//        parentedBlock(MaterialsSetup.LEAD_ORE.get(), "block/lead_ore");
//        parentedBlock(MaterialsSetup.SILVER_ORE.get(), "block/silver_ore");
//        parentedBlock(MaterialsSetup.TIN_ORE.get(), "block/tin_ore");
//        parentedBlock(MaterialsSetup.ZINC_ORE.get(), "block/zinc_ore");
//
//        itemHandheld(MaterialsSetup.ALUMINUM_INGOT.get(), "item/aluminum_ingot");
//        itemHandheld(MaterialsSetup.CADMIUM_INGOT.get(), "item/cadmium_ingot");
//        itemHandheld(MaterialsSetup.CHROMIUM_INGOT.get(), "item/chromium_ingot");
//        itemHandheld(MaterialsSetup.SILVER_INGOT.get(), "item/silver_ingot");
//        itemHandheld(MaterialsSetup.BRASS_INGOT.get(), "item/brass_ingot");
//        itemHandheld(MaterialsSetup.TIN_INGOT.get(), "item/tin_ingot");
//        itemHandheld(MaterialsSetup.COPPER_INGOT.get(), "item/copper_ingot");
//        itemHandheld(MaterialsSetup.LEAD_INGOT.get(), "item/lead_ingot");
//        itemHandheld(MaterialsSetup.BRONZE_INGOT.get(), "item/bronze_ingot");
//        itemHandheld(MaterialsSetup.ZINC_INGOT.get(), "item/zinc_ingot");
//
//        for (RegistryObject<Item> flake_reg : MaterialsSetup.FLAKES) {
//            Item flake = flake_reg.get();
//            itemHandheld(flake, "item/" + flake.getRegistryName().getPath());
//        }
//
//        Allomancy.LOGGER.debug("Creating Item Model for allomancy:vial (filled)");
//        ModelFile mf = getBuilder("vial_filled").parent(getExistingFile(mcLoc("item/handheld")))
//                .texture("layer0", modLoc("item/full_vial"));
//        Allomancy.LOGGER.debug("Creating Item Model for allomancy:vial");
//        getBuilder("vial").parent(getExistingFile(mcLoc("item/handheld")))
//                .texture("layer0", modLoc("item/vial"))
//                .override().predicate(mcLoc("custom_model_data"), 1).model(mf).end();

	}

	public void parentedBlock(Block block, String model) {
//        Allomancy.LOGGER.debug("Creating Item Model for " + block.getRegistryName());
//        getBuilder(block.getRegistryName().getPath())
//                .parent(new ModelFile.UncheckedModelFile(modLoc(model)));
	}

	public void itemHandheld(Item item, String texture) {
//        Allomancy.LOGGER.debug("Creating Item Model for " + item.getRegistryName());
//        getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/handheld")))
//                .texture("layer0", modLoc(texture));
	}

	public void largeItemHandheld(Item item, String texture) {
//        Allomancy.LOGGER.debug("Creating Large Item Model for " + item.getRegistryName());
//        getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(modLoc("item/handheld_large")))
//                .texture("layer0", modLoc(texture));
	}

	public void itemGenerated(Item item, String texture) {
		Plantastic.LOGGER.debug("Creating Item Model for " + item.getRegistryName());
		getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/handheld"))).texture("layer0",
			modLoc(texture));
	}

	@Override
	public String getName() {
		return "Plantastic Item Models";
	}
}
