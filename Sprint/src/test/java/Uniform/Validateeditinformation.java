package Uniform;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.loginpage;
import resources.base;
public class Validateeditinformation extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url1"));
			 loginpage e=new loginpage(driver);
		     e.getprofolio().click();
		     e.getMyaccount().click();
		     e.getEmail().sendKeys("abhishek07@gmail.com");
			 e.getPassword().sendKeys("Error@12345");
			 e.getLogin().click();
			 e.geteditinformation().click();
			 e.getLastname().sendKeys("BR");
		    e.getTelephone().sendKeys("8088774497");
		    e.getContinue().click();
		    
		    driver.close();
			driver=null; 
		 
			 
				 
			 }
	 
	
		}


	 
	 

