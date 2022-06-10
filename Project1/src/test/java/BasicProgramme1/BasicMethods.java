package BasicProgramme1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		String url=("https://www.saucedemo.com/");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
	String Title=driver.getTitle();
	System.out.println(Title);
	
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
	
	//driver.navigate().to("https://www.google.com");
	//driver.close();
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@type='checkbox' and @name='ot-group-id-3']"));
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
	
	WebElement webElement= driver.findElement(By.xpath("//div[@class='inventory_item_description']"));
	System.out.println(webElement);
	
	driver.navigate().to("https://www.alchemy.com/");
	
	String windowhandle=driver.getWindowHandle();
	System.out.println(windowhandle);
	driver.quit();
	
 driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/a[1]")).click();
 
Set<String> windowhandles=driver.getWindowHandles();
 System.out.println(windowhandle);
 
 
 
 
	}

}
