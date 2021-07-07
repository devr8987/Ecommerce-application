package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;
import pomPages.TakeThisCoursePage;

public class TakeCourse extends BaseClass {
	@Test
	public void takecourse() throws FileNotFoundException, IOException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchTextBox(p.getdata("sub"));
		s.searchButton();
		
		SeleniumPage se= new SeleniumPage(driver);
		se.coursebutton();
		
		TakeThisCoursePage t=new TakeThisCoursePage(driver);
		utilities.switchFrame(driver);
		t.playbutton();
		t.pausebutton();
		utilities.switchBack(driver);
		t.takethiscoursebutton();
	}

}
