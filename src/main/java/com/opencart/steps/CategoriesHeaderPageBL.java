package com.opencart.steps;

import com.opencart.pages.CategoriesHeaderPage;
import com.opencart.pages.SuccessPage.SuccessCategoryPage;
import org.testng.Assert;

public class CategoriesHeaderPageBL {

    private final CategoriesHeaderPage categoriesHeaderPage;
    private SuccessCategoryPage successCategoryPage;

    public CategoriesHeaderPageBL() {
        categoriesHeaderPage = new CategoriesHeaderPage();
    }

    /////////////////////////////////////////////////
    /*Desktops categories buttons click */

    public CategoriesHeaderPageBL clickOnDesktopsButton() {
        categoriesHeaderPage.getDesktopsButton().click();
        return this;
    }

    public CategoriesHeaderPageBL clickOnPCButton() {
        categoriesHeaderPage.getPcCategoryButton().click();
        return new CategoriesHeaderPageBL();

    }

    public CategoriesHeaderPageBL clickOnMacButton() {
        categoriesHeaderPage.getMacCategoryButton().click();
        return new CategoriesHeaderPageBL();

    }

    public CategoriesHeaderPageBL clickOnAllDesktopsButton() {
        categoriesHeaderPage.getAllDesktopsCategoryButton().click();
        return new CategoriesHeaderPageBL();

    }
    /////////////////////////////////////////////////
    /*Laptops & Notebooks categories buttons click */

    public CategoriesHeaderPageBL clickOnLaptopsNotebooksButton() {
        categoriesHeaderPage.getLaptopsNotebooksButton().click();
        return this;
    }

    public CategoriesHeaderPageBL clickOnMacsButton() {
        categoriesHeaderPage.getMacsCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }

    public CategoriesHeaderPageBL clickOnWindowsButton() {
        categoriesHeaderPage.getWindowsCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }

    public CategoriesHeaderPageBL clickOnAllLaptopsNotebooksButton() {
        categoriesHeaderPage.getAllLaptopsNotebooksCategoryButton().click();
        return new CategoriesHeaderPageBL();

    }
    /////////////////////////////////////////////////
    /*Components categories buttons click */

    public CategoriesHeaderPageBL clickOnComponentsButton() {
        categoriesHeaderPage.getComponentsButton().click();
        return this;
    }

    public CategoriesHeaderPageBL clickOnMiceTrackballsButton() {
        categoriesHeaderPage.getMiceTrackballsCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }

    public CategoriesHeaderPageBL clickOnMonitorsButton() {
        categoriesHeaderPage.getMonitorsCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }
    public CategoriesHeaderPageBL clickOnPrintersButton() {
        categoriesHeaderPage.getPrintersCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }
    public CategoriesHeaderPageBL clickOnScannersButton() {
        categoriesHeaderPage.getScannersCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }
    public CategoriesHeaderPageBL clickOnWebCamerasButton() {
        categoriesHeaderPage.getWebCamerasCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }
    public CategoriesHeaderPageBL clickOnAllComponentsButton() {
        categoriesHeaderPage.getAllComponentsCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }

    /////////////////////////////////////////////////
    /*Tablets categories buttons click */

    public CategoriesHeaderPageBL clickOnTabletsButton() {
        categoriesHeaderPage.getTabletsButton().click();
        return this;
    }

    /////////////////////////////////////////////////
    /*Software categories buttons click */

    public CategoriesHeaderPageBL clickOnSoftwareButton() {
        categoriesHeaderPage.getSoftwareButton().click();
        return this;
    }
    /////////////////////////////////////////////////
    /*Phones & PDAs categories buttons click */

    public CategoriesHeaderPageBL clickOnPhonesPDAsButton() {
        categoriesHeaderPage.getPhonesPDAsButton().click();
        return this;
    }
    /////////////////////////////////////////////////
    /*Cameras categories buttons click */

    public CategoriesHeaderPageBL clickOnCamerasButton() {
        categoriesHeaderPage.getCamerasButton().click();
        return this;
    }
    /////////////////////////////////////////////////
    /*MP3 Players categories buttons click */

    public CategoriesHeaderPageBL clickOnMp3PlayersButton() {
        categoriesHeaderPage.getMp3PlayersButton().click();
        return this;
    }
    public CategoriesHeaderPageBL clickOnAllMp3PlayersButton() {
        categoriesHeaderPage.getAllMp3PlayersCategoryButton().click();
        return new CategoriesHeaderPageBL();
    }
    /////////////////////////////////////////////////
    /*Category check*/
    public CategoriesHeaderPageBL checkCategory() {
        successCategoryPage = new SuccessCategoryPage();
        return this;
    }

    /////////////////////////////////////////////////
    ///Desktops///
    public void verifyPcCategoryOpen() {

        String expectedMessage = "PC";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }


    public void verifyMacCategoryOpen() {

        String expectedMessage = "Mac";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyAllDesktopsCategoryOpen() {

        String expectedMessage = "Desktops";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    /////////////////////////////////////////////////
    ///Laptops & Notebooks///

    public void verifyMacsCategoryOpen() {

        String expectedMessage = "Macs";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyWindowsCategoryOpen() {

        String expectedMessage = "Windows";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyAllLaptopsNotebooksCategoryOpen() {

        String expectedMessage = "Laptops & Notebooks";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    /////////////////////////////////////////////////
    ///Components///
    public void verifyMiceTrackballsCategoryOpen() {

        String expectedMessage = "Mice and Trackballs";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    public void verifyMonitorsCategoryOpen() {

        String expectedMessage = "Monitors";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    public void verifyPrintersCategoryOpen() {

        String expectedMessage = "Printers";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    public void verifyScannersCategoryOpen() {

        String expectedMessage = "Scanners";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    public void verifyWebCamerasCategoryOpen() {

        String expectedMessage = "Web Cameras";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    public void verifyAllComponentsCategoryOpen() {

        String expectedMessage = "Components";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }

    /////////////////////////////////////////////////
    ///Tablets///
    public void verifyTabletsCategoryOpen() {

        String expectedMessage = "Tablets";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }

    /////////////////////////////////////////////////
    ///Software///
    public void verifySoftwareCategoryOpen() {

        String expectedMessage = "Software";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    /////////////////////////////////////////////////
    ///Phones & PDAs///
    public void verifyPhonesPDAsCategoryOpen() {

        String expectedMessage = "Phones & PDAs";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    /////////////////////////////////////////////////
    ///Cameras///
    public void verifyCamerasCategoryOpen() {

        String expectedMessage = "Cameras";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    /////////////////////////////////////////////////
    ///MP3 Players///
    public void verifyAllMp3PlayersCategoryOpen() {

        String expectedMessage = "MP3 Players";
        Assert.assertEquals(successCategoryPage.getPcCategoryTitle().getText(), expectedMessage, "Incorrect page title");
    }
    /////////////////////////////////////////////////
}
