package com.bae.blackjack.tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.main.Blackjack;

public class TwistTest {

	static Blackjack blackjack;
	//ignore this class, the tests don't work
	
	@BeforeClass
	public static void setup() {
		blackjack = new Blackjack();
	}
	@Test 
	public void twistTest1() {
		assertEquals(1,blackjack.twist());
	}
	@Test 
	public void twistTest2() {
		assertEquals(2,blackjack.twist());
	}
	@Test 
	public void twistTest3() {
		assertEquals(3,blackjack.twist());
	}
	@Test 
	public void twistTest4() {
		assertEquals(4,blackjack.twist());
	}
	@Test 
	public void twistTest5() {
		assertEquals(5,blackjack.twist());
	}
	@Test 
	public void twistTest6() {
		assertEquals(6,blackjack.twist());
	}
	@Test 
	public void twistTest7() {
		assertEquals(7,blackjack.twist());
	}
	@Test 
	public void twistTest8() {
		assertEquals(8,blackjack.twist());
	}
	@Test 
	public void twistTest9() {
		assertEquals(9,blackjack.twist());
	}
	@Test 
	public void twistTest10() {
		assertEquals(10,blackjack.twist());
	}
	@Test 
	public void twistTest11() {
		assertEquals(11,blackjack.twist());
	}
}
