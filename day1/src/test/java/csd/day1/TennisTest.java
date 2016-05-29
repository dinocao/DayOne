package csd.day1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TennisTest {

	@Test
	public void test() {
		assertEquals("Love All", Tennis.getState(0, 0));
		assertEquals("Fifteen All", Tennis.getState(1, 1));
		assertEquals("Thirty All", Tennis.getState(2, 2));
		assertEquals("Deuce", Tennis.getState(3, 3));
		assertEquals("Deuce", Tennis.getState(4, 4));
		assertEquals("Deuce", Tennis.getState(40, 40));
		assertEquals("Fifteen Love", Tennis.getState(1, 0));
		assertEquals("Thirty Love", Tennis.getState(2, 0));
		assertEquals("Thirty Fifteen", Tennis.getState(2, 1));
		assertEquals("Forty Fifteen", Tennis.getState(3, 1));
		assertEquals("Forty Thirty", Tennis.getState(3, 2));
		assertEquals("Fifteen Thirty", Tennis.getState(1, 2));
		assertEquals("Fifteen Forty", Tennis.getState(1, 3));
		assertEquals("Thirty Forty", Tennis.getState(2, 3));
		assertEquals("A Win", Tennis.getState(4, 1));
		assertEquals("B Win", Tennis.getState(1, 4));
		assertEquals("A Win", Tennis.getState(4, 2));
		assertEquals("B Win", Tennis.getState(2, 4));
		assertEquals("A Aduantage", Tennis.getState(4, 3));
		assertEquals("A Aduantage", Tennis.getState(3, 4));
		assertEquals("A Win", Tennis.getState(6, 2));
		assertEquals("B Win", Tennis.getState(3, 9));
		
		
		
	}

}
 