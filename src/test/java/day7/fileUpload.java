package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		// 1) Single file upload. file name: - Test1.txt
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\JAVA CORE\\New folder\\Text1.txt");

		// validation
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text1.txt")) {
			System.out.println("File is successfully uploaded");
		} else {
			System.out.println("Upload failed");
		}*/

		// 2) Multiple files upload

		String file1 = "D:\\JAVA CORE\\New folder\\Text1.txt";
		String file2 = "D:\\JAVA CORE\\New folder\\Text2.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		
		//validation 1 - Number of files are uploaded
		int noOfFiesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

		if (noOfFiesUploaded == 2) {
			System.out.println("All files are successfully uploaded");
		} else {
			System.out.println("All files are not uploaded");
		}
		
		//validation 2 - file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text1.txt") 
			&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Text2.txt")){
			System.out.println("File names matching");
		}
		else {
			System.out.println("File names are not matching");
		}
	}
}