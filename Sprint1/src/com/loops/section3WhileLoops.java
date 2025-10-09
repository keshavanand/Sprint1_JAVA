package com.loops;

public class section3WhileLoops {
	public static void main(String args[]){
		// 3.1 One million
//		int i = 1;
//		while(i<=1000000){
//			System.out.println(i);
//			i++;
//		}
		
		// 3.2 Letters of the alphabet
		char alphabet = 'a';
		while (alphabet !='z'+1) {
			System.out.print(alphabet);
			alphabet = (char) (alphabet +1);
		}
		
		// 3.3 Fibonacci sequence
		int firstNum = 0;
		int secondNum =1;
		int nextNum = 0;
		while (nextNum<1000){
			System.out.print("\n Fibonacci sequence: "+nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
			nextNum = firstNum + secondNum;
		}
		
		
	}
}
