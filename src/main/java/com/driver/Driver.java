package com.driver;

import com.config.ConfigFactory;
import com.config.FrameworkConfig;
import com.enums.DriverType;
import com.enums.WaitType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public final class Driver {

    private Driver(){}

    //common for all the threads
    //public static WebDriver driver;
    // static because initDriver() and quitDriver() are static methods so they can only operate on static variables
    //public static FrameworkConfig config;

    public static void initDriver(){

        String browser = ConfigFactory.getConfig().browser();
        if(DriverManager.getDriver() == null){
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);//threadLocal.set(driver);

            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }

    }

    public static void quitDriver(){
        //driver.quit();

        if (DriverManager.getDriver() != null) //threadLocal.get() != null
        {
            DriverManager.getDriver().quit(); //threadLocal.get().quit();
            DriverManager.setDriver(null);

        }
    }
}
