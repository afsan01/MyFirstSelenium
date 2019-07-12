package testPage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verizon {
	@Test
	public static void radioButton() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.verizonwireless.com/smartphones/samsung-galaxy-s10-plus/");
		
		/*List<WebElement> colorTextOptions = driver.findElements(By.className("colorText"));
		
		for(WebElement e : colorTextOptions) {
			if(e.getText().equalsIgnoreCase("Flamingo pink")) {
				e.click();
			}
		}*/
		//driver.findElement(By.cssSelector("#tile_container > div.col-sm-6.col-lg-offset-2.col-lg-4 > div.deviceConfig.padTop6.padBottom24.border_bottomBlack > div > div > div.row.noSideMargin.colorStackTopPad.padTop15 > div > div > div.row.noSideMargin > div > div:nth-child(6) > div")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='#ff9999']"));

       File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src, new File ("C:\\Users\\alvee\\Desktop\\Interview materials\\Picture.png\\"));


		driver.close();
	}

}
