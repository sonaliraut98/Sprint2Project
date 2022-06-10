package SeleniunProject.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	
	   System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
	   
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.get("https://rahulshettyacademy.com");
	   String title =driver.getTitle();
	   System.out.println(title);
	   driver.findElement(By.id("user_name"));
	   driver.findElement(By.tagName("text"));
	   
	   
	   
    }
}
