package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sonu1 {
	
	
	
	@FindBy(xpath="//a[@id='loginButton']/div")
	private WebElement nextBt;
	
	public Sonu1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickNext()
	{
		nextBt.click();
	}

}
