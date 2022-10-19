package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TOP_Offer {

	public TOP_Offer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Top Offers']")
	private WebElement Top_Offer_text;

	@FindBy(xpath = "(//a[text()='VIEW ALL'])[1]")
	private WebElement View_All;

	@FindBy(xpath = "//div[text()='Top Offers']")
	private WebElement Top_offer_check;

	@FindBy(xpath = "//div[text()='SanDisk']")
	private WebElement SanDisk;

	@FindBy(xpath = "//div[text()='Water Bottles']")
	private WebElement Water_Bottle;

	@FindBy(xpath = "//div[text()='Apple iPads']")
	private WebElement Apple_Ipads;

	@FindBy(xpath = "//div[text()='Office Supplies']")
	private WebElement Office_Supplies;

	public String top_offer_text() {
		return Top_Offer_text.getText();
	}

	public void view_all_offer() {
		View_All.click();
	}

	public String top_offer_check() {
		return Top_offer_check.getText();
	}

}
