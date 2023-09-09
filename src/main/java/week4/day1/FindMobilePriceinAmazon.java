package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMobilePriceinAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		Thread.sleep(10000);

		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		int size = findElements.size();
		System.out.println(size);

		List<Integer> price = new ArrayList<>();
		for (WebElement ele : findElements) {
			text = ele.getText();
			System.out.println(text);
			String replaceAll = text.replaceAll(",", "");
			int mobileprice = Integer.parseInt(replaceAll);
			price.add(mobileprice);
		}

		Collections.sort(price);
		System.out.println(price.get(0));
		driver.close();

	}

}
