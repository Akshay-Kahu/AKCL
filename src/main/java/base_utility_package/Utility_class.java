package base_utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_class {

	WebDriver driver;

	public Utility_class(WebDriver driver1) {
		driver = driver1;
	}

	public String Get_Excel_Data(int row_index, int cell_index) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir" + "src/test/resources/TC_Data.xlsx"));
		Sheet sheet = WorkbookFactory.create(file).getSheet("Flipkart");
		Cell cell = sheet.getRow(row_index).getCell(cell_index);
		try {
			return (int) cell.getNumericCellValue() + "";
		} catch (Exception e) {
			return cell.getStringCellValue();
		}

	}

	public void Take_Screen_shot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir" + "ScreenShot_Proof"));
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			Reporter.log("Directory Not found ", true);
		}
	}

}
