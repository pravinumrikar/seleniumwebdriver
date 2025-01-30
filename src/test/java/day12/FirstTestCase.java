package day12;

import org.testng.annotations.Test;

/*
 * 1) Open web app
 * 2) Login
 * 3) Logout
 */

public class FirstTestCase {

	@Test(priority=1)
	void openapp() {
		
		System.out.println("Opening the application");
	}
	@Test(priority=2)
	void login() {
		
		System.out.println("Login application");
	}
	@Test(priority=3)
	void logout() {
		
		System.out.println("Logout application");
	}

}
