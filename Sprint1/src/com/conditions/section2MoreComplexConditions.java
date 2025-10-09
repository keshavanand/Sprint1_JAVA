package com.conditions;

public class section2MoreComplexConditions {
	public static void main(String args[]){
		//2.1 Valid account numbers
		int accountNumber = 24534352;
		
		if (accountNumber >= 10000000 && accountNumber <=99999999){
			System.out.println("Valid Account Numebr");
		}
		else {
			System.out.println("Invalid Account Numebr");
		}
		
		// 2.2 Airline Code 1
		String flightCode = "QT5678";
		
		if (flightCode.substring(0,2).equals("BA")){
			System.out.println("British Airways");
		}
		else{
			System.out.println("Not British Airways");
		}
		
		// 2.3 Airline codes 2
		String flightCodeShort = flightCode.substring(0,2);
		if (flightCodeShort.equals("BA") || flightCodeShort.equals("LH") || flightCodeShort.equals("FR")){
			System.out.println("Valid Airline");
		}
		else {
			System.out.println("Invalid Airline");

		}
		
		// 2.3 Airline codes 3
		if (!flightCodeShort.equals("BA") && !flightCodeShort.equals("LH") && !flightCodeShort.equals("FR")){
			System.out.println("Invalid Airline");
		}
		
		// 2.5 Valid ID
		boolean validPassport = true, validDrivingLicence = false;
		
		if (validPassport || validDrivingLicence){
			System.out.println("id verified");
		}
		else {
			System.out.println("unable to verify id");
		}
		
		// 2.6 Older driver
		boolean hasLicence =true, isDead=false, hasPassedEyeTest = false;
		
		if (hasLicence && !isDead && hasPassedEyeTest) System.out.println("Can still Drive");
		else System.out.println("not licenced to drive");
	}
}
