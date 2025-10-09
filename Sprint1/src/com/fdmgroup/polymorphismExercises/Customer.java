package com.fdmgroup.polymorphismExercises;

public class Customer extends UserAccount {
	private static int  minCustomerPasswordLength = 7;

	public Customer(String username,String password, String fullName){
		super(username, password, fullName);
	}
	public void accessWebsite(){
		System.out.println("accessing website as customer");
	}
	
	@Override
	public boolean changePassword(String newPass, String confirmPass){
		if(newPass.length()>=minCustomerPasswordLength && confirmPass.length()>=minCustomerPasswordLength){
			return super.changePassword(newPass, confirmPass);
		}
		return false;
	}
	
	
}
