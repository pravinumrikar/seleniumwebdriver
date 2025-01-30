package day18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//page object classes -- without using PageFactory

public class loginTest {

	WebDriver driver;

	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test
	void testLogin() {
		LoginPage lp = new LoginPage(driver);
		
		// whatever driver we already created in the page object we need to pass this
		// driver as parameter for invoking the page object constructor. the
		// constructor will be invoked the driver will be initiated in the page object model
		// whatever driver we created here in this class will not work for page object
		// because both are two different classes so we need to invoke page object
		// driver and we have passed driver as parameter in the object here for invoking
		// the constructor of page object

		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
