package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    ReservaValidacion reservaValidacion=new ReservaValidacion();

    @Test
    public void comprobarFormatoFechaErronea(){
        String fecha = "lorem";
        Exception valor = Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarFormatoFechas(fecha));
        Assertions.assertEquals(Mensaje.FORMATO_FECHAS.getMensaje(),valor.getMessage());
    }

    @Test
    public void comprobarFormatoFechaCorrecto(){
        String fecha = "02/09/2023";
        boolean valor =Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFormatoFechas(fecha));
        Assertions.assertTrue(valor);
    }

    @Test
    public void comprobarNumeroPersonaErronea(){
        int numero = 9;
        Exception valor= Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarNumeroPersonas(numero));
        Assertions.assertEquals(Mensaje.PERSONA_RESERVA.getMensaje(),valor.getMessage());
    }

    @Test
    public void comprobarNumeroPersonaCorrecta(){
        int numero = 3;
        Boolean valor = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarNumeroPersonas(numero));
        Assertions.assertTrue(valor);

    }

}