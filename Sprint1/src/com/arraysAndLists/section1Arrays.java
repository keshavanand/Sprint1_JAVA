package com.arraysAndLists;

import java.util.Arrays;

public class section1Arrays {
	public static void main(String[] args){
		// 1.1 Friends Array
		String[] bestFriendNames = {"Kamal", "Joban", "Simran","Arsh", "mani"};
		
		int arraySize = bestFriendNames.length;
		
		System.out.println("Number of Friends: " + arraySize);
		
		for(String name: bestFriendNames){
			System.out.println(name);
		}
		
		bestFriendNames[4] = "Manvir";
		
		Arrays.sort(bestFriendNames);
		
		System.out.println("First Person in Array: " + bestFriendNames[0]);
		
		System.out.println("Last person in Array: "+ bestFriendNames[arraySize-1]);
		
		bestFriendNames[1] = null;
		
		System.out.println("Final Array: " + Arrays.toString(bestFriendNames));
		
		// 1.2 Poker Hand
		String[] pokerHand = new String[5];
		pokerHand[0] = "Queens of Hearts";
		pokerHand[1] = "3 of Spades";
		pokerHand[2] = "3 of Diamonds";
		pokerHand[3] = "9 of Hearts";
		pokerHand[4] = "6 of Clubs";
		
		System.out.println("Poker Hand Array: " + Arrays.toString(pokerHand));

	}
}
