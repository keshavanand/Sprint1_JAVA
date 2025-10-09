package com.fdmgroup.SolidExercises.Exercise1;

import java.util.List;

public abstract class Manager {
	
	protected List<Employee> employeeList;
	
	abstract void addEmployee(Employee employee);
	abstract void removeEmployee(Employee employee);
	abstract void updateEmployee(Employee employee);
	abstract List<Employee> listEmployee();
}
