package com.fdmgroup.castingExericses;
import java.util.ArrayList;
import java.util.List;

public class CalorieCounter {
	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();
	
	public void addLowCalorieFood(FoodItem foodItem){
		if(foodItem.getCalories()<=500) lowCalorieFoods.add(foodItem);
	}
	
	public ArrayList<FoodItem> getAllLowCalorieFoods(){
		return lowCalorieFoods;
	}
	
	public void removeHighCalorieFoodsFromBasket(Basket basket, int calories){
		
		List<BasketItem> list = basket.getAllItems();
		
		for(int i =0; i<list.size(); i++){
			
			BasketItem item = list.get(i);
			
			if(item instanceof FoodItem){
				if(((FoodItem) item).getCalories() > calories){
					basket.removeItem(item);
				}
			}
		}
	}
}
