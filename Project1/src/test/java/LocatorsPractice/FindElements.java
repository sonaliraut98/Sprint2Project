package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
		   
		   String url="https://www.rahulshettyacademy.com/dropdownsPractise/";
		   driver.get(url);
		   
		   String Title=driver.getTitle();
		   System.out.println(Title);
		   
		   
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  
	boolean check1=	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
		
	boolean check2=	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isDisplayed();
	boolean check3=	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
	
	System.out.println(check1);
	System.out.println(check2);

	System.out.println(check3);
	
	driver.close();
	
	}

}
