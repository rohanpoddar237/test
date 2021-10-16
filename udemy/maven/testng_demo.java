package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class testng_demo {
	WebDriver driver =null;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();

	}
	public void google_search()
	{
		
  	
        String baseUrl = "https://www.google.com/";
        
 
        driver.get(baseUrl);
		
		driver.findElement(By.name("q")).sendKeys("automathion");
		
	}
		
		
		
	//	public Void down()
		{
			driver.close();
			
			System.out.println("close");
		
			
		}
		
	
	

}
