package com.train;

import java.util.Arrays;
import java.util.Scanner;

public class TrainTicketBooking {
	public static void main(String[] args) {
		System.out.println("Welcome To Train Booking");
		
	}

	public static void loginDetails() {
		System.out.println("Enter the Number:");
		Scanner InputU = new Scanner(System.in);
		long userMobileNo = InputU.nextLong();
		System.out.println("Enter the password:");
		Scanner InputP = new Scanner(System.in);
		String Password = InputP.next();
		boolean isValid = LoginDetails.usernameVerification(userMobileNo, Password);
		if (isValid == true) {
			System.out.println("The Entered Username and Password is Valid");
		} else {
			System.out.println("The Entered Username and Password is InValid");
			loginDetails();
		}
	}
	public static void journeyDetails() {
		System.out.println("Enter the Juorney Date YYYY-MM-DD : ");
		Scanner inputdate = new Scanner(System.in);
		String journeyDate = inputdate.next();
		boolean isValid = JuorneyDetails.juorneyDate(journeyDate);
		if(isValid == true) {
			System.out.println("Enter Date is Eligible For Takal Ticket Booking ");
		}
		else {
			journeyDetails();
		}
	}
	public static void trainDetails() {
		String[] trainList = new String[3];
		trainList[0] = "1.Madurai Express @17:30 ";
		trainList[1] = "2.PearCity Express @19:30";
		trainList[2] = "2.Bangalore Express @08:00";
		System.out.println("Cab Types " + Arrays.toString(trainList));
		for (int i = 0; i < trainList.length; i++) {
			String cType = trainList[i];
			System.out.println(cType);
		}
		
	}
	public static void selectionOfTrains() {
		System.out.println("Select The Train:");
		Scanner inputSelection= new Scanner(System.in);
		String trainOption = inputSelection.next();
		boolean isValid = TrainList.seatOption(trainOption);
		if(isValid==true) {
			System.out.println("Seats Avilable in The Selected Train");
		}
		else {
			selectionOfTrains();
		}
	}
}
