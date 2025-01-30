package day8;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// 1) full page screenshot: - (calling from TakesScreenshot interface)
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage2.png");
		sourcefile.renameTo(targetfile); //copy source file to target file
		*/

		//2) capture the screenshot of specific area or section of the page- (calling from WebElement interface)
		/*WebElement featureproducts = driver.findElement(By.xpath("//div[@id='HTML1']//div[@class='widget-content']"));
		
		File sourcefile = featureproducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\featureproducts.png");
		sourcefile.renameTo(targetfile); 
		*/
		
		//3) capture the screenshot of specific WebElement
		WebElement logo = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile);
		
		driver.quit();
	}
}
