package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    LocalValidacion localValidacion=new LocalValidacion();

    @Test
    public void comprobarNitErroneo(){
        String nit= "1029585678999";
        Exception valor = Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNit(nit));
        Assertions.assertEquals(Mensaje.LONGITUD_NIT.getMensaje(),valor.getMessage());
    }


    @Test
    public void comprobarNitCorrecto(){
        String nit= "12er35g560";
        boolean valor= Assertions.assertDoesNotThrow(()->this.localValidacion.validarNit(nit));
        Assertions.assertTrue(valor);
    }

    @Test
    public void comprobarNombreErroneo(){
        String nombre = "uyjhngfvbcbcvbvcnbvcbvdnbvcnvbncvnvcnvcbcvbcvbfbfdbcfcvbfcbgfnbcv12344575686";
        Exception valor= Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNombre(nombre));
        Assertions.assertEquals(Mensaje.LONGITUD_EMPRESA.getMensaje(),valor.getMessage());
    }

    @Test
    public void comprobarNombreCorrecto(){
        String nombre= "lorem";
        boolean valor= Assertions.assertDoesNotThrow(()->this.localValidacion.validarNombre(nombre));
        Assertions.assertTrue(valor);
    }
}