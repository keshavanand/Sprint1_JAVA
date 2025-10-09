package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class NumberOfPagesComparator implements Comparator<Book> {

	public int compare(Book arg0, Book arg1) {
		return arg0.getNumberOfPages() - arg1.getNumberOfPages();
	}
	
}
