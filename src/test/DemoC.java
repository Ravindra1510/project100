package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoC {
	public WebDriver driver;//we declare driver bcoz we use everywhere
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver=new ChromeDriver();
	}

	@AfterMethod
	
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void testC()
	{
		driver.get("http://localhost/login.do");
		String url=driver.getCurrentUrl();
		SoftAssert s=new SoftAssert();
		s.assertEquals(url,"http://localhost/login.do");
		
		/*String url=driver.getCurrentUrl();
		if(url.contains("login.do"))
		{
		  Reporter.log("URL contains login.do",true);	
		}
		else
		{
			Reporter.log("URL doesnot contains login.do",true);
			//s.fail();
		}*/
		s.assertAll();
	}
}
