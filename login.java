package StepsDif;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddCustomersPage;
import pages.HomePage;
import pages.ProjectPage;
import pages.loginPage;

public class login {
	
	public WebDriver driver;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   Thread.sleep(3000);
	}

	@When("User opens URL")
	public void user_opens_url() {
		System.out.println("url ");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String Username , String Password) {
		loginPage loginPage = new loginPage(driver);
		loginPage.enterName(Username);
		loginPage.enterPassword(Password);
	
	}

	@When("Click on Loginbutton")
	public void click_on_login_button() {
		loginPage loginPage = new loginPage(driver);
		loginPage.ClickLogin();
	}

	@Then("Page Title should be")
	public void page_title_should_be() {
		System.out.println("page title ");
	}


	
	
}
