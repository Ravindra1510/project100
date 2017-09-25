package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest {
	@Test(priority=0, invocationCount=2)
	public void registerUser()
	{
		Reporter.log("registerUser",true);
	}
	
	@Test(priority=1)
	public void deleteAllUser()
	{
		Reporter.log("deleteAllUser",true);
	}
	

}
