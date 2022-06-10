package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.EditPage;


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
			//driver.get(strArg2);
			driver.get(prop.getProperty("url1"));
	        throw new PendingException();
	    }
		/* @And("^Click on profile$")
		    public void click_on_profile() throws Throwable {
			 EditPage  e=new EditPage (driver);
		     e.getprofolio().click();
		     
		        throw new PendingException();
		    }*/
		
		 @And("^click on My Account$")
		    public void click_on_my_account() throws Throwable {
			 EditPage  e=new EditPage (driver);
			 e.getMyaccount().click();
			 
		        throw new PendingException();
		    }
		 
		 @Then("^click on login $")
		    public void click_on_login1() throws Throwable {
			 EditPage  e=new EditPage (driver);
			 e.getloginbtn().click();
		        throw new PendingException();
		    }
		 @And("^enter (.+),  (.+)$")
		    public void enter_(String emailaddress, String password) throws Throwable {
			 EditPage  e=new EditPage (driver);
			 e.getEmail().sendKeys("sonaliraut0512@gmail.com");
			 e.getPassword().sendKeys("Sonali@123");
			throw new PendingException();
		    }
		  @And("^Click on login$")
		    public void click_on_login() throws Throwable {
			  EditPage  e=new EditPage (driver);
			  e.getLogin().click();
		        throw new PendingException();
		    }


	    @Then("^Click on Edit your information$")
	    public void click_on_edit_your_information() throws Throwable {
	    	EditPage  e=new EditPage (driver);
	    	 e.geteditinformation().click();
	    	
	        throw new PendingException();
	    }
	    @And("^enter (.+) and (.+)$")
	    public void enter_and(String telephone, String lastname) throws Throwable {
	    	EditPage  e=new EditPage (driver);
	    	e.getLastname().sendKeys("Bhagwat");
	    	e.getTelephone().sendKeys("1234567890");
	    	
	        throw new PendingException();
	    }
	    @And("^click on continue$")
	    public void click_on_continue() throws Throwable {
	    	EditPage  e=new EditPage (driver);
	    	e.getContinue().click();
	        throw new PendingException();
	    }


	    @Then("^verify you get(.+)$")
	    public void verify_you_get(String SucessfulupdatetheAccountinformation) throws Throwable {
	        throw new PendingException();
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}
	}


