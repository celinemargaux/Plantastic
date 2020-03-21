package com.celinemargaux.plantastic.common.util.helper.json;

public class ItemModel {
	String parent = "";
	int x = 0;
	String[] textures = new String[x];
	String layer0 = "";
	
	public ItemModel(String parent, int x, String layer0) {
		this.parent = parent;
		this.x = x;
		this.layer0 = layer0;
	}

}
