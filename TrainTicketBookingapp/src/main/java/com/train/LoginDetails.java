package com.train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LoginDetails {
	static ArrayList<String> usernameArray = new ArrayList<String>();
	static ArrayList<String> passwordArray = new ArrayList<String>();


	public static void registerUser(String username, String password) {
		usernameArray.add(username);
		passwordArray.add(password);
	}

	public static boolean credentialValidation(String userId, String password) {
		boolean isValidCredentials = false;
		try {
			if (usernameArray.contains(userId)) {
				if (passwordArray.contains(password)) {
					isValidCredentials = true;
				}
			}

		} catch (Exception e) {
			String wrong = "Wrong Password";
			System.out.println(wrong);
		}
		return isValidCredentials;

	}

}
