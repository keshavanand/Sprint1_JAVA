package com.fdmgroup.Exception;

public class SquareRoot {
	
	public static void main(String[] args){
		try {
			squareRoot(5);
			squareRoot(-3);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		} finally{
			System.out.println("Program Finished.");
		}
	}
	
	public static void squareRoot(int number) throws NegativeNumberException{
		
		System.out.println("Input is: "+number);
		
		if(number < 0) throw new NegativeNumberException("Output: Square root of negative number is not allowed.");
		
		System.out.println("Output :"+Math.sqrt(number));
	}
}
