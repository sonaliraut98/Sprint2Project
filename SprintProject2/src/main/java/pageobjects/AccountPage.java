package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	
public WebDriver driver;
	
	By Editlnk=By.linkText("Edit your Account information");
	By Fax=By.id("input-fax");
	By Startbtn=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	By modifylnk=By.partialLinkText("Modify your wish list");
	By continuebutton=By.cssSelector("#content > div > div > a");
	
	
	
	
	
	public AccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement Editclick()
	{
		return driver.findElement(Editlnk);
	}
	public WebElement getFax()
	{
		return driver.findElement(Fax);
	}
	public WebElement continueclick1()
	{
		return driver.findElement(Startbtn);
	}
	public WebElement modifyclick()
	{
		return driver.findElement(modifylnk);
	}
	public WebElement click1()
	{
		return driver.findElement(continuebutton);
	}




	public WebElement getEditlnk() {
		// TODO Auto-generated method stub
		return null;
	}




	public WebElement gettext() {
		// TODO Auto-generated method stub
		return null;
	}


	public WebElement getmodifylnk() {
		// TODO Auto-generated method stub
		return null;
	}






	public WebElement getcontinuebutton() {
		// TODO Auto-generated method stub
		return null;
	}




	public WebElement getStartbtn() {
		// TODO Auto-generated method stub
		return null;
	}




	
	}
	
	
	




