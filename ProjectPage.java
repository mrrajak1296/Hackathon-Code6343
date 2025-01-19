package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
	
	WebDriver driver;
	
	public ProjectPage(WebDriver driver) {
		
		// Immtialize driver using thisdriver as reference 
		
		this.driver=driver;
				
		// USe pagefactory and store [driver and this] parameter in it
				
		PageFactory.initElements(driver, this);
	}
		

	@FindBy(xpath = "//span[.='Project Info ']")
	private WebElement projectinfo;
	
	
	@FindBy(xpath = "//a[.='Projects']")
	private WebElement projectclick;
	
	@FindBy(xpath = "(//*[.=' Add '])[1]")
	private WebElement addcusto;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement ProjName;
	
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement custoName;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	private WebElement projAdmin;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveButton;

	public WebElement getProjectinfo() {
		return projectinfo;
	}

	public WebElement getProjectclick() {
		return projectclick;
	}

	public WebElement getAddcusto() {
		return addcusto;
	}

	public WebElement getProjName() {
		return ProjName;
	}

	public WebElement getCustoName() {
		return custoName;
	}

	public WebElement getProjAdmin() {
		return projAdmin;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	public void project() {
		
		projectinfo.click();
		
		projectclick.click();
		
		addcusto.sendKeys("Vishal");
		
		ProjName.sendKeys("Cluster");
		
		custoName.sendKeys("Vis");
		
		projAdmin.sendKeys("Vandana");
		
		saveButton.click();
		
		
		
	}
	
	
	
}
	