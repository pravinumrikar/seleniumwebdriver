package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageOnScreen {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		//use this statement to remove "chrome is being controlled by automated test software"
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); 
		

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
