package NewProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
		String url="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
	
		driver.get(url);
		driver.manage().window().maximize();
		
	//	driver.switchTo().frame(1);
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
	
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
