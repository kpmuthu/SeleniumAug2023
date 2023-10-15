package assertionsandScreenshot;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class ScreenshotExample {
    public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

        // Navigate to a website
        driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(4000);
		
        try {
            // Take a screenshot and store it as a file
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Specify the path where you want to save the screenshot
            String destinationPath = "./snaps/img002.jpg";

            // Copy the screenshot file to the destination path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));

            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}