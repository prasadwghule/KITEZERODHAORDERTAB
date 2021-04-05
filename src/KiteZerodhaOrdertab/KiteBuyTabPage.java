package KiteZerodhaOrdertab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteBuyTabPage 
{
	
	@FindBy(xpath="//input[@step='1']") private WebElement qty;
	@FindBy(xpath="//button[@type='submit']") private WebElement buybtn;
	@FindBy(xpath="//input[@id='radio-196']") private WebElement marketbtn;
	@FindBy(xpath="//label[@for='radio-191']") private WebElement longtermbtn;
	
	
	public KiteBuyTabPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickKiteBuyTabPage_longtermbtn() 
	{
		longtermbtn.click();
	}
	
	public void setKiteBuyTabPage_qty()
	{
		qty.sendKeys("10");
	}
	
	public void clickKiteBuyTabPage_marketbtn()
	{
		marketbtn.click();
	}
	
	
	
	public void clickKiteBuyTabPage_buybtn() 
	{
		buybtn.click();
		
		
	}
	
	

}
