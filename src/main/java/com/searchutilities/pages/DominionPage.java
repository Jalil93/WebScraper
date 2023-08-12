package com.searchutilities.pages;

import com.searchutilities.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DominionPage extends TestBase {

    @FindBy(xpath="//*[@role='main']//input[@name='username']")
    WebElement usernameField;

    @FindBy(xpath="//*[@role='main']//input[@name='password']")
    WebElement passwordField;

    @FindBy(id="sidebar-open-btn")
    WebElement menuButton;

    @FindBy(xpath="//*[@role='main']//input[@type='submit']")
    WebElement signInButton;

    @FindBy(id="onetrust-accept-btn-handler")
    WebElement acceptCookiesButton;

    public DominionPage() {
        PageFactory.initElements(driver, this);
    }

    public void navToDominion() {
        driver.get(prop.getProperty("domUrl"));
        if(acceptCookiesButton.isDisplayed()){
            acceptCookiesButton.click();
        }
    }

    public void loginDominion() {
        signInButton.click();
        usernameField.sendKeys(prop.getProperty("domUsername"));
        passwordField.sendKeys(prop.getProperty("domPassword"));
        signInButton.click();
    }


}