package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class POM_Class1_Flight_and_Hotel {

	@FindBy(xpath = "(//div[@class='xtXmba'])[9]")
	private WebElement Flight;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement Source;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Destination;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Date;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement Traveller;

	public void Cl_Flight(String Flight_opt) {
		Flight.click();
	}

	public void Source_City(String City_NAme) {
		Source.sendKeys(City_NAme);
	}

	public void Destination_City(String Dest_City_Name) {
		Destination.sendKeys(Dest_City_Name);
	}
//public void Journey_Date(String JDate) {
//	Date.sendKeys(double JDate); 
//	}

	public void No_Traveller(String Travellers) {
		Traveller.sendKeys(Travellers);
	}
}
