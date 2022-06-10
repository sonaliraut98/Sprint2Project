package BasicProgramme1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		//LOCATORS
		
		driver.findElement(By.id("user-name")).sendKeys("sonali");
	    driver.findElement(By.className("form_input")).sendKeys("Complete");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("Over");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("fgytg");
		driver.findElement(By.tagName("form_input")).sendKeys("1234");
		
		
		
		

	}

}
