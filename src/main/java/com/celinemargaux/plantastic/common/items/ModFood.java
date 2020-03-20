package com.celinemargaux.plantastic.common.items;

import com.celinemargaux.plantastic.common.util.helper.ModItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;

public class ModFood extends Item {
	public ModFood(int hunger, float saturation, EffectInstance effect, float probability) {
		super(new Item.Properties()
			.food(new Food.Builder().hunger(hunger).saturation(saturation).effect(() -> effect, probability).build())
			.group(ModItemGroup.PLANTASTIC));
	}

	public ModFood(Item.Properties properties) {
		super(properties.group(ModItemGroup.PLANTASTIC));
	}
	
	public ModFood(int hunger, float saturation) {
		super(new Item.Properties()
			.food(new Food.Builder().hunger(hunger).saturation(saturation).build())
			.group(ModItemGroup.PLANTASTIC));
	}
}
