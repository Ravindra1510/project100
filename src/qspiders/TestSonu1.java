package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSonu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("http://localhost/login.do");
       Sonu1 s=new Sonu1(driver);
       s.clickNext();
       
	}

}
