package day14;

import org.testng.annotations.Test;

public class paymentTest {

	@Test(priority = 1, groups= {"sanity", "regression", "functional"})
	void paymentInRupees() {
		System.out.println("Payment in Rupees");
	}

	@Test(priority = 2, groups= {"sanity", "regression", "functional"})
	void paymentInDoller() {
		System.out.println("Payment in Doller");
	}

}
