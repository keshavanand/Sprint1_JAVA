package com.fdmgroup.project;

import java.util.List;

public class Person extends Customer {

	public Person(String name, String address) {
		super(name, address);
	}

	@Override
	public void chargeAllAccount(double amount) {
		List<Account> accounts = getAccounts();
		for (Account account: accounts) {
			account.withdraw(amount);
		}
	}

}
