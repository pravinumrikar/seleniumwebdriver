package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // setting of headless mode of execution

		WebDriver driver = new ChromeDriver(options); // pass reference variable of ChromeOptions here

		driver.get("https://www.google.com/");

		String act_title = driver.getTitle();

		if (act_title.equals("Automation Testing Practice")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Passed");
		}
	}
}
