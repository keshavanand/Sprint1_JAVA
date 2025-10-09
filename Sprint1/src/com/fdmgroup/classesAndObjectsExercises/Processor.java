package com.fdmgroup.classesAndObjectsExercises;

public class Processor {

	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;
	
	public Processor(String model, double speed, int numberOfCores){
		this.MODEL = model;
		this.SPEED = speed;
		this.NUMBER_OF_CORES = numberOfCores;
	}
	
	public String getModel(){
		return this.MODEL;
	}
	
	public double getSpeed(){
		return this.SPEED;
	}
	
	public int getNumberOfCores(){
		return this.NUMBER_OF_CORES;
	}
	
	public void processData(String data){
		System.out.println("Method name: processData, values: "+data);
	}
}
