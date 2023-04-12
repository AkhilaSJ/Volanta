package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {
	@FindBy(id="Course")
	private WebElement coursetab;
	
	@FindBy(name="addresstype")
	private WebElement couseadd;
	 
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	public void setCoursetab(WebElement coursetab) {
		this.coursetab = coursetab;
	}
	public void setCouseadd(WebElement couseadd) {
		this.couseadd = couseadd;
	}
	public WebElement getCouseadd() {
		return couseadd;
	}
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApplication(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void seleniumtrainingtab() {
	seleniumtraining.click();
}
}

