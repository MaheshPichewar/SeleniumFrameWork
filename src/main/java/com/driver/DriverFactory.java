package com.driver;

import com.enums.DriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {
    //adding final keyword to class name is for restricting others from extending this class

    private DriverFactory(){}
    //declaring constructor as private means restricting others from creating objects of this class outside the class

    public static WebDriver getDriver(String browserName)
    {
        WebDriver driver;
        if(browserName.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else{
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        return driver;

        //Changed below code to above , Using the concept of Enums in Java as shown above
        /* public static WebDriver getDriver(String browserName)
        {
            WebDriver driver;
            if(browserName.equalsIgnoreCase("chrome")){

                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();

            } else if (browserName.equalsIgnoreCase("edge")) {

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

            } else{
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
            }
            return driver;
            */



    }
}
