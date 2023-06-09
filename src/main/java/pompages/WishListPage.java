package pompages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class WishListPage {
		
		@FindBy(xpath="//div[@class='play-icon']")
		private WebElement playicon;
		
		@FindBy(xpath="//div[@class='play-icon']")
	private WebElement pauseicon;
		
		@FindBy(xpath="//span[text()='Add To Wishlist']")
		private WebElement addtowishlist;
		
		public WishListPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void playbutton() {
			playicon.click();
		}
		
		public void pausebutton() {
			pauseicon.click();
		}
		
		public void addtowhislistbtn() {
			addtowishlist.click();
		}

}
