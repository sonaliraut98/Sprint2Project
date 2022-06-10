package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class loginpage {
		public WebDriver driver ;
//		By profolio= By.xpath("//*[@id=\'Menu_Wmt3OMY3\']/nav/ul/li[2]/a/span/span/i");
//		By Myaccount=By.xpath("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[2]/a/span/span/i");
		By Email=By.xpath("//input[@id='input-email']");
		By Password= By.xpath("//input[@id='input-password']");
//		By Login= By.xpath("//*[@id=\"System_nyHsmShk\"]/div/div[2]/div/form/div/div[2]/input");
//		By editinformation= By.xpath("//*[@id=\"System_nyHsmShk\"]/align/ul/li[1]/a");
//		By Lastname=By.xpath("//*[@id=\"input-lastname\"]");
//		By Telephone=By.xpath("//*[@id=\"input-telephone\"]");
//		By Continue= By.xpath("//*[@id=\"edit_account_form\"]/div/div[2]/input");
//		By sucessfull=By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div");
		
	public loginpage(WebDriver driver) {
			this.driver=driver;
		}
	
	

	public WebElement getprofolio(){
		return driver.findElement(profolio);
	}
	public WebElement getMyaccount() {
		return driver.findElement(Myaccount);
	}
	public WebElement getEmail() {
		return driver.findElement(Email);
		}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getLogin() {
		return driver.findElement(Login);
	}
	public WebElement geteditinformation() {
		return driver.findElement(editinformation);
	}
	public WebElement getLastname() {
		return driver.findElement(Lastname);
	}
	public WebElement getTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement getContinue() {
		return driver.findElement(Continue);
	}
	public WebElement getsucessfull() {
		return driver.findElement(sucessfull);
	}

	}

	
	



