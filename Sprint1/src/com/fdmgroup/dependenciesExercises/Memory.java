package com.fdmgroup.dependenciesExercises;

public class Memory {
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;
	
	public Memory(String model,double capacity, double speed){
		this.MODEL = model;
		this.CAPACITY = capacity;
		this.SPEED = speed;
	}
	
	public void setUsedSpace(double usedSpace){
		this.usedSpace = usedSpace;
	}
	
	public double getUsedSpace(){
		return this.usedSpace;
	}
	
	public String getModel(){
		return this.MODEL;
	}
	
	public double getCapacity(){
		return this.CAPACITY;
	}
	
	public double getSpeed(){
		return this.SPEED;
	}
	
	public void storeData(String data){
		System.out.println("Method name: storeData, values: "+data);
	}
}
