package extent_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase
	{
	public static Test endtest;
	public static ExtentReports report;
	public static WebDriver driver;
	

	@BeforeTest
	public static void startTest()
	{
        System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_for94\\chromedriver.exe");
	driver=new ChromeDriver();

	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	
	// create ExtentReports and attach reporter(s)
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
    ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
   
	}
	@AfterTest
	public static void endTest()
	{
	
	report.flush();
	driver.quit();
	}

	}
