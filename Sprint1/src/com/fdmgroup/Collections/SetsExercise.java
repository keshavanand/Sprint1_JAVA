package com.fdmgroup.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetsExercise {
	public static void main(String[] args){
		Set<String> set= eliminatesDuplicates("keshav","kamal","john","keshav");
		System.out.println(set);
		
	}

	public static Set<String> eliminatesDuplicates(String... names){
		Set<String> set = new HashSet<String>();
		for (String name: names){
			set.add(name);
		}
		
		return set;
	}
	
	
}
