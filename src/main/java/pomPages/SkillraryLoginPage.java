package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath="//a[.=' GEARS ']")
	private WebElement Gearsbtn;
	
	@FindBy(xpath="(//a[.=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(xpath="//a[.='Contact Us']")
	private WebElement contactus;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement searchbtn;
	
	public WebElement getContactus() {
		return contactus;
	}
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		Gearsbtn.click();
	}
	
	public void skillraryDemoApp() {
		demoapp.click();
	}
	
	public void Contactusbtn() {
		contactus.click(); 
	}
	
	public void searchTextBox(String sub) {
		searchtb.sendKeys(sub);
	}
	
	public void searchButton() {
		searchbtn.click();
	}
}
