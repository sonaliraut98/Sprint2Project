package CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
         features="src/test/java/Features",
         glue="StepDefination")
public class LoginPage extends  AbstractTestNGCucumberTests {

	
}
