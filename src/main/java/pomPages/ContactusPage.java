package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class ContactusPage {
	@FindBy(name="name")
	private WebElement nametb;
	
	@FindBy(name="sender")
	private WebElement emailtb;
	
	@FindBy(name="subject")
	private WebElement subtb;
	
	@FindBy(name="message")
	private WebElement msgtb;
	
	@FindBy(xpath="//button[.='Send us mail']")
	private WebElement sendusbtn; 
	
	public ContactusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void nameTextBox(String name) {
		nametb.sendKeys(name);
	}
	public void emailtextBox(String email) {
		emailtb.sendKeys(email);
	}
	public void subjectTextBox(String sub) {
		subtb.sendKeys(sub);
	}
	public void messageTextBox(String msg) {
		msgtb.sendKeys(msg);
	}
	public void sendButton() {
		sendusbtn.click();
	}

}
