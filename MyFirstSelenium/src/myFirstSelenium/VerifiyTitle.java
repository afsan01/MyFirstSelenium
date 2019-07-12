package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiyTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		String ExpectedTitle = "Login - TechFios Test Application - Billing";
		String ActualTitle = "";
		
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ActualTitle =driver.getTitle();
		
		if(ActualTitle.contentEquals(ExpectedTitle)){
			System.out.println("Test case Passed");
			
		}
		else {
			System.out.println("Test Case is Failed");
		}
		//driver.quit();

	}

}
