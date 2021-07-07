package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.ContactusPage;
import pomPages.SkillraryLoginPage;

public class ContactDetails extends BaseClass {
	@Test
	public void contactUs() throws FileNotFoundException, IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		Point loc = s.getContactus().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilities.scrollBar(driver, x, y);
		s.Contactusbtn();
		
		ContactusPage c= new ContactusPage(driver);
		c.nameTextBox(p.getdata("name"));
		c.emailtextBox(p.getdata("email"));
		c.subjectTextBox(p.getdata("subject"));
		c.messageTextBox("message");
		c.sendButton();
	}
	

}
