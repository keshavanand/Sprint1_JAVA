package com.fdmgroup.Generics;

public class Runner {
	public static void main(String[] args){		
		Book<Integer> book1 = new Book<Integer>();
		book1.setId(1);
		
		Book<Integer> book2 = new Book<Integer>();
		book2.setId(2);
		
		Catalog<Book<Integer>> catalog = new Catalog<Book<Integer>>();
		catalog.addItem(book1);
		catalog.addItem(book2);
		
		Book<Integer> book = catalog.findItem(2);
		
		
		System.out.println(book.getId());
		
		
		
	}
}
