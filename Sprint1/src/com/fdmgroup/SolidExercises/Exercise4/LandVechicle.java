package com.fdmgroup.SolidExercises.Exercise4;

public class LandVechicle extends Vehicle implements Manualled{
	private double currentSpeedInLandMilesPerHour;
	private int numberOfAxels;
	
	public double getCurrentSpeedInLandMilesPerHour() {
		return currentSpeedInLandMilesPerHour;
	}
	public void setCurrentSpeedInLandMilesPerHour(double currentSpeedInLandMilesPerHour) {
		this.currentSpeedInLandMilesPerHour = currentSpeedInLandMilesPerHour;
	}
	public int getNumberOfAxels() {
		return numberOfAxels;
	}
	public void setNumberOfAxels(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}
}
