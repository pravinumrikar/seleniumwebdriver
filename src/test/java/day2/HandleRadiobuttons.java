package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadiobuttons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
		//male_rd.click();
		
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='female']"));
		female_rd.click();
		
		//System.out.println("select status of the male radio button"+male_rd.isSelected());
		System.out.println("select status of the female radio button"+female_rd.isSelected());
	}

}
