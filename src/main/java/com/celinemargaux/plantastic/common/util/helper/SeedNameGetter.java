package com.celinemargaux.plantastic.common.util.helper;

import net.minecraft.block.Block;

public class SeedNameGetter {
	public static String getSeedsName(Block crop) {
		StringBuilder cropID = new StringBuilder(crop.getRegistryName().toString());
		StringBuilder cropName = new StringBuilder(
			cropID.substring(modidEndsHere(cropID.toString().toCharArray()), cropNameEndsHere(cropID.toString().toCharArray())));
		return cropName.append("_seeds").toString();
	}

	private static int modidEndsHere(char[] cropID) {
		for (int pos = 0; pos < cropID.length; pos++) {
			if (cropID[pos] == ':') {
				return pos;
			}
		}
		return 0;
	}

	private static int cropNameEndsHere(char[] cropID) {
		for (int pos = 0; pos < cropID.length; pos++) {
			if (cropID[pos] == '_') {
				return pos;
			}
		}
		return 0;
	}
}
