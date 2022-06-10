package Uniform;


	
	import java.io.IOException;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
    import resources.base;
	public class MyAccountPage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	public MyAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void initialize() throws IOException
	{



	driver =initializeDriver();




	driver.get(prop.getProperty("url"));
	
	
	}
	
	}
	




