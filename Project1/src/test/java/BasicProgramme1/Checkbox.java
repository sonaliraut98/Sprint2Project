package BasicProgramme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily"));click();
   //  Thread.sleep(2000);
		
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily"));click();
		
		
		
		
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

	//private static void click() {
		// TODO Auto-generated method stub
		
	}

//	private static void click() {
//		// TODO Auto-generated method stub
//		
//	}

//	private static Exception sleep(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static void click() {
//		// TODO Auto-generated method stub
//		
	


