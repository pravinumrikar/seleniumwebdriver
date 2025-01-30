package day8;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtentionsAtRunTime {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		// use this below statements to use Chrome extensions
		File file = new File("D:\\JAVA CORE\\New folder\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		options.addExtensions(file);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://text-compare.com/");

	}
}
