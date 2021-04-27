package com.train;
public class LoginDetails{
	public static boolean usernameVerification(long userMobileNo ,String password ) {
		boolean isValid = false;
		if(userMobileNo == 9566087158l) {
		if(password.equals("Nevil1234")) {
			isValid = true;
		}	
			else {
				System.out.println("Retry again");
				isValid = false;
		}
	return isValid;		
	}
		return isValid;
	}
}