package com.train;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeniourTest {

	@Test
	public void seniourCheckTest1() {
		int age =10;
		float price=400;
		boolean isValidAge = SeniourCheck.seniourAgeCheck(age, price);
		assertFalse(isValidAge);
	}
	@Test
	public void seniourCheckTest2() {
		int age =40;
		float price=420;
		boolean isValidAge = SeniourCheck.seniourAgeCheck(age, price);
		assertFalse(isValidAge);
	}
	@Test
	public void seniourCheckTest3() {
		int age =70;
		float price=220;
		boolean isValidAge = SeniourCheck.seniourAgeCheck(age, price);
		assertTrue(isValidAge);
	}
	@Test
	public void seniourCheckTest4() {
		int age =65;
		float price=440;
		boolean isValidAge = SeniourCheck.seniourAgeCheck(age, price);
		assertTrue(isValidAge);
	}

}