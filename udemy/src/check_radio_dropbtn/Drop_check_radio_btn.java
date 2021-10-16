package check_radio_dropbtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_check_radio_btn {

public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		  driver.get( "http://demo.automationtesting.in/Register.html" );
    	      
        driver.manage().window().maximize();

        // Drop down select       

        
        WebElement pass=driver.findElement(By.id("Skills"));  
        Select skil =new Select(pass);   //passing parameter to constructor--->
        skil.selectByIndex(4);  // by index or value or text
        
        
     //   WebElement pass=driver.findElement(By.cssSelector("option[value='Android']"));
      //  pass.click();
        

        // check box
        
        WebElement check1=driver.findElement(By.cssSelector("input[value='Cricket']"));
        check1.click();
        
        
        WebElement check=driver.findElement(By.cssSelector("input[value='Movies']"));
        check.click();
        
        //radio  
        WebElement radio=driver.findElement(By.cssSelector(" input[value='Male']"));
        radio.click();
       
        
        
	}

}

