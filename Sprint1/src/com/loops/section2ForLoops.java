package com.loops;

import java.util.ArrayList;
import java.util.List;

public class section2ForLoops {
	public static void main(String args[]){
		// 2.1 One Million
		List<Integer> numbers = new ArrayList<Integer>(); 
//		for (int i =1; i<=1000000; i++){
//			numbers.add(i);
//		}
		System.out.println("List of numbers from 1 to million: "+ numbers);		
		
		// 2.2 Summing a million
		long sum = 0l;
		for (int i = 1; i<=1000000; i++)
				sum +=i;
		System.out.println("Sum from 1 to millon: "+sum);
		
		// 2.3 Odd numbers
		for (int i =1; i<=20; i++)
			System.out.println((i%2!=0)? "Numer:" + i + " is Odd": "");
		
		// 2.4 Three times table
		for (int i = 1; i<=12; i++){
			System.out.println(i+" X 3 = "+ 3*i);
		}
		
		// 2.5 Incrementing alternate numbers
		int[] scores = {25, 15,99,75,47,59,82};
		for (int i = 1;i<scores.length; i++,i++){
			scores[i] +=1;
		}
		for (int i =0; i<scores.length; i++){
			System.out.println(scores[i]);
		}
		
		// 2.6 Alternate letters
		char alphabet = 'a';
		for (int i = 1; i<=26; i++,i++){
			char nextAlphabet = (char) (alphabet + i);
			System.out.println(nextAlphabet);
		}

		
		// 2.7 All times tables
		for (int i =2; i<=12; i++){
			System.out.println("\n"+i +" times table: ");
			for (int j = 1; j<=10; j++){
				System.out.println(j+" X "+i+"= "+ j*i);
			}
		}
		
	}
}
