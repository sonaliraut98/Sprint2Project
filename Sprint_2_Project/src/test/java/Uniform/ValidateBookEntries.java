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

import pageobjects.EditAddressEntity;
import resources.base;


public class ValidateBookEntries extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
		@BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 
			 {
				driver.get(prop.getProperty("url1"));
				 EditAddressEntity r=new EditAddressEntity (driver);
			    	r.getcompany().sendKeys("capgemini");
			    	r.getAddress().sendKeys("Pimpari pune");
			    	r.getRadio().click();
			    	r.getButtonContinue().click();
			    	
			 }
		
			 driver.close();
			driver=null;
			 


		}
}
