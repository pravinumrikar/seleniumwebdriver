package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		/* 1) Locating parent element-->
		-------------------------
		
		Syntax-
		 
		 //<knownXpath>/parent::* 
		 //<knownXpath>/parent::<elementName>
		 //<knownXpath>/..
		
		// 2) Locating child element-->
		------------------------
		Syntax-
		 
		 //<knownXpath>/child::* 
		 //<knownXpath>/child::<elementName>
		 //<knownXpath>/<elementName>
		
		// 3) Locating child element-->
		------------------------
		Syntax-
				  
		//<knownXpath>/* /<elementName>
		//<knownXpath>/child/<elementName>
		 
		// 4) Locating Grand children element-->
		-------------------------------------
		Syntax-
				  
		//<knownXpath>/* /<elementName>
		//<knownXpath>/child/<elementName>
		
		// 5) Locating ancestor of known element-->
		----------------------------------------
		Syntax-
				  
		//<knownXpath>/ancestor::<elementName>
		//<knownXpath>/ancestor::*
		
		// 6) Locating Descendant of known element-->
		------------------------------------------
		Syntax-
				  
		//<knownXpath>/descendant::<elementName>
		//<knownXpath>/descendant::*
		 
		 We can use // instead of descendant :: keyword to locate descendants.
		 
		 // 7) Locating following element-->
		------------------------------------------
		Syntax-
				  
		//<knownXpath>/following::<elementName>
		//<knownXpath>/following::*
		  
		// 8) Locating preceding element-->
		------------------------------------------
		Syntax-
				  
		//<knownXpath>/preceding::<elementName>
		//<knownXpath>/preceding::*
		 
		// 9) Locating following sibling element-->
		------------------------------------------
		Syntax-
				  
		//<knownXpath>/following-sibling::<elementName>
		//<knownXpath>/following-sibling::*
		  
		// 10) Locating preceding sibling element-->
		------------------------------------------
		Syntax-
				  
		//<knownXpath>/preceding-sibling::<elementName>
		//<knownXpath>/preceding-sibling::*
		
		// 11) Locating the Several Xpaths or Chain Xpath-->		 
        -----------------------------
		Syntax-	 
		
		Xpath1|Xpath2|XpathN
	
		*/

		
	}

}
