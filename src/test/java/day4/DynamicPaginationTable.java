package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login steps
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']")); 
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']")); 
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
		
		//close window if it is available
		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed() ) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		//clicking customer
		driver.findElement(By.xpath("//a[@class='parent']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//Showing 1 to 10 of 4412 (442 Pages)
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		//repeating/switching from one page to next page
		for(int p=1; p<=5; p++) 
		{
			if(p>1) 
			{
				WebElement active_page= driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();	
				Thread.sleep(4000);
			}
		}
		
		//Reading the data from table
		int noOfRows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1; r<noOfRows; r++) {
			String customerName= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
			String emailAddress= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
			String status= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
			
			System.out.println(customerName+'\t'+emailAddress+'\t'+status);
			
		}

	}

}
