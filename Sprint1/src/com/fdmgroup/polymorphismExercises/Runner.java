package com.fdmgroup.polymorphismExercises;

public class Runner {
	public static void main(String[] args){
		
		AdminUser admin1 = new AdminUser("keshav", "password", "Keshav Singh");
		AdminUser admin2 = new AdminUser("jhon", "passwordjohn", "Jhon Snow");

		Customer customer1 = new Customer("Harsimran", "customerpass", "Harsimran singh");
		Customer customer2 = new Customer("Joban", "jobanpass", "Joban kaur");
		
		admin1.changePassword("passwordKeshav", "passwordKeshav");
		System.out.println(admin1.getPassword());
		
		customer2.changePassword("adasdsd", "das");
		System.out.println(customer2.getPassword());
		
		admin2.accessWebsite();
		customer1.accessWebsite();
		
		UserAccountManager manager = new UserAccountManager();
		manager.addUser(admin1);
		manager.addUser(admin2);
		manager.addUser(customer1);
		manager.addUser(customer2);
		
		System.out.println(manager.login("keshav", "passwordKeshav") ? "Login Success": "Login failed");
		System.out.println(manager.login("jhon", "password") ? "Login Success": "Login failed");
		
		//Polymorphism
		AdminUser.setMinAdminPasswordLength(10);

		admin1.changePassword("pass", "pass");
		System.out.println(admin1.getPassword());

		admin1.changePassword("1234567890", "1234567890");
		System.out.println(admin1.getPassword());
		
		admin1.changePassword("1234567890", "1234567890",customer1);
		System.out.println(customer1.getPassword());

		
	}
}
