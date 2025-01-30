package day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	SoftAssert sa; // this is declared because we can use this reference variable in different
					// methods in the same class

	// Problem: if hard assertion are failed then first two statement will execute
	// and rest of the other statement will not execute.
	@Test
	void test_hardassertions() {

		System.out.println("testNG hardassertions");
		System.out.println("testNG hardassertions");

		Assert.assertEquals(1, 2); // Use Assert class to call the method. These static static methods

		System.out.println("testNG hardassertions");
		System.out.println("testNG hardassertions");

		// Solution_1: Put the Assertion statement in the last line of the code (Still
		// not recommended)
		/*
		 * System.out.println("testNG"); System.out.println("testNG");
		 * System.out.println("testNG"); System.out.println("testNG");
		 * 
		 * Assert.assertEquals(1, 2);
		 */
	}

	// Solution_2:
	@Test
	void test_softassertions() {

		System.out.println("testNG softassertions");
		System.out.println("testNG softassertions");

		sa = new SoftAssert(); // Create object of the SoftAssert class and call the method with object
								// reference variable. These non-static static methods
		// Or

		// SoftAssert sa = new SoftAssert();

		// Note: if we declare object in the method then
		// we cannot call other methods in the class with this object because we cannot
		// use any local object or variable to call other methods outside object created
		// method in the same class
		// because object created method is limited to itself only

		sa.assertEquals(1, 2);

		System.out.println("testNG softassertions");
		System.out.println("testNG softassertions");

		sa.assertAll(); // Mandatory statement when we use soft assertions
	}

}
