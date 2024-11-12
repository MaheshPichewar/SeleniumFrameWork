package com.pages;

import com.aventstack.extentreports.ExtentReports;
import com.driver.DriverManager;
import com.enums.WaitType;
import com.reports.ExtentLogger;
import com.reports.ExtentManager;
import com.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.utils.SeleniumUtils.*;

public class LoginPage {

    private static final By TXTBOX_USERNAME = By.xpath("//input[@placeholder='Username']");
    private static final By TXTBOX_PASSWORD = By.xpath("//input[@name='password']");
    private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");

    private LoginPage setUsername(String username){
        sendKeys(TXTBOX_USERNAME,username, "Username"); //DriverManager.getDriver().findElement(TXTBOX_USERNAME).sendKeys(username);
        //ExtentLogger.pass("Username is entered successfully");//ExtentManager.getExtentTest().pass("Username is entered successfully");
        return this;  //return new LoginPage();
    }

    private LoginPage setPassword(String password){
        sendKeys(TXTBOX_PASSWORD,password,"Password");   //DriverManager.getDriver().findElement(TXTBOX_PASSWORD).sendKeys(password);
        //ExtentLogger.pass("Password is entered successfully");//ExtentManager.getExtentTest().pass("Password is entered successfully");
        return this;  //return new LoginPage();
    }

    private HomePage clickLoginBtn(){

        click(BTN_LOGIN, "LogIn Button");  //DriverManager.getDriver().findElement(BTN_LOGIN).click();
        //ExtentLogger.pass("Login Button is clicked successfully");//ExtentManager.getExtentTest().pass("Login Button is clicked successfully");
        return new HomePage(); // page chaining

    }

    public HomePage loginToApplication(String username, String password){

        return setUsername(username).setPassword(password).clickLoginBtn(); //method chaining
//        setUsername(username);
//        setPassword(password);
//        return clickLoginBtn();

    }

}

//Report Logs should be written in page classes only( LoginPage, HomePage,.......etc.) , not in Test classes(LoginPageTest, HomePageTest,.......)
