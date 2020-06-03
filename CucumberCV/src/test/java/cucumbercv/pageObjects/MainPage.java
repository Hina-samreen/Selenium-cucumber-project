package cucumbercv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Base {
	
	
	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='LogIn' and @class='toggle-btn']")
	private WebElement loginToggleBtnElement;
	
	@FindBy(xpath="//button[text()='Register' and @class='toggle-btn']")
	private WebElement registerToggleBtnElement;
	
	public void loginToggleClick() {
		
		click(loginToggleBtnElement, 4);
	}
	
	public void registerToggleClick() {
		
		click(registerToggleBtnElement, 4);
	}

}
