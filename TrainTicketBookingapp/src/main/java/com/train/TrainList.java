package com.train;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TrainList {
	public static void listOfTrains() {
		String trainName= "";
		String[] trainList = new String[3];
		trainList[0] = "1.Madurai Express @17:30 ";
		trainList[1] = "2.PearCity Express @19:30";
		trainList[2] = "2.Bangalore Express @08:00";
		System.out.println("Cab Types " + Arrays.toString(trainList));
		for (int i = 0; i < trainList.length; i++) {
			String cType = trainList[i];
			System.out.println(cType);
	}
		System.out.println("Select the Choise: ");
		Scanner input = new Scanner(System.in);
		String trainChoise = input.nextLine();
		switch (trainChoise) {
		case "1":
			System.out.println("The Selected Train is: " + trainList[0]);
			System.out.println("Enter Boarding Station ");
			Scanner inputBoardingPoint = new Scanner(System.in);
			String boardingPoint = inputBoardingPoint.next();
			System.out.println("Enter the Destination Station");
			Scanner inputDestinationPoint = new Scanner(System.in);
			String DestinationPoint = inputDestinationPoint.next();
			break;
		case "2":
			System.out.println("The Selected Train is: " + trainList[1]);
			System.out.println("Enter Boarding Station ");
			Scanner inputBoardingPoint1 = new Scanner(System.in);
			String boardingPoint1 = inputBoardingPoint1.next();
			System.out.println("Enter the Destination Station");
			Scanner inputDestinationPoint1 = new Scanner(System.in);	
			String DestinationPoint1 = inputDestinationPoint1.next();
			break;
		case "3":
			System.out.println("The Selected Train is: " + trainList[2]);
			System.out.println("Enter Boarding Station ");
			Scanner inputBoardingPoint2 = new Scanner(System.in);
			String boardingPoint2 = inputBoardingPoint2.next();
			System.out.println("Enter the Destination Station");
			Scanner inputDestinationPoint2 = new Scanner(System.in);	
			String DestinationPoint2 = inputDestinationPoint2.next();
			break;
		default:
			System.out.println("Invalid Choise");
		}
	}
		public static void seatOption() {
			HashMap<String,String> seatOption = new HashMap<String,String>();
			seatOption.put("2S", "Secound Sitting(2S) ");
			seatOption.put("SL", "Sleeper Class(SL) ");
			seatOption.put("3A", "AC 3 Tier(2S) ");
			seatOption.put("2A", "AC 2 Tier(2S) ");
			seatOption.put("1A", "First Class Ac(2S) ");
			System.out.println("Select The Seats Option: ");
			Scanner inputSeatOption = new Scanner(System.in);
			String seatingOption = inputSeatOption.next();
			String seatAvilable = seatOption.get(seatingOption);
			switch (seatAvilable) {
			case "2S" :
				System.out.println("The Selected Sitting Option is "+seatAvilable+ "The Prie is 200 ");
				price();
				break;
			case "SL":
			}
}
		public static void price() {
		System.out.println("Enter the Numer of Passenger :");
		Scanner inputNumberOfTicketNeeded = new Scanner(System.in);
		int numberOfTicketNeeded = inputNumberOfTicketNeeded.nextInt();
		if(numberOfTicketNeeded >=5) {
			int ticketPrice = numberOfTicketNeeded*200;
			System.out.println(ticketPrice);
		}
		else {
			System.out.println("Only 5 Tickets Per Person");
			seatOption();
		}	
}
}
