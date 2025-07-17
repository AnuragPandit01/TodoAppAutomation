package com.anuragpandit.tests;

import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        BaseTest baseTest = (BaseTest) result.getInstance();
        baseTest.test.log(Status.PASS, "Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        BaseTest baseTest = (BaseTest) result.getInstance();
        baseTest.test.log(Status.FAIL, "Test Failed: " + result.getName() + " - " + result.getThrowable());
    }
}
