package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class NoOfPagesAndIsbnComparator implements Comparator<Book> {
	
	public int compare(Book arg0, Book arg1){
		if(arg0.getNumberOfPages() != arg1.getNumberOfPages())
			return  arg0.getNumberOfPages() - arg1.getNumberOfPages();
		
		return arg1.getIsbn() - arg0.getIsbn();
	}
}
