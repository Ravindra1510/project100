package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
	  String expected="actiTIME - Login";
	  String actual=driver.getTitle();
	  
	 /* if(actual.equals(expected))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }*/
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();;

	  driver.quit();
	}

}
