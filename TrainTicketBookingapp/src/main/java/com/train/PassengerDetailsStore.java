package com.train;

import java.util.ArrayList;
import java.util.Scanner;

public class PassengerDetailsStore {
	static ArrayList<passangerDetails> PassangerInformation = new ArrayList<passangerDetails>();

	public static void addUserDetails(int numberOfTicketNeeded) {
		int tickets = numberOfTicketNeeded;
		while (tickets != 0) {

			addPassangerDetails();
			tickets--;
		}
		
	}
	public static void addPassangerDetails(passangerDetails  ...passanger) {
		for (passangerDetails passangerInfo : passanger) {
			PassangerInformation.add(passangerInfo);			
		}
		
	}
	public static void displayUserDetails() {
			System.out.println("Passanger Entered ");
			for (passangerDetails passangerInfo: PassangerInformation) {
				System.out.println(passangerInfo);
			}
	}
	
}


