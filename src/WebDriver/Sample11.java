package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample11 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
		Thread.sleep(3000);
		//String expResult = "facebook";
		String expResult = "google";
		//String actResult = driver.getTitle();
		String actResult = driver.getTitle();
		System.out.println(actResult);
		if  (actResult.equals(expResult))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
}
}	
			
			
			


