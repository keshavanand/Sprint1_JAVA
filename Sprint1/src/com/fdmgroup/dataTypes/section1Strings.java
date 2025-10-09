package com.fdmgroup.dataTypes;

public class section1Strings {
	public static void main(String args[]){
		// 1.1 String Message
		String message = new String("Hi this is a message");
		System.out.println("Message: "+message);
		
		// 1.2 Full Name
		String firstName = new String("Keshav");
		String lastName = new String("Singh");
		String fullName = firstName + " " + lastName;
		System.out.println("Fullname: " + fullName);
		
		// 1.3 Personal Message
		String personName = "Leo";
		System.out.println("Hello " + personName + ", would you like to learn java");
		
		// 1.4 Name Operations
		String name = "Keshav";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		
		// 1.5 Sentence operations
		String sentence = ("this is a sentence");
		System.out.println(sentence.indexOf(' '));
		System.out.println(sentence.lastIndexOf(' '));
		System.out.println(sentence.indexOf('x'));
		System.out.println(sentence.substring(0,4));
		System.out.println(sentence.substring(10));
		System.out.println(sentence.substring(5,9));
		System.out.println(sentence.contains("a"));
		System.out.println(sentence.contains("x"));
		
		sentence = "is " + sentence +"?";
		
		System.out.println(sentence);
		
		System.out.println(sentence.replaceFirst("t","T"));
		
		
		
	}
}
