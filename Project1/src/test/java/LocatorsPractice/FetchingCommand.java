package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCommand {

	private static final String Title = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
	
   WebDriver driver=new ChromeDriver();
   String url="https://www.saucedemo.com/";
   driver.get(url);
  
   String Title=driver.getTitle();
   System.out.println(Title);
  
 driver.navigate().to("https://www.google.com/");

//  driver.navigate().back();
//  driver.navigate().forward();
//  driver.findElement(By.id("user-name")).getText();
//  driver.findElement(By.id("password")).click();
//  driver.findElement(By.id("password")).sendKeys("secret_sauce");
//driver.findElement(By.id("password")).clear();
//driver.findElement(By.id("password")).sendKeys(Keys.BACK_SPACE);
//
//	
//   
//  String Text= driver.findElement(By.xpath("//input[@type='submit']")).getText();
//  String value = driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("font-size");
//               
//  String Attribute = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("class");
//   
//   System.out.println(Text);
//   System.out.println(value);
//   System.out.println(Attribute);
//   
   
   
	
		
		
	}

}
