package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//page object classes -- without using PageFactory

public class LoginPage {

	WebDriver driver;

	// constructor-initates the drivers
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators

	By text_username_loc = By.xpath("//input[@placeholder='Username']");
	By text_password_loc = By.xpath("//input[@placeholder='Password']");
	By text_loginbtn_loc = By.xpath("//button[normalize-space()='Login']");

	// Action methods

	public void setUserName(String user) {

		driver.findElement(text_username_loc).sendKeys(user);
	}

	public void setPassword(String pwd) {

		driver.findElement(text_password_loc).sendKeys(pwd);
	}

	public void clickLogin() {

		driver.findElement(text_loginbtn_loc).click();
	}
}
