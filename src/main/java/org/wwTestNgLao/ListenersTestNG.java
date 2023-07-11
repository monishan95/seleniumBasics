package org.wwTestNgLao;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenersTestNG implements ITestListener{

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("There is  a mistake");
    }
}
