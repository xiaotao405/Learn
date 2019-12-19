package com.xiaotao.tools.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit4Demo2Test {

	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("BeforeClass");
	}

	@Before
	public void testBefor() {

		System.out.println("Before");
	}

	@Test
	public void testDivideNormal() {
		assertEquals(2, new Junit4Demo2().divide(4, 2));
	}

	@Test
	public void testDivideException() {
		assertNotEquals(2, new Junit4Demo2().divide(4, 4));
	}

	@Test
	public void testMutilNormal() {
		assertEquals(6, new Junit4Demo2().multi(2, 3));
	}

}
