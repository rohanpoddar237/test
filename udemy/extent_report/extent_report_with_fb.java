package extent_report;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;



	public class extent_report_with_fb extends TestBase
	{
	@Test
	void verifyURL()
	{
	driver.get("https://www.facebook.com/");

	endtest = report.startTest("Test to verify Facebook URL");//Test title

	endtest.log(LogStatus.PASS, "Enter the URL Success");
	String url=driver.getCurrentUrl();
	try{
	Assert.assertEquals(url, "https://www.facebook.com/");
	endtest.log(LogStatus.PASS, "URL is correct");
	}
	catch(Exception e)
	{
	endtest.log(LogStatus.FAIL, "URL is not correct");
	}
	}
	
	
	@Test
	void verifyTitle()
	{
	driver.get("https://www.facebook.com/");
	endtest = report.startTest("Test to verify Facebook Title");//Test title
	endtest.log(LogStatus.PASS, "Enter the URL Success");
	String title=driver.getTitle();
	System.out.println(title);
	try{
	Assert.assertEquals(title, "Facebook – log in or sign up");
	endtest.log(LogStatus.PASS, "Title is correct");
	}
	catch(Exception e)
	{
	endtest.log(LogStatus.FAIL, "Title is not correct");
	}
	}
	}


}
