package TestNG_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample4 
{
	@Test
	public void TC1()
	{
	Reporter.log("running TC1");
	}
	@Test
	public void TC2()
	{
	Reporter.log("running TC2");
	}
	@Test
	public void TC3()
	{
	Assert.fail();
	Reporter.log("running TC3");
	}
	
}
