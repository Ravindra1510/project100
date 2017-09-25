package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Content_ListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Vidya%20Shree/Desktop/select.html");
		
		WebElement listBox=driver.findElement(By.id("mtr"));
		
		Select select=new Select(listBox);
		
		List<WebElement> allOptions=select.getOptions();
		List<String> allText=new ArrayList<String>();
		//int count=allOptions.size();
		//System.out.println(count);
		
		for(WebElement option:allOptions)
			
		{
			String text=option.getText();
			allText.add(text);
		}
		Collections.sort(allText);
		
		for(String s:allText)
		{
			System.out.println(s);
		}

	}

}
