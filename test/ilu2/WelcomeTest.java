package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest {

	@Test
	void testHelloBob() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}

}
