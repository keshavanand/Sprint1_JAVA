package com.fdmgroup.project;

public class SavingsAccount extends Account {
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interestDue = balance * (interestRate/100);
		balance +=interestDue;
	}
}
