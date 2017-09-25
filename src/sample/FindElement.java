package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.myntra.com");
		 
		 
	}

}
