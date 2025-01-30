package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();      //ctr+sft+o for required packages
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	//1) Select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
	//2) select all the checkboxes
		//Method_1:-
		List <WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for (int i=0; i<checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
			
		}
		//Method_2:-
		for(WebElement checkbox:checkboxes) 
		{
			checkbox.click();
		}*/
		
	//3) select last three checkboxes with the help of simple formula
		//formula:- total no of checkboxes - how many checkboxes want to select = starting index
		//7-3=4 (starting index)
		
		/*for(int i=4;i<checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
		}*/
		
	//4) select first three checkboxes 
		/*for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
		}*/
	//5) unselect the checkboxes if they are selected
		for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0; i<checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected())
			checkboxes.get(i).click();
		}
		
	}

}
