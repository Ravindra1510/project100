package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOption_selected{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Vidya%20Shree/Desktop/select.html");
		
		WebElement listBox=driver.findElement(By.id("mtr"));

		/*Select select=new Select(listBox);
		select.selectByIndex(0);
		select.selectByValue("d");
		select.selectByVisibleText("Poori");
		
		if(select.isMultiple())
		{
			select.deselectByIndex(0);
			select.deselectByValue("d");
			select.deselectByVisibleText("Poori");
		}
		
		else
		{
			System.out.println("sorry");
		}*/
		
		
		Select select=new Select(listBox);
	    List<WebElement> allOptions=select.getOptions();
	    int count=allOptions.size();
	    System.out.println(count);
	    
	    for(int i=0;i<count;i++)
	    {
	    	WebElement option=allOptions.get(i);
	    	String text=option.getText();
	    	System.out.println(text);
	    }
	}

}
