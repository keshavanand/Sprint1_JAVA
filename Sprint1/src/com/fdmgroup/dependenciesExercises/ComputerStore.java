package com.fdmgroup.dependenciesExercises;
import java.util.ArrayList;

public class ComputerStore {
	private String name;
	private ArrayList<Computer> computers = new ArrayList<Computer>();
	
	public ComputerStore(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void addComputer(Computer computer){
		computers.add(computer);
	}
	
	public ArrayList<Computer> getAllComputers(){
		return this.computers;
	}
}
