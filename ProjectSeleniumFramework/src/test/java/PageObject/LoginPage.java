package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
 public	WebDriver driver;
	
	public LoginPage(WebDriver rdriver){
		
		this.driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="Email")
	WebElement txtEmail;
	
	
	@FindBy(name="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement btnlogin;
	
	@FindBy(linkText ="logout")
	WebElement lnkLogout;
	


//actions
 		
	public void setEmail(String Email) {

txtEmail.sendKeys("admin@yourstore.com");
}
	
	public void setPassword(String password) {
		
		txtPassword.sendKeys("admin");
		
	}
	
	public void clickLogin() {
		btnlogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	
	
	
	
	
	
	


}
