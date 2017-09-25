package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {
	public static String Key1="webdriver.gecko.driver";
	public static String Value1="./driver/geckodriver.exe";
	
	public static String Key2="webdriver.chrome.driver";
	public static String Value2="./driver/chromedriver.exe";
	
	 static
	 {
		 System.setProperty(Key1,Value1);
		 System.setProperty(Key2, Value2);
		 
	 }
	 
	 public static void testBrowser(WebDriver driver)
	 {
		 driver.get("https://www.akademe.in/");
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.quit();
	 }
	 
	 public static void main(String[] args)
	 {
		 WebDriver driver=new FirefoxDriver();
		 Demo9.testBrowser(driver);
		 
		 Demo9.testBrowser(new ChromeDriver());
		 
		 
	 }

}
