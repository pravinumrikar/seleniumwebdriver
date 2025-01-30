package day18;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//page object classes -- using PageFactory

public class LoginPage2 {

	WebDriver driver;

	// constructor-initates the drivers
	/*
	 * LoginPage2(WebDriver driver) { 
	 * this.driver = driver; 
	 * }
	 */

	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);  //Mandatory statement
	}

	// Locators
	/*
	 * By text_username_loc = By.xpath("//input[@placeholder='Username']"); 
	 * By text_password_loc = By.xpath("//input[@placeholder='Password']"); 
	 * By text_loginbtn_loc = By.xpath("//button[normalize-space()='Login']");
	 */
	
	//@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	//OR
	@FindBy(how=How.XPATH, using = "//input[@placeholder='Username']")WebElement txt_username;
	
	//@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	//OR
	@FindBy(how=How.XPATH, using = "//input[@placeholder='Password']")WebElement txt_password;
	
	//@FindBy(xpath="//button[normalize-space()='Login']") WebElement txt_loginbtn;
	//OR
	@FindBy(how=How.XPATH, using = "//button[normalize-space()='Login']")WebElement txt_loginbtn;

	
	// Action methods
	/*
	 * public void setUserName(String user) {
	 * driver.findElement(text_username_loc).sendKeys(user); }
	 * 
	 * public void setPassword(String pwd) {
	 * driver.findElement(text_password_loc).sendKeys(pwd); }
	 * 
	 * public void clickLogin() {
	 * driver.findElement(text_loginbtn_loc).click(); }
	 */
	
	public void setPassword(String user) {
		 
		txt_username.sendKeys(user); 
	}
	
	public void setUserName(String pwd) {
		 
		txt_password.sendKeys(pwd); 
	}
	
	public void clickLogin() {
		 
		txt_loginbtn.click(); 
	}
	
	@FindBy(tagName="a")     //to find out all links present in the page
	List<WebElement> links;

}
