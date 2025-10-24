package com.fdmgroup.problemSolvingExercises.Basic;

import java.util.LinkedList;
import java.util.List;

public class ReverseCharOfEachWord {
	public static void main(String[] args) {
		System.out.print(reverse("Java is fun"));
	}
	
	public static String reverse(String text) {
		
		String[] words = text.split(" ");
		String reversedText = "";
		
		for (String word: words) {
			String reversedWord ="";
			
			for(char c: word.toCharArray()) {
				reversedWord = c + reversedWord;
			}
			
			reversedText = reversedText +" "+reversedWord;
		}
		
		return reversedText;
	}
}
