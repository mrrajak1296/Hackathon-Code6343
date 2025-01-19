package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement name ;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css = "[type='submit']")
	WebElement login;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterName( String Username) {
		name.sendKeys(Username);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void ClickLogin() {
		login.click();
	}
	
	

//	By name = By.name("username");
//	By password = By.name("password");
//	By login = By.cssSelector("[type=\"submit\"]");
//	
//	
//	public loginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void enterName(String Username) {
//		driver.findElement(name).sendKeys(Username);
//		 
//	}
//	
//	public void enterPassword(String Password) {
//		driver.findElement(password).sendKeys(Password);
//		
//		 
//	}
//	
//	public void Clicklogin() {
//		driver.findElement(login).click();
//		 
//	}
//	
}
