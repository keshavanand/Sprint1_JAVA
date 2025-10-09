package com.arraysAndLists;

import java.util.ArrayList;
import java.util.Collections;

public class section2ArrayLists {
	public static void main(String args[]){
		// 2.1 shopping basket
		ArrayList<String> shoppingBasket = new ArrayList<String>();
		shoppingBasket.add("milk");
		shoppingBasket.add("cereals");
		shoppingBasket.add("apples");
		shoppingBasket.add("oranges");
		shoppingBasket.add("bread");
		
		System.out.println("Number of items in basket: " + shoppingBasket.size());
		
		System.out.println("First item in basket: "+ shoppingBasket.get(0));
		System.out.println("Fifth item in basket: "+ shoppingBasket.get(4));
		
		shoppingBasket.remove(4);
		System.out.println("Updated Basket: " +shoppingBasket);
		
		shoppingBasket.remove(2);
		System.out.println("Updated Basket: " +shoppingBasket);
		
		shoppingBasket.add("potatoes");
		shoppingBasket.add("olive oil");
		shoppingBasket.add("chicken");
		
		Collections.sort(shoppingBasket);
		
		System.out.println("First item in basket: "+ shoppingBasket.get(0));
		System.out.println("Last item in basket: "+ shoppingBasket.get(shoppingBasket.size()-1));
		
		System.out.println("\n Second Section\n");
		// 2.2 Salaries
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		
		System.out.println("Highest Salary: "+Collections.max(salaries));
		System.out.println("Lowest Salary: "+Collections.min(salaries));
		
		System.out.println("No. of people earning 42000: "+Collections.frequency(salaries, 42000));
		
		Collections.sort(salaries);
		
		System.out.println("Median Salary: "+ salaries.get(3));
		
		Collections.reverse(salaries);
		
		System.out.println("First item: "+ salaries.get(0));
		System.out.println("Last item: "+ salaries.get(salaries.size()-1));
		
		

	}
}
