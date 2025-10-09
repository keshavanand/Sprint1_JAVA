package com.fdmgroup.dependenciesExercises;

public class HardDrive {
	
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	
	public HardDrive(String model, double capacity){
		this.MODEL = model;
		this.CAPACITY = capacity;
	}
	
	public String getModel(){
		return this.MODEL;
	}
	
	public double getCapacity(){
		return this.CAPACITY;
	}
	
	public double getUsedSpace(){
		return this.usedSpace;
	}
	
	public void setUsedSpace(double usedSpace){
		this.usedSpace = usedSpace;
	}
	
	public String readData(String file){
		return "Data from: " + file; 
	}
	
	public void writeData(String data, String file){
		System.out.println("Method name: writeData, values: "+data +" " + file);
	}
	
}
