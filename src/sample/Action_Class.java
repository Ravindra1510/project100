package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.actimind.com/");
		
		WebElement element=driver.findElement(By.xpath("//span[.='About Company']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//span[.='Basic Facts']")).click();
		
		

	}

}
