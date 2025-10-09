package com.fdmgroup.staticKeywordExercises;

public class Runner {

	public static void main(String args[]){
		System.out.println("Speed of light: "+EnergyMatterCalculator.SPEED_OF_LIGHT);
		System.out.println("Matter with 10 mass has energy: "+EnergyMatterCalculator.matterToEnergy(10));
		System.out.println("10 Energy contain matter: "+EnergyMatterCalculator.energyToMatter(10));
		
		Employee.setMinimumWage(9.53);
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		employee1.setHourlyWage(5);
		employee2.setHourlyWage(2.1);
		employee3.setHourlyWage(14.5);
		
		System.out.println(employee1.getHourlyWage());
		System.out.println(employee2.getHourlyWage());
		System.out.println(employee3.getHourlyWage());

	}
}
