package scripts;

import org.openqa.selenium.WebDriver;

import genericlab.BaseClass;
import pompages.CorejavaPage;
import pompages.SkillraryLoginPage;
import pompages.WishListPage;

public class Test3 extends BaseClass{
	SkillraryLoginPage s=new SkillraryLoginPage( driver)
	s.searchtextbox(p.getPropertyFiledata("name"));
    s.serachbutton();
	
	CorejavaPage c= new CorejavaPage(driver);
	c.corejavaselenium();
	
	WishListPage w=new WishListPage(driver);
	driverutilies.switchFrames(driver);
	w.playbutton();
	Thread.sleep(10000);
	w.pausebutton();
	driverutilies.switchbackframe(driver);
	w.addtowhislistbtn();
}
