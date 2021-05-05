package com.train.sc;

import org.junit.Test;

import com.train.PassengerDetailsStore;
import com.train.passangerDetails;

public class AddUserTest {

	@Test
	public void test() {
		passangerDetails Passanger1 = new passangerDetails();
		Passanger1.passangername="Magesh";
		Passanger1.passangerage="22";
		Passanger1.passangergender="Male"; 
		

		passangerDetails Passanger2 = new passangerDetails();
		Passanger2.passangername="Robin";
		Passanger2.passangerage="21";	
		Passanger2.passangergender="Male"; 
		

		passangerDetails Passanger3 = new passangerDetails();
		Passanger3.passangername="Linga";
		Passanger3.passangerage="24";
		Passanger3.passangergender="Male"; 
		
		
		
		passangerDetails Passanger4 = new passangerDetails();
		Passanger4.passangername="Robin";
		Passanger4.passangerage="21";
		Passanger4.passangergender="Male"; 
		

		//passengerDetailsStore.addUserDetails(numberOfTicketNeeded);
		PassengerDetailsStore.addPassangerDetails(Passanger1, Passanger2, Passanger3,Passanger4);
		PassengerDetailsStore.displayUserDetails();
	}
	

}
