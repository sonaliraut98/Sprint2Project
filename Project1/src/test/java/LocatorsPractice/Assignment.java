package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
	String url="http://demo.guru99.com/test/delete_customer.php";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("12334");
		
	//	 .withTimeout(30, TimeUnit.SECONDS); 
		driver.findElement(By.name("submit")).click();
	//	driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	String TITLE=	driver.switchTo().alert().getText();
		System.out.println(TITLE);


	}

}
