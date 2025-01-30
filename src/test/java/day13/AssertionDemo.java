package day13;

import org.testng.Assert;
import org.testng.annotations.*
;

public class AssertionDemo {
	@Test
	void testTitle() {

		String exp_title = "Opencart";
		String act_title = "Openshop";

		//1) Use Java only for validation: - (Not recommended generally)
		
		/*if (exp_title.equals(act_title)) {

			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}*/
		
		//2) Use both Java and Assert class methods for validation: - 
		
		/*if (exp_title.equals(act_title)) {

			System.out.println("test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("test failed");
			Assert.assertTrue(false);
		}*/
		
		//3) Use only Assert class methods for validation: - 
		
		Assert.assertEquals(exp_title, act_title);
	}

}
