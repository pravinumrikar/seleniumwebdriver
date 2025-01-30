package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	//1) Normal Alert with OK button:-
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		//method_1-
		//driver.switchTo().alert().accept();
		//method_2- Alert is special type
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
	//2) confirmation alert- OK and cancel button:-
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); //close alert window using OK button
		driver.switchTo().alert().dismiss();  //close alert window using cancel button*/
		
	//3) Prompt alert window - input box:-
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
		Alert myPromptAlert=driver.switchTo().alert();
		myPromptAlert.sendKeys("Welcome");
		myPromptAlert.accept();

	}

}
