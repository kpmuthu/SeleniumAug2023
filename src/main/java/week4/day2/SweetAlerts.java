package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//p-autocomplete[@id='origin']//input")).sendKeys("MS",Keys.TAB);
		
		driver.findElement(By.xpath("//p-autocomplete[@id='destination']//input")).sendKeys("Cape",Keys.TAB);
		
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		
		//---Need to complete
		
		
	}

}
