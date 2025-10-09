package com.fdmgroup.project;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
	private List<Customer> customers = new ArrayList<>();
	private List<Account> accounts = new ArrayList<>();

	
	public List<Customer> getCustomers(){
		return customers;
	}
	
	public List<Account> getAccounts(){
		return accounts;
	}
	
	//Better way to accept ENUM instead of String for variable type
	public Customer createCustomer(String name, String address, String type) throws InvalidTypeException {
		if(type.equalsIgnoreCase("person")) {
			
			Customer customer = new Person(name,address);
			customers.add(customer);
			return customer;
					
		}else if (type.equalsIgnoreCase("company")) {
			
			Customer customer = new Company(name,address);
			customers.add(customer);
			return customer;
					
		}else {
			throw new InvalidTypeException("Invalid Customer Type, Only Person and Company Type acceptable");
		}
	}
	
	public void removeCustomer(Customer customer) {
		if(customer !=null) {
			
			List<Account> customerAccounts = customer.getAccounts();
			
			if(customerAccounts.size() == 0) {
				customers.remove(customer);
			}else {
				
				for(int i = 0; i<customerAccounts.size();i++) {
					accounts.remove(customerAccounts.get(i));
				}
				
				customers.remove(customer);
			}
			
			
		}
	}
	
	public Account createAccount(Customer customer, String type) throws InvalidTypeException {
		if(type.equalsIgnoreCase("checking")) {
			
			Account account = new CheckingAccount();
			accounts.add(account);
			customer.addAccount(account);
			return account;
			
		}else if (type.equalsIgnoreCase("savings")) {
			
			Account account = new SavingsAccount();
			accounts.add(account);
			customer.addAccount(account);
			return account;
			
		}else {
			throw new InvalidTypeException("Invalid Account Type, Only checking and saving Type acceptable");
		}
	}
	
	public void removeAccount(Account account) {
		
		if(account != null) {
			for (Customer customer: customers) {
				List<Account> customerAccounts = customer.getAccounts();
				if(customerAccounts.contains(account)) {
					customerAccounts.remove(account);
					break;
				}
			}
			accounts.remove(account);
		}
	}
	
	
}
