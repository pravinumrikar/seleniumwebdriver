package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicitWait //default time is zero
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);	//pause the execution
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				
		//driver.close();		
		/*
		 * There are two exception we are getting here-->
		 * 1) no such element--> Element is not present on the page. Synchronization
		 * 2) Unable to locate element--> Locator is incorrect
		 * 
		 * 1) If time is not sufficient then you will get exception
		 * 2) It will wait for maximum timeout. This will reduce the performance script
		 * 3) Multiple times
		 */
		
	}

}
