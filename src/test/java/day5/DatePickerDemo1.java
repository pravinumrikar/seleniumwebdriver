package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker");
		driver.manage().window().maximize();

		// switch to frame
		driver.switchTo().frame(0);

		// Method-1: using sendKeys() method
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");

		// Method-2: using date picker element

		// for future date selection
		// String year="2025";
		// String month= "May";
		// String day="20";

		// for previous/past date selection
		String year = "2023";
		String month = "May";
		String date = "25";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // opens date picker

		// select month and year
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual
																													// month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual
																												// Year

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click(); //for future dates
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // for past
																										// dates

		}

		// Select the date now
		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

}
