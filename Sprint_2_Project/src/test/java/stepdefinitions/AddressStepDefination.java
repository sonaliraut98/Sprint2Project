package stepdefinitions;



import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageobjects.EditAddressEntity;
import resources.base;

	public class AddressStepDefination extends base {

	    @Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {
	    	 driver =initializeDriver();
	        throw new PendingException();
	    }

	  
	    @And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	//driver.get(strArg1=);
	    	driver.get(prop.getProperty("url1"));
	        throw new PendingException();
	    }
	    
	    @And("^Click on Address Book link  in home page to land on Webpage$")
	    public void click_on_address_book_link_in_home_page_to_land_on_webpage() throws Throwable {
	    	EditAddressEntity r=new EditAddressEntity(driver); //driver.findElement
		    
	        throw new PendingException();
	    }
	        

	    @And("^ user enters (.+),(.+) ^")
	    public void user_enters_(String company,String address2) throws Throwable {
	    	EditAddressEntity r=new EditAddressEntity(driver); 
	    	r.getcompany().sendKeys("capgemini");
	    	r.getAddress().sendKeys("Pimpari pune");
	    	
	    	
	        throw new PendingException();
	    }

	    @And("^Click on yes or no$")
	    public void click_on_yes_or_no() throws Throwable {
	    	EditAddressEntity r=new EditAddressEntity(driver); 
	    	r.getRadio().click();
	        throw new PendingException();
	    }

	    @And("^Click on continue$")
	    public void click_on_continue() throws Throwable {
	    	EditAddressEntity r=new EditAddressEntity(driver); 
	    	r.getButtonContinue().click();
	        throw new PendingException();
	    }
	  


	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}


