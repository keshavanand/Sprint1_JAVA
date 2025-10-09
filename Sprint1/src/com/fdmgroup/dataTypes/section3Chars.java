package com.fdmgroup.dataTypes;

public class section3Chars {
	public static void main(String args[]){
		// 3.1 Unicode numbers
		char letter = 'a';
		int code = 98;
		
		System.out.println("Value of letter variable in int: " + (int)letter);
		System.out.println("Value of code variable in char: " +(char)code);
		System.out.println("Value of number 36 variable in char: " +(char)36);
		
		// 3.2 Difference between letters
		int minusValue1 = 'c' - 'a';
		int minusValue2 = 'z' - 'a';
		
		System.out.println("Value of c - a in number: " +minusValue1);
		System.out.println("Value of z - a in number: " +minusValue2);
		
		// 3.3 Adding chars and Strings
		char char1 = 'x', char2 = 'y', char3 = 'z';
		String string1="z",string2="y";
		
		System.out.println(char1 + char2 + char3);
		System.out.println(char1 + char2 + string2);
		System.out.println(char1 + string1 + char3);
		
		System.out.println("Notice: Addition of chars result in integer,"
				+ "addition of char ");

		
		
	}
}
