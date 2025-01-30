package day13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {// Below are static and hard assertions
					// assertEquals method
		Assert.assertEquals("xyz", "xyz"); // passed
		Assert.assertEquals(123, 345); // failed
		Assert.assertEquals("abc", 123); // failed
		Assert.assertEquals("123", "123"); // passed
		Assert.assertEquals(123, 123); // passed

		// assertNotEquals method
		Assert.assertNotEquals(123, 123); // failed
		Assert.assertEquals(123, 345); // passed

		// assertTrue method
		Assert.assertTrue(true); // passed
		Assert.assertTrue(false); // failed
		Assert.assertTrue(1 == 2); // failed
		Assert.assertTrue(1 == 1); // passed

		// assertFalse method
		Assert.assertFalse(1 == 2); // passed
		Assert.assertFalse(1 == 1); // failed

		// fail method
		Assert.fail(); // this method will fail test case intentionally if we want

	}

}
