package KiteZerodhaOrdertab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//input[@id='search-input']") private WebElement search;
	@FindBy(xpath="//li[@class='search-result-item selected isadded']") private WebElement SBIN;
	
	
	public KiteHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteHomePagesearch() throws InterruptedException
	{
		search.sendKeys("sbin");
		Thread.sleep(3000);
				
	}
	
	public void clickKiteHomePageSBIN()
	{
		SBIN.click();
	}
	
	
	

}
