package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		Actions act = new Actions(driver);

		// Mouse Hover
		// act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		// OR
		act.moveToElement(desktop).moveToElement(mac).click().perform(); 
		//OR
		act.moveToElement(desktop).moveToElement(mac).perform(); 
		//OR
		act.moveToElement(desktop).moveToElement(mac).build().perform(); //preferable
	}

}
