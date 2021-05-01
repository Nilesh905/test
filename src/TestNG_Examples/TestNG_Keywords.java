package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords 
{

@Test
public void login1() 
{
Reporter.log("running login TC1 ", true);
}

@Test
public void login2() 
{
Reporter.log("running login TC2 ", true);
}

@Test(dependsOnMethods={"login1","login2"})
public void logout()
{
Reporter.log("running logout TC3 ", true);
}
	
	
	
	
	
	
	
	
	
	
	
//	@Test(timeOut=8000)
//	public void TC1() throws InterruptedException
//	{
//		Thread.sleep(9000);
//		Reporter.log("RUNNING TC1",true);
//	}
	
//	@Test
//	public void TC2()
//	{
//		Reporter.log("RUNNING TC2",true);
//	}
	
//	@Test(enabled = true)
//	public void TC1()
//	{
//		Reporter.log("RUNNING TC1",true);
//	}
//	@Test(enabled = true)
//	public void TC2()
//	{
//		Reporter.log("RUNNING TC2",true);
//	}
	
//	@Test(priority=3)
//	public void TC2()
//	{
//		Reporter.log("RUNNING TC2",true);
//	}
//	
//	@Test(priority=1)
//	public void TC3()
//	{
//		Reporter.log("RUNNING TC2",true);
//	}
//	
//	@Test(priority=1)
//	public void TC4()
//	{
//		Reporter.log("RUNNING TC2",true);
//	}
//	
	
//@Test(invocationCount = 10)
//public void TC1()
//{
//	Reporter.log("RUNNING TC1",true);
//}
}
