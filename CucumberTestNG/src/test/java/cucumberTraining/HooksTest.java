package cucumberTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class HooksTest {
	
	public static WebDriver driver;
	 
	
	@Before
	public void openbrowser(){
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void closebrowser(){
		driver.close();
		
	}
}
