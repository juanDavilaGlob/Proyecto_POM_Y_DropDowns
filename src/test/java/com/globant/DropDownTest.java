package com.globant;

import com.globant.pages.HomePage;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest
{
    /**
     * Selecciona opciones del DropDown
     */
    @Test(dataProvider = "indicesToTest", dataProviderClass = DataProviderDropDownOptions.class)
    public void selectOptionDropDown(int data){
        System.out.println("Seleccionó opción del siguiente índice del DropDown: "+data);
        String selectedDP = homePage.getElementDropDownSelected(data);
        System.out.println("Elemento seleccionado: "+selectedDP);
    }
}
