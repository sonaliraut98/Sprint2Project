package SeleniunProject.Project1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		

	}

}
