package NewProgramms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	private static final Set<String> Windowhandles = null;
	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/?ir=1");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a")).click();
		
	Set<String>handle=driver.getWindowHandles();
	System.out.println(handle);
	
	Iterator<String>iterator=Windowhandles.iterator();
	String parentWindow=iterator.next();
	String childwindow =iterator.next();
	
	driver.switchTo().window(childwindow);
	
		driver.findElement(By.name("UserFirstName")).sendKeys("sonali");
		driver.findElement(By.name("UserLastName")).sendKeys("acadamey");
		

	}

}
