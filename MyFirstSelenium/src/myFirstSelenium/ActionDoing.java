package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionDoing {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.del.com/en-us#");
		//driver.navigate().to("https://www.objectspy.com/register/studentportal/detail_link.php?page_id=47");
		//driver.navigate().back();
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions action = new Actions (driver);
		action.moveToElement(driver.findElement(By.linkText("Financing"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Pay Bill & Manage Account")).click();
		
		driver.quit();
	}

}
