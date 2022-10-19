package base_utility_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class Base_Class {
	public static WebDriver driver;
	
	public static void Launch_Browser(String Browser_Name) {
		
		switch (Browser_Name) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","F:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "Edge":
			System.setProperty("webdriver.edge.driver","F:\\Automation Tools\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		case "FireFox":
			System.setProperty("webdriver.gecko.driver","F:\\Automation Tools\\geckodriver FIREFOX\\geckodriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			Reporter.log(Browser_Name+" - Browser not Found");
			break;
		}
		
	}

}
