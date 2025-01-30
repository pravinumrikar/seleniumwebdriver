package day13;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	//Before method and after method annotations
	
	/* TC-1
	 * 1) Login -- @BeforeMethod
	 * 2) Search -- @Test
	 * 3) Logout -- @AfterMethod`
	 * 4) Login -- 
	 * 5) Search -- @Test
	 * 6) Logout -- 
	 */
	@BeforeMethod
	void login() {

		System.out.println("This is login...");
	}

	@Test(priority=1)
	void search() {

		System.out.println("This is search...");
	}

	@Test(priority=2)
	void advanceSearch() {

		System.out.println("This is advance search...");
	}

	@AfterMethod
	void logout() {

		System.out.println("This is logout...");
	}

}
