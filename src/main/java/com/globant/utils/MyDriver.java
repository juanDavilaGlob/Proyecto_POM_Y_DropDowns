package com.globant.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
    public WebDriver driver;

    /**
     * Crea driver dependiendo parámetro recibido.
     * @param browser "chrome", "firefox"...
     */
    public MyDriver(String browser){
        switch (browser){
            case "firefox":
                // se ejecuta en firefox
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\juan.davila\\Local Settings\\Application Data\\Google\\Firefox\\Application\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                // se ejecuta en chrome
                System.out.println("Se ejecuta con Chrome");
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan.davila\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan.davila\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chromedriver.exe");
                driver= new ChromeDriver();
        }
    }


    /**
     * Obtiene driver instanciado
     * @return WebDriver
     */
    public WebDriver getDriver(){
        return this.driver;
    }
}
