package com.train;
import static org.junit.Assert.*;
import org.junit.Test;
public class LoginValidation {
	//Checking the Number details With correct details
	@Test
	public void userNameCheckTest1() {
		long userMobileNo =9566087158l;
		String password = "Nevil1234";
		boolean isValidNumber = LoginDetails.usernameVerification(userMobileNo, password);
		assertTrue(isValidNumber);
	}
	//Checking the number with correct details
	@Test
	public void userNameCheckTest2() {
		long userMobileNo =9600923846l;
		String password ="nevil1234";
		boolean isValidNumber = LoginDetails.usernameVerification(userMobileNo,password);
		assertFalse(isValidNumber);
	}	
}