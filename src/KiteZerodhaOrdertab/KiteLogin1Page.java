package KiteZerodhaOrdertab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy(xpath="//input[@id='userid']") private WebElement un;
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	
	
	public KiteLogin1Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setKiteLogin1Pageun()
	{
		un.sendKeys("DV1510");
		
	}
	
	public void setKiteLogin1Pagepwd()
	{
		pwd.sendKeys("Vijay@123");
		System.out.println("omp");
	}
	
	public void clickKiteLogin1Pagelogin()
	{
		login.click();
	}

}
