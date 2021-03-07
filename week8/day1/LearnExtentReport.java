package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//Step1: set the path for the result file
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result.html");
		reporter.setAppendExisting(true);
		
		//step2: create actual extent report data
		ExtentReports extent = new ExtentReports();
		
		//Step3: Attach the extent report data to the reporter
		extent.attachReporter(reporter);
		
		
		//Step4: testcase details
		ExtentTest test = extent.createTest("LoginAndLogout", "Login test for LeafTaps");
		test.assignAuthor("Hari");
		test.assignCategory("Smoke");
		
		//Step5: Test step status
		test.pass("Enter Username");
		test.pass("Enter Password");
		test.pass("Click Login button", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/email notification.png").build());
		
		
		//Step6: Is mandatory for all the execution
		extent.flush();
		
		
	}

}
