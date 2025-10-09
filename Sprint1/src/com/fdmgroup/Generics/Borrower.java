package com.fdmgroup.Generics;

public class Borrower<T extends Number> implements CatalogItem<T> {
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

}
