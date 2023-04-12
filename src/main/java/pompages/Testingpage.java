package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
@FindBy(xpath="(//a[text()='selenium training'])[2]")
private WebElement seleniumtraining;

@FindBy(id="mycart")
private WebElement cart;

@FindBy(xpath="(//i[@class='fa fa-facebook'][2]" )
private WebElement facebookicon;

public Testingpage (WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
public void seleniumtratinigtab() {
	seleniumtraining.click();
}
public void addcart() {
	cart.click();
}

public void facebook() {
	facebookicon.click();
}
public WebElement getSeleniumtraining() {
	return seleniumtraining;
}
public WebElement getCart() {
	return cart;
}
public WebElement getFacebookicon() {
	return facebookicon;
}
}