package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {
	public static final double SPEED_OF_LIGHT = 300000000;
	
	public static double matterToEnergy(double matter){
		return matter * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
	}
	
	public static double energyToMatter(double energy){
		return (energy)/(SPEED_OF_LIGHT * SPEED_OF_LIGHT);
	}
	
}
