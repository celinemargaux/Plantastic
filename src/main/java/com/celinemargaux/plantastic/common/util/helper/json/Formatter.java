package com.celinemargaux.plantastic.common.util.helper.json;

public class Formatter {
	/**
	 * removes trailing white space characters,
	 * replaces left over blank with underscores
	 * and converts the name to lower case
	 * 
	 * @param regName is the registryName of a minecrtaft object
	 * @return the formatted registryName
	 */
	public static String formatRegistryName (String regName) {
		regName.replaceAll("[\\s][\\s]", "\\r");
		regName.replaceAll(" ", "_");
		regName.toLowerCase();
		return regName;
	}
	
}
