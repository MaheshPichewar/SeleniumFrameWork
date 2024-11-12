package com.pages.pagecomponent;
import com.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.utils.SeleniumUtils.*;


public class LeftMainMenuComponent {

    //private static final By LNK_ADMIN = By.xpath("//a[@class='oxd-main-menu-item active toggle']");
    private String topMenus = "menu_%replaceble";

    public void clickOnMenu(String Menu){
        String pim_viewPimModule = topMenus.replaceAll("%replacable","pim_viewPimModule");
        click(By.id(pim_viewPimModule),"menu");
    }

    //PageFactory
    //Using PageFactory , Dynamic locators is not possible
    // WebElement  --> By , String
  /*  @FindBy(id="menu_pim_viewPimModule")
    private WebElement LNK_PIM;

    @FindBy(id="menu_leave_viewLeaveModule")
    private WebElement LNK_LEAVE;

    public LeftMainMenuComponent(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }     */

    /* public void clickAdmin(){
        click(LINK_ADMIN); //DriverManager.getDriver().findElement(lnkAdmin).click();
    } */
}
