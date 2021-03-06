package cucmberoptions;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	import cucumber.api.testng.AbstractTestNGCucumberTests;

	//@RunWith(Cucumber.class)
	@CucumberOptions(  
		    features = "src/test/java/features",
		    glue={"stepdefinitions"},
  //  	    dryRun=true,
        monochrome= true,
       plugin={"pretty","junit:target/junitReports/reports.xml"}
		   ) 
	public class TestRunner extends AbstractTestNGCucumberTests  {

	}


