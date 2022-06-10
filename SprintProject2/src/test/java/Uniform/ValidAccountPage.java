package Uniform;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;


import pageobjects.AccountPage;
import resources.base;


public class ValidAccountPage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
		@BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
		     driver.get(prop.getProperty("url"));
			 AccountPage p=new AccountPage(driver);
				 
				 p.getEditlnk().click();
				 p.getFax().sendKeys("544632");
				 p.getStartbtn().click();
				 p.getmodifylnk().click();
				 p.getcontinuebutton().click();
            
				driver.close();
			    driver=null;
						 
		}
}
				 




