package com.sira.learning.SelAutomation.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listenersms implements ITestListener{
	
	protected static ExtentReports extent;
	protected static ExtentSparkReporter spark;
	protected static ExtentTest test;
	

	@Override
	public void onTestStart(ITestResult result) {
		//test.log(Status.INFO, "On Start of Test ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.pass(result.getMethod().getMethodName());
		test.log(Status.PASS, "  Test Passed  " +result.getMethod().getMethodName());
		test.log(Status.INFO, "On Test Success ");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, "On Test Failure ");
		test.fail(result.getMethod().getMethodName());
		test.log(Status.FAIL, "  Test Failed  " +result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, "On Test Skipped ");
		test.skip(result.getMethod().getMethodName());
		test.log(Status.SKIP, "  Test skipped  " +result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("reports/testreport.html");
		extent.attachReporter(spark);
		//test.log(Status.INFO, "On Test Start  ");


	}

	@Override
	public void onFinish(ITestContext context) {
		//test.log(Status.INFO, "On Test Finish ");
		extent.flush();

	}
	
	
	

}
