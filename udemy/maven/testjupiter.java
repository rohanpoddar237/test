package maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class testjupiter {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
    	
        String baseUrl = "https://csp-demo.jupiterintel.com/";
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
       
   
        
        
      driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiInput-input\" and @type=\"text\"]")).sendKeys("test2@vrtechnologies.info");
      
     
        driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiInput-input\" and @type=\"password\"]")).sendKeys("Dev@test2jupiter");
        
         
        
       driver.findElement(By.className("button-container")).click();
       
      
       WebElement popupelement = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Ok']")));
       popupelement.click();
       

       driver.findElement(By.cssSelector("button[aria-controls='customized-menu']")).click();
       
       driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
       
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/main/div[2]/div/div/div/div[1]/div[1]")).click();
       
       driver.findElement(By.cssSelector("div[id^=mui-component-select-selectedYear]")).click();
       
       driver.findElement(By.cssSelector("li[data-value='2030']")).click();
       
       driver.findElement(By.cssSelector(" input[value='10']")).click();
       
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/main/div[2]/div[1]/div/div[4]/div/div[2]/div/fieldset/div/label[3]/span[1]/span[1]/input")).click();
     
       driver.findElement(By.cssSelector("div[id='mui-component-select-selectedEventProbability']")).click();
       
       
       driver.findElement(By.cssSelector("li[label='4%']")).click();
       
       
       //            for data explorer---->
       driver.findElement(By.cssSelector("div[title='Data Layers']")).click();
       
       
       
       //            for data layer---->
       
       driver.findElement(By.cssSelector("div[title='Data Explorer']")).click();
       
       
       //             for flood score---->
       
       driver.findElement(By.cssSelector("div[title='FloodScore']")).click();
       
       
       //           for search operation--->
       
     //  driver.findElement(By.cssSelector("input[aria-autocomplete='both']")).sendKeys("port arthur");
       
     //  driver.findElement(By.cssSelector("input[value='port arthur']")).click();
       
       
       //             for sign out---->
 
      // driver.findElement(By.cssSelector("div[title='Sign Out']")).click();
    
       
      // driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]")).click();
       
       
	}
	

}
