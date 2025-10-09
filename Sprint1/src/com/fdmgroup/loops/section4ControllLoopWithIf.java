package com.fdmgroup.loops;

public class section4ControllLoopWithIf {
	public static void main(String args[]){
		// 4.1 Finding a city
		String[] cities = {"Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle"};
		for (String city: cities){
			if(city.startsWith("B")){
				System.out.println(city + " - match");
				break;
			}
			System.out.println(city + " - not match");
		}
		
		// 4.2 First number over 100
		int[] numbers ={6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91};
		
		for (int num : numbers){
			if(num > 100){
				System.out.println(num);
				break;
			}
		}
	}
}
