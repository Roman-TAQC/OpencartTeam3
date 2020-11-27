package com.opencart.steps.editAccount;

import com.opencart.datamodel.editAccount.EditAccountModel;
import com.opencart.pages.BasePage;
import com.opencart.pages.EditAccount.EditAccountPage;
import com.opencart.pages.MyAccountPage;
import com.opencart.repository.editAccount.EditAccountModelRepository;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditAccountPageBL extends BasePage {

    private EditAccountPage editAccountPage;
    private MyAccountPage successEditAccount;

    public  EditAccountPageBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editUserAccount() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        editFirstName(editAccountModel.getFirstName());
        editLastName(editAccountModel.getLastName());
        editEmail(editAccountModel.getEmail());
        editTelephone(editAccountModel.getTelephone());
        clickOnBackButton();
        clickOnContinueButton();

        successEditAccount= new MyAccountPage();
        return this;
    }

    private void editFirstName(String firstName) {
        editAccountPage.getFirstnameInput().sendKeys(firstName);
    }

    private void editLastName(String lastName) {
        editAccountPage.getLastnameInput().sendKeys(lastName);
    }

    private void editEmail(String email) {
        editAccountPage.getEmailInput().sendKeys(email);
    }

    private void editTelephone(String telephone) {
        editAccountPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnBackButton() {
        editAccountPage.getBackButton().click();
    }

    private void clickOnContinueButton() {
        editAccountPage.getContinueButton().click();
    }


}
