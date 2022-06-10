package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/login.feature", glue= {"StepDefination"})
public class TestRunner {
	


}
	
	
	
	
	

