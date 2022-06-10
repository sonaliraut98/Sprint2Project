package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAddressEntity {
	public WebDriver driver ;
	
	//By profolio= By.xpath("//*[@id=\'Menu_Wmt3OMY3\']/nav/ul/li[2]/a/span/span/i");
	By Myaccount=By.xpath("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[2]/a/span/span/i");
	By ModifyEnter=By.xpath("//*[@id=\"content\"]/ul[2]/li[3]/a");
	By BtnClick =By.linkText("Edit");
	By company =By.id("input-company");
     By Address  =By.id("input-address-2");
	 By Radio =By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]/input");
	 By ButtonContinue =By.cssSelector("#content > form > div > div.pull-right > input");
	         	
	         	
	 public EditAddressEntity(WebDriver driver) {
			this.driver=driver;
		}
	
	

//	public WebElement getprofolio(){
//		return driver.findElement(profolio);
//	}
	public WebElement getMyaccount() {
		return driver.findElement(Myaccount);
	}
	public WebElement ModifyEnter() {
		return driver.findElement(ModifyEnter);
		}
	public WebElement getBtnClick() {
		return driver.findElement(BtnClick);
	}
	public WebElement getcompany() {
		return driver.findElement(company);
	}
	public WebElement getAddress() {
		return driver.findElement(Address);
	}
	public WebElement getRadio() {
		return driver.findElement(Radio);
	}
	public WebElement getButtonContinue() {
		return driver.findElement(ButtonContinue);
	}
	
	
	
	

}
