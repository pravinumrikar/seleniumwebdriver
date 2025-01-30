package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1) scroll down page by pixel number
		/*js.executeScript("window.scrollBy(0,800);", ""); //we are not passing any
		WebElement or arguments here so it should be empty
		System.out.println(js.executeScript("return window.pageYOffset(0, 1550);"));  //800-->(pixel)*/

		// 2) scroll page till element is visible
		/*
		WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Country:']"));
		js.executeScript("arguments[0].scrollIntoView();", ele); 
		System.out.println(js.executeScript("return window.pageYOffset;"));  //911.2000122070312-->(pixel) 
		//use pageXOffset method here for scrolling horizontally
		*/
		

		// 3) scroll down page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //use scrollWidth here for scrolling horizontally
		System.out.println(js.executeScript("return window.pageYOffset;")); //1595.199951171875-->(pixel)
		
		Thread.sleep(3000);
		
		//4) scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); 
		System.out.println(js.executeScript("return window.pageYOffset;")); //0-->(pixel)
	}

}
