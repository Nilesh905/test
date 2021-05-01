package TestNG_Examples;

	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class TestNG_Annotations
	{
		@BeforeClass
		public void openBrowser() {
			Reporter.log("--open browser---", true);
		}
		
		
		@BeforeMethod
		public void loginToApp()
		{
			Reporter.log("---Pre-condition: Login to app---", true);
		}
		
		@Test
		public void VerifyPN()
		{
			Reporter.log("running VerifyPN test case ", true);
		}
		
		
		@AfterMethod
		public void logoutFromApp()
		{
			Reporter.log("---Post-condition: Logout from app---", true);	
		}
		
		
		@AfterClass
		public void closeBrowser() {
			Reporter.log("--close browser---", true);
		}
		
		
	}

