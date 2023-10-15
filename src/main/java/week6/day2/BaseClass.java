package week6.day2;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver;
	public ChromeOptions options;

	public String excelFilePath;
	public String sheetname;

	@Parameters({ "Browsername", "URL" })
	@BeforeMethod
	public void precondition(String browsername, String url) {
		System.out.println("Base class started");
		if (browsername.contains("Chrome")) {
			options = new ChromeOptions();
			// options.setBinary("116");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if (browsername.contains("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

	}

	@DataProvider(name = "testdata")
	public String[][] senddata() throws IOException {
		System.out.println("Data Provider started");
		/*
		 * String[][] data=new String[2][4]; data[0][0]="Testleaf";
		 * data[0][1]="Petchimuthu"; data[0][2]="Kasimani"; data[0][3]="123";
		 * 
		 * data[1][0]="Petchi&co"; data[1][1]="Petchi"; data[1][2]="Muthu";
		 * data[1][3]="1234";
		 * 
		 * return data;
		 */
		System.out.println("Data Provider finished");
		return ReadExcelOwn.exceldata(excelFilePath, sheetname);

	}

	@AfterMethod
	public void postcondition() {
		//driver.quit();
	}

}
