package qspiders;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sonu2 {
	
	@FindBy(id="Email")
	private WebElement emailTB;
	
	@FindBy(id="next")
	private WebElement nextBt;
	
	@FindBy(id="Passwd")
	private WebElement PasswdTB;
	
	@FindBy(id="signIn")
	private WebElement signInBt;
	
	
	
	
	
	public void login(String email,String psw)
	{
		emailTB.sendKeys(email);
		nextBt.submit();
		PasswdTB.sendKeys(psw);
		signInBt.click();
	}

}
