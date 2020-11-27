package com.opencart.steps;

import com.opencart.pages.MyAccountPage;
import com.opencart.steps.search.SearchPageBL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPageBL {

    WebDriver driver;
    private MyAccountPage myAccountPage;

    public  MyAccountPageBL() {
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnEditAccountButton() {
        myAccountPage.getEditAccountButton().click();
        return this;
    }

    public void verifyEditUserAccount() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessTitle().getText(),expectedMessage, "Incorrect Page Title");
    }
}
