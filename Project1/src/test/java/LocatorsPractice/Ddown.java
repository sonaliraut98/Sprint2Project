package LocatorsPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
	String url="https://www.rahulshettyacademy.com/dropdownsPractise/";
		//String url="https://developer.salesforce.com/signup";
		
		driver.get(url);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		WebElement Ddown=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		Select select=new Select(Ddown);
		
		select.selectByVisibleText("Pune(PNQ)");
		//select.selectByIndex(3);
		
	WebElement options=	select.getFirstSelectedOption();
//		
//	System.out.println(options.getText());	
//		
		
		
	}

}
