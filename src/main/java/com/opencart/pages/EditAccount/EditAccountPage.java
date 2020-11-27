package com.opencart.pages.EditAccount;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter

public class EditAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    public WebElement firstnameInput;

    @FindBy(id = "input-lastname")
    public WebElement lastnameInput;

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(xpath = "//div[contains-token(@class, 'text-danger')]")
    public  WebElement emailValidation;

    @FindBy(id = "input-telephone")
    public WebElement telephoneInput;

    @FindBy(xpath = ".//*[contains(@href,'Back')]")
    private WebElement backButton;

    @FindBy(xpath = ".//*[contains(@href,'Continue')]")
    private WebElement continueButton;
}
