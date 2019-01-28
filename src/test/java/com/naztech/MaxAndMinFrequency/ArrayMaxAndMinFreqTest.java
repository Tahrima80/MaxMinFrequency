package com.naztech.MaxAndMinFrequency;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMaxAndMinFreqTest {

	@Test
	public void testMaxFrequency() {
		assertEquals(4, ArrayMaxAndMinFreq.maxFrequency());
	}

	@Test
	public void testMinFrequency() {
		assertEquals(1, ArrayMaxAndMinFreq.minFrequency());
	}

}
