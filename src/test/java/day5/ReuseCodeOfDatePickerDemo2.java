package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReuseCodeOfDatePickerDemo2 {
	
//user-defined method-1: created for selecting the month and year for future
	static void selectFutureDate(WebDriver driver, String year, String month, String date) 
	{
		
		while(true) 
		{
			String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
			String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();    //actual Year
			
			if(currentMonth.equals(month) && currentYear.equals(year)) 
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();   //for future dates
			
		}
		//for selecting the date
      List <WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
//user-defined method-2: created for selecting the month and year for past
		static void selectPastDate(WebDriver driver, String year, String month, String date) 
		{
			
			while(true) 
			{
				String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
				String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();    //actual Year
				
				if(currentMonth.equals(month) && currentYear.equals(year)) 
				{
					break;
				}
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();     //for past dates
				
			}
			
			//for selecting the date
			List <WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			
			for(WebElement dt:alldates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
		}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method-1: using sendKeys() method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); 
		
		//Method-2: using date picker element
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //opens date picker
		
		//call the above created methods with parameter
		
		String month="August";
		String year="2025";
		String date="19";
		
		selectFutureDate(driver, year, month, date);  //select future date
		//selectPastDate(driver, year, month, date);   //select past date
		

	}

}
