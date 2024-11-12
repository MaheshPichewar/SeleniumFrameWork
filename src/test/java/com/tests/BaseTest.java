package com.tests;

import com.driver.Driver;
import com.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;


public class BaseTest {

    /* @BeforeSuite
    public void beforeSuite(){
        ExtentReport.initReports();
    }

    @AfterSuite
    public void afterSuite(){
        ExtentReport.flushReports();
    }   */ //This code is commented because we are using listener concept for logging

    //protected WebDriver driver;
    //protected is to access should be limited to parent class(BaseTest) and their Child classes

    @BeforeMethod
    public void setup(){
        //ExtentReport.createTest(method.getName());  //for this logging we used concept of listeners
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}


//The Method method parameter in the setup method is an example of Java Reflection,
// a feature that allows a program to inspect and manipulate classes, methods, and fields at runtime.
// Specifically, the Method class from the java.lang.reflect package represents information about, and access to,
// a single method on a class or interface. Here, Method method lets the setup method access the metadata of the test method that will be executed next.

//Key Concept: Reflection with Method Parameter
//Reflection is used here to retrieve information about the test method that is about to be executed, such as its name. This information can be useful for dynamic test reporting, logging, and customized setup or teardown steps based on the specific test being run.

//In summary:

//Reflection lets the setup method get information about the test method, which can be used for detailed test reporting.
//@BeforeMethod ensures that this setup runs before each test method in the class.
//ExtentReports and Driver initialization prepare for the test run by logging the test and setting up the driver, respectively.