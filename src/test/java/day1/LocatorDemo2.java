package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//cssSelector
		//Tag & id --> Tag#id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("pravinkumar824@gmail.com");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("Mydream@8400");
		
		
		//Tag & Class --> Tag.class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("pravinkumar824@gmail.com");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("pravinkumar824@gmail.com");
		
		//Tag & Attribute --> Tag[attribute=value]
		//driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("pravinkumar824@gmail.com");
		//driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Mydream@8400");
		
		////Tag, class & Attribute --> Tag.class[attribute=value]
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("pravinkumar824@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Mydream@8400");
	}

}
