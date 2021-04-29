package com.train.sc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.train.SeatOption;
import com.train.TrainList;

public class SeatSelectionValidation {

	@Test
	public void seatSelectionTest1() {
	String seatOption = "2S";	
	int ticketNeed= 1;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest1a() {
	String seatOption = "2S";	
	int ticketNeed= 2;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest1b() {
	String seatOption = "2S";	
	int ticketNeed= 3;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest1c() {
	String seatOption = "2S";	
	int ticketNeed= 4;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest1d() {
	String seatOption = "2S";	
	int ticketNeed= 5;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest1e() {
	String seatOption = "2S";	
	int ticketNeed= 6;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertFalse(isValidNumber);
	}
	@Test
	public void seatSelectionTest2() {
	String seatOption = "SL";
	int ticketNeed= 1;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest2a() {
	String seatOption = "SL";
	int ticketNeed= 2;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest2b() {
	String seatOption = "SL";
	int ticketNeed= 3;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest2c() {
	String seatOption = "SL";
	int ticketNeed= 4;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest2d() {
	String seatOption = "SL";
	int ticketNeed= 5;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest2e() {
	String seatOption = "SL";
	int ticketNeed= 6;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertFalse(isValidNumber);
	}
	@Test
	public void seatSelectionTest3() {
	String seatOption = "3A";
	int ticketNeed= 1;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	public void seatSelectionTest3a() {
		String seatOption = "3A";
		int ticketNeed= 2;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest3b() {
		String seatOption = "3A";
		int ticketNeed= 3;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest3c() {
		String seatOption = "3A";
		int ticketNeed= 4;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest3d() {
		String seatOption = "3A";
		int ticketNeed= 5;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest3e() {
		String seatOption = "3A";
		int ticketNeed= 6;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertFalse(isValidNumber);
		}
	@Test
	public void seatSelectionTest4() {
	String seatOption = "2A";
	int ticketNeed= 1;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	public void seatSelectionTest4a() {
		String seatOption = "2A";
		int ticketNeed= 2;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest4b() {
		String seatOption = "2A";
		int ticketNeed= 3;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest4c() {
		String seatOption = "2A";
		int ticketNeed= 4;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest4d() {
		String seatOption = "2A";
		int ticketNeed= 5;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertTrue(isValidNumber);
		}
	public void seatSelectionTest4e() {
		String seatOption = "2A";
		int ticketNeed= 6;
		boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
		assertFalse(isValidNumber);
		}
	@Test
	public void seatSelectionTest5() {
	String seatOption = "1A";	
	int ticketNeed= 1;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest5a() {
	String seatOption = "1A";	
	int ticketNeed= 2;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest5b() {
	String seatOption = "1A";	
	int ticketNeed= 3;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest5c() {
	String seatOption = "1A";	
	int ticketNeed= 4;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest5d() {
	String seatOption = "1A";	
	int ticketNeed= 5;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertTrue(isValidNumber);
	}
	@Test
	public void seatSelectionTest5e() {
	String seatOption = "1A";	
	int ticketNeed= 6;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertFalse(isValidNumber);
	}
	@Test
	public void seatSelectionTest6() {
	String seatOption = "2";
	int ticketNeed= 6;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertFalse(isValidNumber);
	}
	@Test
	public void seatSelectionTest7() {
	String seatOption = "";	
	int ticketNeed= 0;
	boolean isValidNumber = SeatOption.seatSelection(seatOption,ticketNeed);
	assertFalse(isValidNumber);
	}
}
