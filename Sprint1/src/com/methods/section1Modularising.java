package com.methods;

public class section1Modularising {
	
	public static void main(String args[]){
		// 1.1 Alien Colors
		int points = getPoints("green");
		System.out.println("You’ve scored "+points+" points!"); 
		
		// 2.2 Summing numbers
		System.out.println("Sum of numbers up to 5: "+ sumOfNumbersUpTo(5));
		System.out.println("Sum of numbers up to 5: "+ sumOfNumbersUpTo(10));
		
		// 2.3 Time Table
		displayTimesTable(3);
		displayTimesTable(5);
		
	}
	
	// 1.1 Alien Colors
	static int getPoints(String color){
		if (color == "green"){
			return 5;
		}
		else if (color == "red"){
			return 10;
		}
		else if (color == "yellow"){
			return 15;
		}
		else{
			return 0;
		}
	}
	// 2.2 Summing numbers
	static long sumOfNumbersUpTo(int number){
		long sum = 0;
		for (int i = 1; i<=number; i++)
				sum +=i;
		return sum;
	}
	
	// 2.3 Times Table
	static void displayTimesTable(int table){
		for (int i = 1; i<=12; i++){
			System.out.println(i+" X "+table+" = "+ table*i);
		}
		
	}
}
