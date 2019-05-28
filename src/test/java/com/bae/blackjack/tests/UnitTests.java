package com.bae.blackjack.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bae.blackjack.main.Blackjack;

public class UnitTests {

	static Blackjack blackjack;
	
	@BeforeClass
	public static void setup() {
		blackjack = new Blackjack();
	}
	@Test
	public void test1() {
		assertEquals(-1,blackjack.play(0,0));
	}
	@Test 
	public void test2() {
		assertEquals(-1,blackjack.play(0, 21));
	}
	@Test
	public void test3() {
		assertEquals(-1,blackjack.play(21, 0));
	}
	@Test 
	public void test4() {
		assertEquals(10,blackjack.play(10, 10));
	}
	@Test 
	public void test5() {
		assertEquals(21,blackjack.play(30, 21));
	}
	@Test 
	public void test6() {
		assertEquals(0,blackjack.play(30, 22));
	}
	@Test 
	public void test7() {
		assertEquals(-1,blackjack.play(31, 22));
	}
	@Ignore
	@Test
	public void test8() {
		assertEquals(10,blackjack.play(25,10));
	}
	@Test 
	public void test9() {
		assertEquals(10,blackjack.play(10, 25));
	}
	@Test
	public void test10() {
		assertEquals(0,blackjack.play(25, 25));
	}
	@Test 
	public void test11() {
		assertEquals(21,blackjack.play(10, 21));
	}
	@Test 
	public void test12() {
		assertEquals(21,blackjack.play(21, 10));
	}
	@Test 
	public void test13() {
		assertEquals(-1,blackjack.play(32, 32));
	}
	@Test 
	public void test14() {
		assertEquals(-1,blackjack.play(1,1));
	}
	
	@Test
	public void test15() {
		assertEquals(-1,blackjack.play(10,32));
	}
	@Test 
	public void test16() {
		assertEquals(-1,blackjack.play(10, 1));
	}
	@Test
	public void test17() {
		assertEquals(-1,blackjack.play(31, 10));
	}
	@Ignore
	@Test 
	public void test18() {
		assertEquals(10,blackjack.play(30, 10));
	}
	@Test 
	public void test19() {
		assertEquals(-1,blackjack.play(1, 10));
	}
	@Test 
	public void test20() {
		assertEquals(10,blackjack.play(4, 10));
	}
//	@Test 
//	public void twistTest() {
//		int a = blackjack.twist();
//		assertEquals(10+a,blackjack.play(25, 10+a));
//	}
	
	@Test 
	public void twistTest() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i <100;i++) {
			myList.add(blackjack.twist());
		}
		for (int a :myList) {
			if (a>0 && a<12) {
				continue;
			} else {
				fail("Expected value between 1 and 11 but got" +a);
			}
		}
		assertTrue(true);
	}

	
	

}
