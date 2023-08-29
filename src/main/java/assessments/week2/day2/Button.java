package assessments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Scenario1:Click and Confirm title
		driver.findElement(By.xpath("//span[text()='Click']")).click();		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Scenario2:Confirm if the button is disabled
		driver.navigate().back();
		Thread.sleep(2000);
		boolean enabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println(enabled);	
		
		//Scenario3: 
		Point location = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']")).getLocation();
		System.out.println(location);		
		
	}

}
