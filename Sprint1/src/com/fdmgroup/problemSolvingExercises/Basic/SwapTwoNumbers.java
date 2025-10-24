package com.fdmgroup.problemSolvingExercises.Basic;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		
		int a = 7;
		int b = 10;
		
		System.out.println("a: "+a+" b: "+b);

		a +=b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a+" b: "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("a: "+a+" b: "+b);

	}

}
