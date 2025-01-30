package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
	
		//Authenticator pop-up OR Digest Authentication:- 
		
		// Syntax:- https://username:password@the-internet.herokuapp.com/digest_auth
		// Example:- https://admin:admin@the-internet.herokuapp.com/digest_auth
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");

	}

}
