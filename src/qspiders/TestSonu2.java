package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestSonu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 
	       WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
	       Sonu2 s2=new Sonu2();
	       PageFactory.initElements(driver, s2);
	       s2.login("viji047@gmail.com","9036728144");
	      // s2.login("9036728144","");
	       
	      

	}

}
