package com.train;

public class SeatOption {
	public static boolean seatSelection(String SeatOption,int numberOfTicketNeeded) {
		boolean isValid = false;
		switch (SeatOption) {
		case "2S":
			System.out.println("The Selected Seat Option is Secound Sitting(2S) ");
			if(numberOfTicketNeeded <= 5) {
				System.out.println(numberOfTicketNeeded +" is Ticket Avilable");
				int cost = numberOfTicketNeeded* 200;
				System.out.println("The Price for the Ticket is :"+cost);
				isValid= true;
			}
			else {
				System.out.println("Only 5 Ticket Per Booking User Please Enter Lesser Value");
				isValid= false;
			}
			break;
		case "SL":
			System.out.println("The Selected Seat Option is Sleeper Class(SL) ");
			if(numberOfTicketNeeded <= 5) {
				System.out.println(numberOfTicketNeeded +" is Ticket Avilable");
				int cost = numberOfTicketNeeded*400;
				System.out.println("The Price for the Ticket is :"+cost);
				isValid= true;
			}
			else {
				System.out.println("Only 5 Ticket Per Booking User Please Enter Lesser Value");
				isValid= false;
			}
			break;
		case "3A":
			System.out.println("The Selected Seat Option is Secound Sitting(2S) ");
			if(numberOfTicketNeeded <= 5) {
				System.out.println(numberOfTicketNeeded +" is Ticket Avilable");
				int cost = numberOfTicketNeeded*1000;
				System.out.println("The Price for the Ticket is :"+cost);
				isValid= true;
			}
			else {
				System.out.println("Only 5 Ticket Per Booking User Please Enter Lesser Value");
				isValid= false;
			}
			break;
		case "2A":
			System.out.println("The Selected Seat Option is AC 3 Tier(2S) ");
			if(numberOfTicketNeeded <= 5) {
				System.out.println(numberOfTicketNeeded +" is Ticket Avilable");
				int cost = numberOfTicketNeeded*1500;
				System.out.println("The Price for the Ticket is :"+cost);
				isValid= true;
			}
			else {
				System.out.println("Only 5 Ticket Per Booking User Please Enter Lesser Value");
				isValid= false;
			}
			break;
		case "1A":
			System.out.println("The Selected Seat Option is First Class Ac(2S) ");
			if(numberOfTicketNeeded <= 5) {
				System.out.println(numberOfTicketNeeded +" is Ticket Avilable");
				int cost = numberOfTicketNeeded*1500;
				System.out.println("The Price for the Ticket is :"+cost);
				isValid= true;
			}
			else {
				System.out.println("Only 5 Ticket Per Booking User Please Enter Lesser Value");
				isValid= false;
			}
			break;
		default:
			System.out.println("The Entered Option Is Invalid ");
			isValid = false;
		}
		return isValid;
	}
}
