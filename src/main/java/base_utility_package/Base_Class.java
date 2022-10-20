package base_utility_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Base_Class {
	public static WebDriver driver;
	public static Utility_Class utility_class;

	public static void Launch_Browser(String Browser_Name) {

		switch (Browser_Name) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "Edge":
			System.setProperty("webdriver.edge.driver", "F:\\Automation Tools\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		case "FireFox":
			System.setProperty("webdriver.gecko.driver", "F:\\Automation Tools\\geckodriver FIREFOX\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			Reporter.log(Browser_Name + " - Browser not Found", true);
			break;
		}

		driver.manage().window().maximize();

		try {
			driver.get(Get_Property_Text("URL"));
		} catch (IOException e) {
			Reporter.log("Check URL from Properties File");
		}

	}

	public static void Initialization() {
		utility_class = new Utility_Class(driver);
		
	}

	public static void Refresh_Browser() {
		driver.navigate().refresh();
	}

	public static String Get_Title() {
		return driver.getTitle();
	}

	public static void Close_browser() {
		driver.close();
	}

	public static void Quit_Browser() {
		driver.quit();
	}

	public static void Static_Wait(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (Exception e) {
			Reporter.log("Wait not working", true);
		}
	}

	public static void Alert_pop_Dismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void Switch_to_Child() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		it.next();
		driver.switchTo().window(it.next());
	}

	public static void Switch_to_Parent() {
		driver.switchTo().window(driver.getWindowHandle());
	}
	

	public static String Get_Property_Text(String key) throws IOException {
		Properties property = new Properties();
		FileInputStream file = new FileInputStream(System
				.getProperty("user.dir" + "Maven_FlipKart_Validation\\src\\test\\resources\\Flipkart.properties"));
		property.load(file);
		return property.getProperty(key);
	}

}
