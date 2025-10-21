package com.fdmgroup.polymorphismExercises.implementations.CustomStringBuilder;

public class Test {
  public static void main(String args[]) throws Exception{
	  MyStringBuilder str = new MyStringBuilder();
	  str.append("Hello");
	  
	  System.out.println(str);
	  
	  str.append(" Keshav");
	  
	  System.out.println(str);
	  
	  System.out.println(str.length());
	  
	  System.out.println(str.charAt(18));
	  
	  str.insert(7, " How");
	  
	  System.out.println(str);
	  
	  System.out.println(str.length());
	  
	  System.out.println();

  }
}
