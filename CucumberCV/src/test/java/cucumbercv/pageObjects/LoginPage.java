package cucumbercv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Base {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(name="user-login-Name")
	private WebElement usernameElement;
	
	@FindBy(xpath="//input[@name='login-Pass']")
	private WebElement passwordElement;
	
	@FindBy(name="login_user")
	private WebElement loginBtnElement;
	
	@FindBy(className="error")
	private WebElement errorMessageElement;
	
	public void enterUsername(String userName) {
		
		enterText(usernameElement, 10, userName);
		
	}
	
	public void enterPassword(String Password) {
		
		enterText(passwordElement, 10, Password);
	}
	
	public void loginBtnClick() {
		
		click(loginBtnElement, 10);
	}
	
	public boolean ifErrorDisplayed() {
		
		return elementIsDisplayed(errorMessageElement, 10);
	}
	
	public String getErrorText() {
		
		return getElementText(errorMessageElement, 10);
	}
}
