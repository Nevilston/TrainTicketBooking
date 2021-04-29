package com.train.sc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.train.LoginDetails;
import com.train.TrainList;

public class TrainListValidation {

	@Test
	public void trainchoiseValidation1() {
	String trainChoise="1";
	boolean isValidNumber = TrainList.seatOption(trainChoise);
	assertTrue(isValidNumber);
	}
	@Test
	public void trainchoiseValidation2() {
	String trainChoise="2";
	boolean isValidNumber = TrainList.seatOption(trainChoise);
	assertTrue(isValidNumber);
	}
	@Test
	public void trainchoiseValidation3() {
	String trainChoise="3";
	boolean isValidNumber = TrainList.seatOption(trainChoise);
	assertTrue(isValidNumber);
	}
	@Test
	public void trainchoiseValidation4() {
	String trainChoise="4";
	boolean isValidNumber = TrainList.seatOption(trainChoise);
	assertFalse(isValidNumber);
	}
	@Test
	public void trainchoiseValidation5() {
	String trainChoise="0";
	boolean isValidNumber = TrainList.seatOption(trainChoise);
	assertFalse(isValidNumber);
	}
	@Test
	public void trainchoiseValidation6() {
	String trainChoise="10";
	boolean isValidNumber = TrainList.seatOption(trainChoise);
	assertFalse(isValidNumber);
	}


}
