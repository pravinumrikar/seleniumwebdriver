package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorDemo1 {
	
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://orangehrm.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("EmailHomePage")).sendKeys("pravinumrikar@gmail.com");
			driver.findElement(By.name("action_request")).click();
			driver.findElement(By.id("Form_getForm_Name")).sendKeys("Pravin Umrikar");
			driver.findElement(By.className("email text")).sendKeys("pravinumrikar@gmail.com");
			driver.findElement(By.tagName("email text")).sendKeys("8446999111");

	}

}
