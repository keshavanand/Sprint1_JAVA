package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	public int compare(Book arg0, Book arg1) {
		
		if (arg1.getPrice()>arg0.getPrice()) return 1;
		else if (arg1.getPrice() < arg0.getPrice()) return -1;
		else return 0;
	}

}
