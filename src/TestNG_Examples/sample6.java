package TestNG_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample6 
{
	@Test
	public void TC7() 
	{
	Reporter.log("running TC7");
	}
	@Test
	public void TC8() 
	{
	Reporter.log("running TC8");
	}
	@Test
	public void TC9() 
	{
	Assert.fail();
	Reporter.log("running TC9");
	}
	
}
