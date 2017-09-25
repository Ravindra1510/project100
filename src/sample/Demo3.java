package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//String title=driver.getTitle();
		
		driver.findElement(By.xpath("//nobr[(contains(text(),'actiTIME 2015.2'))]")).click();;
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();;
	}

}
