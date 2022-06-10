package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
//features = "/src/test/resources/Features/MyAccount",
		features ="classpath:features/MyAccount.feature",
glue={"stepdefination"}

)
public class ClassRunner extends AbstractTestNGCucumberTests {
	}
