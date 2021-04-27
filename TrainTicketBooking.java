package com.train;

import java.util.Scanner;

public class TrainTicketBooking {
	public static void main(String[] args) {
		System.out.println("Welcome To Train Booking");
		loginDetails();
		journeyDetails();
		TrainList.listOfTrains();
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
		System.out.println("Enter Boarding Station ");
		Scanner inputBoardingPoint = new Scanner(System.in);
		String boardingPoint = inputBoardingPoint.next();
		System.out.println("Enter the Destination Station");
		Scanner inputDestinationPoint = new Scanner(System.in);
		String DestinationPoint = inputDestinationPoint.next();
	}
	
}
