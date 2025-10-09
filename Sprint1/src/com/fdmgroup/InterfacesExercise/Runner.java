package com.fdmgroup.InterfacesExercise;

public class Runner {

	public static void main(String[] args) {
		Toy toy = new Toy();
		toy.setName("Aeroplane");
		toy.setPrice(19.80);
		
		Laptop laptop = new Laptop();
		laptop.setName("Dell");
		laptop.setPrice(789.99);
		
		Snack snack1 = new Snack();
		snack1.setName("Protien Bar");
		snack1.setPrice(4.99);
		snack1.setCalories(350);
		
		Snack snack2 = new Snack();
		snack2.setName("Chips");
		snack2.setPrice(6.99);
		snack2.setCalories(700);
		
		ReadyMeal readyMeal1 = new ReadyMeal();
		readyMeal1.setName("Chicken breast");
		readyMeal1.setPrice(9.99);
		readyMeal1.setCalories(450);
		
		ReadyMeal readyMeal2 = new ReadyMeal();
		readyMeal2.setName("Steak");
		readyMeal2.setPrice(16.99);
		readyMeal2.setCalories(850);
		
		Basket basket = new Basket();
		CalorieCounter calorieCounter = new CalorieCounter();
		
		basket.addItem(toy);
		basket.addItem(laptop);
		basket.addItem(snack1);
		basket.addItem(snack2);
		basket.addItem(readyMeal1);
		basket.addItem(readyMeal2);
		
		for(BasketItem basketItem: basket.getAllItems()){
			System.out.println("Name: "+basketItem.getName());
		}

		basket.removeItem(laptop);
		System.out.println("\nAfter removing Dell Laptop from basket\n");
		
		for(BasketItem basketItem: basket.getAllItems()){
			System.out.println("Name: "+basketItem.getName());
		}
		
		calorieCounter.addLowCalorieFood(snack1);
		calorieCounter.addLowCalorieFood(snack2);
		calorieCounter.addLowCalorieFood(readyMeal1);
		calorieCounter.addLowCalorieFood(readyMeal2);

		//calorieCounter.addLowCalorieFood(toy);
		//calorieCounter.addLowCalorieFood(laptop);
		
		for(FoodItem foodItem: calorieCounter.getAllLowCalorieFoods()){
			System.out.println(" Calories: "+ foodItem.getCalories());
		}


	}

}
