package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Dem.html");
		driver.findElement(By.xpath("/html/body/a")).click();
		

	}

}
