package com.fdmgroup.project;

public abstract class Account {
	private final long ACCOUNT_ID;
	private static long nextAccountId = 995;
	protected double balance;
	
	public Account() {
		nextAccountId +=5;
		this.ACCOUNT_ID = nextAccountId;
	}
	public double getBalance() {
		return balance;
	}
	
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	
	public double withdraw(double amount) {
		if(amount <= balance) {
			balance -=amount;
			return amount;
		}
		return 0;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance +=amount;
		}
	}
	
	public void correctBalance(double amount) {
		balance = amount;
	}
	@Override
	public String toString() {
		return "Account [ACCOUNT_ID=" + ACCOUNT_ID + ", balance=" + balance + "]";
	}
}
