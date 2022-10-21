package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_utility_package.Base_Class;

public class Validate_Grocery extends Base_Class {
	
	
	@BeforeClass
	public void Inital_Activity() throws IOException {
		Launch_Browser(Get_Property_Text("Browser"));
		Static_Wait(3);
		Initialization();

}
	@BeforeMethod
	 public void URL_Launch() throws InterruptedException {
	   driver.get("URL");
		// driver.get("https://www.flipkart.com/");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//div[@class='eFQ30H'])[10]")).click();
	}
	@Test
	public void Grocery_validation() {
		//Actual = Grocery Prices In India();
	}

}