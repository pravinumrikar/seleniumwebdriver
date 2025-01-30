package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod2 {
	@Test(priority = 1)
	void openapp() {
		Assert.assertTrue(true); // Passed
	}

	@Test(priority = 2, dependsOnMethods = { "openapp" })
	void login() {
		Assert.assertTrue(false); // Failed
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	void search() {
		Assert.assertTrue(true); // Skipped
	}

	@Test(priority = 4, dependsOnMethods = { "login", "search" })
	void advsearch() {
		Assert.assertTrue(true); // Skipped
	}

	@Test(priority = 5, dependsOnMethods = { "login" })
	void logout() {
		Assert.assertTrue(true); // Skipped
	}
}
