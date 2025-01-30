package day7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize(); //method for maximize the page
		Thread.sleep(4000);
		driver.manage().window().minimize(); //method for minimize the page
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='60%'"); //set zoom level 60%
		Thread.sleep(4000);
		js.executeScript("document.body.style.zoom='110%'"); //set zoom level 110%
		Thread.sleep(4000);
	}

}
