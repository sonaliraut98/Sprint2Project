package BasicProgramme1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		
	WebDriver driver =new ChromeDriver();
//		
driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
//		
  	driver.manage().window().maximize();
//		
//		WebElement DropDown=driver.findElements(By.xpath("//span[@text()='from']")).Click();
//		
//		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
//				
//		from.sendKeys("sydney");
//				
//		
//		Thread.sleep(2000);
//		
//		from.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		
//		from.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		


driver.close();

	}

}
