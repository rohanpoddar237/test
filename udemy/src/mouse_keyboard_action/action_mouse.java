package mouse_keyboard_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_mouse {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		  driver.get( "http://demo.automationtesting.in/Register.html" );
        driver.manage().window().maximize();
        
        
        Actions act=new Actions(driver);  //need to pass driver as parameter
        
        WebElement txt=driver.findElement(By.linkText("Interactions"));
        WebElement txt1=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
        WebElement txt2=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
        
        
        act.moveToElement(txt).perform();//obj call
        act.moveToElement(txt1).perform();
        Thread.sleep(3000);
        
       act.moveToElement(txt2).perform();
        
        
 
   
        

	}

}
