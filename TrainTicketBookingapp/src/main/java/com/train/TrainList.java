package com.train;

public class TrainList {

	public static boolean seatOption(String trainOption) {
		int option = Integer.parseInt(trainOption);
		System.out.println(option);
		boolean isValid = false;
		if (option <= 10) {
			switch (trainOption) {
			case "1":
				System.out.println("The Selected Train is Madurai Express @17:30");
				isValid = true;
				break;
			case "2":
				System.out.println("The Selected Train is PearCity Express @19:30");
				isValid = true;
				break;
			case "3":
				System.out.println("The Selected Train is Bangalore Express @08:00");
				isValid = true;
				break;
			default:
				System.out.println("Invalid Choise");
			}
		} else {
			System.out.println("Retry");
			isValid = false;
		}
		return isValid;

	}

}
