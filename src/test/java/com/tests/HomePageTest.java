package com.tests;
import com.annotations.FrameworkAnnotation;
import com.driver.DriverManager;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.reports.ExtentManager;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.driver.DriverManager.getDriver;

public class HomePageTest extends BaseTest{

    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"Admin","admin123","OrangeHRM"}
        };
    }

    @FrameworkAnnotation(author="mahesh")
    @Test(description = "To check whether the title of the Orangehrm website homepage is displayed correctly",dataProvider = "getData")
    public void titleValidationTest(String username, String password,String expectedTitle)  {

        //ExtentManager.getExtentTest().assignAuthor("Mahesh").assignCategory("smoke").assignCategory("regression");

        LoginPage lp = new LoginPage();
        String actualTitle= lp.loginToApplication(username,password).getHomePageTitle();
        //HomePage homepage = new HomePage();
        //String actualTitle = homepage.getHomePageTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
