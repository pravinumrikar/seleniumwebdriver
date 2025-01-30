package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sataicTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//1) Find total number of rows in a table:-
		
		//Aproach1:- If page contains multiple tables then use this approach
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); 
		/*//System.out.println("Number of rows:"+rows);
		
		//Aproach2:- If page contains single table then use this approach
		int rows= driver.findElements(By.tagName("tr")).size(); 
		System.out.println("Number of rows:"+rows);
		
	//2) Find total number of columns in a table:-
		
		//Aproach1:- If page contains single table then use this approach
		//int columns= driver.findElements(By.tagName("th")).size(); 
		//System.out.println("Number of rows:"+columns);
		
		//Aproach2:- If page contains multiple tables then use this approach
		int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); 
		System.out.println("Number of rows:"+columns);
		
		
	//3) Read data from specific row and column (Ex. 5th row and 1st colmun)
		String  bookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); 
		System.out.println(bookName);
		
		String  authorName= driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText(); 
		System.out.println(bookName);
		
	//4) Read the data from all rows and columns
		
		System.out.println("bookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price"); //printing header part
		
		for(int r = 2; r<=rows; r++ ) {
			for(int c = 1; c<=columns; c++) {
				String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText(); 
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		*/
		
		/*
	//5) Print book names whose author is Mukesh
		for(int r = 2; r<=rows; r++ ) 
		{
		String  authorName1= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText(); 
		
		if(authorName1.equals("Mukesh")) {
			String  bookName1= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(bookName1+"\t"+authorName1);
		}
		}*/
		
	//5) Find total price of all the books
		
		int total=0;
		for(int r = 2; r<=rows; r++ ) 
		{
		String  price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText(); 
		total=total+Integer.parseInt(price); //convert String to integer
		
		}
		System.out.println("Total price of the book:"+total ); //7100
	}

}
