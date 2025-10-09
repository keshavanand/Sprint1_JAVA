package com.dataTypes;

public class section4Wrappers {
	public static void main(String args[]){
		// 4.1 Convert strings to int
		String number1 = "5" , number2 = "3";
		
		int int1 = Integer.parseInt(number1);
		int int2 = Integer.parseInt(number2);
		int sum = int1 + int2;
		System.out.println("Sum: " + sum);
		
		// 4.2 
		number1 = "5.3";
		number2 = "3.2";
		
		double double1 = Double.parseDouble(number1);
		double double2 = Double.parseDouble(number2);
		
		double sumOfDoubles = double1 + double2;
		
		System.out.println("Sum: "+sumOfDoubles);
		
		// 4.3 Extracting numbers from Strings
		String string1 = "abc11", string2 = "9xyz", string3 = "abc7xyz";
		
		int num1 = Integer.parseInt(string1.substring(3));
		int num2 = Integer.parseInt(string2.substring(0,1));
		int num3 = Integer.parseInt(string3.substring(3,4));
		
		int sumOfInt = num1 + num2 + num3;
		
		System.out.println(sumOfInt);
		
		
		
	}

}
