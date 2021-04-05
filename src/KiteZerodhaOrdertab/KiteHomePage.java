package KiteZerodhaOrdertab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//input[@id='search-input']") private WebElement search;
	@FindBy(xpath="//li[@class='search-result-item selected isadded']") private WebElement SBIN;
	@FindBy(xpath="//div[@class='avatar']") private WebElement pn;
	
	public KiteHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void verifyKiteHomePage_pn() 
	{
		String actualpn = pn.getText();
		String exppn = "kv";
				if(actualpn.equalsIgnoreCase(exppn))
				{
					System.out.println("Profile name is displaying correctly");
				}
				else
				{
					System.out.println("Profile name is not displaying correctly");
				}
		
	}
	
	
	public void setKiteHomePagesearch() throws InterruptedException
	{
		search.sendKeys("sbin");		
	}
	
	public void clickKiteHomePageSBIN()
	{
		SBIN.click();
	}
	
	
	

}
