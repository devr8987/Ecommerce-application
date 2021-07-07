package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeThisCoursePage {
	
	@FindBy(xpath="//div[@class=\"play-icon\"]")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class=\"pause-icon\"]")
	private WebElement pausebtn;
	
	@FindBy(xpath="//a[@class=\"btn btn-primary\"]")
	private WebElement takethiscoursebtn;	
			
	 public TakeThisCoursePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void playbutton() {
		 playbtn.click();
	 }
	 
	 public void pausebutton() {
		 pausebtn.click();
	 }
	 
	 public void takethiscoursebutton() {
		 takethiscoursebtn.click();
	 }
	 
}
