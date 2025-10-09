package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class RatingPriceComparator implements Comparator<Book> {

	public int compare(Book arg0, Book arg1) {
		if(arg1.getRating() != arg0.getRating()){
			if (arg1.getRating()>arg0.getRating()) return 1;
			else if (arg1.getRating() < arg0.getRating()) return -1;
			else return 0;
		}
		if (arg0.getPrice()>arg1.getPrice()) return 1;
		else if (arg0.getPrice() < arg1.getPrice()) return -1;
		else return 0;
	}

}
