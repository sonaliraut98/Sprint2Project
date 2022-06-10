package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	//	driver.findElement(By.id("user-name")).sendKeys("sonali");
	
	//	driver.findElement(By.name("user-name")).sendKeys("raut");
		
	//	driver.findElement(By.className("bot_column\"));
		
		//driver.findElement(By.tagName("Password")).sendKeys("1234");
		
	//	driver.findElement(By.cssSelector("#password")).sendKeys("1234");
	
	//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		//driver.findElement(By.xpath("/*[@id=\"password\"]")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

//		WebElement Text=driver.findElement(By.xpath("//*[@contains,'error']"));
//		
//		System.out.println(Text.getText());
//		
		driver.findElement(By.xpath("//*[@placeholder='Username'  and  @id='user-name']")).sendKeys("sonali");
		

	}

}
