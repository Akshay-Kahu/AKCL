package test_package;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_utility_package.Base_Class;

public class Validate_Top_Offers extends Base_Class {
  
	@BeforeClass
	public void Initial_Activity() throws IOException {
		Launch_Browser(Get_Property_Text("Browser"));
		Static_Wait(2);
		Initialization();
		Static_Wait(5);
		top_offer.Pop_Up_cancel();
	}
	
	@BeforeMethod
	public void Handle_pop_up() {
		Static_Wait(5);
		top_offer.view_all_offer();
	}
	@Test
	public void Validate_top_offer_text() throws IOException {
		Static_Wait(5);
		String actual = top_offer.top_offer_check();
		String expected = Get_Property_Text("test1");
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Validate_Sandisk() throws IOException {
		Static_Wait(5);
		String actual = top_offer.sandisk();
		String expected = Get_Property_Text("test2");
//		String expected = "SanDisk";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Validate_Water_Bottle() throws IOException {
		Static_Wait(5);
		String actual = top_offer.water_bottle();
		String expected = Get_Property_Text("test3");
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Validate_Apple_ipad() throws IOException {
		Static_Wait(5);
		String actual = top_offer.apple_ipads();
		String expected = Get_Property_Text("test4");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Validate_Office_supplies() throws IOException {
		Static_Wait(5);
		String actual = top_offer.office_supplies();
		String expected = Get_Property_Text("test5");
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Validate_pens() throws IOException {
		Static_Wait(5);
		String actual = top_offer.pens();
		String expected = Get_Property_Text("test6");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Validate_Hp_mouse() throws IOException {
		Static_Wait(5);
		String actual = top_offer.hp_mouse();
		String expected = Get_Property_Text("test7");
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Validate_Lunch_Box() throws IOException {
		Static_Wait(5);
		String actual = top_offer.Lunch_Box();
		String expected = Get_Property_Text("test8");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Validate_Soundbar_Home_theatres() throws IOException {
		Static_Wait(5);
		String actual = top_offer.home_theature();
		String expected = Get_Property_Text("test9");
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Validate_Home_Temples() throws IOException {
		Static_Wait(5);
		String actual = top_offer.home_temples();
		String expected = Get_Property_Text("test10");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Validate_Musical_toys() throws IOException {
		Static_Wait(5);
		String actual = top_offer.musical_toys();
		String expected = Get_Property_Text("test11");
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void Validate_Puzzle() throws IOException {
		Static_Wait(5);
		String actual = top_offer.puzzle();
		String expected = Get_Property_Text("test12");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Validate_Learning_toy() throws IOException {
		Static_Wait(5);
		String actual = top_offer.learning_toys();
		String expected = Get_Property_Text("test13");
		Assert.assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void Navigate_to() {
		driver.navigate().to("https://www.flipkart.com/");
		Static_Wait(5);
	}
	
	@AfterClass
	public void quit() {
		Quit_Browser();
	}

}
