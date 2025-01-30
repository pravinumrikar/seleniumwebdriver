package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			//Explicit wait
			WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); //specific to element
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			WebElement textUsername= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//input[@placeholder='Username']\"")));
			textUsername.sendKeys("Admin");
			
			WebElement textUserpassword= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//input[@placeholder='Password']\"")));
			textUserpassword.sendKeys("Admin1234");
			
		//	WebElement loginbtn= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='submit']")));
			//loginbtn.click();

	}

}
