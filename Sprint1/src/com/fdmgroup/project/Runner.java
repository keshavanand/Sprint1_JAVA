package com.fdmgroup.project;

import java.util.List;

public class Runner {
	public static void main(String[] args) throws InvalidTypeException {
		
		AccountController accountController = new AccountController();
		
		Customer customer1 = accountController.createCustomer("keshav","brampton","Person");
		Customer customer2 = accountController.createCustomer("kamal","toronto","person");
		Customer company1 = accountController.createCustomer("FDM", "toronto","company");
		Customer company2 = accountController.createCustomer("Scotiabank", "Halifax","company");;
		
		Account account1 = accountController.createAccount(customer1, "savings");
		Account account2 = accountController.createAccount(customer2, "checking");
		Account account3 = accountController.createAccount(customer1, "savings");
		Account account4 = accountController.createAccount(customer2, "checking");
		Account account5 = accountController.createAccount(company1, "savings");
		Account account6 = accountController.createAccount(company2, "checking");
		Account account7 = accountController.createAccount(company1, "savings");
		Account account8 = accountController.createAccount(company2, "checking");
		
		List<Customer> customers = accountController.getCustomers();
		List<Account> accounts = accountController.getAccounts();
		
		System.out.println(customers.toString()+"\n\n");
		System.out.println(accounts.toString()+"\n\n");

		accountController.removeCustomer(customer1);
		
		System.out.println(customers.toString()+"\n\n");
		System.out.println(accounts.toString()+"\n\n");
		
		accountController.removeAccount(account8);
		
		System.out.println(customers.toString()+"\n\n");
		System.out.println(accounts.toString()+"\n\n");
		
		account2.deposit(1000);
		account4.deposit(50);
		
		System.out.println("Account2 balance: "+account2.balance);
		System.out.println("Account4 balance: "+account4.balance);

		customer2.chargeAllAccount(10);
		
		System.out.println("Account2 balance: "+account2.balance);
		System.out.println("Account4 balance: "+account4.balance);
		
		customer2.chargeAllAccount(100);
		
		System.out.println("Account2 balance: "+account2.balance);
		System.out.println("Account4 balance: "+account4.balance);
		
		account5.deposit(500);
		account6.deposit(1000);
		account7.deposit(1000);
		
		company1.chargeAllAccount(100);
		company2.chargeAllAccount(100);
		
		System.out.println("Compnay 1:"+company1);
		System.out.println("Compnay 2:"+company2);
		
	}
	
}
