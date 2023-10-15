package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CVP",Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		WebElement baseTable = driver.findElement(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader stickyTrainListHeader\"]"));
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader stickyTrainListHeader\"]/tbody/tr/td[2]"));
		
		for (WebElement webElement : findElements) {
			
			String trainNames = webElement.getText();
			System.out.println(trainNames);
			
		}
		driver.close();
		
	}

}
