package combinestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitIn3Sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		try
		{
		driver.get("http://localhost/login.do");
		System.out.println("pass");
		}
		
		catch(Exception e)
		{
			System.out.println("Fail");
		}
		

	}

}
