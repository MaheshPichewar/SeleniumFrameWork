package com.pages;

import com.driver.DriverManager;
import com.pages.pagecomponent.FooterMenuComponent;
import com.pages.pagecomponent.LeftMainMenuComponent;

public class HomePage {

    //HomePage has TopMenu ---> Composition
    //HomePage IS A Test ---> Inheritance

    private final LeftMainMenuComponent leftMainMenuComponent;
    private final FooterMenuComponent footerMenuComponent;
    public HomePage(){
        leftMainMenuComponent = new LeftMainMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    }



    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnAdmin(){
        leftMainMenuComponent.clickOnMenu("value");
    }

    public String getFooterText(){
        return footerMenuComponent.getFooterLabel();
    }
}
