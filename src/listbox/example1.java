package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver","C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _55pi _2agf _4o_4 _63xb _p _4jy3 _517h _51sy']")).click();
		Thread.sleep(2000);
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		Select s = new Select(month);
		s.selectByValue("4");
		//driver.findElement(By.xpath("//select[@id='month']")).click();
		// WebElement list = driver.findElement(By.xpath("//select[@id='month']"));
		//Select s = new Select(list);
		//s.selectByIndex(2);
}
}