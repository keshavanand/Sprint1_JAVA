package com.fdmgroup.project;

public class CheckingAccount extends Account {
	private int nextCheckNumber = 0;

	public int getNextCheckNumber() {
		return ++nextCheckNumber;
	}
	
}
