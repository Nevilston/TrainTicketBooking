package com.train;

import static org.junit.Assert.*;

import org.junit.Test;

public class JourneyValidation {

	@Test
	public void journeyDateValidationTest1() {
		String journeydate = "2021-04-28";
		boolean isValidDate = JuorneyDetails.juorneyDate(journeydate);
		assertTrue(isValidDate);
	}
	@Test
	public void journeyDateValidationTest2() {
		String journeydate = "2021-04-27";
		boolean isValidDate = JuorneyDetails.juorneyDate(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest3() {
		String journeydate = "2021-04-26";
		boolean isValidDate = JuorneyDetails.juorneyDate(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest4() {
		String journeydate = "2021-03-26";
		boolean isValidDate = JuorneyDetails.juorneyDate(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest5() {
		String journeydate = "2020-04-26";
		boolean isValidDate = JuorneyDetails.juorneyDate(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest6() {
		String journeydate = "2021-04-26";
		boolean isValidDate = JuorneyDetails.juorneyDate(journeydate);
		assertFalse(isValidDate);
	}
}
