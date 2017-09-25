package combinestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	
	public static void verifyTitle(WebDriver driver,String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		try
		{
		wait.until(ExpectedConditions.titleIs(eTitle));
		System.out.println("Pass");
	}
		
		catch(TimeoutException e)
		{
			System.out.println("Fail");
		}
		
		System.out.println("Exoected Title:"+eTitle);
		String aTitle=driver.getTitle();
		System.out.println("Actual Title:"+aTitle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		

		driver.get("http://localhost/login.do");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
		verifyTitle(driver,"actiTIME - Enter Tim-Track");
		driver.findElement(By.id("logoutLink")).click();
		verifyTitle(driver,"actiTIME - Login");
		driver.quit();

	}

}
