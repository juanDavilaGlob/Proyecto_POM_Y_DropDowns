package com.globant;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class GeneralActions {
    @BeforeSuite
    @Parameters({"browser"})
    public void openBrowser(String browser){
        switch(browser) {
            case "firefox":
                // se ejecuta en firefox
                System.out.println("Se abre browser firefox");
                break;
            case "chrome":
                // se ejecuta en chrome
                System.out.println("Se abre browser chrome");
                break;
            default:
                // se ejecuta en chrome
                System.out.println("Se abre browser chrome");
        }
    }

    @AfterSuite
    public void closerBrowser(){
        System.out.println("Se cierra browser");
    }
}
