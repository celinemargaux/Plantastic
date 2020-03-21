package com.celinemargaux.plantastic.common.util.helper;

import com.celinemargaux.plantastic.common.util.helper.json.Formatter;

public class ItemOrBlock {
	private String registryName = "";
	private String type = "";
	private int hunger = 0;
	private float saturaiont = 0.0f;
	private int growTime = 0;
	
	public ItemOrBlock(String name, String type, int hunger, float sat, int grow) {
		this.registryName = Formatter.formatRegistryName(name);
		this.type = type;
		this.hunger = hunger;
		this.saturaiont = sat;
		this.growTime = grow;
	}

	public String getRegistryName() {
		return registryName;
	}

	public String getType() {
		return type;
	}

	public int getHunger() {
		return hunger;
	}

	public float getSaturaiont() {
		return saturaiont;
	}

	public int getGrowTime() {
		return growTime;
	}
}
