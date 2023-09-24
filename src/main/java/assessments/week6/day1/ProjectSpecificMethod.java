package assessments.week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	public ChromeOptions options;
	public String excelFilePath;
	public String sheetName;


		@Parameters({"Browsername","URL", "Username", "Password"})
		@BeforeMethod
		public void precondition(String browsername, String url, String uName, String pWord) {
			if (browsername.contains("Chrome")) {
				options = new ChromeOptions();
				// options.setBinary("116");
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
			} else if (browsername.contains("Edge")) {
				driver = new EdgeDriver();
			}
			else
			{
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(uName);
			driver.findElement(By.id("password")).sendKeys(pWord);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@DataProvider(name = "dyno01")
	public String[][] testdata() throws IOException {
		String[][] data = ReadExcel.getData(excelFilePath, sheetName);
		return data;
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
