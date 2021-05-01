package selinium_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_DDF 
{
public static void main(String[] args) throws IOException  
{
	//FileInputStream file = new FileInputStream ("C:\\Users\\client5\\Desktop\\Nilesh velocity Notes\\Selenium daily notes\\Selenium_Framework\\practise1.xlsx");
	FileInputStream file = new FileInputStream("C:\\Users\\client5\\Desktop\\Nilesh velocity Notes\\Selenium daily notes\\Selenium_Framework\\practise1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
// step1: enter UN
 String UN = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
// step2: enter PWD
 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
//step3: click on login button
driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
//step4: enter pin
String pin = sh.getRow(0).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
//step5: click on continue btn
driver.findElement(By.xpath("//button[text()='Continue ']")).click();
String ActUserId = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
String ExpUserId = sh.getRow(0).getCell(3).getStringCellValue();
if(ExpUserId.equals(ActUserId))
{
	System.out.println("pass");

}
else
{
	System.out.println("fail");
}
}
}
