package BasicProgramme1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		
		ChromeDriver driver =new ChromeDriver();
		 
		driver.get("https://developer.salesforce.com/signup");
		
		driver.manage().window().maximize();
		
	WebElement dropdown=driver.findElement(By.name("country"));
		
		Select select= new Select(dropdown);
		
		select.selectByValue("AX");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Aland Islands"); ///single
		Thread.sleep(2000);
		
		select.selectByIndex(15);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		

	}

}
