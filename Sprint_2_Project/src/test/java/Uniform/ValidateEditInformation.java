package Uniform;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.BeforeTest;

import pageobjects.EditPage;
import resources.base;
public class ValidateEditInformation extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			driver.get(prop.getProperty("url1"));
			 EditPage e=new EditPage(driver);
		   //  e.getprofolio().click();
		     e.getMyaccount().click();
		     e.getloginbtn().click();
		     e.getEmail().sendKeys("sonaliraut0512@gmail.com");
			 e.getPassword().sendKeys("Sonali@123");
			 e.getLogin().click();
			 e.geteditinformation().click();
			 e.getLastname().sendKeys("Pimpari pune");
		    e.getTelephone().sendKeys("1234567890");
		    e.getContinue().click();
		    
		    driver.close();
		//	driver=null; 
		 
			 
				 
			 }
	 
	
		}


	 
	 

