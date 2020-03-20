package com.celinemargaux.plantastic.common.items;

import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;

public class EdiblePlant extends Item {

	public EdiblePlant(int hunger, float saturation, EffectInstance effect, float probability) {
		super(new Item.Properties()
			.food(new Food.Builder().hunger(hunger).saturation(saturation).fastToEat().effect(() -> effect, probability).build())
			.group(ModItemGroup.PLANTASTIC));
	}

	public EdiblePlant(Item.Properties properties) {
		super(properties.group(ModItemGroup.PLANTASTIC));
	}

	public EdiblePlant(int hunger, float saturation) {
		super(new Item.Properties().food(new Food.Builder().hunger(hunger).saturation(saturation).fastToEat().build())
			.group(ModItemGroup.PLANTASTIC));
	}

}
