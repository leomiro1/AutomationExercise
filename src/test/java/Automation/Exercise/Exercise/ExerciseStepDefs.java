package Automation.Exercise.Exercise;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class ExerciseStepDefs {
	protected WebDriver driver;

    @Before    
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Librerias\\BrowserDrivers\\chromedriver.exe");
    	driver = new ChromeDriver();    
    }
    
    @Given("^user is on \"([^\"]*)\"$")
    public void user_is_on(String url) {
    	//go to the desired url
    	driver.get("http://" + url);  
    }

    @When("^user types \"([^\"]*)\" in the searchbox$")
    public void user_types_in_the_searchbox(String textToSearch) {
    	//enter the text to search in Google
    	driver.findElement(By.id("lst-ib")).sendKeys(textToSearch);  
    }

    @And("^user press \"([^\"]*)\" in the searchbox$")
    public void user_press_in_the_searchbox(String key) {
    	//click ENTER button
    	if (key.equals("ENTER")) {
    		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
    	}
    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void user_clicks_on_link(String arg1) {
    	//selected xpath clicks on first link of Google Search
    	if (driver.findElement(By.xpath("//h3/a")).getText().equals("Selenium - Web Browser Automation")) {
    	driver.findElement(By.xpath("//h3/a")).click();
    	}
    }

    @Then("^user is on Selenium HQ Page$")
    public void user_is_on_Selenium_HQ_Page() {
    	//check where the user is with the title of the url
    	String header = driver.getTitle();
    	assertEquals(header,"Selenium - Web Browser Automation");  
    }
    
    @After    
    public void tearDown() {     
    	driver.close();    
    } 	

}
