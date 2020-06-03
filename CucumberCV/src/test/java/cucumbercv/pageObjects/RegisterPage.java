package cucumbercv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base {
	
	public RegisterPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(name="user-register-Name")
	private WebElement registerUserNameElement;
	
	@FindBy(name="register-Email1")
	private WebElement registerEmailIdElement;
	
	@FindBy(name="register-Pass")
	private WebElement registerPasswordElement;
	
	@FindBy(name="reg_user")
	private WebElement registerBtnElement;
	
	public void enterUserName(String UserName) {
		
		enterText(registerUserNameElement, 10, UserName);
	}
	
	public void enterEmailID(String EmailId) {
		
		enterText(registerEmailIdElement,10,EmailId);
	}
	
	public void enterPassword(String Password) {
		
		enterText(registerPasswordElement, 10, Password);
	}

	public void registerBtnClick() {
		
		click(registerBtnElement, 10);
	}
}
