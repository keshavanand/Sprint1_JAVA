package com.fdmgroup.Collections;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDuplicates {
	public static void main(String[] args){
		int result = getNumberOfDuplicates("The the the THE dog is brown BrOwN");
		System.out.println(result);
	}
	
	public static int getNumberOfDuplicates(String text){
		String[] words = text.toUpperCase().split(" ");
		Set<String> set = new HashSet<String>();
		int count = 0;
		Set<String> counted = new HashSet<String>();

		for(String word: words){
			if(set.contains(word) && !counted.contains(word)){
				count++;
				counted.add(word);
			}
			else set.add(word);
		}
		
		return count;
		
		
	}
}
