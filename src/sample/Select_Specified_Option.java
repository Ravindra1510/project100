package sample;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Specified_Option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("option to search");
		Scanner sc=new Scanner(System.in);
		String expected=sc.nextLine();
		sc.close();
		System.out.println("Searching");
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Vidya%20Shree/Desktop/select.html");
		
		WebElement listBox=driver.findElement(By.id("mtr"));
		
		Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		int found=0;
		
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			if(text.equals(expected))
			{
				found++;
			}
		}
		
		if(found==0)
		{
			System.out.println("Not present");
		}
		
		if(found==1)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Duplicate");
		}
		


	}

}
