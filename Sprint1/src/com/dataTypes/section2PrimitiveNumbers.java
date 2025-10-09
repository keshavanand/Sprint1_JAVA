package com.dataTypes;

public class section2PrimitiveNumbers {
	public static void main(String args[]){
		// 2.1 Favourite Number
		int favouriteNumber = 99;
		String message = "My Favourite Number is " + favouriteNumber;
		System.out.println(message);
		
		// 2.2 Adding Ints
		int number1 = 5;
		int number2 = 3;
		int sum = number1 + number2;
		System.out.println("Sum of number1 and number2 is: "+ sum);
		
		// 2.3 Arthimetic
		int counter = 0;
		counter++;
		counter +=5;
		counter--;
		counter -=2;
		counter *=2;
		System.out.println("Counter Final Value: "+counter);
		
		// 2.4 Dividing different int and doubles
		int a = 5 , b = 2;
		double c = 5 , d = 2;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(c/b);
		System.out.println(a/d);
		System.out.println("Notice that when using arthimitic signs with different "
				+ "primitive types the resulted type is the bigger. Calculating percentage"
				+ " with double can give more accurate percentage than int");
		
	}
}
