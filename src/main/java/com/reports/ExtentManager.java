package com.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {

    private ExtentManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    static ExtentTest getExtentTest(){//removing public ,so that it can become default access modifier , access will be within the
        // package , so classes ExtentReport , ExtentLogger can only acceess this class properties
        return threadLocal.get();
    }

    static void setExtentTest(ExtentTest test ){ //removing public ,so that it can become default access modifier , access will be within the
        // package , so classes ExtentReport , ExtentLogger can only acceess this class properties
        threadLocal.set(test);
    }
}
