package mouse_keyboard_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		  driver.get( "https://www.google.co.in/" );
        driver.manage().window().maximize();
        
        
        Actions act=new Actions(driver);  //need to pass driver as parameter
        
        WebElement txt=driver.findElement(By.name("q"));
  
           txt.sendKeys("selenium download");
          
         Action all=(Action) act.sendKeys(txt, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        
       all.perform();
       
}

}
