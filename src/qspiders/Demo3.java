package qspiders;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import java.util.List;


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.actimind.com/");
		String xp="//input[@value='Submit Request']";
		driver.findElement(By.xpath(xp)).click();
		
		try
		{
			Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
		}
		
		catch(Exception e)
		{
			
		}
		
		
		
		
		

	}

}
