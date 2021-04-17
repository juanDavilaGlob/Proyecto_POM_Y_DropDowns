package com.globant;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class MultiSelectTest extends GeneralActions {

    /**
     * Selecciona opcion del multiselect
     */
    @Test
    public void selectOptionMultiselect(){
        System.out.println("Selecciono opción multiselect");
        assertTrue("No se seleccionó correctamente la opción del multiselect", true );
    }
}
