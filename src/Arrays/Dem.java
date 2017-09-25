package Arrays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Users/Vidya%20Shree/Desktop/links/table.html");

  WebElement ele=driver.findElement(By.id("t1"));
  List<WebElement> allTd=driver.findElements(By.tagName("td"));
  int sum=0;
  
  for(WebElement e:allTd)
  {
	  String text=e.getText();
	  
	  try
	  {
		  int v=Integer.parseInt(text);
		  System.out.println(v);
		  sum=v+sum;
	  }
	  
	  catch(Exception d)
	  {
		  
	  }
  }
  System.out.println(sum);

	}

}
