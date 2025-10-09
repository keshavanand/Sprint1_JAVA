package com.conditions;

public class section1SimpleIfStatements {
	public static void main(String args[]){
		// 1.1 Alien colours-1 and 1.2 Alien colours-2
		String alienColor = "yellow";
		
		if (alienColor == "green"){
			System.out.println("Hurah, you just earned a 5 points");
		}
		if (alienColor == "red"){
			System.out.println("Hurah, you just earned a 10 points");
		}
		if (alienColor == "yellow"){
			System.out.println("Hurah, you just earned a 15 points");
		}
		
		// 1.3 Alien colours-3
		alienColor = "black";
		
		if (alienColor == "green"){
			System.out.println("Hurah, you just earned a 5 points");
		}
		else if (alienColor == "red"){
			System.out.println("Hurah, you just earned a 10 points");
		}
		else if (alienColor == "yellow"){
			System.out.println("Hurah, you just earned a 15 points");
		}
		else{
			System.out.println("Invalid Colour");
		}
		
		// 1.4 Stages of Life
		int age = 67;
		
		if (age < 2) System.out.println("Message: The person is baby");
		else if (age <4) System.out.println("Message: The person is toddler");
		else if (age <13) System.out.println("Message: The person is child");
		else if (age <20) System.out.println("Message: The person is teenager");
		else if (age <65 ) System.out.println("Message: The person is adult");
		else System.out.println("Message: The person is a pensioner");
		
		// 1.5 Tax Rates
		int salary = 12501;
		if (salary > 150000){ 
			System.out.println("45%"); 
			} else if (salary > 50000){ 
			System.out.println("40%"); 
			} else if (salary > 12500){ 
			System.out.println("20%"); 
			} else { 
			System.out.println("0%"); 
			}
	}
}
