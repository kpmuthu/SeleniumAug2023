package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text2 = alert.getText();
		System.out.println("Alert Text"+text2);
		
		alert.accept();
		String text = driver.findElement(By.xpath("//button[text()='Try it']/../p")).getText();
		if(text.contains("OK"))
		{
			System.out.println("Alert Accepted");
		}
		else
		{
			System.out.println("Alert is not accepted");
		}
		
		
	}

}
