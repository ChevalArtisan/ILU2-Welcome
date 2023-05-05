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
		assertEquals(Welcome.welcome("Charles,Georges,Valery,francois,jacques,nicolas,francois,emmanuel"), "Hello, Charles, Georges, Valery, Francois, Jacques, Nicolas, Francois, Emmanuel" );

	}
	@Test
	void testHelloBobAndMinMaj() {
		assertEquals(Welcome.welcome("bob,SOPHIE"), "Hello, Bob. AND HELLO SOPHIE !");
		assertEquals(Welcome.welcome("ERNEST,bob,SOPHIE"), "Hello, Bob. AND HELLO ERNEST, SOPHIE !");
		assertEquals(Welcome.welcome("hoho,HUHU,hihi"), "Hello, Hoho, Hihi. AND HELLO HUHU !");

	}

}
