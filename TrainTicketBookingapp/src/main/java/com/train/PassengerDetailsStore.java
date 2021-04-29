package com.train;

import java.util.ArrayList;

public class PassengerDetailsStore {
	static ArrayList<UserDetails> PassangerInformation = new ArrayList<UserDetails>();

	public static void addUserDetails() {
		UserDetails obj = new UserDetails();
		
		obj.passangername = "reno";
		obj.passangerage = "20";
		obj.passangergender = "Male"; 
		PassangerInformation.add(obj);
		UserDetails obj1 = new UserDetails();
		
		for (UserDetails userDetails : PassangerInformation) {
			
			if(userDetails.passangername.equalsIgnoreCase("reno")) {
				System.out.println(userDetails.passangername+ "" +userDetails.passangerage+""+userDetails.passangergender);
				break;
			}
		}

	}
	
