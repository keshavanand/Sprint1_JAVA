package com.fdmgroup.loops;

import java.util.ArrayList;
import java.util.Arrays;

public class section1ForEachLoops {
	public static void main(String args[]){
		// 1.1 Array of courses
		String[] courses = {"UNIX", "SQL", "JAVA", "Python", "Web Apps"};
		
		for(String course: courses){
			System.out.println("I love Learning "+course);
		}
		
		// 1.2 Copying to an ArrayList 
		ArrayList<String> coursesList = new ArrayList<String>();
		for (String course: courses){
			coursesList.add(course);
		}
				
		// 1.3 Displaying Courses
		for(String course: coursesList){
			System.out.println(course);
		}
		
		// 1.4 Total Price
		ArrayList<Double> prices = new ArrayList<Double>();
		prices.add(4.50);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);
		
		double totalPrice = 0;
		
		for (Double price: prices){
			totalPrice +=price;
		}
		
		System.out.println("Total Price: "+totalPrice);
		
		// 1.5 Copying to an array
		double[] pricesArray = new double[5];
		int index = 0;
		for(Double price: prices){
			pricesArray[index] = price;
			index++;
		}
		
		System.out.println("Copied Array: " +Arrays.toString(pricesArray));
		
		// 1.6 Adding numbers from a string
		String text = "10,7,25,3,8";
		String[] splitText = text.split(",");
		int sum = 0;
		for(String num: splitText) sum +=Integer.parseInt(num);
		System.out.println("The total is: "+ sum);
		
		// 1.7 Reverse a String
		String text1 = "desrever neeb sah txet siht";
		char[] textChars = text1.toCharArray();
		String reverseText1 = "";
		for(char textChar: textChars){
			reverseText1 = textChar + reverseText1;
		}
		System.out.println("Reverse text: "+ reverseText1);
		
		
		
	}
}
