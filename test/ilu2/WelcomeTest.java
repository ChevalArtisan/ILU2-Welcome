package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest {

	@Test
	void testHelloBob() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	@Test
	void testHelloMyFriend() {
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome("                                   "), "Hello, my friend");
		assertEquals(Welcome.welcome(null), "Hello, my friend");


	}
	
	@Test
	void testHELLOBOB() {
		assertEquals(Welcome.welcome("BOB"), "HELLO, BOB");
	}
	
	@Test 
	void testHelloBobAndCo(){
		assertEquals(Welcome.welcome("bob,bobi"), "Hello, Bob, Bobi");
	}

}
