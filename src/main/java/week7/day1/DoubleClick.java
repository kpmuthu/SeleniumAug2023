package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		RemoteWebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		
		Actions action=new Actions(driver);
		action.doubleClick(findElement).perform();
		
		

	}

}
