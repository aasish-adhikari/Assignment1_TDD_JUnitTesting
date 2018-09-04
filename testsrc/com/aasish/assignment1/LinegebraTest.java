package com.aasish.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinegebraTest {
	
	private Linegebra classUnderTest;

	@Before
	public void setUp() throws Exception {
		
		classUnderTest = new Linegebra();
	}

	@Test
	public void testDistance() {
		long result = (long) Math.sqrt(Math.pow((8-3), 2)+ Math.pow((10-4), 2));
		assertEquals(result, classUnderTest.distance(3, 4, 8, 10));
		
		result = (long) Math.sqrt(Math.pow(5-(-2), 2)+ Math.pow(((-6)-(-8)), 2));
		assertEquals(result, classUnderTest.distance(-2, -8, 5, -6));
		
		result = (long) Math.sqrt((0-0)*(0-0)+(0-0)*(0-0));
		assertEquals(result, classUnderTest.distance(0, 0, 0, 0));
		
		
	}

	@Test
	public void testEquation() {

		String result = "6x - 5y = -2";
		assertEquals(result, classUnderTest.equation(3, 4, 8, 10));
		
		result = "2x - 7y = 52";
		assertEquals(result, classUnderTest.equation(-2, -8, 5, -6));
		
		result = null ;
		assertEquals(result, classUnderTest.equation(0, 0, 0, 0));
		
	}

	@Test
	public void testGradient() {
		
		//let java find the gradient
		long result = (10-4)/(8-3);
		assertEquals(result, classUnderTest.gradient(3, 4, 8, 10));
		
		result = ((-6) -(-8))/(5-(-2));
		assertEquals(result, classUnderTest.gradient(-2, -8, 5, -6));
		
	}

}
