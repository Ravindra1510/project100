package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		//String xp="input[type='password']";
		driver.findElement(By.cssSelector("input[.='textField']")).click();

	}

}
