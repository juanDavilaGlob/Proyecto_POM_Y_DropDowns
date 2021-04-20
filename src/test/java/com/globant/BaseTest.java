package com.globant;

import com.globant.pages.HomePage;
import com.globant.utils.MyDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    MyDriver myDriver;
    WebDriver driver;

    public HomePage homePage;

    @BeforeSuite
    @Parameters({"browser"})
    public void openBrowser(String browser){
        myDriver = new MyDriver(browser);
        driver = myDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    }

    /**
     * Cierra navegador
     */
    @AfterSuite
    public void closerBrowser(){
        driver.quit();
    }

    /**
     * Obtener el homePage
     */
    public HomePage getHomePage(){
        return homePage;
    }
}
