package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

     @FindBy(xpath = ".//*[contains(@href,'Edit Account')]")
    private WebElement editAccountButton;

     @FindBy(xpath = "//div[contains(@class, 'Test')]")
     private WebElement successTitle;

    public WebElement getEditAccountButton() {
        return editAccountButton;
    }

    public WebElement getSuccessTitle() {
        return  successTitle;
    }
}
