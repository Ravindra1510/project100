package combinestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static boolean verifyTitle(WebDriver driver, String eTitle)
	{
		String aTitle=driver.getTitle();
		return aTitle.equals(eTitle);
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		if(verifyTitle(driver,"actiTIM - Login"))
		{
			System.out.println("pass:login page is displayed");
		
		
		
			
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(3000);
		
		if(verifyTitle(driver,"actiTIME - Enter Time-Track"))
		{
	 System.out.println("pass:Home page shld disp");
		}
		
		else
		{
			System.out.println("fail:HP shld nt  is displayed");

		}
		
		
		}
		else
		{
		System.out.println("Fail:login page shld not displayed");
		
	}
	}
	
	
}
	