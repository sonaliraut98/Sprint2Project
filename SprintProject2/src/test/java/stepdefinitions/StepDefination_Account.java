package stepdefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AccountPage;
import pageobjects.loginPage;
import resources.base;


public class StepDefination_Account extends base{
	
	 @Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {	
		driver =initializeDriver();
	    System.setProperty("webdriver.chrome.driver", "C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
		 driver=new ChromeDriver();
	   loginPage login=new loginPage(driver);
	  
	    }

	  
	    @And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    	//driver.manage().window().maximize();
	        
	    }
	
	
    @And("^Click on Login link in home page to land on Secure in login Page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_in_login_page() throws Throwable {
    
      	loginPage login=new loginPage(driver);
       	login.getMyAccount().click();
    	
    

    }
    	 @When("^User enters (.+) and (.+) and logs in$")
    	    public void user_enters_and_and_logs_in(String Email, String password) throws Throwable {
    
    	loginPage login=new loginPage(driver);
    	login.getemail().sendKeys("sonaliraut0512@gmail.com");
    	login.getpassword().sendKeys("Sonali@123");
    	
    }
    
    
    @Then("^Verify that user is succesfully open MyAccount Webpage$")
    public void verify_that_user_is_succesfully_open_myaccount_webpage() throws Throwable {
   // System.out.println("inside step-user open myAccount webpage");
    	loginPage login=new loginPage(driver);
    	//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();	
		
    }


    @When("^Click on Edit your Account information link$")
    public void click_on_edit_your_account_information_link() throws Throwable {
    	//System.out.println("inside step-user click on the Editlink");
    	driver.findElement(By.linkText("Edit your account information")).click();
    	AccountPage A=new AccountPage(driver);
    	A.getEditlnk().click();
		
    }
    
    @Then("^Enter the Fax$")
    public void enter_the_fax() throws Throwable {
    	
    	AccountPage A=new AccountPage(driver);
    	A.getFax().sendKeys("544632");
    }
    
    @And("^Click on Continue button$")
    public void click_on_continue_button() throws Throwable {
    //	System.out.println("inside step-user click on continue button");
    	
    	AccountPage A=new AccountPage(driver);
    	A.getStartbtn().click();
    }
    

    @When("^Click on modify your wish list link$")
    public void click_on_modify_your_wish_list_link() throws Throwable {
    
	//	System.out.println("inside step-user click on modify the link ");
    	
    	driver.findElement(By.partialLinkText("Modify your wish list")).click();
    	AccountPage A=new AccountPage(driver);
    	A.getmodifylnk().click();
    
    	 	
    }

    @Then("^My wishlist page should be displayed$")
    public void my_wishlist_page_should_be_displayed() throws Throwable {
  //  System.out.println("inside step-user My whshlist page should open");
    	
    }

//    
//    @And("^Click on Continue button$")
//    public void click_on_continue_button1()throws Throwable {
//    //	System.out.println("inside step-user click on continue button");
//    	driver.findElement(By.cssSelector("#content > div > div > a")).click();	
//    	AccountPage A=new AccountPage(driver);
//    	A.getcontinuebutton().click();
//    }
    }
