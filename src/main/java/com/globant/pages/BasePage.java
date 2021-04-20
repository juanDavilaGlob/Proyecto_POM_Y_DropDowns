package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWait(){
        wait = new WebDriverWait(driver, 20);
        return wait;
    }

    public void dispose(){
        if(driver != null){
            driver.quit();
        }
    }
}
