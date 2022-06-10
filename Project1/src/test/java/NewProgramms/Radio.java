package NewProgramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
		String url="https://www.rahulshettyacademy.com/dropdownsPractise/";
		
		driver.get(url);
		
		WebElement Radio=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		Radio.click();
		//System.out.println(Radio.isSelected());
		
		System.out.println(Radio.isDisplayed());
		
	List<WebElement> Radio1=driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']"));
	System.out.println(Radio1.size());
	
		
		
		
		
		
		
		
		

	}

}
