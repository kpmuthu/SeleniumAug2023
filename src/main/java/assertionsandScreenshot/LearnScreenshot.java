package assertionsandScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

public class LearnScreenshot {

	@Test
	public void takeScreenshot() throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.jiocinema.com/sports");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(
				By.xpath("//h2[text()='2nd ODI - IND vs AUS']/following::div[@class='mui-style-dqy2kp-gradient']"))
				.click();

		Thread.sleep(9000);
		// 6. Take a screen shot of the product displayed
		File from = driver.getScreenshotAs(OutputType.FILE);

		File to = new File("./snaps/img003.jpg");

		FileUtils.copyFile(from, to);

		driver.quit();

	}

}
