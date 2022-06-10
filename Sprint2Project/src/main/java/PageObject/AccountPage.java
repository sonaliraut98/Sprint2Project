package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	
public WebDriver driver;
	
	By Editlnk=By.linkText("Edit your Account information");
	By Fax=By.id("input-fax");
	By continuebtn=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	By modifylnk=By.partialLinkText("Modify your wish list");
	By continuebtn1=By.cssSelector("#content > div > div > a");
	
	
	
	
	
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
	public WebElement continueclick()
	{
		return driver.findElement(continuebtn);
	}
	public WebElement modifyclick()
	{
		return driver.findElement(modifylnk);
	}
	public WebElement continueclick1()
	{
		return driver.findElement(continuebtn1);
	}
	
	
	
}



