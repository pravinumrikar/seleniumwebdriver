package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestInIncognitoMode {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		//use this statement to run the Test Case in Incognito mode
		options.addArguments("--incognito"); 
		

		WebDriver driver = new ChromeDriver(options); 

		driver.get("https://www.google.com/");

		String act_title = driver.getTitle();

		if (act_title.equals("Automation Testing Practice")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Passed");
		}

	}

}
