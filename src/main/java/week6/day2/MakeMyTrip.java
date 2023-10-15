package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeMyTrip extends BaseClass {
	@BeforeTest
	public void setvalues() {
		System.out.println("before Test started");
		excelFilePath = "./testdata/tc001.xlsx";
		sheetname = "MakeMyTrip";

	}

	@Test(dataProvider = "testdata")
	public  void MakeMyTripTC(String fromplace,String toPlace) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.xpath("//source[@type='image/jpeg']/../img")).click();
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHolidays']")).click();

		WebElement fromcity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromcity.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='citypicker_input']")).clear();
		driver.findElement(By.xpath("//input[@class='citypicker_input']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[@class='appendLeft8 blackText']")).click();

		WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
		toCity.click();
		// driver.findElement(By.xpath("dest-search-input")).clear();
		driver.findElement(By.xpath("//input[@class='dest-search-input']")).sendKeys("Goa");
		driver.findElement(By.xpath("(//div[@class='dest-city-container'])[2]")).click();

		driver.findElement(By.xpath("//div[@aria-label='Sun Oct 01 2023']")).click();
		driver.findElement(By.xpath("//button[@class='applyBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Filters']")).click();
	
		WebElement filtrFront = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-1']"));
		WebElement filtrback = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-2']"));
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		builder.dragAndDropBy(filtrFront, 50, 0).perform();
		builder.dragAndDropBy(filtrback, -200, 0).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.id("search_button")).click();

		driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();

		String title = driver.getTitle();
		System.out.println(title);

	}

}
