package com.fdmgroup.problemSolvingExercises.Intermediate;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		
		System.out.println("Answer: "+getFirstNonRepeatingChar("swiss"));
		System.out.println("Answer: "+getFirstNonRepeatingChar("Keshav annad Singh"));

	}
	
	public static char getFirstNonRepeatingChar(String text) {
		char firstNonRepeatingChar=' ';
		char[] characters = text.toCharArray();
		Map<Character, Integer> occurenses = new LinkedHashMap<>();
		
		for(char character: characters) {
			occurenses.put(character, occurenses.getOrDefault(character, 0)+1);
		}
		
		for(char key : occurenses.keySet()) {
			if(occurenses.get(key) == 1) {
				firstNonRepeatingChar = key;
				return firstNonRepeatingChar;
			}
		}
		
		return firstNonRepeatingChar;
	}
}
