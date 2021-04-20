package com.globant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage
{
    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "select-demo")
    private WebElement dropDown;

    @FindBy(id = "multi-select")
    private WebElement multiSelect;

    /**
     * Espera a que se cargue slogan en el DOM
     */
    public void waitToLoad(){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name-and-slogan"))));
        System.out.println("Esperó cargar página correctamente");
    }

    public String getElementDropDownSelected(int idx){
        waitToLoad();
        dropDown.click();
        Select days = new Select(dropDown);
        days.selectByIndex(idx);
        WebElement selectedValue = getDriver().findElement(By.className("selected-value"));
        return selectedValue.getText();
    }

    public String getElementMultiselectSelected(int idx){
        // Se obtiene multiselect
        WebElement btnGetAllSeleced = getDriver().findElement(By.id("printAll"));
        btnGetAllSeleced.click();
        WebElement lbAllSelectValues = getDriver().findElement(By.className("getall-selected"));
        return lbAllSelectValues.getText();
    }
}
