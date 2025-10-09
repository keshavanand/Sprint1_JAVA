package com.fdmgroup.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurences {
	public static void main(String[] args){
		Map<Character, Integer> result = getNumberOfOccurences("Keshav Anand Singh");
		
		for(Character character: result.keySet()){
			int value = result.get(character);
			System.out.println("Character: "+character +" Occur: "+value+" time"+((value>1)?"s":""));
		}
	}
	
	public static Map<Character, Integer> getNumberOfOccurences(String text){
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		Set<Character> set = new HashSet<Character>();
		text = text.trim().toUpperCase().replaceAll("\\s+", "");
		
		
		for(char txt: text.toCharArray()){
			if (!set.contains(txt)){
				result.put(txt,1);
			}
			else{
				int newValue = result.get(txt) + 1;
				result.replace(txt,newValue);
			}
			
			set.add(txt);
		}
		
		return result;
	}
}
