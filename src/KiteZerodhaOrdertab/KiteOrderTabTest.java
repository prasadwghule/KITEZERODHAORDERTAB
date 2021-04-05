package KiteZerodhaOrdertab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteOrderTabTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\"
				+ "BROWSERS\\Chrome_driver\\chromedriver_win32 88\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com");
			
			KiteLogin1Page login1=new KiteLogin1Page(driver);
			login1.setKiteLogin1Pageun();
			login1.setKiteLogin1Pagepwd();
			login1.clickKiteLogin1Pagelogin();
			
			
			KiteLogin2Page login2=new KiteLogin2Page(driver);
			login2.setKiteLogin2Pagepin();
			login2.clickKiteLogin2Pagecntbtn();
			
			KiteHomePage home=new KiteHomePage(driver);
			home.verifyKiteHomePage_pn();
			home.setKiteHomePagesearch();
			home.clickKiteHomePageSBIN();
			
			KiteBuyTabPage buy=new KiteBuyTabPage(driver);
			buy.clickKiteBuyTabPage_longtermbtn();
			Thread.sleep(3000);
			buy.setKiteBuyTabPage_qty();
			Thread.sleep(5000);
			buy.clickKiteBuyTabPage_marketbtn();
			buy.clickKiteBuyTabPage_buybtn();
			
			
	}
	

}
