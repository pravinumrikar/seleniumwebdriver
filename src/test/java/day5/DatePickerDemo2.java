package day5;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	static Month convertMonth(String month) {

		HashMap<String, Month> monthMap = new HashMap<String, Month>();

		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);

		Month vmonth = monthMap.get(month);

		if (vmonth == null) {

			System.out.println("Invalid Month...");

		}

		return vmonth;

	}

	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) {

		// select year:-
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectyear = new Select(yearDropDown);
		selectyear.selectByVisibleText(requiredYear);

		// Select month:-
		// Logic of month selection: -
		// expected_month<current_month --> past_month
		// expected_month>current_month --> future_month
		while (true) {
			String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			// convert requiredMonth and displayMonth into Month objects

			Month expectedMonth = convertMonth(requiredMonth);
			Month currentMonth = convertMonth(displayMonth);

			// compare
			int result = expectedMonth.compareTo(currentMonth);

			// if result is 0 --> months are equal
			// if result is > 0 --> future month
			// if result is < 0 --> past month

			if (result < 0) {
				// past month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else if (result > 0) {
				// future month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else {
				break;
			}
		}

		// select date:-
		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldates) {
			if (dt.getText().equals(requiredDate)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// input DOB
		String requiredYear = "2027";
		String requiredMonth = "June";
		String requiredDate = "29";

		driver.switchTo().frame("frame-one796456169"); // if id is given when we inspect the iframe we can use id and no
														// need to use locator here
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

		selectDate(driver, requiredYear, requiredMonth, requiredDate);
	}
}
