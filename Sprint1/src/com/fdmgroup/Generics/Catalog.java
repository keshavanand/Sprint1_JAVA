package com.fdmgroup.Generics;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends CatalogItem<? extends Number>> {
	
	private List<T> items = new ArrayList<T>();
	
	public void addItem(T item){
		items.add(item);
	}
	public <U extends Number> T findItem(U id){
		for(T item: items){
			if (item.getId() == id) return item;
		}
		return null;
	}
	
}
