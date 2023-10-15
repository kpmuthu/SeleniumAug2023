package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
public static void main(String[] args) throws IOException {
	
	//Step1: Set up the report path
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
	
	//maintain the history
	reporter.setAppendExisting(true);
	
	//Step2: Create object for ExtentReports
	ExtentReports extent = new ExtentReports();
	
	//Step3: attach the data with the physical file
	extent.attachReporter(reporter);
	
	//Step4: Create a testcase 
	                              //   testName, testDescription
	ExtentTest test = extent.createTest("Login","Login with positive credentials");
	
	//Step5: Assign author and assign category
	test.assignAuthor("Subraja");
	test.assignCategory("smoke");
	
	//Step6: Step level status
	test.pass("Username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("../snaps/Stringmemory.png").build());
	test.pass("Password entered successfully");
	test.fail("Login is not successfull");
	
    ExtentTest test1 = extent.createTest("CreateLead","CreateLead with positive credentials");
	
	//Step5: Assign author and assign category
	test1.assignAuthor("Subraja");
	test1.assignCategory("smoke");
	
	//Step6: Step level status
	test1.pass("Username entered successfully");
	test1.pass("Password entered successfully");
	test1.pass("Login is not successfull");
	
	//Step7: Mandatory step
	extent.flush();
	
	System.out.println("Done");
	
}
}
