package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Saucedemo extends BaseClass {

	@BeforeTest
	public void setdata() {
		System.out.println("before Test started");
		excelFilePath = "./testdata/SauceAddProduct.xlsx";
		sheetname = "AddProduct";
	}

	@Test(dataProvider = "testdata")
	public void Saucedemotestcase(String Productname) throws InterruptedException {

		int size = driver.findElements(By.xpath("(//div[@class='inventory_item_name'])")).size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {

			String text2 = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[" + i + "]")).getText();
			System.out.println(text2);
			if (text2.equals(Productname) || text2.equals(Productname) || text2.equals(Productname)) {
				int size1 = driver.findElements(By.xpath("(//button[@class='btn_primary btn_inventory'])[" + i + "]"))
						.size();
				for (int j = 1; j <= size1; j++) {
					driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[" + j + "]")).click();
					break;
				}
			}

		}

		driver.findElement(By.xpath("//*[local-name()='svg' and @data-icon='shopping-cart']")).click();
		int size2 = driver.findElements(By.xpath("//div[@class='inventory_item_name']")).size();
		for (int i = 1; i <= size2; i++) {
			String text2 = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[" + i + "]")).getText();
			System.out.println(text2);
			if (text2.equals(Productname) || text2.equals(Productname) || text2.equals(Productname)) {
				Thread.sleep(20000);
				System.out.println("All the products are added");

			}

		}

	}

}
