package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.DemoSkillraryLoginPage;
import pomPages.SkillraryLoginPage;

public class AddToCart extends BaseClass {
	@Test
	public void addproduct() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		utilities.switchTab(driver);
		
		DemoSkillraryLoginPage d= new DemoSkillraryLoginPage(driver);
		utilities.mouseHover(driver, d.getCoursebtn());
		d.seleniumTrainingBtn();
		
		AddToCartPage a= new AddToCartPage(driver);
		utilities.doubleClick(driver, a.getAddbtn());
		a.addToCartButton();
		utilities.alertPopUp(driver);
		
	}

}
