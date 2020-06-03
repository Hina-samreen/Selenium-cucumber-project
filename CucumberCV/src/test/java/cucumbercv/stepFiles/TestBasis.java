package cucumbercv.stepFiles;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumbercv.pageObjects.LoginPage;
import cucumbercv.pageObjects.MainPage;
import cucumbercv.pageObjects.RegisterPage;
import cucumbercv.testbase.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class TestBasis extends BaseUtil {
	
	WebDriver driver;
	LoginPage login;
	MainPage main;
	RegisterPage register;
	
	
	private BaseUtil base;
	public TestBasis(BaseUtil base) {
		
		this.base=base;
		
	}
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imran\\eclipse-workspaceNew\\CucumberCV\\src\\test\\resources\\cucumbercv\\executables\\chromedriver.exe");
		base.driver= new ChromeDriver();
		login=new LoginPage(base.driver);
		base.driver.manage().window().maximize();
		
								
		
	}

	
	@Given("User navigates to CVcreation website")
	public void user_navigates_to_CVcreation_website() {
	   
		login.visit("http://resumecreation.tk/");
	}

	
	@After
	public void tearDown() {
		
		base.driver.quit();
	}

}

