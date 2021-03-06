package StepDefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdefination {
	
	
	public static WebDriver driver;
	
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    System.out.println("inside step-user the browser with chrome$ ");
    

 System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
  driver=new ChromeDriver();
driver.manage().window().maximize(); 
        
    }

    @When("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	//System.out.println("inside step-user navigate to site");
    	
    	driver.navigate().to("\"http://uniformm1.upskills.in/");	
    	
    }
    
    @And("^Click on Login link in home page to land on Secure in login Page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_in_login_page() throws Throwable {
    	//System.out.println("inside step-user click on login link ");
//    	LoginPage login=new LoginPage(driver);
//    	login.getMyAccount().click();
    	
    	driver.findElement(By.partialLinkText("My Account")).click();

    }

   
    	 @When("^User enters (.+) and (.+) and logs in$")
    	    public void user_enters_and_and_logs_in(String Email, String password) throws Throwable {
    	    	//System.out.println("inside step-user enters Email and password");
    		 driver.findElement(By.name("email")).sendKeys("sonaliraut0512@gmail.com");
    		 driver.findElement(By.id("input-password")).sendKeys("Sonali@123");	
    	
    	
    }
    
    
    @Then("^Verify that user is succesfully open MyAccount Webpage$")
    public void verify_that_user_is_succesfully_open_myaccount_webpage() throws Throwable {
   // System.out.println("inside step-user open myAccount webpage");
    	
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();	
		
    }


    @When("^Click on Edit your Account information link$")
    public void click_on_edit_your_account_information_link() throws Throwable {
    	//System.out.println("inside step-user click on the Editlink");
    	driver.findElement(By.linkText("Edit your account information")).click();
		
    }
    
    @Then("^Enter the Fax$")
    public void enter_the_fax() throws Throwable {
    	//System.out.println("inside step-user Enter the fax");
    	
    	driver.findElement(By.id("input-fax")).sendKeys("544632");
    }
    
    @And("^Click on Continue button$")
    public void click_on_continue_button() throws Throwable {
    //	System.out.println("inside step-user click on continue button");
    	
    	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();	
    }
    

    @When("^Click on modify your wish list link$")
    public void click_on_modify_your_wish_list_link() throws Throwable {
    
	//	System.out.println("inside step-user click on modify the link ");
    	
    	driver.findElement(By.partialLinkText("Modify your wish list")).click();
    	 	
    }

    @Then("^My wishlist page should be displayed$")
    public void my_wishlist_page_should_be_displayed() throws Throwable {
  //  System.out.println("inside step-user My whshlist page should open");
    	
    }

    
    @And("^Click on Continue button$")
    public void click_on_continue_button1()throws Throwable {
    //	System.out.println("inside step-user click on continue button");
    	driver.findElement(By.cssSelector("#content > div > div > a")).click();	
    	
   
    }
}