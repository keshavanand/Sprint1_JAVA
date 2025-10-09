package com.fdmgroup.Collections;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ExerciseHashMap {
	public static void main(String[] args){
		Map<String, Color> colors = getColors();
		for(String name: colors.keySet()){
			System.out.println("Color: "+name +" With value: "+colors.get(name));
		}
	}
	
	public static Map<String, Color> getColors(){
		Map<String, Color> colors = new HashMap<String, Color>();
		
		colors.put("black",Color.black);
		colors.put("blue",Color.blue);
		colors.put("cyan",Color.cyan);
		colors.put("darkGray",Color.darkGray);
		colors.put("gray",Color.gray);
		colors.put("green",Color.green);
		colors.put("lightGray",Color.lightGray);
		colors.put("magenta",Color.magenta);
		colors.put("orange",Color.orange);
		colors.put("pink",Color.pink);
		colors.put("red",Color.red);
		colors.put("white",Color.white);
		colors.put("yellow",Color.yellow);
		
		return colors;


	}
	
}
