package cucumbercv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CVHomePage extends Base {
	
	
	public CVHomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//span[contains(text(),'Your Registeration was successful')]")
	private WebElement registerMsgElement;
	
	public boolean isRegisterMsgDisplayed() {
		
		return elementIsDisplayed(registerMsgElement, 10);
	}

}
