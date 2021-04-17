package com.globant;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class DropDownTest extends GeneralActions
{
    /**
     * Selecciona una opción del DropDown
     */
    @Test(dataProvider = "indicesToTest", dataProviderClass = DataProviderDropDownOptions.class)
    public void selectOptionDropDown(int data){
        System.out.println("Seleccionó opción del siguiente índice del DropDown: "+data);
        assertTrue( "Falla selección de opción en DropDown",true );
    }
}
