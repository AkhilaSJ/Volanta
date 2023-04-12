package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlab.BaseClass;
import pompages.SkillraryDemoApplication;
import pompages.SkillraryLoginPage;
import pompages.Testingpage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		//create an object for skillrary object page
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.SkillraryDemoApplication();
		
		SkillraryDemoApplication sd= new SkillraryDemoApplication(driver);
		driverutilies.switchTabs(driver);
		driverutilies.dropDown(sd.getCoursetab(),p.getPropertyFiledata("courseadd"));
		 
		Testingpage t=new Testingpage(driver);
		 driverutilies.drangAndDrop(driver,t.getSeleniumtraining(),t.getCart());
 Point fb = t.getFacebookicon().getLocation();
	int x = fb.getX();
	int y = fb.getY();
	
	driverutilies.scrollbar(driver, x, y);
	t.facebook();
	}	
	

}
