package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest{
	@Test(priority=2)
	public void testB()
	{
		Reporter.log("executing testB",true);
	}

}
