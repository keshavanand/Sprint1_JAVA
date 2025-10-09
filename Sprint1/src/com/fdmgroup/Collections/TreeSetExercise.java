package com.fdmgroup.Collections;

import java.util.TreeSet;

public class TreeSetExercise {

	public static void main(String[] args) {
		TreeSet<String> treeSet = sortedTreeSet("x y a b d l c");
		System.out.println(treeSet);
	}
	
	public static TreeSet<String> sortedTreeSet(String text){
		String[] words = text.split(" ");
		TreeSet<String> treeSet = new TreeSet<String>();
		
		for(String word: words){
			treeSet.add(word);
		}
		
		return treeSet;
	}

}
