package com.celinemargaux.plantastic.datagen;

import java.util.Collection;
import java.util.Locale;

import com.celinemargaux.plantastic.Plantastic;
import com.celinemargaux.plantastic.init.Init;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class Languages extends LanguageProvider {
	public Locale locale = null;

	public Languages(DataGenerator gen, String modid, String locale) {
		super(gen, modid, locale);
		this.locale = Locale.forLanguageTag(locale);
	}

	@Override
	protected void addTranslations() {
		switch ("locale") {
		case "en_us": {
			addEnglish();
			break;
		}
		case "en_uk": {
			addEnglish();
			break;
		}
		case "de_de": {
			addGerman();
			break;
		}
		default: {
			Plantastic.LOGGER.debug("No matching translation for" + locale + "locale could be identified!");
		}
		}
	}

	@Override
	public String getName() {
		return "Plantastic Language";
	}

	private void addEnglish() {
		add("ModItemGroup.PLANTASTIC", "Plantastic Item Group");

		// add item translations
		Collection<RegistryObject<Item>> itemList = Init.ITEMS.getEntries();
		itemList.forEach(regItem -> {
			Item item = regItem.get();
			add(item, capitalize(item.getRegistryName().toString(), locale));
		});

		// add block translastions
		Collection<RegistryObject<Block>> blockList = Init.BLOCKS.getEntries();
		blockList.forEach(regBlock -> {
			Block block = regBlock.get();
			add(block, capitalize(block.getRegistryName().toString(), locale));
		});

		// add crop trasnlations
		Collection<RegistryObject<Block>> cropList = Init.CROPS.getEntries();
		cropList.forEach(regCrop -> {
			Block block = regCrop.get();
			add(block, capitalize(block.getRegistryName().toString(), locale));
		});

		// add seed translastions
		Collection<RegistryObject<Item>> seedList = Init.SEEDS.getEntries();
		seedList.forEach(regItem -> {
			Item item = regItem.get();
			add(item, getSeedName(item.getRegistryName().toString(), locale));
		});
	}

	private void addGerman() {

	}

	private String capitalize(String name, Locale locale) {
		return name.replaceAll("_", " ").toUpperCase(locale);
	}

	private String getSeedName(String name, Locale locale) {
		String seedName = capitalize(name, locale);
		return seedName.replace("Crop", "Seeds");
	}

}
