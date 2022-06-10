package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.loginpage;

import org.junit.runner.RunWith;
import resources.base;
//import pageobjects.loginpage;

public class EditinformationstepDefnition {
	@RunWith(Cucumber.class)
	public class Editinformationstep extends base {
		@Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {
			 driver =initializeDriver();
	        throw new PendingException();
	    }
		@And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg2) throws Throwable {
			driver.get(strArg2);
	        throw new PendingException();
	    }
		 @And("^Click on profile$")
		    public void click_on_profile() throws Throwable {
		     loginpage e=new loginpage(driver);
		     e.getprofolio().click();
		     
		        throw new PendingException();
		    }
		 @And("^click on My Account$")
		    public void click_on_my_account() throws Throwable {
			 loginpage e=new loginpage(driver);
			 e.getMyaccount().click();
			 
		        throw new PendingException();
		    }
		 @And("^enter (.+),  (.+)$")
		    public void enter_(String emailaddress, String password) throws Throwable {
			 loginpage e=new loginpage(driver);
			 e.getEmail().sendKeys("hsrakshith37@gamil.com");
			 e.getPassword().sendKeys("Error@12345");
			throw new PendingException();
		    }
		  @And("^Click on login$")
		    public void click_on_login() throws Throwable {
			  loginpage e=new loginpage(driver);
			  e.getLogin().click();
		        throw new PendingException();
		    }


	    @Then("^Click on Edit your information$")
	    public void click_on_edit_your_information() throws Throwable {
	    	 loginpage e=new loginpage(driver);
	    	 e.geteditinformation().click();
	    	
	        throw new PendingException();
	    }
	    @And("^enter (.+) and (.+)$")
	    public void enter_and(String telephone, String lastname) throws Throwable {
	    	loginpage e=new loginpage(driver);
	    	e.getLastname().sendKeys("BR");
	    	e.getTelephone().sendKeys("8088774497");
	    	
	        throw new PendingException();
	    }
	    @And("^click on continue$")
	    public void click_on_continue() throws Throwable {
	    	loginpage e=new loginpage(driver);
	    	e.getContinue().click();
	        throw new PendingException();
	    }


	    @Then("^verify you get(.+)$")
	    public void verify_you_get(String successyouraccounthasbeensuccessfullyupdated) throws Throwable {
	        throw new PendingException();
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}
	}


