package com.train;

import java.time.LocalDate;

public class JuorneyDetails {
	public static boolean juorneyDate(String journeyDate) {
		LocalDate todayDate =  LocalDate.now();
		LocalDate userJourneyDate = LocalDate.parse(journeyDate);
		LocalDate afterDate = todayDate.plusDays(1);
		boolean isValid = false;
		if(todayDate.compareTo(userJourneyDate) < 0) {
			if(userJourneyDate.compareTo(afterDate)==0) {
				isValid = true;
			}
			else {
				System.out.println("No Trains Avilable on the Booking Date");
				isValid = false;
			}
		}
		else{
			System.out.println("No Trains Avilable on the Booking Date");
			isValid = false;
		}
		return isValid;
	}
	}
	
