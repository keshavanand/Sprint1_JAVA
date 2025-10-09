package com.fdmgroup.dependenciesExercises;

public class Computer {
	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;
	
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor){
		this.MODEL = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.PROCESSOR = processor;
	}
	
	public String getModel(){
		return this.MODEL;
	}
	
	public Processor getProcessor(){
		return this.PROCESSOR;
	}
	
	public HardDrive getHardDrive(){
		return this.hardDrive;
	}
	
	public void setHardDrive(HardDrive hardDrive){
		this.hardDrive = hardDrive;
	}
	
	public Memory getMemory(){
		return this.memory;
	}
	
	public void setMemory(Memory memory){
		this.memory = memory;
	}
	
	public void turnOff(){
		System.out.println("Computer Turned OFF");
	}
	
	public void turnOn(){
		System.out.println("Computer Turned ON");
	}
	
	public void getPower(PowerSource powerSource){
		double watts = powerSource.supplyPower();
		System.out.println("Watts: "+watts);
	}
}

