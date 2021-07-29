package com.lti.demo3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void addtest1() {
		int res=new App().add(10, 20);
		assertEquals(30, res);
	}
	
	@Test
	public void addtest2() {
		int res=new App().add(30, 20);
		assertEquals(50, res);
	}

}
