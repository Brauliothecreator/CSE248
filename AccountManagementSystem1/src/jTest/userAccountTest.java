package jTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import accounts.AccountBag;
import accounts.UserAccountFactory;

class userAccountTest {

	@Test
	void lowerCaseTest() {
		UserAccountFactory u = new UserAccountFactory();
		String password = "cjhkdjhdi#H1";
		
		
		
		assertTrue(u.checkPassword(password));
		
	
	}

}
