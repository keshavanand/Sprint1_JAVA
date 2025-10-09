package com.fdmgroup.SolidExercises.Exercise1;

import java.util.List;

public class EmployeeManager extends Manager {
		
	@Override
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	@Override
	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		int index = employeeList.indexOf(employee);
		employeeList.set(index, employee);
	}
	
	@Override
	public List<Employee> listEmployee(){
		return employeeList;
	}
}
