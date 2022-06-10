package LocatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
	String url="https://www.rahulshettyacademy.com/dropdownsPractise/";
	//String url="https://developer.salesforce.com/signup";
		
		driver.get(url);
		driver.manage().window().maximize();
		
	//	String Title=driver.getTitle();
//		System.out.println(Title);
		
	driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		 
	driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		 
		 
 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
	
		 driver.findElement(By.id("driver.findElement(By.id(\"ctl00_mainContent_rbtnl_Trip_2")).click();
		 
	System.out.println(driver.findElements(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).size());
	System.out.println(driver.findElements(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).size());
	}
	
	private static Exception sleep(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

