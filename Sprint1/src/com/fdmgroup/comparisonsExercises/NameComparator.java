package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class NameComparator implements Comparator<Book> {

	public int compare(Book arg0, Book arg1) {
		return arg0.getTitle().compareTo(arg1.getTitle());
	}

}
