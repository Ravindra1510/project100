package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	 private WebElement login;
	 
	 public LoginPage(WebDriver driver)
	 {
		 login=driver.findElement(By.id("Login"));
	 }
	 
	 public void clickLogin()
	 {
		 login.click();
	 }
}
