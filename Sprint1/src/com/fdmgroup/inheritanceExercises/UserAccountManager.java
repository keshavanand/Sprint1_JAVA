package com.fdmgroup.inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {
	private ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	public void addUser(UserAccount user){
		userAccounts.add(user);
	}
	
	public boolean login(String username, String password){
		UserAccount user = null;
		for(UserAccount userAccount: userAccounts){
			if (userAccount.getUsername() == username)
				user = userAccount;
		}
		if(user !=null && user.getPassword()== password) return true;
		return false;
	}
	
	
	
	
}
