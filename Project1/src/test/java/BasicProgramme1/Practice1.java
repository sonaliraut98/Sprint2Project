package BasicProgramme1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("abcd");
	
	driver.findElement(By.id("password")).sendKeys("12345");
	driver.findElementByXPath("//*[@id=\"login-button\"]");
	
	driver.close();
	
	
	
		
		

	}

}
