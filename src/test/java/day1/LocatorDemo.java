package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://orangehrm.com/");
		driver.manage().window().maximize();
		
		
		//1) id-->
//		driver.findElement(By.xpath("//*[@id='Form_submitForm_EmailHomePage']")).sendKeys("pravinumrikar@gmail.com");
//		driver.findElement(By.xpath("//*[@id='Form_submitForm_action_request']")).click();
		//driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("pravinumrikar@gmail.com");
		//driver.findElement(By.name("action_request")).click();
		
		//2) name-->
		//driver.findElement(By.name("EmailHomePage")).sendKeys("pravin");
		
		//3) linkText & 4) PartialLinkText-->
		//driver.findElement(By.linkText("Executive Profile")).click();
		//driver.findElement(By.partialLinkText("Profile")).click();
		
	    //5) classname-->	
	    // int sliders= driver.findElements(By.className("owl-item cloned")).size();
	    //System.out.println(sliders);
	
	    //6) Tagname-->
	    //int links=driver.findElements(By.tagName("a")).size();
	    //System.out.println(links);
		
//		driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("parvinkumar@gmail.com");
//		driver.findElement(By.xpath("//input [@type='submit'] [@name='action_request']")).click();
//      driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your email')]")).sendKeys("pravinkumar@gmail.com");
//		driver.findElement(By.xpath("//input[@type='submit'and @name='action_request']")).click();
//      driver.findElement(By.xpath("//input[@type='submit'or @name='action_ppprequest']")).click();
//      String value=driver.findElement(By.xpath("//*[text()='Revolutionize Your Human Resource Management Experience!']")).getText();
//		String value=driver.findElement(By.xpath("//*[text()='Learn More']")).getText();
		
	//driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Enter your')]")).sendKeys("pravinkumar@gmail.com");
		//driver.findElement(By.xpath("//input[ends-with(@placeholder, 'Enter your email')]")).sendKeys("pravinkumar@gmail.com");
		//driver.findElement(By.xpath("//input[@type='submit'or @name='action_ppprequest']")).click();
        //System.out.println(value);
	    driver.close();
	}

}
