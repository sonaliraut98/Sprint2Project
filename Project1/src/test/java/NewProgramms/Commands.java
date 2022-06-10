package NewProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	private static final char[] Source = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
//		driver.findElement(By.className("hspDDf"));
//		driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		String url=driver.getTitle();
		System.out.println(url);
		
		String Title=driver.getCurrentUrl();
		System.out.println(Title);
//		
//	   String source=driver.getPageSource();
//	   System.out.println(Source);
	   
	   driver.close();
	  // driver.quit();
		
		
		
		
		
		

	}

}
