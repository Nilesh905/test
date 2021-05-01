package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
//step1: declare d.m. globally
@FindBy(xpath="//input[@id='userid']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement PWD;
@FindBy(xpath="//button[@class='button-orange wide']")private WebElement login;

// step2: to initialize global d.m. 
public  KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
// step3: 
//enter UN
public void enterUN()
{
	UN.sendKeys("DV1510");
}
public void enterPWD()
{
	PWD.sendKeys("Vijay@123");
}
public void clickonloginButton()
{
	login.click();
}

}
