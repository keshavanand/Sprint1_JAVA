package com.fdmgroup.project;

import java.util.List;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
	}

	@Override
	public void chargeAllAccount(double amount) {
		List<Account> accounts = getAccounts();
		for (Account account: accounts) {
			if(account instanceof CheckingAccount) {
				account.withdraw(amount);
			}
			else if (account instanceof SavingsAccount) {
				account.withdraw(amount * 2);
			}
		}
	}

}
