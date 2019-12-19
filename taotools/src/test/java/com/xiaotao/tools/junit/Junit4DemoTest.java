package com.xiaotao.tools.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit4DemoTest {

	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Before
	public void testBefor() {
		
		System.out.println("Before");
	}
	
	@Test
	public void testAdd() {
		assertEquals(6, new Junit4Demo().add(2, 4));
	}

	@Test
	public void testSubtract() {
		assertEquals(20, new Junit4Demo().subtract(30, 10));
	}

}
