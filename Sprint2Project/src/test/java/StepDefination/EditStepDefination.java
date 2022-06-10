package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStepDefination {
	
	public static WebDriver driver;
	
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	        //throw new PendingException();
	       System.setProperty("webdriver.chrome.driver", "C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
			// driver=new ChromeDriver();
	        driver =initializeDriver();
	    }

	    @When("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	        throw new PendingException();
	        driver.get(url);
	    	driver.manage().window().maximize();
	    }

	    @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String email, String password) throws Throwable {
	        throw new PendingException();
	    }

	    @When("^i click on Edit Address link$")
	    public void i_click_on_edit_address_link() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Verify that user is succesfully open MyAccount Webpage$")
	    public void verify_that_user_is_succesfully_open_myaccount_webpage() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Address page is open$")
	    public void address_page_is_open() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^click on continue button$")
	    public void click_on_continue_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Click on Login link in home page to land on Secure in login Page$")
	    public void click_on_login_link_in_home_page_to_land_on_secure_in_login_page() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^click on Edit button$")
	    public void click_on_edit_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^close the brower$")
	    public void close_the_brower() throws Throwable {
	        throw new PendingException();
	    }

	}


