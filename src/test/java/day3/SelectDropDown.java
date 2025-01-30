package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle= driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//Select option from the drop-down-three methods are there:-
		
		//drpCountry.selectByVisibleText("India");
		//drpCountry.selectByValue("india");
		//drpCountry.selectByIndex(9);
		
		//Captures the options from drop-down:-
		
		List<WebElement> options= drpCountry.getOptions();
		System.out.println("Number of options in a drop down:" +options.size());
		
		//Printing the options:-
		/*for (int i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}*/
		
		
		//enhanced for loop for printing the options:-
		for(WebElement op:options) {
			System.out.println(op.getText());
		}

	}

}
