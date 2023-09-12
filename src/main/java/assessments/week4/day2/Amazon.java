package assessments.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String amount = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String updatedamount = amount + ".00";
		System.out.println("Parent windonw amount " + updatedamount);

		String firstamount = amount.replaceAll("\\D", "");
		System.out.println(firstamount);
		String ratingcount = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"))
				.getText();
		System.out.println(ratingcount);
		String parenrtWindow = driver.getWindowHandle();
		String pTitle = driver.getTitle();
		System.out.println("Parent Window Title " + pTitle);

		driver.findElement(
				By.xpath("//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-clamp-2')]//span"))
				.click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);

		driver.switchTo().window(list.get(1));
		String cTitle = driver.getTitle();
		System.out.println("Chile windoew Title " + cTitle);

		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);

		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>(windowHandles1);

		driver.switchTo().window(list1.get(1));
		String cTitle1 = driver.getTitle();
		System.out.println("Chile windoew Title " + cTitle1);
		// driver.switchTo().frame("(//iframe)[3]");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']/../input")).click();

		String amountAtc = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']/span")).getText()
				.trim();

		System.out.println("Add to cart sub total " + amountAtc);

		if (updatedamount.equals(amountAtc)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		driver.quit();
	}

}
