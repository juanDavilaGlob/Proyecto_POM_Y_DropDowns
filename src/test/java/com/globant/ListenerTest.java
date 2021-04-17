package com.globant;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public class ListenerTest implements ITestListener {
    public Logger log = Logger.getLogger(ListenerTest.class);

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case stared: "+result.getName());
        log.info("Test case stared: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case passed: "+result.getName());
        log.info("Test case passed: "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case failed: "+result.getName());
        log.error("Test case failed: "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case skipped: "+result.getName());
        log.info("Test case skipped: "+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
