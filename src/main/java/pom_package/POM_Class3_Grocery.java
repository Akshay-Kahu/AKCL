package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Class3_Grocery {

	@FindBy(xpath = "//div[text()='Grocery']")
	private WebElement Grocery;

	@FindBy(xpath = "//input[@title='Search grocery products'])")
	private WebElement Click_grocery;

	@FindBy(xpath = "//input[@title='Search grocery products'])")
	private WebElement search_grocery;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement click_button;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement Login;

	@FindBy(xpath = "//div[text()='Flipkart Plus Zone']")
	private WebElement Flipkart_Plus_Zone;

	@FindBy(xpath = "//div[text()='EARNED SUPERCOINS']")
	private WebElement EARNED_SUPERCOINS;

	public void Grocery() {
		Grocery.click();
	}

	public void click_grocery(String grocery) {
		Click_grocery.click();
	}

	public void search_grocery(String handwash) {
		search_grocery.sendKeys(handwash);
	}

	public void click_button() {
		click_button.click();
	}

	public void Login() {
		Login.click();
	}

	public void Flipkart_Plus_Zone() {
		Flipkart_Plus_Zone.click();
	}

	public void EARNED_SUPERCOINS() {
		EARNED_SUPERCOINS.isDisplayed();
	}
}
