package day13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	/* TC-2
	 * 1) Login -- @BeforeClass
	 * 2) Search -- @Test
	 * 3) Search -- @Test
	 * 4) Logout -- @AfterClass
	 */
	
	//Note: - NO NEED OF @AfterClass METHOD WHEN WE USE @BeforeClass
	
	@BeforeClass
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

	@AfterClass
	void logout() {

		System.out.println("This is logout...");
	}
}
