package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoriesHeaderPage extends BasePage {
    //////////////////////////////
    /* Desktops category button*/
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[1]/a")//Head Desktops button
    private WebElement desktopsButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[1]/div/div/ul/li[1]/a")//PC button
    private WebElement pcCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[1]/div/div/ul/li[2]/a")//Mac button
    private WebElement macCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[1]/div/a")//All Desktops button
    private WebElement allDesktopsCategoryButton;

    //////////////////////////////
    /*Laptops & Notebooks category button */

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[2]/a")//Head Laptops & Notebooks button
    private WebElement laptopsNotebooksButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[2]/div/div/ul/li[1]/a")//Macs button
    private WebElement MacsCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[2]/div/div/ul/li[2]/a")//Windows button
    private WebElement windowsCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[2]/div/a")//All Laptops & Notebooks button
    private WebElement allLaptopsNotebooksCategoryButton;

    //////////////////////////////
    /*Components category button */
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/a")//Head Components button
    private WebElement componentsButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[1]/a")//Mice and Trackballs button
    private WebElement miceTrackballsCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")//Monitors button
    private WebElement monitorsCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[3]/a")//Printers button
    private WebElement printersCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[4]/a")//Scanners button
    private WebElement scannersCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[5]/a")//Web Cameras button
    private WebElement webCamerasCategoryButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/a")//All Components button
    private WebElement allComponentsCategoryButton;

    //////////////////////////////
    /*Tablets category button */
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[4]/a")//Head Tablets button
    private WebElement tabletsButton;

    //////////////////////////////
    /*Software category button */
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[5]/a")//Head Software button
    private WebElement softwareButton;

    //////////////////////////////
    /*Phones & PDAs category button */
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[6]/a")//Head Phones & PDAs button
    private WebElement phonesPDAsButton;

    //////////////////////////////
    /*Cameras category button */
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[7]/a")//Head Cameras button
    private WebElement camerasButton;

    //////////////////////////////
    /*MP3 Players category button */
    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[8]/a")//Head MP3 Players button
    private WebElement mp3PlayersButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[8]/div/a")//All MP3 Players button
    private WebElement allMp3PlayersCategoryButton;

    //////////////////////////////
    /* Getters */

    /////Desktops category/////
    public WebElement getDesktopsButton() {
        wait.until(ExpectedConditions.visibilityOf(desktopsButton));
        return desktopsButton;
    }

    public WebElement getPcCategoryButton() {
        wait.until(ExpectedConditions.visibilityOf(pcCategoryButton));
        return pcCategoryButton;
    }

    public WebElement getMacCategoryButton() {
        return macCategoryButton;
    }

    public WebElement getAllDesktopsCategoryButton() {
        return allDesktopsCategoryButton;
    }

    /////Laptops & Notebooks category/////

    public WebElement getLaptopsNotebooksButton() {
        return laptopsNotebooksButton;
    }

    public WebElement getMacsCategoryButton() {
        return MacsCategoryButton;
    }

    public WebElement getWindowsCategoryButton() {
        return windowsCategoryButton;
    }

    public WebElement getAllLaptopsNotebooksCategoryButton() {
        return allLaptopsNotebooksCategoryButton;
    }

    /////Components category/////

    public WebElement getComponentsButton() {
        return componentsButton;
    }

    public WebElement getMiceTrackballsCategoryButton() {
        return miceTrackballsCategoryButton;
    }

    public WebElement getMonitorsCategoryButton() {
        return monitorsCategoryButton;
    }

    public WebElement getPrintersCategoryButton() {
        return printersCategoryButton;
    }

    public WebElement getScannersCategoryButton() {
        return scannersCategoryButton;
    }

    public WebElement getWebCamerasCategoryButton() {
        return webCamerasCategoryButton;
    }

    public WebElement getAllComponentsCategoryButton() {
        return allComponentsCategoryButton;
    }

    /////Tablets category/////

    public WebElement getTabletsButton() {
        return tabletsButton;
    }

    /////Software category/////

    public WebElement getSoftwareButton() {
        return softwareButton;
    }

    /////Phones & PDAs category/////

    public WebElement getPhonesPDAsButton() {
        return phonesPDAsButton;
    }

    /////Cameras category/////

    public WebElement getCamerasButton() {
        return camerasButton;
    }

    /////MP3 Players category/////

    public WebElement getMp3PlayersButton() {
        return mp3PlayersButton;
    }

    public WebElement getAllMp3PlayersCategoryButton() {
        return allMp3PlayersCategoryButton;
    }

}
