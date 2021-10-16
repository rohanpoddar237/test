package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport {

	public static void main(String[] args) {
	
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        

        System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
		WebDriver driver = (WebDriver)new ChromeDriver();
		
		test.log(Status.INFO, "starting case ");
    	
        String baseUrl = "https://www.google.com/";
        
        test.pass("nav to search box");
        
        driver.get(baseUrl);
		
		driver.findElement(By.name("q")).sendKeys("automathion");
		
		test.pass("entered ");
		
		driver.close();
		
		test.pass("closed ");
		
		test.pass("completed ");
		
		// calling flush writes everything to the log file
        extent.flush();
 
	}

}
