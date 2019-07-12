package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderScrollHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/?ref=southwestairline.com");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).sendKeys("Dallas");
		driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).sendKeys("LGA");
		
		JavascriptExecutor date = (JavascriptExecutor) driver;
		date.executeScript("document.getElementById('LandingPageAirSearchForm_departureDate').value='02/25/2019'");
		date.executeScript("document.getElementById('LandingPageAirSearchForm_returnDate').value='02/28/2019'");
		
		Thread.sleep(4000);
		driver.findElement(By.id("LandingPageAirSearchForm_submit-button")).click();
		
		//driver.close();
	}

}
