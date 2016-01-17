package cucumberTraining;



import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.junit.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionTest {

	WebDriver driver = HooksTest.driver;
	String url = "http://www.testdiary.com/";
	
	@Given("^I have the current testdiary url$")
	public void i_have_the_current_testdiary_url() throws Throwable {
	  
		System.out.println("my current url is: " + url);
	}

	@When("^I open the testdiary url$")
	public void i_open_the_testdiary_url() throws Throwable {
		driver.get(url);
	   
	}

	@Then("^testdiary should be displayed$")
	public void testdiary_should_be_displayed() throws Throwable {
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
		  Assert.assertEquals(url, currentUrl);
		  Reporter.log(" i have the correct url for test diary");
		  
	}
}
