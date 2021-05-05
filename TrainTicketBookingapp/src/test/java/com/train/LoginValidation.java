package com.train;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class LoginValidation {

	//Entering The Valid Details

	@Test
	public void registerUserTest1() { 
		String username = "ling2657";
		String password =  "Lingtan";
		LoginDetails.registerUser(username, password);


	}

	//User name is wrong Password is correct

	@Test
	public void registerUserTest2() { 
		String username = "raja2643";
		String password =  "Raja";
		LoginDetails.registerUser(username, password);	
	}
	//user name is correct password is wrong

	@Test
	public void registerUserTest3() { 
		String username = "Venki2622";
		String password =  "Venki";
		LoginDetails.registerUser(username, password);


	}
	//user name is correct password is wrong
	@Test
	public void registerUserTest4() { 
		String username = "nevil2650";
		String password =  "nevil";
		LoginDetails.registerUser(username, password);
	}

	//user name - correct and password - correct

	@Test
	public void credentialValidationTest1() { 
		String userId = "nevil2345";
		String password =  "nevil";
		boolean inValidCredentials = LoginDetails.credentialValidation(userId, password);
		assertFalse(inValidCredentials);	
	}

	//user name - correct password - correct

	@Test
	public void credentialValidationTest3() { 
		String userId = "ling2657";
		String password =  "Lingtan";
		boolean inValidCredentials = LoginDetails.credentialValidation(userId, password);
		assertTrue(inValidCredentials);	
	}

	//user name-wrong and password-wrong

	@Test
	public void credentialValidationTest2() { 
		String userId = "nevil23";
		String password =  "nevi";
		boolean inValidCredentials = LoginDetails.credentialValidation(userId, password);
		assertFalse(inValidCredentials);	
	}




} 