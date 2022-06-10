package NewProgramms;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

			WebDriver driver=new ChromeDriver();
			String url="https://www.rahulshettyacademy.com/dropdownsPractise/";
			
			driver.get(url);
			
			String Title=driver.getTitle();
			System.out.println(Title);
			
				WebElement Ddown=driver.findElement(By.id("id=\"ctl00_mainContent_ddl_originStation1_CTXT"));
			Select select= new Select(Ddown);
		
	}

}
