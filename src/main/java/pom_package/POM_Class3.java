package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Class3 {
	
	@FindBy(xpath="//div[text()='Grocery']") private WebElement Grocery;
	
	@FindBy(xpath="//a[text()='Login']") private WebElement Login;
	
	@FindBy(xpath="//div[text()='Flipkart Plus Zone']") private WebElement Flipkart_Plus_Zone;
    
	@FindBy(xpath="//div[text()='EARNED SUPERCOINS']") private WebElement EARNED_SUPERCOINS;
	public void Grocery() {
		Grocery.click();
	}
	public void Login() {
		Login.click();
	}
	public void Flipkart_Plus_Zone() {
		 Flipkart_Plus_Zone.click();	
	}
	public void EARNED_SUPERCOINS () {
		EARNED_SUPERCOINS.isDisplayed();
	}
}

