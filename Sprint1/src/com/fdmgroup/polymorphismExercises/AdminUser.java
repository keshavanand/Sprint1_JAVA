package com.fdmgroup.polymorphismExercises;

public class AdminUser extends UserAccount {
	private static int  minAdminPasswordLength ;
	
	public AdminUser(String username,String password, String fullName){
		super(username, password, fullName);
	}
	
	public static void setMinAdminPasswordLength(int minAdminPasswordLength){
		AdminUser.minAdminPasswordLength = minAdminPasswordLength;
	}
	public static int getMinAdminPasswordLength(){
		return minAdminPasswordLength;
	}
	public void accessWebsite(){
		System.out.println("accessing website with admin rights");
	}
	
	@Override
	public boolean changePassword(String newPass, String confirmPass){
		if(newPass.length()>=minAdminPasswordLength && confirmPass.length()>=minAdminPasswordLength){
			return super.changePassword(newPass, confirmPass);
		}
		return false;
	}
	
	public boolean changePassword(String newPass, String confirmPass, UserAccount user){
		return user.changePassword(newPass, confirmPass);
	}
	
	
}
