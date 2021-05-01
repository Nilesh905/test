package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample5 
{
	@Test
	public void TC4() 
	{
	Reporter.log("running TC4");
	}
	@Test
	public void TC5()
	{
	Reporter.log("running TC5");
	}
	@Test
	public void TC6() 
	{
	// Assert.fail();
	Reporter.log("running TC6");
	}
	
}
