package cucmberoptions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue= {"stepdefinitions"},
monochrome=true,

plugin={"pretty","junit:target/junitReports/reports.xml"}

)
public class EditTestRunner extends AbstractTestNGCucumberTests  {

}
