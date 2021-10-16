package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_css_xpath {


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		  driver.get( "https://en-gb.facebook.com/" );
    	      
        driver.manage().window().maximize();
        
        
        /*
  
        // cssselector id find kie lie -->id
        
        WebElement pass=driver.findElement(By.cssSelector("input#email]"));
        pass.sendKeys("rohan");
        
        //css for class find   --->class find   (agar muliple class hogi to . se seperate karenge )  aise-->breakclass
        WebElement email=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy]"));
        email.sendKeys("rohan");
        */
        
        // dynamic change ho rha ho attribute me to starting ka word ho last ka likh kar find karte hai  ---> (^)SYMBOL SE 
        
        
       // WebElement s=driver.findElement(By.cssSelector("input[id^='ema']"));//ending ke lie ($) use karte hai     $<<-----
       // s.sendKeys("rohan");
        // input[id*='mai']     <---sabhi ke liye hoga first or last or middle
        // input[id^='mai']      <====fist word find
        // input[id$='mai']     <====for last word find
        
        
                               
        
                                        //xpath ==>
        
        //relative
       
       // WebElement xpath=driver.findElement(By.xpath("//input[@id='email']"));
      //  xpath.sendKeys("rohan");
        
        // jab 1 text box me 2 text enter karna ho check ke liye fir forget ka link
        //text
        WebElement xpath=driver.findElement(By.xpath("//input[@id='email']"));
        xpath.sendKeys("rohan");
        Thread.sleep(3000);
        xpath.clear();
        
        WebElement xpath1=driver.findElement(By.xpath("//input[@id='email'or@name='email'or@type='text']"));
        xpath1.sendKeys("poddar");
        
        //text se find karna
        WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        link.click();
        
        //contailer xpath--->>adha likha text bhi run hoga 
      //  WebElement l=driver.findElement(By.xpath("//a[containstext().'Forgotten']"));
   //     l.click();
       
        //travesing -- backward search karta hai 
      //  WebElement radio=driver.findElement(By.xpath("//label[text()='femail'/../input]"));
      //  radio.click();
        
        
        
	}}
