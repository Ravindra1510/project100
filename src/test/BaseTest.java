package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
  @BeforeSuite
  public void start()
  {
	  Reporter.log("start",true);
  }
  
  @AfterSuite
  public void end()
  {
	  Reporter.log("End",true);
  }
  
  @BeforeTest
  public void ConnectDB()
  {
	  Reporter.log("connectDB",true);
  }
  
  @AfterTest
  public void disconnectDB()
  {
	  Reporter.log("disconnectDB",true);
  }
  
  @BeforeClass
  
	  public void OpenApp()
	  {
		  Reporter.log("openApp",true);
	  }
  
  @AfterClass
  public void closeApp()
  {
	  Reporter.log("closeApp",true);
	  
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("login",true);
  }
  
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("logOut",true);
  }
  }
  
