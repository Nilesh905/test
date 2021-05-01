package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_quite 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver",".exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		// 3. quite:
		//driver.quit();
		}
		}

