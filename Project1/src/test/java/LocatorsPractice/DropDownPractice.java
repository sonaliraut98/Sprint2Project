package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
		   
		   String url="https://maven.apache.org/";
		   driver.get(url);
		  
		   String Title=driver.getTitle();
		   System.out.println(Title);
		   
	//	  driver.findElement(By.linkText("blinkingText")).click();
		
	//	  driver.findElement(By.partialLinkText("blinkingText")).click();
		   
//	 driver.findElement(By.className("externalLink")).click();
//		 
//		 
//	driver.findElement(By.xpath("//a[@text='License']")).click();
//	
	driver.findElement(By.cssSelector("#leftColumn > nav > ul > li:nth-child(5) > a")).click();
	driver.findElement(By.cssSelector(".Project Roles")).click();	   

	
	}

	private static void thread() {
		// TODO Auto-generated method stub
		
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	private static Object driver() {
		// TODO Auto-generated method stub
		return null;
	}

}
