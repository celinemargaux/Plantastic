package com.celinemargaux.plantastic.common.util.helper;

public class ItemOrBlock {
	private String registryName;
	private String type;
	private int hunger;
	private float saturaiont;
	private int growTime;
	
	public ItemOrBlock(String name, String type, int hunger, float sat, int grow) {
		this.registryName = name;
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
