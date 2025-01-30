package day1;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
	//ChromeDriver driver=new ChromeDriver();
	
		//WebDriver driver=new ChromeDriver(); //Type (Up) Casting
		WebDriver driver=new EdgeDriver();
		driver.get("https://orangehrm.com/");
		
		String title= driver.getTitle();
		if(title.equals("Human Resources Management Software | OrangeHRM"))
		{
			System.out.println("Test passed");
		}
		else 
		{
			System.out.println("Test failed");
		}

		
		driver.close();
		driver.quit();
			
	}

}
