package com.celinemargaux.plantastic.common.util.helper;

import com.celinemargaux.plantastic.common.items.PlantasticItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup extends ItemGroup {
	public static ModItemGroup PLANTASTIC = new ModItemGroup(ItemGroup.GROUPS.length, "Plantastic");

	private ModItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(PlantasticItems.PLANTASTIC_ICON.get());
	}

}
