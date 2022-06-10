package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	public WebDriver driver;
	
	By Login=By.partialLinkText("My Account");
    By email=  By.name("email");
	By password=By.id("input-password");
    By button= By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
	
  public  loginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
  	this.driver=driver;
		
	}




	public WebElement getMyAccount()
	{
		return driver.findElement(Login);
	}
	

	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getbutton() 
	{
		return driver.findElement(button);
	}
}






	

