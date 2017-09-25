package combinestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {
//static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=JbA7WbGlK4by8Ae9uLOQDg");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement link=allLinks.get(i);//link returntype WebElement
			String text=link.getText();
			System.out.println(text);
        
        //String text=allLinks.get(count).getText();9999
        //System.out.println(txt.getText());
		}
	}

}
