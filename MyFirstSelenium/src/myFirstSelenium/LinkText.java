package myFirstSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe" );
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.newtours.demoaut.com/");
			driver.manage().window().maximize();
			//delete all cookies
			driver.manage().deleteAllCookies();
			//wait for page to be loaded
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			List<WebElement> ele = driver.findElements(By.tagName("a"));
			
			System.out.println("Number of link are:"  + ele.size());
			
			for(int i=0; i<ele.size(); i++) {
			System.out.println("Number of limk are:" + ele.get(i).getAttribute("href"));	
			}
			
			Thread.sleep(1000);
			driver.quit();


	}

}
