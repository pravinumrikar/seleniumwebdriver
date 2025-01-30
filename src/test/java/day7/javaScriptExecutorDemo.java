package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();        // Type Casting approach (Upcasting)
		//ChromeDriver driver = new ChromeDriver();   // direct approach
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into inputbox - alternate of sendKeys() method
		JavascriptExecutor js=(JavascriptExecutor)driver;   // Type Casting approach
		//JavascriptExecutor js=driver;                     // direct approach
		js.executeScript("arguments[0].setAttribute('value','Ram')", inputbox);
		
		//clicking on element - alternate of click() method
		//selecting radio button with JavascriptExecutor
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn) ;
		

	}

}
