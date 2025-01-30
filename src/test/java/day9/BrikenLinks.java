package day9;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrikenLinks { // Definition: Broken link does'nt have any source in the server

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		// Capture all links from the website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" + links.size());

		// number of broken links
		int noOfBrokenLinks = 0;

		// Step-1) Search links as href="https://xyz.com"
		for (WebElement linkElement : links) {
			String hrefattvalue = linkElement.getAttribute("href"); // need to convert into url format
			if (hrefattvalue == null || hrefattvalue.isEmpty()) {
				System.out.println("href attribute value is null or empty. So not possible to check");
				continue;
			}
			// Step-2) https://xyz.com --> server --> status code
			// Hit URL to the server
			try {
				@SuppressWarnings("deprecation")
				URL linkURL = new URL(hrefattvalue); // converted href value from string to URL format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // open connection to the server
				conn.connect(); // connect to server and sent request to the server

				// Step-3)
				// status code>=400 broken link
				// status code<400 Not a broken link
				// Get the response code
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattvalue + "====> Broken link");
					noOfBrokenLinks++;
				} else {
					System.out.println(hrefattvalue + "====> Not a broken link");
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Number of broken links: " + noOfBrokenLinks); // 42 broken links are there
	}
}
