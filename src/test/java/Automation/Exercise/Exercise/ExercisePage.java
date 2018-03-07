package Automation.Exercise.Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExercisePage {


	@FindBy(id = "lst-ib")  
	@CacheLookup
	public WebElement lstib;

	@FindBy(xpath = "//h3/a")  
	public WebElement firstLink;
 
	public ExercisePage (WebDriver driver) {
		if(!"Selenium - Web Browser Automation".equals(driver.getTitle()))   
			throw new IllegalStateException("This is not Selenium - Web Browser Automation");   
		PageFactory.initElements(driver, this);   
	}  
	
}
