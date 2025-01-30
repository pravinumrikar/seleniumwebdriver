package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) {
		
		/*
		 1) Absolute Xpath (Full Xpath)
		    --> Use only Tag/Node
		    --> Not preferred because, traverse with each node till it finds element
		    --> Start with single Slash (/)
		    --> Ex- /html/body/div/div/div/section[1]/div[2]/div/div/div/div/div/form/div/input
		
		 2) Relative Xpath (Partial Xpath)
		    --> Works with only attribute 
		    --> Always preferred because, directly jump and find element by using attribute
		    --> Start with double Slash (//)
		    --> Ex- //*[@id="Form_submitForm_action_request"]
		    
		    Syntax->
		    a) //tagname[@attribute='value']
		    b)//*[@attribute='value']
		*/
		
		WebDriver driver=new ChromeDriver();
		
		//ctr shift o --> for import the packages
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		// 1) Xpath with single attribute-->
		//-------------------------------
		//driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("parvinkumar@gmail.com");
		
		// 2) Xpath with multiple attribute-->
		//---------------------------------
		//driver.findElement(By.xpath("//input[@type='submit'][@name='action_request']")).click();
		
		// 3) Xpath with 'and' operator-->
		//-----------------------------
		//driver.findElement(By.xpath("//input[@type='submit'and @name='action_request']")).click();
		
		// 4) Xpath with 'or' operator--> sometimes we can use for dynamic attributes
		// --------------------------------------------------------------------------
		//driver.findElement(By.xpath("//input[@type='submit'or @name='action_ppprequest']")).click();
		
		// 5) Xpath with inner text and link text (without attribute- only text)- text() method--> 
		// ------------------------------------------------------------------------------------
		/*boolean displaystatus=driver.findElement(By.xpath("//*[text()='Learn More']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value=driver.findElement(By.xpath("//*[text()='Learn More']")).getText();
		System.out.println(value);*/
		
		
		//Handling dynamic attribute-->
		
		// 6) Xpath with contains() method--> for dynamic elements--> instead of the contains method we can use dot (.) also
		// -------------------------------------------------------
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter your email')]")).sendKeys("pravinkumar@gmail.com");
		
		// 7) Xpath with start-with() method--> for dynamic elements
	    // ---------------------------------------------------------
		//driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Enter your email')]")).sendKeys("pravinkumar@gmail.com");
		
		// Difference between contains() and starts-with() method--> 
		//driver.findElement(By.xpath("//input[starts-with(@name, 'EmailHome')]")).sendKeys("pravinkumar@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@name, 'on_request')]")).click();
		
		// 8) Chained Xpath-->
		// ----------------
		driver.findElement(By.xpath("//div[@class='middleColumn']/input")).sendKeys("pravinkumar@gmail.com");
		
		
		//Difference between cssSelectors and Xpath-->
		//ccs path has top-down approach
		//xpath has down-top approach
		
		
		
	}

}
