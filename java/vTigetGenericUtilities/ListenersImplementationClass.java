package vTigetGenericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import vTigerObjectRepository.BaseClass;

/**
 * This class provide implementation of ITestListener Interface in TestNG
 * @author Admin
 *
 */
public class ListenersImplementationClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		
		 test = report.createTest(methodname);
		 test.log(Status.INFO, "->"+methodname+ "-Test executon started->");
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		System.out.println();
		test.log(Status.PASS, "->"+methodname+"Test is passed->");
		
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		test.log(Status.FAIL ,"->"+methodname+ "-Test is failed->");
		     test.log(Status.WARNING, result.getThrowable());
		//Screenshot of failure test cases
		
		String screenshot = methodname+"_"+new JavaUtility().getSystemDateinFormat();
		WebDriverUtility wutil= new WebDriverUtility();
		try {
			String path = wutil.takeScreenShot(BaseClass.sDriver ,screenshot);
			test.addScreenCaptureFromPath(path);//  attach screenshot to the report
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, "->"+methodname+ "-Test is skipped->");
		
		test.log(Status.WARNING, result.getThrowable());// means if the test case is skipped then u will get which exception occurrs
		
	}


	public void onStart(ITestContext context) {
		System.out.println("->suite execution started->");
		/*configure the extent report here*/                                  //Report-20 April 2023-03-49-55.html
		ExtentSparkReporter htmlreport= new ExtentSparkReporter(".\\ExtentReports\\Report-"+new JavaUtility().getSystemDateinFormat()+".html");
		htmlreport.config().setDocumentTitle("Vtiger Execution Report");
		htmlreport.config().setReportName("wccm12-Autoation Report");
		htmlreport.config().setTheme(Theme.STANDARD);
		
		report= new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base browser", "Chrome");
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base platform", "window10"); 
		report.setSystemInfo("Reporter name", "Rahul Bhamre");
		
				
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("->suite execution finished->");
		/*extent report should get generated*/
		report.flush();
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	

	
	

}
