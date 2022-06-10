package BasicProgramme1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
//		driver.get("https://www.selenium.dev/documentation/");
//		
//		driver.findElement(By.linkText("")).click();
//		
		
	driver.get("https://developer.salesforce.com/signup");
	
	driver.findElement(By.xpath("//input[starts-with(@id,'input')]"));
	
	//******8 XPATH FOR THE TEXT()
		
    driver.findElement(By.xpath("//a[@text()=' Terms of Use']"));
    
    // *******write the xpath for the AND and OR ;
    
    
    driver.findElement(By.xpath("//input[@type='checkbox' and @name='ot-group-id-3']"));
    
		
		driver.close();

	}

}
