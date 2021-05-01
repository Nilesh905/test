package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3_PrintOptionInList {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(3000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s = new Select(month);

		List<WebElement> options = s.getOptions();
		

		System.out.println(options.size());

		for (WebElement option : options) 
		{
			System.out.println(option.getText());
		}

//		for(int i=0; i<=options.size()-1; i++) {
//			System.out.println(options.get(i).getText());
//		}

//		for(int i=0; i<=options.size()-1; i++) {
//			WebElement option = options.get(i);
//			System.out.println(option.getText());
//		}

//		for(int i=0; i<=options.size()-1; i++) 
		//{
//			WebElement option = options.get(i);
//			String text = option.getText();
//			System.out.println(text);
//		}

	}
}