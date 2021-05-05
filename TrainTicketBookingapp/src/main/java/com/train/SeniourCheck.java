package com.train;

public class SeniourCheck {
	public static boolean seniourAgeCheck(int age ,float price) {
		int passangerage = age;
		boolean	isValid= true;
		if(passangerage >= 65) {
			float cost = price;
			float discount = (cost/100)*50;
			System.out.println("The Passenger is Seniiour Citizen and the discounted price is"+discount);
			isValid=true;
		}
		else {
			System.out.println("The Passenger is not  Seniiour Citizen");
			isValid=false;
		}
		return isValid;
	}
}
