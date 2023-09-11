package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String Parentwindow = driver.getWindowHandle();

		String title2 = driver.getTitle();
		System.out.println(title2);

		driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS ')]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);

		driver.switchTo().window(list.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Flight")) {

			System.out.println("Driver switched to Child window");
		}
		
		driver.close();
		
		Thread.sleep(8000);
		
		driver.switchTo().window(Parentwindow);
		
		driver.close();

	}

}
