package combinestudy;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the element(t1/t2/t3)");
		Scanner sc=new Scanner(System.in);
		String v=sc.nextLine();
		sc.close();
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Vidya%20Shree/Desktop/hidden.html");
		
		try
		{
		WebElement element=driver.findElement(By.id(v));
		System.out.println("present in src");
		if(element.isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		}
       catch(NoSuchElementException e)
		{
	       System.out.println("fail:element is not present in src");
		}
		
		driver.quit();
	}

}
