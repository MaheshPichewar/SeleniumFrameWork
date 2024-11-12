package com.pages.pagecomponent;

import com.driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    private final By labelFooterMsg = By.xpath("//p[normalize-space()='OrangeHRM OS 5.7']");

    public String getFooterLabel(){
        return DriverManager.getDriver().findElement(labelFooterMsg).getText();
    }
}
