package com.fdmgroup.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
	private final long CUSTOMER_ID;
	private static long nextCustomerId = 1999993;
	private String name;
	private String address;
	private List<Account> accounts = new ArrayList<>();
	
	public Customer(String name,String address) {
		nextCustomerId +=7;
		this.setName(name);
		this.setAddress(address);
		this.CUSTOMER_ID = nextCustomerId;
	}

	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Account> getAccounts(){
		return accounts;
	}
	
	public void addAccount(Account account) {
		if(account != null)
			accounts.add(account);
	}
	
	@Override
	public String toString() {
		return "Customer [CUSTOMER_ID=" + CUSTOMER_ID + ", name=" + name + ", address=" + address + ", accounts="
				+ accounts + "]";
	}

	public void removeAccount(Account account) {
		if(account != null)
			accounts.remove(account);
	}
	
	public abstract void chargeAllAccount(double amount);
}
