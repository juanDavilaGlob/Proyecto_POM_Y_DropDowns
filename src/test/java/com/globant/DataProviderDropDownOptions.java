package com.globant;

import org.testng.annotations.DataProvider;

public class DataProviderDropDownOptions {
    /**
     * Indices de las opciones del DropDown a Testear
     * @return objeto con los indices del dropdown
     */
    @DataProvider(name = "indicesToTest")
    public static Object[][] dropDownOptionsToTest(){
        return new Integer[][]{{0},{1},{2},{3},{4},{5},{6}};
    }
}
