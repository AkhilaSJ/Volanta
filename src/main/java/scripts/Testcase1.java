package scripts;

import org.testng.annotations.Test;

import genericlab.BaseClass;
import pompages.Addtocart;
import pompages.SkillraryDemoApplication;
import pompages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
		SkillraryLoginPage s =new SkillraryLoginPage(driver); //create object
		s.gearsbutton();
		s.SkillraryDemoApplication(); //after this it goes to demo application
		
		SkillraryDemoApplication d= new SkillraryDemoApplication(driver); //create a object
		driverutilies.switchTabs(driver);//need to switch the tab
		driverutilies.mouseHover(driver,d.getCoursetab());//call the method
		d.seleniumtrainingtab();
		
	Addtocart a= new Addtocart(driver);
	driverutilies.doubleClick(driver, a.getAddbtn());
	a.addtocartbutton();
	driverutilies.alertPopUp(driver);
	
	}
	
	

}
