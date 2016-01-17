package cucumberTraining;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/test/java/features", 
		plugin = {"pretty", "html:target/cucumber-html-report"},
		//glue = " ",
		tags = "@testdiary"
		)
public class CukesRunnerTest extends AbstractTestNGCucumberTests {

}
