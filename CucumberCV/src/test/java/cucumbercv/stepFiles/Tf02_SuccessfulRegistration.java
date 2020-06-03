package cucumbercv.stepFiles;



import static org.testng.Assert.assertTrue;

import cucumbercv.pageObjects.CVHomePage;
import cucumbercv.pageObjects.MainPage;
import cucumbercv.pageObjects.RegisterPage;
import cucumbercv.testbase.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tf02_SuccessfulRegistration extends BaseUtil {
	
	
	private MainPage main;
	private RegisterPage register;
	private CVHomePage home;
	
	private BaseUtil base;
	public Tf02_SuccessfulRegistration(BaseUtil base) {
		
		this.base=base;
	}


	
	
	@And("User clicks on Resgister toggle button")
	public void user_clicks_on_Resgister_toggle_button() {
		main=new MainPage(base.driver);
		register=new RegisterPage(base.driver);
		home=new CVHomePage(base.driver);
		System.out.println(base.var);
		main.registerToggleClick();
	   
	}

	@And("User enters desired Username {string}")
	public void user_enters_desired_Username(String UserName) {
		
		register.enterUserName(UserName);
	    
	}

	@And("User enters a valid email Id {string}")
	public void user_enters_a_valid_email_Id(String EmailId) {
		
		register.enterEmailID(EmailId);
	    
	}

	@And("User enters desired Password {string}")
	public void user_enters_desired_Password(String Password) {
		
		register.enterPassword(Password);
	    
	}

	@When("User clicks on Register button")
	public void user_clicks_on_Register_button() {
		
		register.registerBtnClick();
	   
	}

	@Then("User should get sucessfully registered")
	public void user_should_get_sucessfully_registered() {
		
		assertTrue(home.isRegisterMsgDisplayed(), "The registeration was not successful");
	    
	}


}
