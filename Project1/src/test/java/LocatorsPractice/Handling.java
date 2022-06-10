package LocatorsPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/loginpagePractise/#";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
	//	driver.findElement(By.cssSelector(".blinkingText")).click();
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String>windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentId=it.next();
		String childId=it.next();
		
		
		driver.switchTo().window(parentId);
		
	//	driver.findElement(By.linkText("Mentorship")).click();
	
		driver.findElement(By.name("terms")).click();
		
		
		
		
		
		

	}

}
