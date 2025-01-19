package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		// Immtialize driver using thisdriver as reference 
		
		this.driver=driver;
				
		// USe pagefactory and store [driver and this] parameter in it
				
		PageFactory.initElements(driver, this);
		
			
	}

	@FindBy(xpath = "//a[@href='/web/index.php/time/viewTimeModule']")
	private WebElement timeLink;
	
	@FindBy(xpath = "//span[.='Project Info ']")
	private WebElement projectinfo;
	
	@FindBy(xpath = "//a[.='Customers']")
	private WebElement customerclick;
	
	@FindBy(xpath = "(//*[.=' Add '])[1]")
	private WebElement addcusto;

	
	
	public WebElement getTimeLink() {
		return timeLink;
	}


	public WebElement getProjectinfo() {
		return projectinfo;
	}


	public WebElement getCustomerclick() {
		return customerclick;
	}


	public WebElement getAddcusto() {
		return addcusto;
	}


	public void Time() {
		
		timeLink.click();
		
		projectinfo.click();
		
		customerclick.click();
		
		addcusto.click();
		
		
	}
	

}