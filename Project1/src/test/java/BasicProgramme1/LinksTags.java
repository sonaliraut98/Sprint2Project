package BasicProgramme1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Webdriver Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		String url=("http://uniformm1.upskills.in/");
		driver.get(url);
		
	driver.manage().window().maximize();
		
		List<WebElement> alltags=(List<WebElement>) driver.findElementByTagName("a");
	System.out.println("Total tags ar e= "+ alltags.size())	;
	
	for(int i=0; i<alltags.size() ; i++)
	{
		System.out.println("Links on page"+alltags.get(i).getAttribute("href"));
		System.out.println("links on pade are"+alltags.get(i).getText());
	}
	
	
	
		
	}

}
