package base_utility_package;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_class implements ITestListener {

	
	
		@Override
		public void onTestFailure (ITestResult result) {
			Reporter.log("Test Case Failed - "+result.getName(),true);
			
		}
		@Override
		public void onTestSuccess (ITestResult result) {
			Reporter.log("Test Case Passed - "+result.getName(),true);
			try {
				Base_Class.utility_class.Take_Screen_shot();
			} catch (Exception e) {
				Reporter.log("No Name Screenshot ",true);
			}
		}
		@Override
		public void onTestSkipped (ITestResult result) {
			Reporter.log("Test Case Skipped - "+result.getName(),true);
		}

	}
