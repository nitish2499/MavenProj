package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest1() {
		int res=new Calculator().add(10, 20);
		assertEquals(30, res);
	}
	
	@Test
	public void addtest2() {
		int res=new Calculator().add(30, 20);
		assertEquals(50, res);
	}

}
