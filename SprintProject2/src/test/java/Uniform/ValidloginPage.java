package Uniform;

	import java.io.IOException;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.testng.annotations.AfterClass;
//	import org.testng.annotations.AfterMethod;
//	import org.testng.annotations.AfterTest;
//	import org.testng.annotations.BeforeTest;
//	import org.testng.annotations.DataProvider;
//	import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pageobjects.loginPage;
import resources.base;
	public class ValidloginPage extends base {
		 public static Logger log =LogManager.getLogger(base.class.getName());
		 @BeforeTest
		 public void initialize() throws IOException
			{
			
				 driver =initializeDriver();
				 driver.get(prop.getProperty("url"));
				 loginPage e=new loginPage(driver);
			    e.getMyAccount().click();
			    e.getemail().sendKeys("Sonaliraut0512@gmail.com");
			    e.getpassword().sendKeys("Sonali@123");
			    e.getbutton().click();
			    
//			    driver.close();
//				driver=null; 
			 }
		 
		
			}




