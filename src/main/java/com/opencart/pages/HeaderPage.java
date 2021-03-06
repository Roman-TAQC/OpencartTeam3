package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title = 'My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//*[contains(@href,'login')]")
    private WebElement loginButton;
    
    @FindBy(xpath = "//*[@id='search']/span/button")
    private WebElement searchButton;
    
    @FindBy(xpath = "//div[@class ='product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12'][2]//button[1]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[4]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "//div[@class ='pull-right']/a[@href]")
    private WebElement checkoutButton;

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }
}
