package com.searchutilities.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pages {

//    TestData data = new TestData();

    WebDriver driver;

    public Pages(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement ById(String locator) {


        return driver.findElement(By.id(locator));
    }

    public WebElement ByClass(String clss) {
        return driver.findElement(By.className(clss));
    }

    public WebElement ByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement ByName(String name) {
        return driver.findElement(By.xpath("//[@name="+name+"]"));
    }
    public void click(){

    }

    public void goToUrl(String Url) {
        driver.get(Url);
    }

}
