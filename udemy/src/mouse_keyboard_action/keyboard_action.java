package mouse_keyboard_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action {
	

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		  driver.get( "http://demo.automationtesting.in/Register.html" );
        driver.manage().window().maximize();
        
        
        Actions act=new Actions(driver);  //need to pass driver as parameter
        
        WebElement txt=driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
  
       Action all =act.sendKeys(txt,"rohan").sendKeys(Keys.SHIFT).sendKeys("234").build();
      all.perform();
      
       
       
      
      
        
        
}

}
