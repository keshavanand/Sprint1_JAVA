package com.fdmgroup.Generics;

public interface CatalogItem<T extends Number> {
	public T getId();
	public void setId(T id);
}
