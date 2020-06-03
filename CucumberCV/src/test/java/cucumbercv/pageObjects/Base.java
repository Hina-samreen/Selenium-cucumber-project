package cucumbercv.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	Duration timeout;
	int time;
	Duration timeduration;
	WebDriver driver;
	public Base(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void visit(String URL) {
		
		try {
			
			driver.get(URL);
			
		}catch(WebDriverException wde){
			
			System.out.println(wde);
			
		}
	}
	
	public Duration getDuration(int time) {
		
		return Duration.ofSeconds(time);
	}
	
	public void enterText(WebElement element, int time, String inputText) {
		
		try {
			new WebDriverWait(driver, getDuration(time)).until(ExpectedConditions.elementToBeClickable(element)).sendKeys(inputText); 
			}catch(WebDriverException wde){
				
				System.out.println(wde);
				
			}
	}
	
	public void click(WebElement element,int time) {
		
		try {
			new WebDriverWait(driver, getDuration(time)).until(ExpectedConditions.elementToBeClickable(element)).click();
			
			}catch(WebDriverException wde){
				
				System.out.println(wde);
				
			}
		
	}
	
	public void waitUntilElementVisible(WebElement element,int time) {
		
		try {
			
			new WebDriverWait(driver,getDuration(time)).until(ExpectedConditions.visibilityOf(element));
			
		}catch(WebDriverException wde){
			
			System.out.println(wde);
			
		}
	}
	
	
	
	public void selectFromDropdown(int time,WebElement element, String visibleText) {
		
		waitUntilElementVisible(element, time);
		Select select= new Select(element);
		try {
			
			select.selectByVisibleText(visibleText);
		}
		catch(WebDriverException wde){
			
			System.out.println(wde);
			
			
		}
		
	}
	
	public boolean elementIsDisplayed(WebElement element, int time) {
		waitUntilElementVisible(element, time);
		boolean value=false;
		try {
			
			if(element.isDisplayed()) {
				
				value=true;
			}
			
		}catch(WebDriverException wde) {
			
			System.out.println(wde);
			
		}
		return value;
	}
			
	public String getElementText(WebElement element, int time) {
		
		waitUntilElementVisible(element, time);
		String text="";
		
		try {
			
		  text= element.getText();
			
		}catch(WebDriverException wde) {
			
			System.out.println(wde);
		}
		return text;
	}
		
	}


