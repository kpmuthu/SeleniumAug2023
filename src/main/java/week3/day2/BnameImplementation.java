package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BnameImplementation implements Browser {
	public RemoteWebDriver driver;

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

	}

	@Override
	public void startApp(String bname) {
		// TODO Auto-generated method stub

		switch (bname) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}

	}

}
