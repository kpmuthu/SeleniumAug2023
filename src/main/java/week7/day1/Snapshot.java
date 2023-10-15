package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Snapshot {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		RemoteWebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");			
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Interest-Based Ads']"));
		
		Actions action=new Actions(driver);
		action.scrollToElement(findElement).perform();
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file=new File("./snaps/amazon.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
	}

}
