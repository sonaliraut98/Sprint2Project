import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uniformProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();
	String url="http://uniformm1.upskills.in/";
		
		driver.get(url);
		driver.manage().window().maximize();

		
driver.findElement(By.partialLinkText("My Account")).click();

			
 
driver.findElement(By.name("email")).sendKeys("sonaliraut0512@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("Sonali@123");	

	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();	
		
	driver.findElement(By.linkText("Edit your account information")).click();
		
	driver.findElement(By.id("input-firstname")).sendKeys("@123");	
	
	driver.findElement(By.id("input-fax")).sendKeys("544632");
		
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();	
	
	driver.findElement(By.partialLinkText("Modify your wish list")).click();
	
	//driver.findElement(By.xpath("//*[text='Continue']")).click();
	driver.findElement(By.cssSelector("#content > div > div > a")).click();	
	
	//driver.findElement(By.xpath("//a[class='btn btn-primary']")).click();
	
	//driver.findElement(By.className("btn btn-primary")).click();
		
	driver.findElement(By.linkText("Modify your address book entries")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.id("input-company")).sendKeys("capgemini");
	
	driver.findElement(By.id("input-address-2")).sendKeys("pune");
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]/input")).click();	
	
	
	driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input")).click();
	
	
		

	}

}
