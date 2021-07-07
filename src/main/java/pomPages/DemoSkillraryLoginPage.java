package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryLoginPage {
	@FindBy(id="id=\"course\"")
	private WebElement coursebtn;
	
	@FindBy (xpath="//a[.='Selenium Training']")
	private WebElement seleniummousehovering;
	
	
	public DemoSkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void seleniumTrainingBtn() {
		seleniummousehovering.click();
	}
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	
}
