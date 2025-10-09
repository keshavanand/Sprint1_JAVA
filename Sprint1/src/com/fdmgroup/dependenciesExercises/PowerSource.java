package com.fdmgroup.dependenciesExercises;

public class PowerSource {
	double watts;
	
	public void setWatts(double watts){
		this.watts = watts;
	}
	
	public double supplyPower(){
		return watts;
	}
}
