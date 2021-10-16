package test_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_action {

	public static void main(String[] args) 
{
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		  driver.get( "https://www.facebook.com/" );
    	      
        driver.manage().window().maximize();
 
		WebElement txt=driver.findElement(By.id("email"));
		txt.sendKeys("test2@vrtechnologies.info");
		
		//clear for clean the text
		txt.clear();
		txt.sendKeys("rohanpoddar");
		
		//get attribute field se koi attribute get karna ho text ka ya kisi ka bhi
		String output=txt.getAttribute("data-testid");
		System.out.println(output);
		
				
		//get text verification ke liye hota hai ,btn ko verify kiya hai uske attribute ko
		
         WebElement btn= driver.findElement(By.name("login"));
      // System.out.println("text of button is >>"+btn.getText());
        btn.click();
          
        // for verification perpose that btn is visible or not on screen
        System.out.println("dislay"+btn.isDisplayed());
        
        // btn is enabled or not
        System.out.println("dislay"+btn.isEnabled());
        
        //css check color,size of btn or text box or anything
        System.out.println("color test"+btn.getCssValue("color"));
    
        
	}

}
