package cucumbercv.stepFiles;

import static org.testng.Assert.assertEquals;
import cucumbercv.pageObjects.LoginPage;
import cucumbercv.testbase.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tf01_Loginwithoutregister extends BaseUtil {
	
    
	private LoginPage login;
	
	private BaseUtil base;
	
	public Tf01_Loginwithoutregister(BaseUtil base) {
		
		this.base=base;
		
	}
	
	
	@And("User enters an unregistered username {string}")
	public void user_enters_an_unregistered_username(String userName) {
		System.out.println(base.var);
		login=new LoginPage(base.driver);
		login.enterUsername(userName);
	}

	@And("User enters an unregistered password {string}")
	public void user_enters_an_unregistered_password(String password) {
	    
		login.enterPassword(password);
	    
	}

	@When("User clicks on LogIn button")
	public void user_clicks_on_LogIn_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.loginBtnClick();
		
	  
	}

	@Then("An error message should be displayed to the User")
	public void an_error_message_should_be_displayed_to_the_User() {
	    // Write code here that turns the phrase above into concrete actions
		if(login.ifErrorDisplayed()) {
			System.out.println(login.getErrorText());
			assertEquals(login.getErrorText(), "username and Password is wrong");
		}
		
	    
	}

	

}
