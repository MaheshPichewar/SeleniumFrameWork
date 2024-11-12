package com.tests;

import com.annotations.FrameworkAnnotation;
import com.driver.Driver;
import com.driver.DriverManager;
import com.pages.LoginPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{

    @FrameworkAnnotation()
    @Test(description = "To check something")
    public void test1() throws InterruptedException{
        LoginPage l1 = new LoginPage();
        String actualTitle= l1.loginToApplication("Admin","admin123").getHomePageTitle();
        Assert.assertEquals(actualTitle,"OrangeHRM123");

        /* DriverManager.getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        DriverManager.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(DriverManager.getDriver().getTitle(),"OrangeHRM");   */
    }
}

